package dtos;

import java.util.List;

public class Owner {

    public void setId(int id){this.id = id;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   // public void setAge(int age) {this.age = age;}

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    public void setPhones(List<Phones> phone){this.phone = phone; }

    public void setPet(List<Pet> pets){this.pets = pets;}


    private String firstName;
    private String lastName;
    private int age;
    private int id;

    private List<Car> cars;
    private List<Pet> pets;
    private List<Phones> phone;
}
