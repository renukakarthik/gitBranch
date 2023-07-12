package MavenProject;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileProperty {

	

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		//FileInputStream fis=new FileInputStream("commondata11.properties.txt");
		FileInputStream fis=new FileInputStream("C:\\Users\\dellf\\Downloads\\commondata11.properties.txt");
		Properties pro=new Properties();
		 pro.load(fis);
		 String url1 = pro.getProperty("url1");
		// String username = pro.getProperty("username");
		 //String password = pro.getProperty("password");
		 driver.get(url1);
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 
		 //fetching data from excel
		 //connecting the path
		 FileInputStream fes=new FileInputStream("./batch.xlsx");
		 
		 //load the data
		 
		 
		
		 
		 
		 
	

	}

}
