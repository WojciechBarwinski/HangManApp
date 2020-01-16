import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsFileReader {
    private final String file = "words.txt";
    private List<String> wordsSet;

    WordsFileReader(){
        readFile();
    }
    private void readFile(){
        try (Stream<String> stream = Files.lines(Paths.get(file))) {
            wordsSet = stream.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String getRandomWord(){
        Random random = new Random();
        return wordsSet.get(random.nextInt(wordsSet.size()));
    }




    public static void main(String[] args) {

        WordsFileReader wordsFileReader = new WordsFileReader();

        wordsFileReader.readFile();
    }
}
