package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllStepDef {

    @Given("I want to go to school")
    public void wantTogoToSchool(){
        System.out.println("I want to go to school ");
    }

    @When("I drive my car")
    public void driveMyCar(){
        System.out.println("I drive my car");
    }

    @Then("I will arrive")
    public void willDrive(){
        System.out.println("I will arrive");
    }

    @Given("I have {int} money")
    public void moneyIHave(int amount){
        System.out.println("I have money: " + amount);
    }

    @When("going to dealer ship")
    public void goingToDealerShip(){
        System.out.println("going to dealer ship");
    }

    @Then("I can buy {string}")
    public void buyingCarMake(String carMake){
        System.out.println("I can buy Car " + carMake);
    }

}
