Feature: This is a test feature

  #  Scenario: This should call up a browser instance which navigates to the BB home page
  #    Given I am on the home page
  #    When I click on Whats Your Next Project
  #    Then I should be on the Services Page
  #      And I close the browser
  #Scenario Outline: Test Page Heading
  # Given I am on the home page
  # When I click on <Title>
  # Then I check I am on <Title>
  # Examples:
  # | Title      |
  # | "Cisco"    |
  # | "Oracle"   |
  # | "Scripps"  |
  # | "LeapFrog" |
  # | "Snap On"  |
  # | "Trek"     |
  Scenario: checking the testing services icons and read more links
    Given I am on the home page
    When I click on the Website Testing Icon
    Then I should be on the Website Testing Page
