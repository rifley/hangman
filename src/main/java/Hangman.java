import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Hangman {
  private String mAnswer;
  private String mGuesses;

  // String[] possibleAnswers = {"cheese"};


  public String getAnswer(){
    return mAnswer = "trophy";
  }

  public String checkLetter(String letter){
    String gameSolution = "trophy";
    List<String> solutionArray = new ArrayList<String>();
    for(int a = 0; a<gameSolution.length(); a++){
      solutionArray.add("_");
    }
    System.out.println(solutionArray.size());
    int letterIndex = gameSolution.indexOf(letter);
    System.out.println(letterIndex);
    if(letterIndex !=-1){
      solutionArray.set(letterIndex, letter);
      System.out.println(solutionArray.get(letterIndex));
      return "ok";
    }else{
      return "error";
    }
  }
}


// for(int i = 0; i < solutionLetters.length; i++ ){
//   letter.indexOf()
// }
