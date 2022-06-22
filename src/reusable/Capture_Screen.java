package reusable;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen {

	public void Capture_normal_Screen(WebDriver driver, String File_Location) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(File_Location));
	}
	public void Capture_Screen_When_Alert_Presented(String File_Location) throws AWTException, IOException
	{
		Robot robot=new Robot();
		Dimension System_dimension=Toolkit.getDefaultToolkit().getScreenSize();
		BufferedImage image=robot.createScreenCapture(new Rectangle(System_dimension));
		File file=new File(File_Location);
		ImageIO.write(image, "PNG", file);
	}

}
