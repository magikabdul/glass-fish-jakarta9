package cloud.cholewa.glassfishjakarta9.people;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("peoples")
public class PeopleApi {

    @Inject
    private PeopleService peopleService;

    @GET
    public List<Person> getAllPeoples() {
        return peopleService.getAllPersons();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Person addPerson(Person person) {
        return peopleService.addPerson(person);
    }
}
