import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {

    JFrame window;
    Container con;
    JPanel titleNamePanel, mainButtonPanel, mainTextPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,75);
    Font normalFont = new Font("Times New Roman", Font.PLAIN,30);
    JButton simpleButton, myersButton;
    JTextArea mainTextArea;
    ButtonClick simpleButtonClick, myersButtonClick;

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

        mainButtonPanel = new JPanel();
        mainButtonPanel.setBounds(200,300,400,200);
        mainButtonPanel.setBackground(Color.WHITE);

        simpleButton = new JButton("Simple Quiz");
        simpleButton.setBackground(Color.black);
        simpleButton.setForeground(Color.BLUE);
        simpleButton.setFont(normalFont);
        simpleButton.setFocusPainted(false);
        simpleButton.setActionCommand("simpleQuiz");

        simpleButtonClick = new ButtonClick();
        simpleButton.addActionListener(simpleButtonClick);

        myersButton = new JButton("MBTI");
        myersButton.setBackground(Color.black);
        myersButton.setForeground(Color.BLUE);
        myersButton.setFont(normalFont);
        myersButton.setFocusPainted(false);
        myersButton.setActionCommand("myersQuiz");

        myersButtonClick = new ButtonClick();
        myersButton.addActionListener(myersButtonClick);

        titleNamePanel.add(titleNameLabel);
        mainButtonPanel.add(simpleButton);
        mainButtonPanel.add(myersButton);

        con.add(titleNamePanel);
        con.add(mainButtonPanel);
        window.setVisible(true); //must always be last line of constructor

    }

    public void createSimpleQuizScreen(){

        titleNamePanel.setVisible(false);
        mainButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLUE);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("What color is a banana?");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);
    }

    public void createMyersQuizScreen() {

        titleNamePanel.setVisible(false);
        mainButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.BLUE);
        mainTextPanel.setLayout(new GridLayout(2,1));
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the Myers text.");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);
    }

    private class ButtonClick implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();

            if (yourChoice.equals("simpleQuiz"))
                createSimpleQuizScreen();

            if (yourChoice.equals("myersQuiz"))
                createMyersQuizScreen();
        }
    }
}
