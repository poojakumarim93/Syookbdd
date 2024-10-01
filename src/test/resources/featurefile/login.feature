Feature: To test the Login Functionality

  Scenario Outline: Login with valid and Invalid Credentials
    Given User is on Home Page
    When User navigate to Login Page
    Then User enters "<username>" and "<password>"
    And Keeping case as Valid
    Then User should get logged in
    And Message displayed Login Successfully
    Then User enters "<username>" and "<password>"
    And Keeping case as InValid
    Then user will be asked to go back to login page
    And Provide correct credentials

    Examples: 
      | username | password | Case    |
      | Admin    | admin123 | Valid   |
      | admin    | Admin12  | InValid |
