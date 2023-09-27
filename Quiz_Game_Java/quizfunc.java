package Quiz_Game_Java;
public class quizfunc {

    public quizfunc(){
        String[] question = new String[5];
        question[0] = "¿" + "0" + "?";
        question[1] = "¿" + "1" + "?";
        question[2] = "¿" + "2" + "?";
        question[3] = "¿" + "3" + "?";
        question[4] = "¿" + "4" + "?";
        
        for(int i = 0; i < question.length; i++){
            System.out.println(question[i]);
        }
    }
    
}
