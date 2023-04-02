package spotify.ui.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import spotify.ui.driver.DriverSetup;
import spotify.ui.pages.HomePage;

public class BaseTest extends HomePage {

    @BeforeEach
    public void warmUP(){
        openWebSite();
}

    @AfterEach
    public void tearDown() {
        DriverSetup.closeDriver();
  }
}
