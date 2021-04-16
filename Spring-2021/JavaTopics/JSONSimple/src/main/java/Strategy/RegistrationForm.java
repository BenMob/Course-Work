package Strategy;

import Listeners.GoToLoginButtonListener;
import Listeners.RegisterButtonListener;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JPanel implements FormIF {
    private JLabel headerLabel;
    private JButton submitButton;
    private JButton loginButton;
    private JLabel inputBoxLabel;
    private JTextField inputBox;

    private final ImageIcon icon = new ImageIcon("amongus.png");
    private final String headerLabelText = "REGISTER";
    private final String submitButtonLabelText = "Submit";
    private final String loginButtonLabeltext = "Login";
    private final String inputBoxLabelText = "NEW USERNAME:";
    private final int MAX_LENGTH = 20;

    private Screen appScreen;


    public RegistrationForm(Screen appScreen){
        this.headerLabel = new JLabel(headerLabelText);
        this.submitButton = new JButton(submitButtonLabelText);
        this.loginButton = new JButton(loginButtonLabeltext);

        this.appScreen = appScreen;
        this.loginButton.addActionListener(new GoToLoginButtonListener(appScreen));
        this.submitButton.addActionListener(new RegisterButtonListener());

        this.inputBoxLabel = new JLabel(inputBoxLabelText);
        this.inputBox = new JTextField(MAX_LENGTH);
        System.out.println("Creating registration form!");
        this.build();
    }

    public void build(){
        this.setLayout(new BorderLayout());
        this.headerLabel.setFont(new Font("Bold",20, 20));
        this.headerLabel.setForeground(Color.WHITE);

        //Creating the header
        JPanel headerContainer = new JPanel();
        headerContainer.setLayout(new FlowLayout());
        headerContainer.add(headerLabel);
        headerContainer.setBackground(new Color(201, 41, 63));

        // Create the icon container
        JPanel iconContainer = new JPanel();
        iconContainer.setLayout(new BorderLayout());
        JLabel theIcon = new JLabel(icon);

        // Create the formData container
        JPanel formDataContainer = new JPanel();
        formDataContainer.setLayout(new BorderLayout());

        // Create input Data Container
        JPanel inputBoxContainer = new JPanel();
        inputBoxContainer.setLayout(new GridLayout(2,1));
        inputBoxContainer.add(this.inputBoxLabel);
        inputBoxContainer.add(this.inputBox);

        // Create Button Container
        JPanel buttonsContainer = new JPanel();
        buttonsContainer.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonsContainer.add(loginButton);
        buttonsContainer.add(submitButton);

        // Creating the form Data container child
        JPanel formDataContainerChild = new JPanel();
        formDataContainerChild.setLayout(new GridLayout(2,1));
        formDataContainerChild.add(inputBoxContainer);
        formDataContainerChild.add(buttonsContainer);

        // Putting everything together
        iconContainer.add(theIcon, BorderLayout.CENTER);
        formDataContainer.add(formDataContainerChild, BorderLayout.CENTER);
        this.add(iconContainer, BorderLayout.WEST);
        this.add(formDataContainer, BorderLayout.CENTER);
        this.add(headerContainer, BorderLayout.NORTH);
    }
}
