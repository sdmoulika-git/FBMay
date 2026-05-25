Feature: login feature  of Face book page
We need validate the login feature test sceanrios


@SIT
Scenario:  Validate the login fetaure with Valid username and password
Given user is on login page
When user enters valid username "Testing@gmailcom"
And user enters valid password "P22332"
And clicks on submit button
@SIT
Scenario:  Validate the login fetaure with inValid username and password
Given user is on login page
When user enters valid username "Testing@gmailcom"
And user enters valid password "P22332"
And clicks on submit button
Then user should be able to see error message

@smoke
Scenario Outline: Validate the login functionality with valid username and password
 
 Given user is on login page
 When user enters valid usernameM "<username>"
 And user enters valid passwordM "<password>"
And clicks on submit button
 
 Examples: 
|username|password|
|kphp@gmailcom|P3234#$$$|
|selenium@gmaillcom|P334sdTet|