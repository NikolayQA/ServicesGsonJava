package tests;

import com.google.gson.Gson;
import dtos.*;


import java.util.ArrayList;
import java.util.List;

public class PetTest {
    private static final Gson GSON = new Gson()
            .newBuilder()
            .setPrettyPrinting()
            .create();

    public static void main(String[] args) {

        //Add phones
        Phones phone = new Phones();
        phone.setPhone("mobile", "6523696333");
        Phones phone1 = new Phones();
        phone1.setPhone("mobile", "3242442344");
        List<Phones> phones = new ArrayList<>();
        phones.add(phone);
        phones.add(phone1);
        //Configure owner values
        Owner ivan = new Owner();
        ivan.setId(5);
        ivan.setFirstName("Ivan");
        ivan.setLastName("Ivanov");
        ivan.setPhones(phones);
        System.out.println(GSON.toJson(ivan) + "animal:");
        //Configure Animal instance
        Pet pet = new Pet();
        pet.setType("dog");
        pet.setName("Lassy");
        pet.setAge(5);
        System.out.println(GSON.toJson(pet));
        //Creating new instance of OwnerData
        OwnerData ivanData = new OwnerData("Ivan", "Mladost 4");
        System.out.println(GSON.toJson(ivanData));

        String jsonData = "{\"name\": \"Ivan\"}";
        System.out.println("Json data:" + jsonData);
        Data deserializedData = GSON.fromJson(jsonData, Data.class);
        System.out.println("The name of the person is:" + deserializedData.getName());
    }
}
