package com.sdet.RestAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Restassured_ApiWIthPojo {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        Response res = RestAssured.given()
                .when().get("/users/1")
                .then()
                .extract()
                .response();

        ObjectMapper mapper = new ObjectMapper();
        try {
            UserResponse user = mapper.readValue(res.asString(), UserResponse.class);


            System.out.println("Name: " + user.getName());
            System.out.println("City: " + user.getAddress().getCity());
            System.out.println("Company: " + user.getCompany().getName());

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


        //post Call

        AdreesR address = new AdreesR("123 Elm Street", "manishass", "manis");
        UserRequest users = new UserRequest("Manish", " Manager", address);

        ObjectMapper map = new ObjectMapper();
        String usersRequet;
        try {
            usersRequet = map.writeValueAsString(users);
            Response respUSer = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(usersRequet).when().post("/users")
                    .then().extract().response();
            System.out.println("Resposne ---" +respUSer.getBody().asString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }
}
