#you are going to go on github
#first commit
Feature: To test the functionality of JavaTpoint website
Scenario: To Navigate through the homepage of the website
Given Open "facebook" homepage
And go to "signUp" tab
When We fill in FirstNameValue in FirstName
|	4			|	Name	 	|
|	Sid			|	firstname	|
|	Jadhav		|	lastname	|
|	090999989	|	reg_email__	|
|Kkjkj@1234		|	reg_passwd__|
Then Title as "u_0_q"
When We fill in FirstNameValue in FirstName
|	2			|				|
|99999999		|	email		|
|hsfsfsf		|	pass		|

And Title as "u_0_r"