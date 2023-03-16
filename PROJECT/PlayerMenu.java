
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerMenu extends JFrame {

    JTextField textField;

    PlayerMenu() {
        super("Pacman");
        this.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel();
        label.setText("Enter player name: ");
        label.setFont(new Font("DialogInput", Font.BOLD, 20));
        label.setForeground(Color.WHITE);

        // JTextField
        textField = new JTextField(20);
        // Adds event to textfield
        EventHandler handler = new EventHandler();
        textField.addKeyListener(handler);

        // Add components to frame
        this.add(label);
        this.add(textField);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(300, 500);
        
// makes frame appear
this.setVisible(true);
// set frame to center
this.setLocationRelativeTo(null);
// background color of frame
this.getContentPane().setBackground(new Color(25, 25, 166));
}

private class EventHandler implements KeyListener {

public void keyPressed(KeyEvent event) {

    // If ENTER button is pressed, do this
    if (event.getKeyCode() == KeyEvent.VK_ENTER) {

        Board.playerName = textField.getText();

        new ColorMenu();
        // Close playermenu frame
        dispose();

        
    }
}

public void keyTyped(KeyEvent event) {
    //
}

public void keyReleased(KeyEvent event) {
    //
}
}
}
