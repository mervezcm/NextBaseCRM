Feature:As a user, I should be able to find people, documents and more
  by using top-page search bar; so that I can access the searched data

  @AGL-407
  Scenario Outline:Conversation page verification(User can see the conversations)
    Given "<user>" navigates website and enters valid credentials,should see homepage
    When  User on the homepage should write "<searchValue>"  to the search box
    And   User clicks to search button
    And   User should see the conversations keyword
    And   User clicks on the Conversation keyword
    Then  User should see Conversations on the opened page

    Examples:
      | user                           | searchValue   |
      | hr3@cybertekschool.com         | Conversations |
      | marketing35@cybertekschool.com | Conversations |
      | helpdesk35@cybertekschool.com  | Conversations |
