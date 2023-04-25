package Test_Scenarios;

import common.DemoQAInteration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class testSuiteDemoQAInteration{
    WebDriver driver;

    @BeforeTest
    public void beforetest(){
        driver = new ChromeDriver();
        // set timeout de tim element`
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        // open application (AUT/SUT)
        driver.get("https://demoqa.com/");
    }
    @Test(priority=0)
    public void TextBoxInput() throws InterruptedException {
        DemoQAInteration page = new DemoQAInteration(driver);
        page.TapTextBox();
//        page.setFullName("Mina Tran");
//        page.setEmail("abc@gmail.com");
//        page.setCurrentAdd("Cau Giay - HN");
//        page.setPermanentAddress("Dong Da");
        page.inputToTextBox("Mina Tran", "abc@gmail.com", "Cau Giay - HN", "Dong Da");
        page.clickSubmit();
        Thread.sleep(3000);
    }

    @AfterTest
    public void aftertest(){
        driver.quit();
    }
}
