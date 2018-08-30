Feature: doSomething

  Scenario: look busy on google
    When I load the home page of Google
    And I increment
    Then I should get a 200 response
    And Injection should work
    And the atomic should be 2

  Scenario: look busy elsewhere
    When I load another page
    And I increment
    Then I should get a body
    And the atomic should be 3

