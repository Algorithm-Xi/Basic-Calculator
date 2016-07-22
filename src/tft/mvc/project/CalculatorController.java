package tft.mvc.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Donta on 7/18/16.
 */
public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;
    private boolean add;








    public CalculatorController(CalculatorView theView,  CalculatorModel theModel) {

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());

    }


        class CalculateListener implements ActionListener {




            public void actionPerformed(ActionEvent e) {






                    int firstNumber, secondNumber = 0;

                    try {
                        firstNumber = theView.getFirstNumber();
                        secondNumber = theView.getSecondNumber();

                        theModel.addTwoNumbers(firstNumber, secondNumber);
                        theView.setCalcSolution(theModel.getCalculationValue());

                    } catch (NumberFormatException ex) {
                        theView.displayErrorMessage("you need to enter 2 integers");
                    }


            }
        }




        class CalculateListenerTwo implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                int thirdNumber, fourthNumber = 0;

                try {





                } catch (NumberFormatException ex) {
                    theView.displayErrorMessage("you have to enter 2 intergers");
                }

            }
        }

}
