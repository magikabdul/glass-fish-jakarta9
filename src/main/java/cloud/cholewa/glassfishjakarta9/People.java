package cloud.cholewa.glassfishjakarta9;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("peoples")
public class People {

    @GET()
    @Path("{name}")
    public String getPeople(@PathParam("name") String name) {
        return "The name is " + name;
    }
}
