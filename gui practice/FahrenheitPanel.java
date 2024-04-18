import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel{
    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField fahrenheit;

    public FahrenheitPanel(){
        inputLabel = new JLabel("Enter fahrenheit temperature");
        outputLabel = new JLabel("temperature in celsius");
        resultLabel = new JLabel("___");

        fahrenheit  = new JTextField(5);
        fahrenheit.addActionListener(new TempListener());

        add(inputLabel);
        add(fahrenheit);
        add(outputLabel);
        add(resultLabel);

        setPreferredSize(new Dimension (300, 90));
        setBackground(Color.red);

    }

    private class TempListener implements ActionListener{
        public void actionPerformed(ActionEvent event){

            int fahrenheitTemp, celsiusTemp;

            String text = fahrenheit.getText();
            fahrenheitTemp = Integer.parseInt(text);
            celsiusTemp = (fahrenheitTemp-32)*5/9;

            resultLabel.setText(Integer.toString(celsiusTemp));

        }

    }
    

}


