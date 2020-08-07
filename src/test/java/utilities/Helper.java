package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static void captureScreenShot(WebDriver driver, String screenshotName) {
		Path destPath = Paths.get("./Screenshots", screenshotName + ".png");
		try {
			java.nio.file.Files.createDirectories(destPath.getParent());
			FileOutputStream out = new FileOutputStream(destPath.toString());
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			System.out.println("Excpetion while taking screenshot" + e.getMessage());
		}

	}

}
