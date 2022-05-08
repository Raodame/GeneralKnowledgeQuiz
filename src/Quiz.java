import javax.swing.*;

public class Quiz {

    private int score;
    private String name;


    public Quiz(){
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void question1(){
        JOptionPane.showInputDialog(null,"Hello");
    }
}
