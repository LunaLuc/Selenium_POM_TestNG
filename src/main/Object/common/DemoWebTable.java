package common;

import PageUI.ElementWebTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class DemoWebTable extends ElementWebTable{
    WebDriver driver;
    public DemoWebTable(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void ChooseWebTable(){
//        xpathSelectElement.click();
        xpathWebTable.click();
    }
    public void ClickAddNew(){
        xpathClickAdd.click();
    }
    public void InputFistName(String inputFullname){
        xpathFistName.sendKeys(inputFullname);
    }
    public void InputLastName(String inputLastname){
        xpathLastName.sendKeys(inputLastname);
    }
    public void InputEmail(String inputMail){
        xpathEmail.sendKeys(inputMail);
    }
    public void InputAge(String inputAge){
        xpathAge.sendKeys(inputAge);
    }
    public void InputSalary(String inputSalary){
        xpathSalary.sendKeys(inputSalary);
    }
    public void InputDepartment(String inputDepartment){
        xpathDepartment.sendKeys(inputDepartment);
    }
    public void ClickSubmitAdd(){
        xpathSubmitAddNew.click();
    }

    public void SearchAddNew(String inputSearch){
        xpathSearchAddNew.sendKeys(inputSearch);
    }
    public int getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(9999);
    }
}
