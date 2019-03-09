package com.dept.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    private WebDriver driver;

    @FindBy(css = ".shelf-cta[href='/new']")
    public WebElement createRepositoryCTA;

    public Homepage(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(_driver, this);
    }

    public void clickCreateButton() {
        createRepositoryCTA.click();
    }
}
