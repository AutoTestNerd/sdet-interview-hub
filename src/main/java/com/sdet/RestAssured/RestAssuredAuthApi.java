package com.sdet.RestAssured;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredAuthApi {
    public static void main(String[] args) {

        String payload ="{\n" +
                "  \"username\": \"emilys\",\n" +
                "  \"password\": \"emilyspass\",\n" +
                "  \"expiresInMins\": 30\n" +
                "}";
        RestAssured.baseURI ="https://dummyjson.com/auth";
      Response res = RestAssured.given()
                .contentType("application/json")
                .body(payload)
                .when()
                .post("/login")
                .then()
                .extract().response();

        System.out.println(res.getBody().asString());
        String RespSTring = res.getBody().asString();
        String accessToken =JsonPath.read(RespSTring,"$.accessToken");
        System.out.println(accessToken);


        Response authResp =RestAssured.given()
                .header("Authorization" ,"Bearer "+accessToken)
                .when()
                .get("/auth/me")
                .then()
                .extract().response();
        System.out.println(authResp.getBody().asString());



    }
}
