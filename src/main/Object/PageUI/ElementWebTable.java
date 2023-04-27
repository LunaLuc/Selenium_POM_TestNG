package PageUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementWebTable {
    @FindBy(xpath = "//div[@class = 'card-body']") public WebElement xpathSelectElement;
    @FindBy(xpath = "//ul[@class = 'menu-list']/li[4]") public WebElement xpathWebTable;
    @FindBy(xpath = "//button[@id = 'addNewRecordButton']") public WebElement xpathClickAdd;
    @FindBy(xpath = "//input[@id='firstName']") public WebElement xpathFistName;
    @FindBy(xpath = "//input[@id='lastName']") public WebElement xpathLastName;
    @FindBy(xpath = "//input[@id='userEmail']") public WebElement xpathEmail;
    @FindBy(xpath = "//input[@id='age']") public WebElement xpathAge;
    @FindBy(xpath = "//input[@id='salary']") public WebElement xpathSalary;
    @FindBy(xpath = "//input[@id='department']") public WebElement xpathDepartment;
    @FindBy(xpath = "//button[@id='submit']") public WebElement xpathSubmitAddNew;
    @FindBy(xpath = "//input[@id='searchBox']") public WebElement xpathSearchAddNew;
}
