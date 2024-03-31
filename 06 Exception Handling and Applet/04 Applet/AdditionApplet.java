import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionApplet extends Applet implements ActionListener {
    private TextField num1Field;
    private TextField num2Field;
    private Button addButton;
    private Label resultLabel;

    public void init() {
        // Create and initialize GUI components
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        addButton = new Button("Add");
        resultLabel = new Label("Result: ");

        // Add action listener to the button
        addButton.addActionListener(this);

        // Add components to the applet
        add(new Label("Enter the first number: "));
        add(num1Field);
        add(new Label("Enter the second number: "));
        add(num2Field);
        add(addButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            // Get the user-entered numbers from the text fields
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Calculate the sum
                int sum = num1 + num2;

                // Display the result
                resultLabel.setText("Result: " + sum);
            } catch (NumberFormatException ex) {
                // Handle invalid input
                resultLabel.setText("Result: Invalid input");
            }
        }
    }
}
