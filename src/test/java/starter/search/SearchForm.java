package starter.search;

import org.openqa.selenium.By;

class SearchForm {
    static By SEARCH_FIELD = By.name("q");
    static By SEARCH_BUTTON = By.cssSelector(".search__button");
    static By MENU_BUTTON = By.xpath("//*[@id=\"imdbHeader-navDrawerOpen--desktop\"]/div");
    static By TOP_RATED_PROGRAM= By.linkText("Top Rated Shows");
    static By SELECT_EPISODE = By.xpath("//*[@id=\"react-autowhatever-1--item-5\"]/a/div[2]/div[1]");
    static By RATINGS= By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/a/span");
    static By REVIEW= By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/strong/span");
}
