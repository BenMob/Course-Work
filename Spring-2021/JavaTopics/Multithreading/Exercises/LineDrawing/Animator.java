package LineDrawing;

import java.awt.Color;
import javax.swing.BorderFactory;

class Animator implements Runnable{
    private LiningPanel liningPanel = null;
    private boolean isPaused = false;

    /**
     * Constructor.
     * @param liningPanel
     */
    Animator(LiningPanel liningPanel){
        this.liningPanel = liningPanel;
    }

    /**
     * Performs the animation.
     */
    private void animate(){
        this.liningPanel.updateCounter();
        this.liningPanel.repaint();
    }

    /**
     * Running Thread.
     */
    public void run(){
        while(true){
            if(!isPaused){ this.animate(); }
            try{ Thread.sleep(300); }catch(Exception e){};
        }
    }

    /**
     * Controls the pausing and the resuming of the animation.
     * @param state
     */
    public void setIsPaused(boolean state){
        this.isPaused = state;
        if(this.isPaused){
            this.liningPanel.setBackground(Color.BLACK);
            this.liningPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        }else{
            this.liningPanel.setBackground(Color.WHITE);
            this.liningPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }
}