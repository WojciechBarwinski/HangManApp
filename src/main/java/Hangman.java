import java.util.Arrays;
import java.util.List;

class Hangman {

    private String[] wordToFind;
    private String[] playerWord;
    private int movements;
    private Player player;
    private Gallows gallows;

    Hangman(){
        WordsFileReader wordsFileReader = new WordsFileReader();
        this.wordToFind = wordsFileReader.getRandomWord().split("");
        this.playerWord = new String[wordToFind.length];
        for (int i = 0; i < playerWord.length; i++) {
            playerWord[i] = "_";

        }
        this.movements = 11;
        this.player = new Player();
        this.gallows = new Gallows();
    }
    Hangman(String wordToFind) {
        this.wordToFind = wordToFind.split("");
        this.playerWord = new String[wordToFind.length()];
        for (int i = 0; i < playerWord.length; i++) {
            playerWord[i] = "_";

        }
        this.movements = 11;
        this.player = new Player();
        this.gallows = new Gallows();
    }

    String[] getPlayerWord() {
        return playerWord;
    }

    String[] getWordToFind() {
        return wordToFind;
    }

    void gameLoop() {
        while (!Arrays.equals(wordToFind, playerWord) && movements != 0) {
            checkLetter();
            List<String> tmpList = Arrays.asList(playerWord);
            System.out.println(tmpList);
        }
        gameResult();
    }

    private void checkLetter() {
        String playerGivenLetter = player.playerGivenLetter();
        for (int i = 0; i < wordToFind.length; i++) {
            if (wordToFind[i].equalsIgnoreCase(playerGivenLetter)) {
                playerWord[i] = playerGivenLetter;
            }
        }
        if (player.isNotContainLetter(wordToFind, playerGivenLetter)) {
            movements--;
            gallows.gallowsDraw();
        }
    }

    private void gameResult() {
        if (movements != 0) {
            System.out.println("Wygrałeś");
        } else {
            System.out.println("Przegrałes");
        }
    }
}
