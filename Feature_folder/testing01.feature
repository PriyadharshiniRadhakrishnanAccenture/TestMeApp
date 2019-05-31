Feature: Login Test
- Description(optional):Registered user can login into TestMe App using proper credentials.
- Pre-Requiste: Registration module should be completed.

Example Mapping:

Business Rule1: Signin link
Business Rule2: Signup link
Acceptance criteria: Registered user should be logged in success to TestMe for search product.
Example: john wish to purchasing an item from TestMeApp, he should login first to complete his transaction.

Scenario: Login with valid credentials
Given user launch chrome browser And enter TestMe URL
When user enter username in username field
When user enter password in password field
When user clicks on OK button
Then verify result