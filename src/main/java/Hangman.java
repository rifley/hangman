import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Hangman {
  private String mAnswer;
  private String mGuesses;

  // String[] possibleAnswers = {"cheese"};
  ArrayList<String> solutionArray = new ArrayList<String>();

  public String getAnswer(){
    String gameSolution = "trophy";
    for(int a = 0; a<gameSolution.length(); a++){
      solutionArray.add("_");
    }
    /*^^ Associate with mAnswer*/
    mAnswer = "trophy";
    return mAnswer;
  }

  public ArrayList checkLetter(String letter){
/*Reference mAnswer as solutionArray*/
    int letterIndex = gameSolution.indexOf(letter);
    if(letterIndex !=-1){
      solutionArray.set(letterIndex, letter);
      System.out.println(solutionArray.get(letterIndex));
      return solutionArray;
    }else{
      return solutionArray;
    }
  }
}


/*Move to Hangman class member variables*/
