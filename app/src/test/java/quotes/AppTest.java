

package quotes;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


    class AppTest {

        @Test public void getFromJson(){
        String path ="./src/test/resources/recentquoites.json";
            String expectedAuther= "Marilyn Monroe";
            ArrayList<Quotes> testResult = App.getQuotesFromFile(path);
            assertNotNull(testResult);
            System.out.println(testResult.get(0).getAuthor());
            System.out.println(expectedAuther);
            assertEquals(expectedAuther,testResult.get(0).getAuthor());

        }

        @Test public void sendGetRequest(){
            String url = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";
            assertNotNull(App.sendGetRequest(url));


        }
    }