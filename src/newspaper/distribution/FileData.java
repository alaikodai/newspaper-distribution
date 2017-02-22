/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newspaper.distribution;
import java.io.IOException;
/**
 *
 * @author areeyatipyasothi
 */
public class FileData {

    public static void main(String[] args) throws IOException {
        String file_name = "/Users/areeyatipyasothi/Desktop/hello2.rtf";
        try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
            
            for (int i = 0; i < aryLines.length;i++) {
                System.out.println(aryLines[i]);
            }
        } catch (IOException e) {
            System.out.println("Wat file lol");
        }
        WriteFile data = new WriteFile(file_name);
        data.writeToFile("Something cool!");
        System.out.println("Text File Written To");
    }
}
