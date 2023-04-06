Feature:As a user, I should be able to find people, documents and more
  by using top-page search bar; so that I can access the searched data
  @AGL-446
  Scenario Outline:Finding workgroup verification(User can find group)
    Given "<user>" navigates website and enters valid credentials,should see homepage
    When User can write the "groupKeyword" on the search bar and should see the searched group

    Examples:
      | user                           |
      | hr1@cybertekschool.com         |
      | marketing35@cybertekschool.com |
      | helpdesk35@cybertekschool.com  |

