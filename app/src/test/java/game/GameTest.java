package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;      // ...with the caveat noted below.
import org.junit.Test;



public class GameTest {
 /*  @Test public void testGetsWordToGuess() {
    Game game = new Game("Makers");
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void testGetsRemainingAttempts(){
      Game game = new Game("Makers");
      assertEquals(game.getRemainingAttempt(),10);
  }

  @Test public void testGetRandomStringFromDict(){
      Game game = new Game();
      assertEquals(game.getWordToGuess(), game.getWordToGuess());
  }*/
// GameTest.java
@Test
    public void testGetsWordToGuessWithRandomWord() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

        Game game = new Game(mockedChoser);

        assertEquals(game.getWordToGuess(), "D________");
    }

}