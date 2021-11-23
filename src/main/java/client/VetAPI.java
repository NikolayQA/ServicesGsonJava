package client;

import com.google.gson.Gson;
import dtos.Vet;
import enums.AuthType;

import java.util.ArrayList;
import java.util.List;

public class VetAPI extends HTTPClient{
    private static final Gson GSON = new Gson()
            .newBuilder()
            .setPrettyPrinting()
            .create();

    public VetAPI(AuthType auth, String token) {
        super(auth, token);
    }

    public VetAPI() {
        super(AuthType.NO_AUTH, "");
    }

    public List<Vet> createVet(Vet vet){
        post("/vets", GSON.toJson(vet));
        List<Vet> vets = new ArrayList<>();
        vets.add(new Vet("Ivan"));
        vets.add(new Vet("Alex"));
        vets.add(new Vet("Milen"));
        return vets;
    }
}
