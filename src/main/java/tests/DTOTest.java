package tests;

import com.google.gson.Gson;
import dtos.Car;
import dtos.Data;
import dtos.Owner;
import dtos.OwnerData;
import enums.FuelType;

import java.util.ArrayList;
import java.util.List;

public class DTOTest {
    private static final Gson GSON = new Gson()
            .newBuilder()
            .setPrettyPrinting()
            .create();

    public static void main(String[] args) {
        //Configure ford instance
        Car ford = new Car(FuelType.PETROL);
        ford.setModel("Cuga");
        ford.setYear("2015");
        //Create list with one car
        List<Car> cars = new ArrayList<>();
        cars.add(ford);
        //Configure owner values
        Owner ivan = new Owner();
       // ivan.setAge(30);
        ivan.setFirstName("Ivan");
        ivan.setLastName("Ivanov");
        ivan.setCars(cars);
        System.out.println(GSON.toJson(ivan));
        //Creating new instance of OwnerData
        OwnerData ivanData = new OwnerData("Ivan", "Mladost 4");
        System.out.println(GSON.toJson(ivanData));

        String jsonData = "{\"name\": \"Ivan\"}";
        System.out.println("Json data:" + jsonData);
        Data deserializedData = GSON.fromJson(jsonData, Data.class);
        System.out.println("The name of the person is:" + deserializedData.getName());
    }
}
