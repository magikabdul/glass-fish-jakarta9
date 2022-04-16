package cloud.cholewa.glassfishjakarta9.people;

import jakarta.enterprise.inject.Default;
import jakarta.enterprise.inject.Produces;

public class PeopleFactory {

//    @Produces
    @Default
    public PeopleService createService() {
        return new PeopleService();
    }
}
