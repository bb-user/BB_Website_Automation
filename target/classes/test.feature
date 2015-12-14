Feature: This is a test feature

  Scenario: This should call up a browser instance which navigates to the BB home page
    Given I am on the home page
    When I click on Whats Your Next Project
    Then I should be on the Services Page
