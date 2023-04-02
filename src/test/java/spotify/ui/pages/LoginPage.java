package spotify.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

  private final By INPUT_USERNAME = By.xpath("//input[@id='login-username']");
  private final By INPUT_PASSWORD = By.xpath("//input[@id='login-password']");
  private final By BUTTON_LOGIN_BASE_PAGE = By.xpath("//button[@data-testid='login-button']");
  private final By BUTTON_LOGIN_AUTORIZATION_PAGE = By.xpath("//span[@class='Type__TypeElement-sc-goli3j-0 kwLSIj sc-eDvSVe itlAHd']");
  private final By TEXT_INCORRECT_USERNAME_OR_PASSWORD = By.xpath("//span[@class='Message-sc-15vkh7g-0 dHbxKh']");
  private final By USER_IMG_AVATAR = By.xpath("//div[@class='KdxlBanhDJjzmHfqhP0X']");
  public static String expectedErrorMessageLogin = "Incorrect username or password.";

  public LoginPage inputUsername(String username) {
    WebElement userNameLogIn = driver.findElement(INPUT_USERNAME);
    userNameLogIn.sendKeys(username);
    return this;
  }

  public LoginPage inputPassword(String password) {
    WebElement userPassword = driver.findElement(INPUT_PASSWORD);
    userPassword.sendKeys(password);
    return this;
  }

  public LoginPage clickLogin() {
    WebElement buttonLogIn = driver.findElement(BUTTON_LOGIN_BASE_PAGE);
    buttonLogIn.click();
    return this;
  }

  public LoginPage enterLoginUser() {
    WebElement buttonLogInUser = driver.findElement(BUTTON_LOGIN_AUTORIZATION_PAGE);
    buttonLogInUser.click();
    return this;
  }

  public boolean isDisplayedAvatar() {
    WebElement userAvatar = driver.findElement(USER_IMG_AVATAR);
    return userAvatar.isDisplayed();
  }

  public String errorMessageAutorization(){
    WebElement errorAutorization = driver.findElement(TEXT_INCORRECT_USERNAME_OR_PASSWORD);
    return errorAutorization.getText();
  }
}
