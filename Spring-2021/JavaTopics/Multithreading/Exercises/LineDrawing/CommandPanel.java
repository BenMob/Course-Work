package LineDrawing;
import javax.swing.JButton;
import java.awt.event.*;

public class CommandPanel extends javax.swing.JPanel implements ActionListener{
    private final String PAUSE = "PAUSE";
    private final String RESUME = "RESUME";
    private Animator animator = null;
    private JButton button = null;
    private boolean animationIsStopped = false;

    /**
     * Constructor
     * @param animator
     */
    public CommandPanel(Animator animator){
        this.animator = animator;
        this.configureButton();
    };

    /**
     * Gets called from the constructor to configure the command button.
     */
    private void configureButton(){
        this.button = new JButton();           // Creates the button.
        this.toggleButton();                   // Sets the button label.
        this.button.addActionListener(this);   // Adds action listener to the button.
        this.add(this.button);                 // Adds the button to this command panel.
    }

    /**
     * Toggles the button between RESUME and STOP
     */
    private void toggleButton(){
        if(this.animationIsStopped){
            this.button.setText(this.RESUME);
        }else{
            this.button.setText(this.PAUSE);
        }
        this.animationIsStopped = !this.animationIsStopped;
    }

    /**
     * Controls actions to be triggered on button click.
     */
    @Override
    public void actionPerformed(ActionEvent e){
        this.toggleButton();;
    }
}