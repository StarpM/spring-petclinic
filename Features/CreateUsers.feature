Feature: The created users should exist				
Scenario Outline: Verification for the user database

Given Open Chrome and launch the application
When I go on the owner page
And I go on the create owner page
And I enter his firstName '<firstName>'
# And I fill the form with the following datas '<firstName>' '<lastName>' '<address>' '<city>' '<telephone>' 
And I enter his lastName '<lastName>'
And I enter his address '<address>'
And I enter his city '<city>'
And I enter his telephone '<telephone>'
Then The previously created users should exist

Examples:
|firstName  |lastName  |address     |city    |telephone  |
|Toto       |Dupont    |rue tutu    |Lille   |0102030405 |
|Tata       |Dupond    |square fake |Paris   |1112131415 |
|Titi       |Martin    |allée foo   |Calais  |0508090607 |