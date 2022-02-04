Feature: Dell login and Search

Scenario: Verify user can login            
Given Launch dell "<URL>"
Then Mouseover Sign In and click on Sign In
Then enter user and password and click login
Then verify user is logged in

Scenario: Verify search result
Given Launch dell "<URL>"
When Enter XPS in search field and click search
Then Verify search result