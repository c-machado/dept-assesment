package com.dept.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {

    private WebDriver driver;

    @FindBy(css = ".Box--danger .Box-row:last-child .btn-danger")
    public WebElement deleteRepositoryCTA;

    @FindBy(css = ".Box--danger .Box-row:last-child form input[name='verify']")
    public WebElement inputConfirmNameRepo;

    @FindBy(css = ".Box--danger .Box-row:last-child form [type='submit']")
    public WebElement buttonConfirmDeleteRepo;

    public SettingsPage(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(_driver,this);
    }

    public void clickDeleteRepositoryCTA() {
        deleteRepositoryCTA.click();
    }

    public void enterRepoNameToDelete(String _repoName) {
        inputConfirmNameRepo.sendKeys(_repoName);
    }

    public void clickConfirmDeleteAction() {
        buttonConfirmDeleteRepo.click();
    }
}
