Feature: To validate facebook login

In order to validate facebook login 
As a user 
I will give valid username and password and validate the login


Scenario: To validate the facebook login 

Given I am on the facebook webite
And I give  the username in the username feild 
And give the password in the password feild 
And I clik on the login 
Then I am able to successfully login the facebook website
And I  will see my username in the top
