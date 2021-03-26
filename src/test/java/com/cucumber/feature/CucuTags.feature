Feature: book the hotel

Background:
Given enter the url "https://adactinhotelapp.com/"
Then enter the username "DineshDineshDineshDi"
Then enter the password "123456"
Then click on the Login button
 
@first    
Scenario Outline:: login the page
Given enter the url "https://adactinhotelapp.com/"
Then enter the username "<username>"
Then enter the password "<password>"
Then click on the Login button
Examples:
|username|password|
|hii|123|
|DineshDineshDineshDi|123456|
|Dinesh|456987|
|Vignesh|22584|
|suguna devi|58492|
|karthi|54875|



Scenario: Search for the hotel
Given user already in the search page
Then enter the location "value" "Sydney"
Then enter the hotel name "value" "Hotel Hervey"
Then enter the room type "value" "Double"
Then enter the room number "value" "2"
Then enter the checkin "15/04/2021"
Then enter the checkout "18/06/2021"
Then enter the adult room "int" "2"
Then enter the child room "int" "2"
Then enter the submit 


Scenario: Select the hotel
Given already in giving the personal details
Then click the radio button 
Then click the continue button


Scenario: Giving the personal details
Given give the firstname "Dinesh"
Then give the lastname "subramanian"
Then give the address "nallur, chennai kuruku santhu"
Then give the card num "2017201520152015"
Then type of card "value" "MAST"
Then expiry month of the card "visibletext" "May"
Then expiry year of the card "visibletext" "2022"
Then enter the cvv number "123"
Then click the submit button 
