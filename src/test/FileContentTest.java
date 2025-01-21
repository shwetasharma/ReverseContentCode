package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.FileContent;

public class FileContentTest {	

	@Test
	public void writeReverseContentOk() {
		String inputFilePath = ".\\src\\test\\resources\\Input.txt";
		String expectedOutputContent = "CBA";
		FileContent fileContentObject = new FileContent();
		String actualOutputContent = fileContentObject.readFileContent(inputFilePath);
		assertEquals(expectedOutputContent, actualOutputContent);
	}
	
	@Test
	public void writeReverseContentException() {
		String inputFilePath = ".\\src\\test\\resources\\Input1.txt";
		String expectedOutputContent = "";
		FileContent fileContentObject = new FileContent();
		String actualOutputContent = fileContentObject.readFileContent(inputFilePath);
		assertEquals(expectedOutputContent, actualOutputContent);
	}
}
