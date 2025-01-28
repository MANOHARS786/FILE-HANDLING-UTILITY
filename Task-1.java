/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Main
{
	// File path for demonstration purposes
    private static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu options
        while (true) {
            System.out.println("\nFile Operations Menu:");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Modify File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter content to write to the file: ");
                        String content = scanner.nextLine();
                        writeFile(content);
                        break;
                    case 2:
                        System.out.println("Content of the file:");
                        System.out.println(readFile());
                        break;
                    case 3:
                        System.out.print("Enter the word to replace: ");
                        String oldWord = scanner.nextLine();
                        System.out.print("Enter the new word: ");
                        String newWord = scanner.nextLine();
                        modifyFile(oldWord, newWord);
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    /**
     * Writes content to a file.
     * If the file already exists, it will overwrite the content.
     *
     * @param content The content to write to the file.
     * @throws IOException If an I/O error occurs.
     */
    public static void writeFile(String content) throws IOException {
        Files.write(Paths.get(FILE_NAME), content.getBytes());
        System.out.println("Content written to file successfully.");
    }

    /**
     * Reads content from the file.
     *
     * @return The content of the file as a String.
     * @throws IOException If an I/O error occurs or the file does not exist.
     */
    public static String readFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get(FILE_NAME)));
    }

    /**
     * Modifies the file content by replacing occurrences of a specific word.
     *
     * @param oldWord The word to be replaced.
     * @param newWord The replacement word.
     * @throws IOException If an I/O error occurs.
     */
    public static void modifyFile(String oldWord, String newWord) throws IOException {
        // Read the current file content
        String content = readFile();

        // Replace the old word with the new word
        String modifiedContent = content.replace(oldWord, newWord);

        // Write the modified content back to the file
        writeFile(modifiedContent);

        System.out.println("File modified successfully.");
    }
}
