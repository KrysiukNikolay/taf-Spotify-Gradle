package spotify.ui.data;

import com.github.javafaker.Faker;

public class UserData {

    static Faker faker = new Faker();

    public static final String USER_EMAIL = "krysiuk.nikolay@gmail.com";
    public static final String USER_PASSWORD = "Spotify2013";
    public static final String EMPTY_USER_EMAIL = "";
    public static final String EMPTU_USER_PASSWORD = "";
    public static final String RANDOM_USER_EMAIL = faker.internet().emailAddress();
    public static final String RANDOM_USER_PASSWORD = faker.internet().password(
            7
            ,14
            ,true
            ,true);
}
