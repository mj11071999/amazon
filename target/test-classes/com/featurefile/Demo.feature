Feature: checking add to chart functionality
Background:
Given user must launch the browser

@login
Scenario Outline: login functionality
Given user must launch the url
When user enter the "<usern>" in username field
And user enter the "<passw>" in the password field
Then user click on login button and it navigate to the products page

Examples:
|usern|passw|
|abc|123|
|fghuj|89090|
|standard_user|secret_sauce|


Scenario: search product functionality
When user add to their chart button
Then user click on the add to chart button and it navigate to the next page

Scenario: checkout functionality
Then user click on the checkout button and it navigate to the next page

Scenario Outline: Giving address and customer details functionality
When user entering their "<first>" in the name field
And user entering their "<second>" in the secondname field
And user entering their "<postal>" in the box
Then user click on continue and it navigate to the next page

Examples:
|first|second|postal|
|merlin|jervice|60066|
|john|richard|700067|
|deva|tamizharasan|300099|


Scenario: payment functionality
Then user click to finish button to conform the order