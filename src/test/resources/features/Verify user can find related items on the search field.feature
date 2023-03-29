Feature:As a user, I should be able to find people, documents and more
  by using top-page search bar; so that I can access the searched data


  Scenario Outline:Related keywords verification(User can find related items to written keyword)

    Given "<user>" navigates website and enters valid credentials,should see homepage
    When  User on the homepage can write "<relatedKeyword>" to the search box
    And   User clicks to search button
    Then   User should see the related keyword written on the search box

    Examples:
      | user                           | relatedKeyword |
      | hr1@cybertekschool.com         | Employee       |
      | marketing35@cybertekschool.com | Employee       |
      | helpdesk35@cybertekschool.com  | Employee       |