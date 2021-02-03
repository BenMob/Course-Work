package LineDrawing;

import java.awt.Color;

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
            try{ Thread.sleep(200); }catch(Exception e){};
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
        }else{
            this.liningPanel.setBackground(Color.WHITE);
        }
    }
}