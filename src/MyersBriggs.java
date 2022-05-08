import javax.swing.*;

public class MyersBriggs {
    public static void main(String[] args) {

        String[] typeOfTest = {"Simple", "Elaborate"};

        int test = JOptionPane.showOptionDialog(null, "Welcome to the Myers-Briggs Type Indicator.\nWould you like to take the Simple or Elaborate Test?",
                "MBTI Test", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, typeOfTest, typeOfTest[0]);

        if (test == 0){
            System.out.println("simple");
        }
        if (test == 1){
            JOptionPane.showMessageDialog(null, "Elaborate test currently unavailable.","Elaborate Test", JOptionPane.WARNING_MESSAGE);
        }
    }
}
