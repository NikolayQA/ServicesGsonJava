package client;

import enums.AuthType;

public class HTTPClient {
    private AuthType auth;
    private String token;

    public HTTPClient(AuthType auth, String token) {
        this.auth = auth;
        this.token = token;
    }

    protected void post(String url, String body) {
        System.out.println("Setting headers:" + "Authorization |" + auth + " " + token);
        System.out.println("Sending post request to: " + url + " with body: " + body);
    }

}
