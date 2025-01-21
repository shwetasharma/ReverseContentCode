package main.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileContent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFilePath = ".\\src\\resources\\Input.txt";
		String outputFilePath = ".\\src\\resources\\Output.txt";		
		reverseFileConent(inputFilePath, outputFilePath);
	}


	public static void reverseFileConent(String inputFilePath, String outputFilePath) {
		String reverseContent = readFileContent(inputFilePath);	
		writeOutputFile(outputFilePath,reverseContent);
	}
	
	public static String readFileContent(String filePath) {

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			StringBuilder content = new StringBuilder();
			String line = reader.readLine();
			if (line != null) {
				content.append(line);
				while ((line = reader.readLine()) != null) {
					content.append(System.lineSeparator()).append(line);
				}
			}
			return content.reverse().toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public static void writeOutputFile(String filePath, String content) {
		try (FileWriter writer = new FileWriter(filePath)) {
			writer.write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
