

Feature:As a user, I should be able to find people, documents and more
  by using top-page search bar; so that I can access the searched data

  Scenario Outline:Finding group verification(User can find group)
    Given "<user>" navigates website and enters valid credentials,should see homepage
    When  User on the homepage can write the finding group keyword on the search bar
    And   User clicks to search button
    And   User should see the FindingGroups keyword
    And   User clicks on the FindingGroup  button
    Then  User should click search button under the search in groups title  opened page

    Examples:
      | user                           |  |
      | hr1@cybertekschool.com         |  |
      | marketing35@cybertekschool.com |  |
      | helpdesk35@cybertekschool.com  |  |