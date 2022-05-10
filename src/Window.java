import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,100);
    Font normalFont = new Font("Times New Roman", Font.PLAIN,30);
    JButton simpleButton;
    ButtonClick simpleButtonClick;

    public static void main(String[] args) {

        new Window();
    }

    public Window(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.WHITE);
        window.setLayout(null);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.WHITE);

        titleNameLabel = new JLabel("Random Quizzes");
        titleNameLabel.setForeground(Color.BLACK);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(200,300,400,200);
        startButtonPanel.setBackground(Color.WHITE);

        simpleButton = new JButton("Simple Quiz");
        simpleButton.setBackground(Color.black);
        simpleButton.setForeground(Color.BLUE);
        simpleButton.setFont(normalFont);

        simpleButtonClick = new ButtonClick();
        simpleButton.addActionListener(simpleButtonClick);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(simpleButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
        window.setVisible(true); //must always be last line of constructor

    }

    private class ButtonClick implements ActionListener{

        public void actionPerformed(ActionEvent event){
            Quiz.basic();
        }

    }
}
