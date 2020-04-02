package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;

import static org.assertj.core.api.Assertions.assertThat;
import static starter.matchers.TextMatcher.textOf;

public class SearchEpisodeStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Given("As a new user navigates to IMDb home page")
    public void navigatesToIMDBPage() {
        navigateTo.imdbHomePage();
        
    }
    
    @And("Search for {string}")
    public void searchTopRatedShows(String text) {
    	searchFor.searchText(text);
    	
    }
    @And("Navigate to top rated shows")
    public void topRatedShows() {
    	searchFor.navigateToTopRatedShows();	
    }
    
    @When("select Game of Thrones The Last Watch link from the suggestion window")
    public void selectEpisode() {
        searchFor.selectWebSeries();
    }
    
    
    @Then("user should able to verify the title of selected episode {string}")
    public void titleofSelectedEpisode(String episode) {
    	
        assertThat(episode.equalsIgnoreCase(searchFor.verifyTitle()));
    }
    @Then("user should able to verify the rating {string}")
    public void ratingOfEpisode(String rating) {
    	 assertThat(rating.equalsIgnoreCase(searchFor.verifyTitle()));
    }
    @Then("user should able to verify the number of reviews {string}")
    public void reviewsOfEpisode(String reviewNumber) {
    	 assertThat(reviewNumber.equalsIgnoreCase(searchFor.verifyTitle()));
    }
    
}
