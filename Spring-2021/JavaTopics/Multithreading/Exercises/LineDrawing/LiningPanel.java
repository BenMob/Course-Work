package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.BorderFactory;

public class LiningPanel extends javax.swing.JPanel {
    private double maximumLines = 20.0;
    private double lineCounter = 1.0;
    private boolean paused = false;

    /**
     * Constructor
     */
    public LiningPanel() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    /**
     * Generaretes a random color.
     * @return A Color object
     */
    private Color generateRandomColor(){
        final int R = (int)(Math.random() * 255);
        final int G = (int)(Math.random() * 255);
        final int B = (int)(Math.random() * 255);

        return new Color(R,G,B);
    }

    /**
     * Deaws the squares one after the other.
     * @param g
     */
    private void drawArtPiece(Graphics g){
        int width = getWidth();
        int height = getHeight();

        for(int i = 0; i < this.lineCounter; i ++){
            int x = (int)((i/this.maximumLines) * width);
            int y = (int)((i/this.maximumLines) * height);

            g.setColor(this.generateRandomColor());
            g.drawLine(x, height, width, height - y);

            g.setColor(this.generateRandomColor());
            g.drawLine(width, height-y, width - x, 0);

            g.setColor(this.generateRandomColor());
            g.drawLine(width - x, 0, 0, y);

            g.setColor(this.generateRandomColor());
            g.drawLine(0, y, x, height);
        }
    }

    /**
     * Increments the counter, unless it has reached its maximum
     * otherwise it sets it to 1.
     */
    public void updateCounter(){
        if(this.lineCounter == this.maximumLines){
            this.lineCounter = 1.00;
        }else{
            this.lineCounter ++;
        }
    }

    /**
     * Painst the component.
     * @param g
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.drawArtPiece(g);
    }
}
