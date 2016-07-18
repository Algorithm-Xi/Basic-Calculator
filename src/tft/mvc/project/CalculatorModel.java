package tft.mvc.project;

/**
 * Created by Donta on 7/18/16.
 */
public class CalculatorModel {

    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber;


    }

    public int getCalculationValue(){
        return calculationValue;
    }


}
