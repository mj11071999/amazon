package Http_Methods;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

import com.aventstack.extentreports.gherkin.model.Then;
public class Get_Request {
  public static void main(String[] args) {
	  RestAssured.baseURI="https://reqres.in/";//domainendpoint
	  Response response = given().queryParam("page", 2).when().get("/api/users/").then().extract().response();
	  System.out.println(response.asPrettyString());
	  JsonPath jsonPath = response.jsonPath();
	  Object object = jsonPath.get("data.first_name");
	  System.out.println(object);
	  
	  
	  
	  
	  
}
}
