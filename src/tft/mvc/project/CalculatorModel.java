package tft.mvc.project;

/**
 * Created by Donta on 7/18/16.
 */
public class CalculatorModel {

    private int calculationValue;

    private int calculationValueTwo;


    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue(){

        return calculationValue;
    }


    public void subtractTwoNumbers(int secondNumber, int thirdNumber) { calculationValueTwo = secondNumber - thirdNumber; }

    public int getCalculationValueTwo() {

        return calculationValueTwo;  }


}
