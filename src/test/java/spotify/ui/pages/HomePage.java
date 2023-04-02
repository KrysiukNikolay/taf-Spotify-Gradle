package spotify.ui.pages;

public class HomePage extends BasePage{

    public static final String URL = "https://open.spotify.com/";
    public void openWebSite() {
        driver.get(URL);
    }
}
