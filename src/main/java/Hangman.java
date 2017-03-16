import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Hangman {
  private String mAnswer;
  private String mGuesses;

  String[] possibleAnswers = {"cheese"};

  public String getAnswer(){
    return mAnswer = possibleAnswers[0];
  }
}
