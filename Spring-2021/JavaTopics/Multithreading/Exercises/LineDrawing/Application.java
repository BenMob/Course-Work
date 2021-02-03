package LineDrawing;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Application {
    /**
     * The application runner.
     * @param mainFrame
     * @param commandPanel
     * @param liningPanel
     */
    private static void runApplication(JFrame mainFrame){

        LiningPanel liningPanel = new LiningPanel();
        Animator animator = new Animator(liningPanel);
        CommandPanel commandPanel = new CommandPanel(animator);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().add(commandPanel, BorderLayout.NORTH);
        mainFrame.getContentPane().add(liningPanel, BorderLayout.CENTER);
        mainFrame.pack();
        mainFrame.setMinimumSize(new Dimension(500, 500));
        mainFrame.setTitle("Lining Art");
        mainFrame.setVisible(true);

        // Creates and starts the animation thread
        Thread thread = new Thread(animator); thread.start();
    }

    public static void main(String[] args) {
        JFrame application = new JFrame();
        Application.runApplication(application);
    }
}
