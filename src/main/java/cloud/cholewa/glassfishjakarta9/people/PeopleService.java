package cloud.cholewa.glassfishjakarta9.people;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class PeopleService {

    private final List<Person> peoples = new ArrayList<>();

    @PostConstruct
    public void init() {
        peoples.add(new Person("Adam", 34));
        peoples.add(new Person("Evan", 12));
        peoples.add(new Person("Tom", 52));
    }

    public List<Person> getAllPersons() {
        return peoples;
    }

    public Person addPerson(Person person) {
        peoples.add(person);
        return person;
    }
}
