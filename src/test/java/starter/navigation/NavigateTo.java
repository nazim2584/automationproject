package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    HomePage homePage;

    @Step("Open the IMDB home page")
    public void imdbHomePage() {
    	homePage.open();
    }
   
}
