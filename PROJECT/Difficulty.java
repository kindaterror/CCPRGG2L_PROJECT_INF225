
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Difficulty extends JFrame {
    Difficulty() {
        super("Pacman");
        this.setLayout(new FlowLayout());

        JLabel text = new JLabel("Choose difficulty");
        text.setFont(new Font("DialogInput", Font.BOLD, 20));
        text.setForeground(Color.black);
        text.setForeground(Color.WHITE);


        JButton easyButton = new JButton();
        easyButton.setText("EASY");
        easyButton.setFont(new Font("Helvetica", Font.BOLD, 30));
        easyButton.setForeground(Color.green);
        easyButton.setBackground(Color.blue);

        // Add event to Easy button
        EventHandler easyHandler = new EventHandler(4, 6);
        easyButton.addActionListener(easyHandler);

        JButton mediumButton = new JButton();
        mediumButton.setText("MEDIUM");
        mediumButton.setFont(new Font("Helvetica", Font.BOLD, 30));
        mediumButton.setForeground(Color.yellow);
        mediumButton.setBackground(Color.blue);

        // Add event to Medium button
        EventHandler mediumHandler = new EventHandler(6, 3);
        mediumButton.addActionListener(mediumHandler);

        JButton hardButton = new JButton();
        hardButton.setText("HARD");
        hardButton.setFont(new Font("Helvetica", Font.BOLD, 30));
        hardButton.setBackground(Color.blue);
        hardButton.setForeground(Color.red);

        // Add event to Hard button
        EventHandler hardHandler = new EventHandler(12, 1);
        hardButton.addActionListener(hardHandler);

        add(text);
        add(easyButton);
        add(mediumButton);
        add(hardButton);

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

    private class EventHandler implements ActionListener {

        int numGhosts;
        int numLives;

        // Constructor
        EventHandler(int ghosts, int lives) {
            this.numGhosts = ghosts;
            this.numLives = lives;
        }

        public void actionPerformed(ActionEvent event) {
            Board.N_GHOSTS = this.numGhosts;
            Board.pacsLeft = this.numLives;
            // Goes to Pacman frame
            new Pacman();

            // Closes difficulty menu frame
            dispose();
        }
    }
}
