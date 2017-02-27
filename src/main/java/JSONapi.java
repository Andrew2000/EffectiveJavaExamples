/**
 * Created by andrewlee on 2/25/17.
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.google.gson.*;

public class JSONapi {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        JSONapi example = new JSONapi();
        String response = example.run("http://swapi.co/api/people");


        JsonParser parser = new JsonParser();
        JsonObject rootObj = parser.parse(response).getAsJsonObject();
        System.out.println(rootObj);
        //System.out.println(response);

        Gson gson = new Gson();

        //String jsonOutput = gson.toJson(response);
        //System.out.println(jsonOutput);
        Swapi s = gson.fromJson(rootObj, Swapi.class);

        //System.out.println(s.getResults().toString());

        List<Result> Swapilist = s.getResults();
        System.out.println(Swapilist.get(0).getName());
        List<Result> sorted = Swapilist.stream()
             .filter(b -> "Luke Skywalker".equals(b.getName()))
                .collect(Collectors.toList());
        System.out.println(sorted);
             //   .map(h -> h.name)
             //   .collect(Collectors.toList());
        //System.out.println("Persons: " + sorted);

    }
}