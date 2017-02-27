/**
 * Created by andrewlee on 2/25/17.
 */
import com.google.gson.Gson;

public class StreamJSON {

    public static void main(String[] args) {

        Gson g = new Gson();

        Person person = g.fromJson("{\"name\": \"John\"}", Person.class);
        System.out.println(person.name); //John

        System.out.println(g.toJson(person)); // {"name":"John"}
    }
}
