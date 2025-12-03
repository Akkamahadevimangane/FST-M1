package activities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

 public class Activity14 {
    public static void main(String[] args) throws IOException {
    	File file = new File("src/main/resources/newfile.txt");
    	try {
            
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
                File inputFile = null;
                inputFile = new File("sample.txt");
                System.out.println("File path: " + inputFile.getAbsolutePath());
                
				//FileUtils.writeStringToFile(inputFile, "Some text in a file", Charset.defaultCharset());
            } else {
                System.out.println("File already exists at this path.");
            }

            // Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(file, "UTF8"));

            // Create directory
            File destDir = new File("src/main/resources/destDir");
            // Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            // Get file from new directory
            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            // Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            // Print it
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
        
    } 
} 


/* import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) {
        File inputFile = new File("sample.txt"); // Assign file
        try {
            // Create the file if it doesn't exist
            if (inputFile.createNewFile()) {
                System.out.println("File created: " + inputFile.getAbsolutePath());
            }

            // Write the file path into the file instead of printing to console
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                writer.write("File path: " + inputFile.getAbsolutePath());
                System.out.println("File path written into the file successfully.");
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
} */

