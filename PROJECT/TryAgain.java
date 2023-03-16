import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryAgain extends JFrame {

    TryAgain() {

        JLabel player = new JLabel();
        player.setText("Player: "+ Board.playerName);
        player.setFont(new Font ("Helvetica", Font.BOLD, 20));
        player.setForeground(Color.WHITE);

        // convert int to string
        String score = Integer.toString(Board.score);
        JLabel scoreLabel = new JLabel();
        scoreLabel.setText("Your score: " + score);
        scoreLabel.setFont(new Font ("Helvetica", Font.BOLD, 25));
        scoreLabel.setForeground(Color.WHITE);

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Retry");
        tryAgainButton.setFont(new Font("Helvetica", Font.BOLD, 25));
        tryAgainButton.setBackground(Color.blue);
        tryAgainButton.setForeground(Color.WHITE);

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Helvetica", Font.BOLD, 25));
        exitButton.setBackground(Color.blue);
        exitButton.setForeground(Color.WHITE);
        

        tryAgainHandler handler = new tryAgainHandler();
        tryAgainButton.addActionListener(handler);

        this.setLayout(new FlowLayout());

        ExitHandler handlers = new ExitHandler();
        exitButton.addActionListener(handlers);

        this.setLayout(new FlowLayout());

        this.add(player);
        this.add(scoreLabel);
        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Pacman");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(220, 475);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(25, 25, 166));

    }

    private class tryAgainHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new MainMenu();
            dispose();
        }
    }

    private class ExitHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }

}
