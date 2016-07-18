package tft.mvc.project;

/**
 * Created by Donta on 7/18/16.
 */
public class MVC {

    public static void main(String[] args) {


        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView, theModel);


        theView.setVisible(true);

    }

}
