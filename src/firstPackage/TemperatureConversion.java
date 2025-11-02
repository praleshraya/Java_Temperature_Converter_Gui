package firstPackage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConversion {
    public static void main(String[] args) {
        // I am creating frame here called JFrame
        JFrame frame = new JFrame("Temperature Converter - By Pralesh Rayamajhi");

        ImageIcon icon = new ImageIcon("C:\\Users\\LENOVO\\Desktop\\LOGOCF.png");  // Replace with your logo file path
        frame.setIconImage(icon.getImage());

        // We need to set out layout for my JFrame i.e size
        frame.setLayout(null);
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Now I have to create some text named as labels here
        JLabel labelCelsius = new JLabel("Enter Temperature in Celsius:");
        labelCelsius.setBounds(20, 20, 200, 30);
        frame.add(labelCelsius);

        // Now i am creating text field to enter and has size.
        JTextField textCelsius = new JTextField();
        textCelsius.setBounds(220, 20, 100, 30);
        frame.add(textCelsius);

        // creating label for temp in Fahrenheit.
        JLabel labelFahrenheit = new JLabel("Enter Temperature in Fahrenheit:");
        labelFahrenheit.setBounds(20, 60, 200, 30);
        frame.add(labelFahrenheit);

        // creating input text filed for temp in Fahrenheit.
        JTextField textFahrenheit = new JTextField();
        textFahrenheit.setBounds(220, 60, 100, 30);
        frame.add(textFahrenheit);

        // Create the button to convert Celsius to Fahrenheit
        JButton buttonConvertCelsius = new JButton("Convert Celsius to Fahrenheit");
        buttonConvertCelsius.setBounds(50, 100, 250, 30);
        frame.add(buttonConvertCelsius);


        // Create the button to convert Fahrenheit to Celsius
        JButton buttonConvertFahrenheit = new JButton("Convert Fahrenheit to Celsius");
        buttonConvertFahrenheit.setBounds(50, 140, 250, 30);
        frame.add(buttonConvertFahrenheit);

        // Create the button to exit
        JButton buttonToExit = new JButton("Close");
        buttonToExit.setBounds(50, 180, 250, 30);
        frame.add(buttonToExit);

        // Create the label for displaying the results
        JLabel labelResult = new JLabel("Your results : ");
        labelResult.setBounds(20, 220, 350, 30);
        frame.add(labelResult);


        // Adding action listener to convert Celsius to Fahrenheit
        buttonConvertCelsius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // get the Celsius input
                    double celsius = Double.parseDouble(textCelsius.getText());

                    // conversion logic to fahrenheit
                    double fahrenheit = (celsius * 9 / 5) + 32;

                    // Display the result
                    labelResult.setText("Fahrenheit: " + fahrenheit);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for Celsius.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // adding action listener to convert Celsius to Fahrenheit
        buttonConvertFahrenheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // getting the Fahrenheit input
                    double fahrenheit = Double.parseDouble(textFahrenheit.getText());

                    // conversion logic to celsius
                    double celsius = (fahrenheit - 32) * 5 / 9;

                    // Displaying the result
                    labelResult.setText("Celsius: " + celsius);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for Fahrenheit.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonToExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // this will make our form visible.
        frame.setVisible(true);
    }
}