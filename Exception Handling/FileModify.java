import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileModify {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("playground.txt");
        BufferedReader br = new BufferedReader(fr);

        String str = br.readLine();

        String updatedStr = str.substring(0, 5) + " R " + str.substring(5);

        br.close();

        FileWriter writer = new FileWriter("playground.txt");
        writer.write(updatedStr);
        writer.close();
    }
}
