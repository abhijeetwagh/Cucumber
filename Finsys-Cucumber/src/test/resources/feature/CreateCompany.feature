#StoryType=WEB
#Owner=Abhi
#CreationDate=24-12-2017 Sunday
@CreateCompany
Feature: CreateCompany feature

    Background:User is successfully logged in
    When user launch the "firefox" browser
    And user enters the url "http://localhost:90/finsys"
    Then user enter "dummyfm" as enter username
    Then user enter "passw0rd" as password
    And user clicks on login button
         
    @EndToEnd
    Scenario: Create a new Company for user having role of BEO
      When user expand company left hand side accordian pane      
      And user click on Manage company
      And user click on the New
      And user enter company name "Ubuntu"
      And user select Company type "IT"
      And user enter company Address "Hinjewadi phase 2"
      And user enter Company phone Detail "020-258978964"
      When user enters all mandatory and required fields
     	| demo@infosys.com | ASDGF5659L  | 29750311018 | INDIA |
      Then user click on save button          

    @EndToEnd
    Scenario: Create a new company by passing some valid data  
     When user expand company left hand side accordian pane
     And user click on Manage company
     And user click on the New
     And user enter company name "Tesla"
     And user select Company type "IT"
     And user enter company Address "Hinjewadi phase 3"
     And user enter Company phone Detail "020-258978965"
     And user enter Company email id "xyz@outlook.com"
     When user enters all mandatory and required fields
     |  | ACFFJ6989D  | 26359847589 | INDIA |
     Then user click on save button 

    @EndToEnd
    Scenario: Create a company by passing already existing comapny name & detail 
     When user expand company left hand side accordian pane
     And user click on Manage company
     And user click on the New
     And user enter company name "Tesla"
     And user select Company type "IT"
     And user enter company Address "Hinjewadi phase 3"
     And user enter Company phone Detail "020-258978965"
     And user enter Company email id "xyz@outlook.com"
     When user enters all mandatory and required fields
     |   | ACFFJ6989D  | 26359847589 | INDIA |
     Then user click on save button 
     Then user get the message starting with "Company Already Exists.Please Select different Company Name!!!"

    