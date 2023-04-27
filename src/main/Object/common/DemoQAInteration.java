package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import PageUI.Element;
import org.openqa.selenium.WebElement;


public class DemoQAInteration {
    WebDriver driver;

    public DemoQAInteration(WebDriver driver){
        this.driver = driver;
    }
    By ChooseElementTab = By.xpath("//div[@class = 'card-body']");
    By TextBoxOption = By.xpath("//ul[@class = 'menu-list']/li[1]");
    By FullName = By.xpath("//input[@id= 'userName']");
    By Email = By.xpath("//input[@id= 'userEmail']");
    By CurrentAdd = By.xpath("//textarea[@id= 'currentAddress']");
    By PermanentAddress = By.xpath("//textarea[@id= 'permanentAddress']");
    By Submit = By.xpath("//button[@id= 'submit']");

    //Choose TextBoxOption
    public void TapTextBox (){
        driver.findElement(ChooseElementTab).click();
        driver.findElement(TextBoxOption).click();
    }

    //set FullName
    public void setFullName(String strFullName) {
        driver.findElement(FullName).sendKeys(strFullName);
    }

    //set Email
    public void setEmail(String strEmail){
        driver.findElement(Email).sendKeys(strEmail);
    }

    //set CurrentAdd
    public void setCurrentAdd(String strCurrentAdd){
        driver.findElement(CurrentAdd).sendKeys(strCurrentAdd);
    }

    //set PermanentAddress
    public void setPermanentAddress(String strPermanentAddress){
        driver.findElement(PermanentAddress).sendKeys(strPermanentAddress);
    }

    //click Submit
    public void clickSubmit(){
        driver.findElement(Submit).click();
    }

    public void inputToTextBox(String strFullName, String strEmail,String strCurrentAdd,String strPermanentAddress) throws InterruptedException{
//        //choose Element-Textbox
//        this.TapTextBox();

        //Fill value
        this.setFullName(strFullName);
        this.setEmail(strEmail);
        this.setCurrentAdd(strCurrentAdd);
        this.setPermanentAddress(strPermanentAddress);

//        //click Submit
//        this.clickSubmit();
    }

}
