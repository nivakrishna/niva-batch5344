import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishnakumar\\Desktop\\selenium\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);


		w.get("http://demo.automationtesting.in/Index.html");

		//1.checking the button for sign up with valid email id
		w.findElement(By.id("email")).sendKeys("niva.tester@gmail.com");
		Thread.sleep(2000);
		w.findElement(By.id("enterimg")).click();
		w.navigate().back();
		w.findElement(By.id("email")).clear();


		//2.checking the button for sign up with invalid email id
		w.findElement(By.id("email")).sendKeys("niva.testail.com");
		Thread.sleep(2000);
		w.findElement(By.id("enterimg")).click();
		w.navigate().back();
		//w.findElement(By.id("email")).clear();



		//3.checking the button for sign up with blank text field
		w.findElement(By.id("email")).sendKeys("");
		Thread.sleep(2000);
		w.findElement(By.id("enterimg")).click();
		w.navigate().back();
		Thread.sleep(3000);
		System.out.println("sigup section done sucessfully");


		//4.sign in section with valid crenditials(D)
		w.findElement(By.linkText("Sign In")).click();
		w.findElement(By.xpath("/html/body/div/div/div[2]/input")).sendKeys("niva.mnh@gmail.com");
		w.findElement(By.xpath("/html/body/div/div/div[3]/input")).sendKeys("mnbvczx");
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id=\"enterbtn\"]")).click();
		w.navigate().back(); Thread.sleep(3000);

		// 5.sign in section with invalid email id
		w.findElement(By.linkText("Sign In")).click();
		w.findElement(By.xpath("/html/body/div/div/div[2]/input")).sendKeys("nivagmail.com");
		w.findElement(By.xpath("/html/body/div/div/div[3]/input")).sendKeys("mnkk");
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id=\"enterbtn\"]")).click();
		w.navigate().back(); Thread.sleep(3000);

		//6.sign in section with blank fields
		w.findElement(By.linkText("Sign In")).click();
		w.findElement(By.xpath("/html/body/div/div/div[2]/input"));
		w.findElement(By.xpath("/html/body/div/div/div[3]/input"));
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id=\"enterbtn\"]")).click();
		w.navigate().back();

		//7.checking the functionality of "skip the sign in button"
		w.findElement(By.id("btn2")).click();
		System.out.println("signin section done sucessfully");
		
		//8.checking the functionality of vertical scrolling
		JavascriptExecutor js =(JavascriptExecutor)w;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		System.out.println("page end");

		//in register section


		//9.to check the radio button for gender
		w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		System.out.println("radio button section done sucessfully");


		//10.To check the funcionality of check boxes for hobbies
		w.findElement(By.id("checkbox2")).click();
		w.findElement(By.id("checkbox3")).click();
		System.out.println("check boxes are done sucessfully");


		//11.To check the functionality of drop down box for skills
		Select s0=new Select(w.findElement(By.id("Skills")));
		s0.selectByVisibleText("Programming");
		//12. To check the functionality of drop down box for country
		Select s4=new Select(w.findElement(By.id("countries")));
		s4.selectByVisibleText("Algeria");

		//date of birth

		//13. To check the functionality of drop down box for date
		Select s01=new Select(w.findElement(By.id("daybox")));
		s01.selectByVisibleText("15");
		
		//14.To check the functionality of drop down box for month
		Select s1=new Select(w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		s1.selectByVisibleText("January");
		
		//15.To check the functionality of drop down box for year
		Select s2=new Select(w.findElement(By.id("yearbox")));
		s2.selectByVisibleText("1998");
		System.out.println("drop box section done sucessfully");
		
		//16.to check the functionality of submit button with valid data(D)
		w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("kavitha");
		w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("raut");
		w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("pune maharashtra");
		w.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("kavitha.tester@gmail.com");
		w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9876543210");
		w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		w.findElement(By.id("checkbox2")).click();
		w.findElement(By.id("checkbox3")).click();    
		w.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		w.findElement(By.linkText("Estonian")).click();
		Select s10=new Select(w.findElement(By.id("Skills")));
		s10.selectByVisibleText("Programming");
		Select s11=new Select(w.findElement(By.id("countries")));
		s11.selectByVisibleText("Algeria");
		Select s12=new Select(w.findElement(By.id("daybox")));
		s12.selectByVisibleText("15");
		Select s13=new Select(w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		s13.selectByVisibleText("January");
		Select s14=new Select(w.findElement(By.id("yearbox")));
		s14.selectByVisibleText("1998");w.findElement(By.id("firstpassword")).sendKeys("PASsword01");
		w.findElement(By.id("secondpassword")).sendKeys("PASsword01");
		w.findElement(By.id("submitbtn")).click();
		System.out.println("submit section sucessfully");
		//17.to check the functionality of refresh button  
		w.findElement(By.id("Button1")).click();

		//18. To check the functionality of 'choosefile 'option for file upload    
		WebElement upload_file= w.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
		upload_file.sendKeys("C:\\Users\\krishnakumar\\Desktop");
		System.out.println("upload file sucessfully");

		//19.to check the screenshot of the function working properly or not screenshot
		TakesScreenshot ts=(TakesScreenshot)w;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\krishnakumar\\Desktop\\automation.png");
		Files.copy(src,trg);
		System.out.println("take screenshot sucessfully");

		//20. To check the functionality of webtable button
		w.findElement(By.linkText("WebTable")).click();
		w.navigate().back();

		//21. To check the functionality of  switch to(mouse hover) 
		Actions act=new Actions(w);
		act.moveToElement(w.findElement(By.linkText("SwitchTo"))).perform();
		//22.to check the functionality of alert    	
		act.moveToElement(w.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a"))).click().perform();
		Thread.sleep(2000);
		//23.To check the functionality of alert with okay 
		w.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click(); 
		Thread.sleep(3000);
		w.switchTo().alert().accept();
		Thread.sleep(3000); 
		//24.To check the functionality of alert with ok and cancel 
		w.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a ")).click();
		//25. To check the functionality of 'click the button to display an  alert box'
		w.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();Thread.sleep(3000);
		w.switchTo().alert().accept();
		Thread.sleep(3000);

		//26.To check the functionality of alert with text   
		w.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();

		//27. To check the functionality of click the button to demonstrate the prompt box 
		w.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();Thread.sleep(3000);
		Alert A1=w.switchTo().alert();
		A1.sendKeys("niva");
		Thread.sleep(3000);
		A1.accept();
		System.out.println("alert section completed sucessfully");

		//28.To check the functionality of windows
        act.moveToElement(w.findElement(By.linkText("SwitchTo"))).perform(); 
		Thread.sleep(2000);
		act.moveToElement(w.findElement(By.linkText("Windows"))).click().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ESCAPE).build().perform();

		//29.To check the functionality of open new tabed windows
        w.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
		Set<String> windows=w.getWindowHandles();
		Iterator<String >it=windows.iterator();
		String parent_window1=it.next();
		String child_window1=it.next();
		w.switchTo().window(parent_window1);
		Thread.sleep(5000);
		w.switchTo().window(child_window1);
		Thread.sleep(5000);
		w.switchTo().window(parent_window1);
		Thread.sleep(5000);

		//30.To check the functionality of Open New Seperate Windows
        w.findElement(By.linkText("Open New Seperate Windows")).click();
		w.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
		Thread.sleep(5000);
		Set<String> windows1=w.getWindowHandles();
		Iterator<String >it1=windows1.iterator();
		String child_window2=it1.next();
		w.switchTo().window(child_window2);
		Thread.sleep(5000);
		w.switchTo().window(parent_window1);

		//31.To check the functionality of Open Seperate Multiple Windows
        w.findElement(By.linkText("Open Seperate Multiple Windows")).click();
		w.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
		Thread.sleep(5000);
		Set<String> windows3=w.getWindowHandles();
		Iterator<String >it3=windows3.iterator();
		String child_window3=it3.next();
		w.switchTo().window(child_window3);
		w.switchTo().window(parent_window1);
		System.out.println("window section completed sucessfully");
        System.out.println("sucessfull");
		
        System.out.println("Title : " + w.getTitle() );
		System.out.println("Current Url : "+w.getCurrentUrl());
		w.quit();


	}
}
