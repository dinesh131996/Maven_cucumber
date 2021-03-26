Feature: Book the hotel
Background:
        Given give the url "https://adactinhotelapp.com/"
        When give the username "DineshDineshDineshDi"
        Then give the password "123456"
        Then submit the given details
    
    Scenario Outline:: give the user inputs
        Given give the url "https://adactinhotelapp.com/"
        When give the username "<username>"
        Then give the password "<password>"
        Then submit the given details

        Examples:
        |username|password|
        |DineshDineshDineshi|123456|
        |abc|253|
        |bef|2569|
        |bhy|8579|
        |dsf|5585|
        