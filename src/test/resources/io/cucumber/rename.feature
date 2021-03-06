@rename
Feature: Rename an item

  As a user, i want to rename the items of my account
  so that i see clearer or different names as i need them

  Background: User is logged in
    Given user user1 is logged
    And the following items have been created in the account
      | RenameMe  |

  Scenario: Rename an item
    When user selects to Rename the item RenameMe
    And user sets Renamed as new name
    Then user should see Renamed in the filelist
    But user should not see Rename in the filelist anymore