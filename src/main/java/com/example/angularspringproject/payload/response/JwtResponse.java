package com.example.angularspringproject.payload.response;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Integer id;
    private String pseudo;
    private String email;


    public JwtResponse(String accessToken, Integer id, String pseudo, String email) {
        this.token = accessToken;
        this.id = id;
        this.pseudo = pseudo;
        this.email = email;

    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

}
