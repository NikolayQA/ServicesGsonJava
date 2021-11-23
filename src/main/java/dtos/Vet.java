package dtos;

public class Vet {

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    private String firstName;

    public Vet(String name){
        this.firstName = name;
    }
}
