# FILE-HANDLING-UTILITY

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: LEELA MANOHAR

*INTERN ID*: CT12IQO

*DOMAIN*: JAVA DEVELOPER

*DURATION*: 8 WEEKS

*MENTOR*: NEELA SANTOSH

*DESCRIPTION*:

Objective:
The objective of this program was to demonstrate basic file operations in Java, including writing, reading, and modifying text files. This exercise also aimed to familiarize users with handling files efficiently while using standard Java libraries.

Overview of the Program:
The program is a menu-driven application that allows users to interactively perform the following file operations:

Write to a File: Accept user input and save it as the content of a text file named sample.txt. The program overwrites any existing content in the file.
Read from a File: Display the content of the text file, providing a way to confirm that data is correctly saved.
Modify a File: Allow users to replace occurrences of specific words in the file with new ones, demonstrating basic text processing.
The program uses the Java NIO (New Input/Output) package for efficient file handling, specifically Files and Paths classes.

Technical Details:

Writing to a File:

The user enters text, which is then converted to bytes and saved using the Files.write() method.
If the file does not exist, it is created automatically.
Reading a File:

The content of the file is fetched using Files.readAllBytes() and converted back into a String for display.
This method ensures fast and simple file reading.
Modifying a File:

The String.replace() method is used to find and replace words in the file content.
The modified content is then rewritten to the file, showcasing how text can be dynamically changed.
How the Program Works:

The user is presented with a menu to select an operation:

Write text to a file.
Read and display the file content.
Replace specific words in the file and update the content.
Exit the program.
For Write and Modify operations, the program accepts user input using the Scanner class and performs the requested actions on the file.

Proper error handling ensures that issues like missing files or incorrect paths are handled gracefully.
