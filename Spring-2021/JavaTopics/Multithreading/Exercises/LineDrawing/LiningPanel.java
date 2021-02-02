package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.BorderFactory;

public class LiningPanel extends javax.swing.JPanel {
    private Color[] colors = new Color[]{ Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW };

    public LiningPanel() {
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    // Generates random color.
    private Color generateRandomColor(){
        double colorPosition = Math.random() * this.colors.length;
        return colors[(int)colorPosition];
    }

    // Draws a randomly colored line.
    private Graphics drawColoredLine(Graphics g, int x1, int y1, int x2, int y2){
        Color color =this.generateRandomColor();
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
        return g;
    }

    // Draws the whole art piece.
    private void drawArtPiece(Graphics g, double lines){
        int width = getWidth();
        int height = getHeight();

        for(int i = 0; i < lines; i ++){
            int x = (int)((i/lines) * width);
            int y = (int)((i/lines) * height);

            this.drawColoredLine(g,0, y, x, height);                       // Left to Bottom
            this.drawColoredLine(g, x, height, width, height - y);         // Bottom to Right
            this.drawColoredLine(g, width, y, x, 0);                       // Right to Top
            this.drawColoredLine(g,width - x, 0, 0, y);             // Top to Left
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        final double lines = 15.0;
        this.drawArtPiece(g, lines);
    }
    
}
