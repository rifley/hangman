import java.io.Console;

public class App {
  public static void main(String[] args){
    boolean programRunning = true;
    while(programRunning){
      Hangman hangman = new Hangman();
      Console myConsole = System.console();
      System.out.println("You can: guess a letter, or type 'board' to check the board state. Type exit to leave. ");
      String userChoice = myConsole.readLine();
      if(userChoice=="exit"){
        programRunning=false;
      }else{
        System.out.println(hangman.checkLetter(userChoice));
      }
    }
  }
}
