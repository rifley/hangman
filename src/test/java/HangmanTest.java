import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class HangmanTest {

  @Test
  public void newHangman_instantiatesCorrectly() {
    Hangman testHangman = new Hangman();
    assertEquals(true, testHangman instanceof Hangman);
  }

  @Test
  public void newHangman_receivesAnswer_String() {
    Hangman testHangman = new Hangman();
    assertEquals("trophy", testHangman.getAnswer());
  }

  @Test
  public void newHangman_checkLetterAgainstAnswer_String() {
    Hangman testHangman = new Hangman();
    assertEquals("h", testHangman.checkLetter("h"));
  }

  @Test
  public void newHangman_correctLetterAddedToAnswerArray_Array() {
    Hangman testHangman = new Hangman();
    ArrayList<String> testArray = new ArrayList<String>();
    testArray.add("_");
    testArray.add("_");
    testArray.add("_");
    testArray.add("p");
    testArray.add("_");
    testArray.add("_");
    assertEquals(testArray, testHangman.checkLetter("p"));
  }
}



/*
1. Instantiating the constructor correctly
2. Receives answer string from a created/stored array.
Recognize an individual letter within the answer string.

- Start a hangman game (Instantiate a new constructor object)
- The game will select a word from a stored list of "answers".
- The game will recognize a letter from within that word.

If you pass "A" through the test, it will check that letter
against all letters in the stored answer.




Create a secondary array with underscore characters that will correspond to the length of the
answer that has been selected.*/
