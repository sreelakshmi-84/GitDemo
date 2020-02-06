Feature: Login tnto Application



Scenario: Positive test validating login
Given Initialise browser with chrome
And navigate to "http://qaclickacademy.com" site
And click on Login link in homepage to land on securesign in page

When user enters "lellasreelakshmi@gmail.com" and "Aanya@2016" and logs in
Then verify that user is successfully logged in