package cucumber.practiceSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeAllStepDef {

    @Given("I want to go to school1")
    public void wantTogoToSchool1(){
        System.out.println("I want to go to school1");
    }

    @When("I drive my car1")
    public void driveMyCar1(){
        System.out.println("I drive my car1");
    }

    @Then("I will arrive1")
    public void willArrive1(){
        System.out.println("I will Arrive1");
    }

    @Given("1I have {int} money")
    public void moneyIhaveI(int amount1){
        System.out.println("1I have money: " + amount1);
    }

    @When("1going to dealer ship")
    public void goingToDealerShipI(){
        System.out.println("1going to dealer ship");
    }
    @Then("II can buy {string}")
    public void buyingCarMakeI(String carMake1){
        System.out.println("1I can buy car: " + carMake1);
    }
}
