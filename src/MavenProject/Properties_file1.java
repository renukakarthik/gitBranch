package MavenProject;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Properties_file1 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		FileInputStream fis=new FileInputStream("\"C:\\Users\\dellf\\Downloads\\commondata11.properties.txt\");
		

	}

}
