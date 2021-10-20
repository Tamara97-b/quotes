

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
        @Test public void testRandomNum(){

            Gson gson = new Gson();

            FileReader fr= null;
            try {
                fr = new FileReader("./src/test/resources/recentquoites.json");
                BufferedReader br=new BufferedReader(fr);

                ArrayList<HashMap> json = gson.fromJson(br, ArrayList.class);

                br.close();
                fr.close();

                int Random = (int)(Math.random()*json.size());
                for(int i=1 ; i<10000;i++) {
                    assertTrue(Random >= 0 && Random < json.size());
                }
                System.out.println("random value is between the 0 and ArrayList size");



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedReader br=new BufferedReader(fr);
        }

    }