package Strategy;

/**
 * This class creates a Login Form
 */
import Listeners.GoToRegisterButtonListener;
import Listeners.LoginButtonListener;
import javax.swing.*;
import java.awt.*;

public class LoginForm extends JPanel implements FormIF {
    private JLabel headerLabel;
    private JButton submitButton;
    private JButton registerButton;
    private JLabel inputBoxLabel;
    private JTextField inputBox;

    private final ImageIcon icon = new ImageIcon("amongus.png");
    private final String headerLabelText = "WELCOME";
    private final String submitButtonLabelText = "Log In";
    private final String registerButtonLabelText = "New User";
    private final String inputBoxLabelText = "ENTER USERNAME:";
    private final int MAX_LENGTH = 20;

    private Screen appScreen;

    public LoginForm(Screen appScreen){
        this.headerLabel = new JLabel(headerLabelText);
        this.submitButton = new JButton(submitButtonLabelText);
        this.registerButton = new JButton(registerButtonLabelText);
        this.inputBoxLabel = new JLabel(inputBoxLabelText);

        this.appScreen = appScreen;    // This is what gives this class access to the app's screen
        this.registerButton.addActionListener(new GoToRegisterButtonListener(appScreen));
        this.submitButton.addActionListener(new LoginButtonListener());

        this.inputBox = new JTextField(MAX_LENGTH);
        System.out.println("Creating login form!");
        this.build();
    }

    @Override
    public void build(){
        this.setLayout(new BorderLayout());
        this.headerLabel.setFont(new Font("Bold",20, 20));
        this.headerLabel.setForeground(Color.WHITE);
        /* TODO: Break this process down using the Build Design Pattern */

        //Creating the header
        JPanel headerContainer = new JPanel();
        headerContainer.setLayout(new FlowLayout());
        headerContainer.add(headerLabel);
        headerContainer.setBackground(new Color(50, 120, 212));

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
        buttonsContainer.add(registerButton);
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