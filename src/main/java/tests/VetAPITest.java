package tests;

import client.VetAPI;
import dtos.Vet;
import enums.AuthType;

import java.util.List;

public class VetAPITest {

    public static void main(String[] args) {
        VetAPI vetAPI = new VetAPI(AuthType.NO_AUTH, "" );
        Vet vet = new Vet("Maria");
        vetAPI.createVet(vet);
        //Check that the response is correct
        VetAPI noAuthVetAPI = new VetAPI();
        List<Vet> vets = noAuthVetAPI.createVet(vet);
        System.out.println("Total count of vets returned:" + vets.size());
        long countE = vets.stream().filter(v -> v.getFirstName().startsWith("M")).count();
        System.out.println("People count with name containing e:" + countE);
    }
}
