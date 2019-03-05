#StoryType=WEB
#Owner=ejagruti
#CreationDate=24-12-2017 Sunday
@Login
Feature:Login Feature

  Background:user is successfully logged in
  When user opens the "firefox" browser
  And user enters the url "http://localhost:90/finsys/login.html"

  @SmokeTest @EndToEnd
  Scenario: Login Functionality for valid username and password
    Given user is on the application login page
    When user enters "dummyfm" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user is on the application home page
    

 @EndToEnd
  Scenario: Login Functionality for valid username and invalid password
  Given user is on the application login page
  When user enters "dummyfm" as username
  And user enters "Password" as password
  And user clicks on login button
  Then user is on the same login page


  @EndToEnd
  Scenario: Login Functionality for invalid username and valid password
  Given user is on the application login page
  When user enters "dumyfm" as username
  And user enters "Password" as password
  And user clicks on login button
  Then user is on the same login page
  
  
  @EndToEnd
  Scenario: Login Functionality for blank username and  password
  Given user is on the application login page
  When user enters "" as username
  And user enters "" as password
  And user clicks on login button
  Then user is on the same login page
 
  
  
 
  