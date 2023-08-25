
/*

1) Automation test case related to CRM application
    1) Given User open login page of HRM application
    2) When user enter valid user name and valid password
    3) then user should be able to access the home page

 */



import io.netty.handler.codec.http.multipart.FileUpload;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class automationOfLogin {

@Test
    public void verifyDragAndDrop()

      {
         WebDriver driver = new ChromeDriver();
         driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
         driver.manage().window().maximize();
 // Create two webElement ( source webElement and Second Target WebElement )

          WebElement src = driver.findElement(By.xpath("//div[@id='box1']"));

          WebElement target = driver.findElement(By.xpath("//div[@id='box106']"));

         Actions act = new Actions(driver);
         act.
                 clickAndHold(src).
                 moveToElement(target).
                 release().
                 build().
                 perform();


          System.out.println("Debug");


     }


     @Test
    public void verifyDragAndDropWithoutTarget(){
         WebDriver driver = new ChromeDriver();
         driver.get("https://jqueryui.com/draggable/");
         driver.manage().window().maximize();
         // Time out


         // Frames

         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

         WebElement src =  driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
         Actions act = new Actions(driver);
         act.dragAndDropBy(src ,285 ,100 ).perform();
         System.out.println("Debug");

     }

     @Test
    public void handlingScrollBar(){

       WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();

       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollTo(0,500)");


//       JavascriptExecutor js = (JavascriptExecutor) driver;


//       js.executeScript("scroll(0,document.body.scrollHeight)","");
//       js.executeScript("windows.scrollTo(0,400)");
       System.out.println("debug");


     }

     @Test

    public void VerifyCaptureScreenShot() throws IOException {

          WebDriver driver = new ChromeDriver();
          driver.get("https://automationtesting.co.uk/");
          driver.manage().window().maximize();

          TakesScreenshot  ts = (TakesScreenshot) driver;

          File src=  ts.getScreenshotAs(OutputType.FILE);  // Go to the website and click on print screen

          File target = new File(".//screenShot//pag2.png");

          FileUtils.copyFileToDirectory(src, target);


     }

}
