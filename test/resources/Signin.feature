Feature: Nopcommercesignin
  Background:
    Given User should be able to open a webpage
    And Enter a valid website URL

    Scenario Outline: signin
      When User clicked on login
      Then User should be on login page
      And enter a registered "<userid>"
      Then enter a "<correct password>"
      And user should be logged in successfully
      Then user close the browser
      Examples:
        |userid | correct password |
      | nishant.dhanani@gmail.com | Ndnd@2250 |

