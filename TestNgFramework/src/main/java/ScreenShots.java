import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.testng.asserts.SoftAssert;

public class ScreenShots {
	
	
	
	public static void takeScreenShots() {
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		Files.copy(SrcFile, new File("C:\\Users\\u_far\\eclipse-workspace\\TestNgFramework\\ScreenShots\\shot"+Math.random()+".png"));
	}
	
	public static void softAssert() {
		
		SoftAssert as=new SoftAssert();
		as.assertTrue(3>5);
		System.out.println("continue....");
		as.assertAll();
	}
	

}
