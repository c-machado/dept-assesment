package com.dept.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateRepository {
    private WebDriver driver;

    @FindBy(id = "repository_name")
    public WebElement repositoryName;

    @FindBy(id = "repository_description")
    public WebElement repositoryDescription;

    @FindBy(id = "repository_public_true")
    public WebElement radioBtnPublicRepo;

    @FindBy(id = "repository_public_false")
    public WebElement radioBtnPrivateRepo;

    @FindBy(id = "repository_auto_init")
    public WebElement readmeFile;

    @FindBy(css  = "ul.repo-templates summary:first-of-type")
    public WebElement gitIgnoreCTA;

    @FindBy(css = "context-ignore-filter-field")
    public WebElement gitIgnoreFilterField;

    @FindAll({@FindBy(css = "[data-filterable-for='context-ignore-filter-field'] .select-menu-item:not([style='display: none;'])")})
    public List<WebElement> gitIgnoreFilteredOptions;

    @FindBy(css = "#new_repository [type='submit']")
    public WebElement gitIgnoreCreateRepoCTA;

    public CreateRepository(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(_driver,this);
    }

    public void enterRepoName(String _repoName) {
        repositoryName.sendKeys(_repoName);
    }

    public void enterRepoDescription(String _description) {
        repositoryDescription.sendKeys(_description);
    }

    public void selectPublicRepo() {
        radioBtnPublicRepo.click();
    }

    public void selectPrivateRepo() {
        radioBtnPrivateRepo.click();
    }

    public void checkCreateReadme() {
        readmeFile.click();
    }

    public void openGitIgnoreOptions() {
        gitIgnoreCTA.click();
    }

    public void filterGitIgonreOptions(String _filterGitIgnore) {
        gitIgnoreFilterField.sendKeys(_filterGitIgnore);
    }

    public void clickOnSubmitRepo() {
        gitIgnoreCreateRepoCTA.click();
    }
}