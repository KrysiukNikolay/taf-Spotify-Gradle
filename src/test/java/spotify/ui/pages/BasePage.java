package spotify.ui.pages;

import org.openqa.selenium.WebDriver;
import spotify.ui.driver.DriverSetup;

public class BasePage {

  protected WebDriver driver;
  public BasePage() {
    driver = DriverSetup.createDriver();
  }
}
