package dtos;

public class OwnerData extends Data {
    private String address;

    public OwnerData(String name, String address){
        super(name);
        this.address = address;
    }

}
