package Test_Scenarios;

import common.DemoQAInteration;
import common.DemoWebTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public void TC01_TextBoxInput() throws InterruptedException {
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
    @Test
    public void TC02_WebTable() throws InterruptedException{
        DemoWebTable WebTable = new DemoWebTable(driver);

        // random email
        String email = "rose" + WebTable.getRandomNumber() + "@mail.net";

        // Add new
        WebTable.ChooseWebTable();
        WebTable.ClickAddNew();
        WebTable.InputFistName("Lan");
        WebTable.InputLastName("Tran");
        WebTable.InputEmail(email);
        WebTable.InputAge("33");
        WebTable.InputSalary("5000");
        WebTable.InputDepartment("Insurance");
        Thread.sleep(3000);
        WebTable.ClickSubmitAdd();
        Thread.sleep(3000);

        //search item added
        WebTable.SearchAddNew(email);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void TC03_Search() {
        DemoWebTable WebTable = new DemoWebTable(driver);
        //search item added

    }

    @AfterTest
    public void aftertest(){
        driver.quit();
    }
}
