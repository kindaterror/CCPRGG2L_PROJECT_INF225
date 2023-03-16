import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
    MainMenu() {
        super("Pop Cat");
        this.setLayout(new FlowLayout());

     
         ImageIcon icon = new ImageIcon("poppin.gif");
         JLabel label = new JLabel();
         label.setIcon(icon);

        JLabel text = new JLabel("Pop Cat" );
        JLabel text2 = new JLabel("By: "+"Christian Gabion, "+ "Quirf Ivan" );
        JLabel text3 = new JLabel("Ffiona Sayson, "+ "Jan Kenneth Depositario" );
        text.setFont(new Font("Consolas", Font.BOLD, 50));
        text.setForeground(Color.white);
        text2.setFont(new Font("Consolas", Font.BOLD, 10));
        text2.setForeground(Color.white);
        text3.setFont(new Font("Consolas", Font.BOLD, 10));
        text3.setForeground(Color.white);

        text.setForeground(Color.WHITE);
        text2.setForeground(Color.WHITE);
        text3.setForeground(Color.WHITE);
     

        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Helvetica", Font.BOLD, 25));
        button.setBackground(Color.blue);
        button.setForeground(Color.WHITE);

         EventHandler handler = new EventHandler();
         button.addActionListener(handler);

         this.add(label);
         this.add(button);
         this.add(text);
         this.add(text2);
         this.add(text3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(25, 25, 166));
        

     }

     // Event handler class
     private class EventHandler implements ActionListener {

         public void actionPerformed(ActionEvent event) {
            

            // Switches to difficulty menu
            new PlayerMenu();

            // Closes main menu
             dispose();
         }
    }
}
