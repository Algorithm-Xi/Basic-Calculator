package tft.mvc.project;

/**
 * Created by Donta on 7/18/16.
 */

import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculatorView extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Add");
    private JTextField calcSolution = new JTextField(10);

    private JButton calculateButtonTwo = new JButton("-");
    private JButton calculateButtonThree = new JButton("x");
    private JButton calculateButtonFour = new JButton("/");











    CalculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        //Additon

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        //Subtraction

        calcPanel.add(calculateButtonTwo);

        //Multiplication

        calcPanel.add(calculateButtonThree);
        calcPanel.add(calculateButtonFour);





        this.add(calcPanel);





    }

    //Additon


    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());

    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());

    }

    public void setCalcSolution(int solution) {

        calcSolution.setText(Integer.toString(solution));


    }

    void addCalculationListener(ActionListener listenerForCalcButton){
        calculateButton.addActionListener(listenerForCalcButton);

    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);


    }

    //Subtraction

    void addCalculationListenerTwo(ActionListener listenrForCalcButton) {
        calculateButtonTwo.addActionListener(listenrForCalcButton);
    }

    void displayErrorMessageTwo(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);

    }



}
