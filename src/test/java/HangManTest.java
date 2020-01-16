
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/*
        //given
        //when
        //then
 */
public class HangManTest {
    Player player = new Player();
    @Test
    public void shouldCreateArrayFromString() {
        //given
        Hangman hangman = new Hangman("bunny");
        String[] wordArray = {"b", "u", "n", "n", "y"};
        //when
        //then
        assertThat(hangman.getWordToFind()).isEqualTo(wordArray);
    }

    @Test
    public void shouldReturnEmptyArrayBecauseGivenLetterIsNotInList() {
        //given
        ByteArrayInputStream in = new ByteArrayInputStream("d".getBytes());
        System.setIn(in);
        Hangman hangman = new Hangman("bunny");
        String[] tmpStringArray = new String[5];
        for (int i = 0; i < tmpStringArray.length; i++) {
            tmpStringArray[i] = "_";
        }
        //when
        //then
        assertThat(Arrays.equals(tmpStringArray, hangman.getPlayerWord()));
    }

    @Test
    public void shouldReturnArrayWithPlayer1Letter() {
        //given
        ByteArrayInputStream in = new ByteArrayInputStream("b".getBytes());
        System.setIn(in);
        Hangman hangman = new Hangman("bunny");
        String[] tmpStringArray = new String[5];
        for (int i = 0; i < tmpStringArray.length; i++) {
            tmpStringArray[i] = "_";
        }
        tmpStringArray[0] = "b";
        //when
        //then
        assertThat(Arrays.equals(tmpStringArray, hangman.getPlayerWord()));
    }

    @Test
    public void shouldReturnArrayWithPlayer2Letter() {
        //given
        ByteArrayInputStream in = new ByteArrayInputStream("n".getBytes());
        System.setIn(in);
        Hangman hangman = new Hangman("bunny");
        String[] tmpStringArray = new String[5];
        for (int i = 0; i < tmpStringArray.length; i++) {
            tmpStringArray[i] = "_";
        }
        tmpStringArray[2] = "n";
        tmpStringArray[3] = "n";
        //when
        //then
        assertThat(Arrays.equals(tmpStringArray, hangman.getPlayerWord()));
    }

    @Test
    public void shouldReturnFalseBecausePlayerLetterIsInWordArray(){
        //given
        Hangman hangman = new Hangman("bunny");
        String playerWord = "u";
        //when
        //then
        assertThat(player.isNotContainLetter(hangman.getWordToFind(), playerWord)).isFalse();
    }

    @Test
    public void shouldReturnTrueBecausePlayerLetterIsNotInWordArray(){
        //given
        Hangman hangman = new Hangman("bunny");
        String playerWord = "x";
        //when
        //then
        assertThat(player.isNotContainLetter(hangman.getWordToFind(), playerWord)).isTrue();
    }


}


