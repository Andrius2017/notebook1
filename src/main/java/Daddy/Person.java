package Daddy;

import java.util.ArrayList;
import java.util.List;


public class Person extends Record {


    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String phones;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhone(String phones) {
        this.phones = phones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Daddy.Person{" +

                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phones + '\'' +
                '}';
    }
}

