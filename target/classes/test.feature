Feature: This is a test feature

  #  Scenario: This should call up a browser instance which navigates to the BB home page
  #    Given I am on the home page
  #    When I click on Whats Your Next Project
  #    Then I should be on the Services Page
  Scenario Outline: Test Page Heading
    Given I am on the home page
    When I click on <Link>
    Then I check I am on <Title>

    Examples: 
      | Link | Title      |
      | "2"  | "Cisco"    |
      | "3"  | "Oracle"   |
      | "4"  | "Scripps"  |
      | "5"  | "LeapFrog" |
      | "6"  | "Snap On"  |
      | "7"  | "Trek"     |
