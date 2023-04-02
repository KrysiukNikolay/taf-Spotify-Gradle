package spotify.ui.steps;

import spotify.ui.pages.LoginPage;

public class LoginUserSteps {

  public static void stepsUserLogIn (String name, String password){
    new LoginPage()
            .clickLogin()
            .inputUsername(name)
            .inputPassword(password)
            .enterLoginUser();
  }
}
