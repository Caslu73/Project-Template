@us8
Feature: search new users dialog

  Agile Story : User Story8: As a user, I should be able to search users by ID.

  Scenario: Verify user information
    Given I am on the login page
    And I login using following credentials:
      | email    | librarian21@library |
      | password | libraryUser         |

    And I click on "Users" link
    When I search for "6565"
    Then table should contain this data
      | User ID   | 6565                        |
      | Full Name | Perla Klocko                |
      | Email     | flavia.parisian@hotmail.com |


 # Note: The user with 486 ID has to be on the app. This is a pre-condition.
 # If there is no such a book, the QA has to create it manually before performing testing