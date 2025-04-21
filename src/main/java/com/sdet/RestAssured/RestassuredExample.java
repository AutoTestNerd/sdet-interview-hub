package com.sdet.RestAssured;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class RestassuredExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://api.restful-api.dev";
        Map<String,String > querparam = new HashMap<>();
        querparam.put("page" ,"2");
        Map<String,String > pathparam = new HashMap<>();
        pathparam.put("role" ,"users");
//
//       Response response = RestAssured.given()
//               .queryParams(querparam)
//               .pathParams(pathparam)
//               .log().uri()
//                .when()
//                .get("/api/{role}")
//                .then()
//                .extract()
//                .response();
//     String resp=  response.getBody().asString();
//        JsonPath jsonPath = response.jsonPath();
//        List<String> lastNames=   jsonPath.getList("data.last_name");
//        System.out.println("Last Names:");
//        lastNames.forEach(System.out::println);
//        List<Integer> id = jsonPath.getList("data.id");
//        System.out.println("ID:");
//
//        id.forEach(System.out::println);


//     System.out.println(response.jsonPath().getString("last_name"));




     //Post Call
        String payload= "{\n" +
                "   \"name\": \"Apple MacBook Pro 16\",\n" +
                "   \"data\": {\n" +
                "      \"year\": 2019,\n" +
                "      \"price\": 1849.99,\n" +
                "      \"CPU model\": \"Intel Core i9\",\n" +
                "      \"Hard disk size\": \"1 TB\"\n" +
                "   }\n" +
                "}";

     Response res =   RestAssured.given()
             .contentType("application/json")
                .when()
                .body(payload)
                .post("/objects")
                .then()
                .extract()
                .response();


     System.out.println(res.getBody().asString());
     String resp = res.getBody().asString().toString();
       String reseult = JsonPath.read(resp ,"$.data['Hard disk size']");
//        JsonPath jsonPath = res.jsonPath();
//
//       String resut = jsonPath.get("data['CPU model']");
        System.out.println(reseult);




    }


}
