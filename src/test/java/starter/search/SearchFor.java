package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SearchFor extends UIInteractionSteps {

   
    @Step("Navigate to top rated shows")
    public void navigateToTopRatedShows() {
        $(SearchForm.MENU_BUTTON).click();
        $(SearchForm.TOP_RATED_PROGRAM).click();
    }
    
    @Step("Search for {string}")
    public void searchText(String episodeName) {
        $(SearchForm.SEARCH_FIELD).sendKeys(episodeName);
       
       
    }
    @Step("select Game of Thrones The Last Watch link from the suggestion window")
    public void selectWebSeries() {
    	 $(SearchForm.SELECT_EPISODE).click();
    }
    
    @Step("user should able to verify the title of selected episode {string}")
    public String verifyTitle() {
    	 return  $(SearchForm.RATINGS).getText();
    }
    
    @Step("user should able to verify the rating {string}")
    public String verifyRatings() {
    	return $(SearchForm.RATINGS).getText();
    }
    
    @Step("user should able to verify the number of reviews {string}")
    public String verifyReviews() {
    	return $(SearchForm.REVIEW).getText();
    }
}
