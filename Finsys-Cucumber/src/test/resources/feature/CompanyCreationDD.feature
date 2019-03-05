#StoryType=WEB
#Author: abhi
#CreationDate=25-01-2019 Friday

@CompanyCreationDD
Feature: Multiple Company Creation 

  Background:User is successfully logged in
    When user launch the "firefox" browser
    When user enters the url "http://localhost:90/finsys"
    Then user enter "dummyfm" as enter username
    Then user enter "passw0rd" as password
    And user click on login button

  @SmokeTest
  Scenario Outline: Create a new Company
      When user expand create new company left hand side accordian pane
      And user click on New company option which is at the Top
      And user get the New Create company page details
      And user enter "<company name>"
      And user enter "<company Address>"
      And user enter "<Company contact Number>"
      When user enters all mandatory and required fields
      Then user click on save button
      And user gets the "<message>" starting with 
      And user click on search button 
      Then user on the search page
      And user enter newly created user detail in search bar and click on search button
      Then user is on the search page with new created company       
      
     Examples: 
      | company name    | company Address   | Company contact Number  |        message                 |
      | Ubuntu          | Hinjewadi phase2  | 020-258978964           |   Company Created Successfully |
      | MicroService    | Magarpatta city   | 020-264879546           |   Company Created Successfully |
      | Sun Microsystem | Nanded city       | 020-466558779           |   Company Created Successfully |
      | Tesla           | Baner             | 020-698798456           |   Company Created Successfully |
        
