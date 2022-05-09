import javax.swing.*;

public class Runner {
    public static void main(String[] args) {

        String name = "";
        int score = 0;

        while (name.equals(""))
        name = JOptionPane.showInputDialog(null, "Please enter your name.", "Name", JOptionPane.INFORMATION_MESSAGE);

        if (JOptionPane.showInputDialog(null,"What color is a banana?", "Question 1", JOptionPane.QUESTION_MESSAGE).equalsIgnoreCase("yellow"))
            score += 1;
        if (JOptionPane.showInputDialog(null,"What is the biggest planet in our solar system?", "Question 2", JOptionPane.QUESTION_MESSAGE).equalsIgnoreCase("Jupiter"))
            score += 1;
        if (JOptionPane.showInputDialog(null,"Who was the first president of the United States (last name)?", "Question 3", JOptionPane.QUESTION_MESSAGE).equalsIgnoreCase("Washington"))
            score += 1;

        JOptionPane.showMessageDialog(null,name + ", you scored a " + score + " out of 3.","Results", JOptionPane.INFORMATION_MESSAGE);


//        String[] options = {"yes", "no"};
//        int test = JOptionPane.showOptionDialog(null, "Test", "Test", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
//        System.out.println(test);

        //            JOptionPane.showMessageDialog(null, "Elaborate test currently unavailable.",
//                    "Elaborate Test", JOptionPane.WARNING_MESSAGE);
//            System.exit(0);
    }
}
