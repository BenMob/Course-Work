package LineDrawing;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Application {
    /**
     * The application runner.
     * @param mainFrame
     * @param commandPanel
     * @param liningPanel
     */
    private static void runApplication(JFrame mainFrame){
        Animator animator = new Animator();
        CommandPanel commandPanel = new CommandPanel(animator);
        LiningPanel liningPanel = new LiningPanel();

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().add(commandPanel, BorderLayout.NORTH);
        mainFrame.getContentPane().add(liningPanel, BorderLayout.CENTER);
        mainFrame.pack();
        mainFrame.setSize(600, 600);
        mainFrame.setTitle("Lining Art");
        mainFrame.setVisible(true);

        Thread thread = new Thread(animator); thread.start();
    }

    public static void main(String[] args) {
        JFrame application = new JFrame();
        Application.runApplication(application);
    }
}
