Feature: Login into Application
Scenario Outline: Positive test Validating Login
Given Initialize the  Browser with Chrome
And  Naviagte to "http://qaclickacademy.com" site
And Click on Login link in HomePage  to land SignIn Page
When User Enters <username> and <password> and logs in
Then Veify that user is successfully logged in
And close the browser
 
 
 Examples:
 |username          |password  |
 |test99@gmail.com  |123456    |
 |test12@gmail.com  |123       |