Feature: doSomething

  Scenario: look busy on google
    When I load the home page of Google
    Then I should get a 200 response
    And Injection should work

  Scenario: look busy elsewhere
    When I load another page
    Then I should get a body
