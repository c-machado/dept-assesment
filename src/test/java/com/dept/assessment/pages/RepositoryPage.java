package com.dept.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepositoryPage {

    private WebDriver driver;

    @FindBy(css = "[itemprop='name']")
    public WebElement repositoryName;

    @FindBy(css ="[data-selected-links*='repo_settings']")
    public WebElement settingsTab;

    public RepositoryPage(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(_driver,this);
    }

    public String getRepositoryName() {
        return repositoryName.getText();
    }

    public void clickOnSettingsTab() {
        settingsTab.click();
    }
}
