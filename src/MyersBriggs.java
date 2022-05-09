import javax.swing.*;

public class MyersBriggs {
    public static void main(String[] args) {

        String[] typeOfTest = {"Simple", "Elaborate", "Exit"};
        String typeResult = "";
        int over = 0;

        String[] simple1 = {"by yourself", "with a group of people"};
        String[] simple2 = {"facts", "ideas"};
        String[] simple3 = {"head", "heart"};
        String[] simple4 = {"organized and consistent efforts", "spontaneous bursts of energy"};

        String[] elaborateList = {"Strongly Disagree", "Disagree", "Somewhat Disagree", "Neutral", "Somewhat Agree", "Agree", "Strongly Agree"};
        int currentQuestion;

        String[] overview = {"Learn more", "Exit"};

        int focusOfAttention = 0; //I vs E
        int informationInput = 0; //S vs N
        int decisionMaking = 0; //T vs F
        int lifestyle = 0; //J vs P

        int test = JOptionPane.showOptionDialog(null, "Welcome to the Myers-Briggs Type Indicator.\nWould you like to take the Simple or Elaborate Test?",
                "Type of Test", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, typeOfTest, typeOfTest[0]);

        if (test == 1){
            currentQuestion = questionnaire("It's easy for me to meet and make friends.",1,elaborateList);
            focusOfAttention += negative(currentQuestion);

            currentQuestion = questionnaire("I often think and worry about the future.",2,elaborateList);
            informationInput += negative(currentQuestion);

            currentQuestion = questionnaire("I make decisions more with my heart than my head.",3,elaborateList);
            decisionMaking += negative(currentQuestion);

            currentQuestion = questionnaire("I consider myself to be an organized and decisive person.",4,elaborateList);
            lifestyle += positive(currentQuestion);

            currentQuestion = questionnaire("I prefer to spend time alone than with other people.",5,elaborateList);
            focusOfAttention += positive(currentQuestion);

            currentQuestion = questionnaire("I start with the facts and details before forming the big picture.",6,elaborateList);
            informationInput += positive(currentQuestion);

            currentQuestion = questionnaire("I have a hard time relating to the emotions of others.",7,elaborateList);
            decisionMaking += positive(currentQuestion);

            currentQuestion = questionnaire("I tend to procrastinate.",8,elaborateList);
            lifestyle += negative(currentQuestion);

            currentQuestion = questionnaire("At a social event, I can be seen mingling and meeting new people.",9,elaborateList);
            focusOfAttention += negative(currentQuestion);

            currentQuestion = questionnaire("I rely more on my imagination than the facts to make decisions.",10,elaborateList);
            informationInput += negative(currentQuestion);

            currentQuestion = questionnaire("Being kind matters more to me than being right.",11,elaborateList);
            decisionMaking += negative(currentQuestion);

            currentQuestion = questionnaire("I enjoy keeping my options open.",12,elaborateList);
            lifestyle += negative(currentQuestion);

            currentQuestion = questionnaire("I usually initiate conservations.",13,elaborateList);
            focusOfAttention += negative(currentQuestion);

            currentQuestion = questionnaire("I prefer my work to be more conventional than original.",14,elaborateList);
            informationInput += positive(currentQuestion);

            currentQuestion = questionnaire("I don't usually think about how my actions have affected others.",15,elaborateList);
            decisionMaking += positive(currentQuestion);

            currentQuestion = questionnaire("I like to keep a to-do list and plan out my work.",16,elaborateList);
            lifestyle += positive(currentQuestion);

            currentQuestion = questionnaire("When introduced to someone new, I take a while to open up to them.",17,elaborateList);
            focusOfAttention += positive(currentQuestion);

            currentQuestion = questionnaire("I tend to ask the question \"why\" more than \"what\" and \"why\".",18,elaborateList);
            informationInput += negative(currentQuestion);

            currentQuestion = questionnaire("It's important to prioritize logic over the feelings of others when making decisions.",19,elaborateList);
            decisionMaking += positive(currentQuestion);

            currentQuestion = questionnaire("I tend to work in bursts of energy.",20,elaborateList);
            lifestyle += negative(currentQuestion);
        }
        if (test == 0){
            if (questionnaire("Usually, I prefer to spend my free time...",1,simple1) == 0)
                focusOfAttention--;
            else
                focusOfAttention++;

            if (questionnaire("Typically, I prefer to work with...",2,simple2) == 0)
                informationInput--;
            else
                informationInput++;

            if (questionnaire("When making decisions, I often follow my...",3,simple3) == 0)
                decisionMaking--;
            else
                decisionMaking++;

            if (questionnaire("My work style can be characterized by...",4,simple4) == 0)
                lifestyle--;
            else
                lifestyle++;
        }
        if (test == 2)
            System.exit(0);

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

        while(over == 0) {
            over = JOptionPane.showOptionDialog(null, "Thank you for taking the Myers-Briggs Type Indicator.\n\nYour result: " + typeResult,
                    "Results", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, overview, overview[1]);
            if (over == 0) {
//            JOptionPane.showOptionDialog(null, typeResult.substring(0,1) + ": " + Math.abs(Math.round(focusOfAttention/15)*50) + 50 + "%",
//                    "Overview", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, overview, overview[1]);
                JOptionPane.showMessageDialog(null, "Currently unavailable", "Show more", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static int negative(int cQ) {
        if (cQ == 0)
            return -3;
        if (cQ == 1)
            return -2;
        if (cQ == 2)
            return -1;
        if (cQ == 4)
            return 1;
        if (cQ == 5)
            return 2;
        if (cQ == 6)
            return 3;
        return 0;
    }

    public static int positive(int cQ){
            if (cQ == 0)
                return 3;
            if (cQ == 1)
                return 2;
            if (cQ == 2)
                return 1;
            if (cQ == 4)
                return -1;
            if (cQ == 5)
                return -2;
            if (cQ == 6)
                return -3;
            return 0;
    }

    public static int questionnaire(String q, int num, String[] list){
        return JOptionPane.showOptionDialog(null, q,
                "Question " + num, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, list, list[0]);
    }
}
