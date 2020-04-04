import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class Komponent extends JPanel implements ActionListener {
   private JLabel label;
   private JPanel panel;
   private Color bgColor, textColor;
   private String displayText;
   
   public Komponent() {
      label = new JLabel();
      panel = new JPanel(new FlowLayout());
      panel.add(label);
      add(panel);

      Timer timer = new Timer(500, this);
      timer.start();
   }
   
   public void actionPerformed(ActionEvent e) {
      String oldText = label.getText();
      String newText= oldText.substring(1) + oldText.substring(0,1);
      label.setText(newText);
   }
    
   public String getDisplayText() {
        return displayText;
   }

   public void setDisplayText(String displayText) {
        this.displayText = displayText;
        label.setText(displayText + "                           ");
   }
   
      public Color getTextColor() {
        return textColor;
   }

   public void setTextColor(Color textColor) {
        this.textColor = textColor;
        label.setForeground(textColor);
   }
    
   public Color getBgColor() {
        return bgColor;
   }

   public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
        panel.setBackground(bgColor);
   }
}