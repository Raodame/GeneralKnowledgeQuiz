import javax.swing.*;

public class MyersBriggs {
    public static void main(String[] args) {

        String[] typeOfTest = {"Simple", "Elaborate"};

        String[] simple1 = {"by yourself", "with a group of people"};
        String[] simple2 = {"facts", "ideas"};
        String[] simple3 = {"head", "heart"};
        String[] simple4 = {"organized and consistent efforts", "spontaneous bursts of energy"};

        String[] elaborateList = {"Strongly Disagree", "Disagree", "Somewhat Disagree", "Neutral", "Somewhat Agree", "Agree", "Strongly Agree"};

        int currentQuestion;

        int focusOfAttention = 0; //I vs E
        int informationInput = 0; //S vs N
        int decisionMaking = 0; //T vs F
        int lifestyle = 0; //J vs P

        String typeResult = "";


        int test = JOptionPane.showOptionDialog(null, "Welcome to the Myers-Briggs Type Indicator.\nWould you like to take the Simple or Elaborate Test?",
                "Type of Test", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, typeOfTest, typeOfTest[0]);

        if (test == 1){

//            JOptionPane.showMessageDialog(null, "Welcome to the Elaborate Myers-Briggs Type Indicator." +
//                    "\nAnswer questions on a scale from \"Strongly Disagree\" to \"Strongly Agree\"." +
//                    "\n");

            currentQuestion = JOptionPane.showOptionDialog(null, "It's easy for me to meet and make friends.",
                    "Question 1", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                focusOfAttention -= 3;
            if (currentQuestion == 1)
                focusOfAttention -= 2;
            if (currentQuestion == 2)
                focusOfAttention--;
            if (currentQuestion == 4)
                focusOfAttention++;
            if (currentQuestion == 5)
                focusOfAttention += 2;
            if (currentQuestion == 6)
                focusOfAttention += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I often think and worry about the future.",
                    "Question 2", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                informationInput -= 3;
            if (currentQuestion == 1)
                informationInput -= 2;
            if (currentQuestion == 2)
                informationInput--;
            if (currentQuestion == 4)
                informationInput++;
            if (currentQuestion == 5)
                informationInput += 2;
            if (currentQuestion == 6)
                informationInput += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I make decisions more with my heart than my head.",
                    "Question 3", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                decisionMaking -= 3;
            if (currentQuestion == 1)
                decisionMaking -= 2;
            if (currentQuestion == 2)
                decisionMaking--;
            if (currentQuestion == 4)
                decisionMaking++;
            if (currentQuestion == 5)
                decisionMaking += 2;
            if (currentQuestion == 6)
                decisionMaking += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I consider myself to be an organized and decisive person.",
                    "Question 4", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                lifestyle += 3;
            if (currentQuestion == 1)
                lifestyle += 2;
            if (currentQuestion == 2)
                lifestyle++;
            if (currentQuestion == 4)
                lifestyle--;
            if (currentQuestion == 5)
                lifestyle -= 2;
            if (currentQuestion == 6)
                lifestyle -= 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I prefer to spend time alone than with other people.",
                    "Question 5", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                focusOfAttention += 3;
            if (currentQuestion == 1)
                focusOfAttention += 2;
            if (currentQuestion == 2)
                focusOfAttention++;
            if (currentQuestion == 4)
                focusOfAttention--;
            if (currentQuestion == 5)
                focusOfAttention -= 2;
            if (currentQuestion == 6)
                focusOfAttention -= 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I start with the facts and details before forming the big picture.",
                    "Question 6", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                informationInput += 3;
            if (currentQuestion == 1)
                informationInput += 2;
            if (currentQuestion == 2)
                informationInput++;
            if (currentQuestion == 4)
                informationInput--;
            if (currentQuestion == 5)
                informationInput -= 2;
            if (currentQuestion == 6)
                informationInput -= 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I have a hard time relating to the emotions of others.",
                    "Question 7", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                decisionMaking += 3;
            if (currentQuestion == 1)
                decisionMaking += 2;
            if (currentQuestion == 2)
                decisionMaking++;
            if (currentQuestion == 4)
                decisionMaking--;
            if (currentQuestion == 5)
                decisionMaking -= 2;
            if (currentQuestion == 6)
                decisionMaking -= 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I tend to procrastinate.",
                    "Question 8", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                lifestyle -= 3;
            if (currentQuestion == 1)
                lifestyle -= 2;
            if (currentQuestion == 2)
                lifestyle--;
            if (currentQuestion == 4)
                lifestyle++;
            if (currentQuestion == 5)
                lifestyle += 2;
            if (currentQuestion == 6)
                lifestyle += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "At a social event, I can be seen mingling and meeting new people.",
                    "Question 9", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                focusOfAttention -= 3;
            if (currentQuestion == 1)
                focusOfAttention -= 2;
            if (currentQuestion == 2)
                focusOfAttention--;
            if (currentQuestion == 4)
                focusOfAttention++;
            if (currentQuestion == 5)
                focusOfAttention += 2;
            if (currentQuestion == 6)
                focusOfAttention += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I rely more on my imagination than the facts to make decisions.",
                    "Question 10", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                informationInput -= 3;
            if (currentQuestion == 1)
                informationInput -= 2;
            if (currentQuestion == 2)
                informationInput--;
            if (currentQuestion == 4)
                informationInput++;
            if (currentQuestion == 5)
                informationInput += 2;
            if (currentQuestion == 6)
                informationInput += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "Being kind matters more to me than being right.",
                    "Question 11", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                decisionMaking -= 3;
            if (currentQuestion == 1)
                decisionMaking -= 2;
            if (currentQuestion == 2)
                decisionMaking--;
            if (currentQuestion == 4)
                decisionMaking++;
            if (currentQuestion == 5)
                decisionMaking += 2;
            if (currentQuestion == 6)
                decisionMaking += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I enjoy keeping my options open.",
                    "Question 12", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                lifestyle -= 3;
            if (currentQuestion == 1)
                lifestyle -= 2;
            if (currentQuestion == 2)
                lifestyle--;
            if (currentQuestion == 4)
                lifestyle++;
            if (currentQuestion == 5)
                lifestyle += 2;
            if (currentQuestion == 6)
                lifestyle += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I usually initiate conservations.",
                    "Question 13", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                focusOfAttention -= 3;
            if (currentQuestion == 1)
                focusOfAttention -= 2;
            if (currentQuestion == 2)
                focusOfAttention--;
            if (currentQuestion == 4)
                focusOfAttention++;
            if (currentQuestion == 5)
                focusOfAttention += 2;
            if (currentQuestion == 6)
                focusOfAttention += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I prefer my work to be more conventional than original.",
                    "Question 14", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                informationInput += 3;
            if (currentQuestion == 1)
                informationInput += 2;
            if (currentQuestion == 2)
                informationInput++;
            if (currentQuestion == 4)
                informationInput--;
            if (currentQuestion == 5)
                informationInput -= 2;
            if (currentQuestion == 6)
                informationInput -= 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I don't usually think about how my actions have affected others.",
                    "Question 15", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                decisionMaking += 3;
            if (currentQuestion == 1)
                decisionMaking += 2;
            if (currentQuestion == 2)
                decisionMaking++;
            if (currentQuestion == 4)
                decisionMaking--;
            if (currentQuestion == 5)
                decisionMaking -= 2;
            if (currentQuestion == 6)
                decisionMaking -= 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I like to keep a to-do list and plan out my work.",
                    "Question 16", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                lifestyle += 3;
            if (currentQuestion == 1)
                lifestyle += 2;
            if (currentQuestion == 2)
                lifestyle++;
            if (currentQuestion == 4)
                lifestyle--;
            if (currentQuestion == 5)
                lifestyle -= 2;
            if (currentQuestion == 6)
                lifestyle -= 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "When introduced to someone new, I take a while to open up to them.",
                    "Question 17", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                focusOfAttention += 3;
            if (currentQuestion == 1)
                focusOfAttention += 2;
            if (currentQuestion == 2)
                focusOfAttention++;
            if (currentQuestion == 4)
                focusOfAttention--;
            if (currentQuestion == 5)
                focusOfAttention -= 2;
            if (currentQuestion == 6)
                focusOfAttention -= 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I tend to ask the question \"why\" more than \"what\" and \"why\".",
                    "Question 18", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                informationInput -= 3;
            if (currentQuestion == 1)
                informationInput -= 2;
            if (currentQuestion == 2)
                informationInput--;
            if (currentQuestion == 4)
                informationInput++;
            if (currentQuestion == 5)
                informationInput += 2;
            if (currentQuestion == 6)
                informationInput += 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "It's important to prioritize logic over the feelings of others when making decisions.",
                    "Question 19", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                decisionMaking += 3;
            if (currentQuestion == 1)
                decisionMaking += 2;
            if (currentQuestion == 2)
                decisionMaking++;
            if (currentQuestion == 4)
                decisionMaking--;
            if (currentQuestion == 5)
                decisionMaking -= 2;
            if (currentQuestion == 6)
                decisionMaking -= 3;

            currentQuestion = JOptionPane.showOptionDialog(null, "I tend to work in bursts of energy.",
                    "Question 20", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elaborateList, elaborateList[0]);
            if (currentQuestion == 0)
                lifestyle -= 3;
            if (currentQuestion == 1)
                lifestyle -= 2;
            if (currentQuestion == 2)
                lifestyle--;
            if (currentQuestion == 4)
                lifestyle++;
            if (currentQuestion == 5)
                lifestyle += 2;
            if (currentQuestion == 6)
                lifestyle += 3;
        }
        if (test == 0){
            if (JOptionPane.showOptionDialog(null, "Usually, I prefer to spend my free time...",
                    "Question 1", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simple1, simple1[0]) == 0)
                focusOfAttention--;
            else
                focusOfAttention++;

            if (JOptionPane.showOptionDialog(null, "Typically, I prefer to work with...",
                    "Question 2", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simple2, simple2[0]) == 0)
                informationInput--;
            else
                informationInput++;

            if (JOptionPane.showOptionDialog(null, "When making decisions, I often follow my...",
                    "Question 3", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simple3, simple3[0]) == 0)
                decisionMaking--;
            else
                decisionMaking++;

            if (JOptionPane.showOptionDialog(null, "My work style can be characterized by...",
                    "Question 4", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, simple4, simple4[0]) == 0)
                lifestyle--;
            else
                lifestyle++;
        }

        if (focusOfAttention < 0)
            typeResult += "I";
        else if (focusOfAttention > 0)
            typeResult += "E";
        else
            typeResult += "x";

        if (informationInput < 0)
            typeResult += "S";
        else if (informationInput > 0)
            typeResult += "N";
        else
            typeResult += "x";

        if (decisionMaking < 0)
            typeResult += "T";
        else if (decisionMaking > 0)
            typeResult += "F";
        else
            typeResult += "x";

        if (lifestyle < 0)
            typeResult += "J";
        else if (lifestyle > 0)
            typeResult += "P";
        else
            typeResult += "x";


        JOptionPane.showMessageDialog(null, "Thank you for taking the Myers-Briggs Type Indicator.\n\nYour result: " + typeResult,
                "Results", JOptionPane.INFORMATION_MESSAGE);

    }
}
