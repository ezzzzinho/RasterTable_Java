import java.awt.*;
import javax.swing.*;
 
public class Komponent extends JPanel {
    private String displayText;
    private Color color; 
    private Color colorBorder;

    private JPanel panel;
    private JLabel label;
    
    public Komponent() {
        panel = new JPanel();
        label = new JLabel();
        panel.add(label);
        add(panel);
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        panel.setBackground(color);
    }
    
    public Color getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
        panel.setBorder(BorderFactory.createLineBorder(colorBorder));
    }
    
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
        label.setText(displayText);
    }
    
}
