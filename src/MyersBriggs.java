import javax.swing.*;

public class MyersBriggs {
    public static void main(String[] args) {

        String[] typeOfTest = {"Simple", "Elaborate"};

        String[] simple1 = {"by yourself", "with a group of people"};

        String[] elaborateLeft = {"Strongly Disagree, Disagree, Somewhat Disagree, Neutral, Somewhat Agree, Agree, Strongly Agree"};
        String[] elaborateRight = {"Strongly Disagree, Disagree, Somewhat Disagree, Neutral, Somewhat Agree, Agree, Strongly Agree"};

        int focusOfAttention = 0; //I vs E
        int informationInput = 0; //S vs N
        int decisionMaking = 0; //T vs F
        int lifestyle = 0; //J vs P

        int test = JOptionPane.showOptionDialog(null, "Welcome to the Myers-Briggs Type Indicator.\nWould you like to take the Simple or Elaborate Test?",
                "MBTI Test", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, typeOfTest, typeOfTest[0]);

        if (test == 0){
            JOptionPane.showMessageDialog(null, "Simple test currently unavailable.","Simple Test", JOptionPane.WARNING_MESSAGE);
        }
        if (test == 1){
            JOptionPane.showMessageDialog(null, "Elaborate test currently unavailable.","Elaborate Test", JOptionPane.WARNING_MESSAGE);
        }

        JOptionPane.showOptionDialog(null, "Most of the time, you prefer to spend time...",
                "Question 1", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, simple1, simple1[0]);
    }
}
