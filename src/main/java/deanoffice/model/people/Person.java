package deanoffice.model.people;

import deanoffice.model.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    private String name;
    private String surname;
    private String email;
    private Address address;
}
