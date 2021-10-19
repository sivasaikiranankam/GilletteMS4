Feature: Open the Gillette Website  

Scenario: Check item in Urban Ladder website
Given Open Browser 
And navigate to given url
When we Enter "shaving cream" in searchbox and search
Then check item is present or not

Scenario: Check item in Urban Ladder website
Given Open Browser 
And navigate to given url
When Click on shop all products
Then verify wheather rasors and trimmers are present or not

Scenario: Check item in Urban Ladder website
Given Open Browser 
And navigate to given url
When click on terms and condtions in footer
Then verify code of conduct is present or not

















