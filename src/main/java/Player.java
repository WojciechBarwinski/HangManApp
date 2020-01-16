import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Player {
    List<String> playerWords;

    Player(){
        playerWords = new ArrayList<String>();
    }

    String playerGivenLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę");
        String playerWord = scanner.nextLine();
        while (playerWords.contains(playerWord)){
            System.out.println("Ta litera była juz podana, podaj inną \n");
            playerWord = scanner.nextLine();
        }
        playerWords.add(playerWord);
        System.out.println("Podane przez Ciebie litery to: " + playerWords);
        return playerWord;
    }

    boolean isNotContainLetter(String[] wordArray, String playerLetter){
        List<String> tmpList = Arrays.asList(wordArray);
        return !tmpList.contains(playerLetter);
    }

}
