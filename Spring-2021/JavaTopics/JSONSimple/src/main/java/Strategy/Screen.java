package Strategy;

import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {

    private final int SMALL_X = 500;
    private final int SMALL_Y = 300;
    private final int ONE = 1;
    private final int ZERO = 0;
    private int flag = 0;

    FormIF form;

    public Screen(){
        this.form = new LoginForm(this);
        this.setTitle("Testing Strategy Pattern");
        this.setResizable(false);
        this.setLayout(new GridBagLayout());
        this.setSize(new Dimension(SMALL_X, SMALL_Y));
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(216, 219, 225));
        this.add((JPanel)form);
        this.setVisible(true);
    }

    public void changeForm(){
        // Calls Swap in a swap() in a separate thread
       Runnable runnable = () -> swap();
       Thread thread = new Thread(runnable);
       thread.start();
    }

    private void swap(){
        this.getContentPane().remove((JPanel)form);

        if(flag == ZERO){
            form = new RegistrationForm(this);
            flag = ONE;
        }else{
            form = new LoginForm(this);
            flag = ZERO;
        }

        this.getContentPane().add((JPanel)form);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }
}
