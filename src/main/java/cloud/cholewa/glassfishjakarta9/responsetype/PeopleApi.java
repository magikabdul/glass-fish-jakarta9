package cloud.cholewa.glassfishjakarta9.responsetype;

import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Path("peoples")
public class PeopleApi {

    private final Set<Person> peoples = new HashSet<>();

    @PostConstruct
    public void init() {
        peoples.add(new Person("Adam", 34));
        peoples.add(new Person("Evan", 12));
    }


    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllPeoples() {
        return new ArrayList<>(peoples);
    }
}
