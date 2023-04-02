package spotify.ui.steps;

import spotify.ui.pages.SearchPage;

public class SearchArtistSteps {

    public static void stepsSearchArtist (String nameArtist){
        new SearchPage()
                .clickSearch()
                .inputSearchRequest(nameArtist);
    }
}
