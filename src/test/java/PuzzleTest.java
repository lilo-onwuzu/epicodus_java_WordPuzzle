import org.junit.*;
import static org.junit.Assert.*;

public class PuzzleTest {

  @Test
  public void runPuzzle_replacesA(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "_";
    assertEquals(expected, testPuzzle.runPuzzle("a"));
  }

  @Test
  public void runPuzzle_replacesAandE(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "__";
    assertEquals(expected, testPuzzle.runPuzzle("ae"));
  }

  @Test
  public void runPuzzle_replacesAandEandI(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "___";
    assertEquals(expected, testPuzzle.runPuzzle("aei"));
  }

  @Test
  public void runPuzzle_replacesAandEandIandO(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "____";
    assertEquals(expected, testPuzzle.runPuzzle("aeio"));
  }

  @Test
  public void runPuzzle_replacesAandEandIandOandU(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "_____";
    assertEquals(expected, testPuzzle.runPuzzle("aeiou"));
  }

  @Test
  public void runPuzzle_acceptsUpperCaseCharactersForVowels(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "_____";
    assertEquals(expected, testPuzzle.runPuzzle("AEIOU"));
  }

  @Test
  public void runPuzzle_CodeRetainsLowerCaseCharactersForConsonants(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "fghj";
    assertEquals(expected, testPuzzle.runPuzzle("fghj"));
  }

  @Test
  public void runPuzzle_CodeRetainsUpperCaseCharactersForConsonants(){
    Puzzle testPuzzle = new Puzzle();
    String expected = "FGHJ";
    assertEquals(expected, testPuzzle.runPuzzle("FGHJ"));
  }
}
