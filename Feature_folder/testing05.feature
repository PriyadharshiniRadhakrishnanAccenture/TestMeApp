Feature: The user one who wants to select product and proceed with checkout

Scenario: Select product and proceed checkout

Given user login to TestMeApp
When user select product as "laptop/headphone"
When user clicks on add to cart
When user clicks on cart link
When user provides quantity as 1
When user proceed checkout
Then verify the review and payment page
 