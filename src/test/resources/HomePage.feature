Feature: Home Page - General Test

# Should use a background script for the Given for page links tests. 
Given I am on the home page 

Scenario: Test Whats Your Next Project?
When I click on Whats Your Next Project
Then I should be on the Services Page

Scenario: Test Prvious Clients
# Should be able to use a data table here. 
When I click on a client
Then I should be on that clients referal page

Scenario: Test Services Links
# Should be able to use a data table here
When I click a services link
Then I should be on that services page

Scenario: Test Follow Our Blog
When I click Follow Our Plog
Then I should be on the first page of the block

Scenario Test Blog Links
When I click a blog link
Then I should be on that blogs page