package LineDrawing;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.Color;

class CommandPanel extends javax.swing.JPanel implements ActionListener{
    private final String PAUSE = "PAUSE";
    private final String RESUME = "RESUME";
    private Animator animator = null;
    private JButton button = null;
    private boolean animationIsPaused = false;

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
     * Toggles the button between RESUME and PAUSE
     * depending on the state of this.animationIsStopped
     */
    private void toggleButton(){
        if(this.animationIsPaused){
            this.button.setText(this.RESUME);
            animator.setIsPaused(true);
            this.setBackground(Color.BLACK);
        }else{
            this.button.setText(this.PAUSE);
            animator.setIsPaused(false);
            this.setBackground(Color.WHITE);
        }

        this.animationIsPaused = !this.animationIsPaused;
    }

    /**
     * Controls actions to be triggered on button click.
     */
    @Override
    public void actionPerformed(ActionEvent e){
        this.toggleButton();
    }
}