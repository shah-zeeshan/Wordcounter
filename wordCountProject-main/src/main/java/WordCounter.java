import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

    public void wordCount() throws IOException {

        FileReader fileReader = new FileReader("usersText.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] words;
        String word;
        int wordCount = 0;

        while((word = bufferedReader.readLine()) != null){
            words = word.split(" ");
            wordCount = wordCount + words.length;
        }

        fileReader.close();

        System.out.println("Number of words in your text = " + wordCount);

    }

    public void charCountWithSpaces() throws IOException {

        FileReader fileReader = new FileReader("usersText.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input;
        int charCount = 0;

        while((input = bufferedReader.readLine()) != null){
            charCount += input.length();
        }

        fileReader.close();

        System.out.println("Number of characters in your text including white spaces = " + charCount);

    }

    public void charCountWithoutSpaces() throws IOException {

        FileReader fileReader = new FileReader("usersText.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int charCount = 0;

        while(true){
            int c = bufferedReader.read();
            if (c < 0)
                break;
            if (!Character.isWhitespace(c))
                charCount++;
        }

        fileReader.close();

        System.out.println("Number of characters in your text without white spaces = " + charCount);

    }
}
