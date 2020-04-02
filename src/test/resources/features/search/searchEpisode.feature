Feature: Search episode

 @cucumber
  Scenario: User navigates to IMBD home page
	Given As a new user navigates to IMDb home page
	And Navigate to top rated shows
	And Search for "Game of thrones"
	When select Game of Thrones The Last Watch link from the suggestion window
	Then user should able to verify the title of selected episode "Game of Thrones: The Last Watch"
	Then user should able to verify the rating "7.2"
	Then user should able to verify the number of reviews "5253"

  @cucumber
  Scenario: Sign-Up in IMDB
   Given As a user click on the Sign In link displayed on the top right corner 
   And click the Create a New Account button
   When create an  account by filling the registration form
   Then Verify whether the newly registered user was able to login to the application