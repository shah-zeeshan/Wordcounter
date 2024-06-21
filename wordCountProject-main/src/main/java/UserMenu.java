import java.io.IOException;
import java.util.Scanner;

public class UserMenu {

    public void userMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);

        FileManager fileManager = new FileManager();
        WordCounter wordCounter = new WordCounter();
        String userChoice = "";

        while (!userChoice.equals(5)) {

            displayMenuOption();

            userChoice = scanner.next();
            switch (userChoice) {
                case "1":
                    fileManager.createFile();
                    wordCounter.wordCount();
                    break;
                case "2":
                    fileManager.createFile();
                    wordCounter.charCountWithSpaces();
                    break;
                case "3":
                    fileManager.createFile();
                    wordCounter.charCountWithoutSpaces();
                    break;
                case "4":
                    fileManager.deleteFile();
                    System.exit(0);
            }


        }
    }

    public void displayMenuOption() {
        System.out.println(
                "\n 1. Get word count " +
                        "\n 2. Get character count including whitespaces" +
                        "\n 3. Get character count without whitespaces" +
                        "\n 4. Exit");

    }
}
