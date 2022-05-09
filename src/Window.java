import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class Window {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,100);
    Font normalFont = new Font("Times New Roman", Font.PLAIN,30);
    JButton startButton;

    public static void main(String[] args) {

        new Window();
    }

    public Window(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.DARK_GRAY);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.red);

        titleNameLabel = new JLabel("Test Title");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.white);

        startButton = new JButton("Test Button");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.BLUE);
        startButton.setFont(normalFont);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);

    }
}
