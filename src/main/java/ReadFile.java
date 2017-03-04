/**
 * Created by andrewlee on 3/3/17.
 */
import java.io.*;

public class ReadFile {

    private static final String FILENAME = "test.json";

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;


        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}