import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  @Test
  public void newHangman_instantiatesCorrectly() {
    Hangman testHangman = new Hangman();
    assertEquals(true, testHangman instanceof Hangman);
  }

  @Test
  public void newHangman_receivesAnswer_String() {
    Hangman testHangman = new Hangman();
    assertEquals("cheese", testHangman.getAnswer());
  }

}



/*
1. Instantiating the constructor correctly
2. Receives answer string from a created/stored array.


Create a secondary array with underscore characters that will correspond to the length of the
answer that has been selected. 
