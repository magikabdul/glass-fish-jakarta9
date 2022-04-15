package cloud.cholewa.glassfishjakarta9;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("calculator")
public class Calculator {

    @QueryParam("a")
    private int a;

    @QueryParam("b")
    private int b;

    @GET()
    @Path("add")
    public String add() {
        return String.format("Sum of %d and %d = %d", a, b, (a + b));
    }
}
