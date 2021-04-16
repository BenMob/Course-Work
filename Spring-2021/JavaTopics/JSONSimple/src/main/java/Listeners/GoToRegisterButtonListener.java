package Listeners;

import Strategy.Screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToRegisterButtonListener implements ActionListener {

    Screen screen;
    public GoToRegisterButtonListener(Screen screen){
        this.screen = screen;
    }
    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Going to Registration Form\n");
        this.screen.changeForm();
    }
}
