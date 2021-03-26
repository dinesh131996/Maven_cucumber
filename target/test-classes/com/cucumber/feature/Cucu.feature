Feature: Booking the hotel


Scenario: login_page
Given user is already on login page
When username is given
Then password is given
Then click login button


Scenario: Search the hotel
Given Give the location "value" "Sydney"
Then Give the hotel "value" "Hotel Hervey"
Then Room type "value" "Double"
Then No of rooms "value" "2"
Then Clear value
Then Check in date "25/02/2021"
Then Clear value2
Then check out date "28/02/2021"
Then Adult room "int" "2"
Then Child room "int" "2"
Then Submit