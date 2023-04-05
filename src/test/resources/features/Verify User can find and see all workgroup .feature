Feature:As a user, I should be able to find people, documents and more
  by using top-page search bar; so that I can access the searched data

  Scenario Outline:Finding workgroup verification(User can find group)
    Given "<user>" navigates website and enters valid credentials,should see homepage
    When User can write the "groupKeyword" on the search bar
    When  User can write the workgroup keyword on the search bar
    And   User clicks to search button
    And   User should see workgroup button and click it.
    Then  User should see the all workgroups.


    Examples:
      | user                           |
      | hr3@cybertekschool.com         |
      | marketing35@cybertekschool.com |
      | helpdesk35@cybertekschool.com  |

