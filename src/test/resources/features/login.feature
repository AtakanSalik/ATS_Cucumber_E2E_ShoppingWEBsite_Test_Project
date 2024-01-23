@login
Feature: Login Test
  # Agile story : As a user I should be able to login with valid credentials
  Background:
    Given The user navigates to website


  Scenario: Positive Login Test 1 without parameter
    When  The user clicks on login button and enters valid credentials
    Then  The user verifies welcome message


  Scenario: Positive Login Test 2 without parameter
    When The user clicks on login button and enters "atakan" and "atakan123" credentials
    Then  The user verifies welcome "atakan" message


  Scenario Outline: Positive Login Test 3 without parameter
    When The user clicks on login button and enters "<username>" and "<password>" credentials
    Then  The user verifies welcome "<username>" message
    Examples:
      | username | password  |
      | atakan   | atakan123 |

