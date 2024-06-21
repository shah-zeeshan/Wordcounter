import java.io.*;
import java.util.Scanner;

public class FileManager implements FileInterface{

    @Override
    public void createFile() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your text here:");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("usersText.txt"));
            String userInput = scanner.nextLine();
            bufferedWriter.write(userInput);
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteFile() {

        File file = new File("usersText.txt");

        while (file.exists()) {
            if (file.delete()) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Problem deleting file!");
            }
        }
    }


}
