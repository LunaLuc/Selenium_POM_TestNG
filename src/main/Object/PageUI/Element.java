package PageUI;

import org.openqa.selenium.By;

public interface Element {
    String XPATH_ELEMENT_TAB = "//div[@class = 'card-body']";
    String XPATH_TEXTBOX_OPTION = "//ul[@class = 'menu-list']/li[1]";
    String XPATH_FULL_NAME = "//input[@id= 'userName']";
    String XPATH_EMAIL = "//input[@id= 'userEmail']";
    String XPATH_CURRENT_ADDRESS = "//textarea[@id= 'currentAddress']";
    String XPATH_PermanentAddress = "//textarea[@id= 'permanentAddress']";
    String XPATH_Submit = "//button[@id= 'submit']";
}

