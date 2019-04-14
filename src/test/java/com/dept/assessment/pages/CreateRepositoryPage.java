package com.dept.assessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Iterator;
import java.util.List;

public class CreateRepositoryPage {

    private WebDriver driver;
    private String filteredGitOptionsSelector = "[data-filterable-for='context-ignore-filter-field'] .select-menu-item:not([style='display: none;'])";

    public List<WebElement> filteredOptions;

    @FindBy(id = "repository_name")
    public WebElement repositoryName;

    @FindBy(id = "repository_description")
    public WebElement repositoryDescription;

    @FindBy(id = "repository_public_true")
    public WebElement radioBtnPublicRepo;

    @FindBy(id = "repository_visibility_public")
    public WebElement radioBtnPrivateRepo;

    @FindBy(id = "repository_auto_init")
    public WebElement readmeFile;

    @FindBy(css  = "ul.repo-templates summary:first-of-type")
    public WebElement gitIgnoreCTA;

    @FindBy(id = "context-ignore-filter-field")
    public WebElement gitIgnoreFilterField;

    @FindBy(css = "[data-filterable-for='context-ignore-filter-field'] .select-menu-item:first-of-type")
    public WebElement gitIgnoreNoneOption;

    @FindBy(css = "#new_repository [type='submit']")
    public WebElement gitIgnoreCreateRepoCTA;

    @FindBy(css = "dd.error")
    public WebElement errorExistingRepo;

    public CreateRepositoryPage(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(_driver,this);
    }

    public void enterRepoName(String _repoName) {
        repositoryName.sendKeys(_repoName);
    }

    public void enterRepoDescription(String _description) {
        repositoryDescription.sendKeys(_description);
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

    /**
     * Getting the gitIgnore options available after filtered against a String
     * @param _filterGitIgnore String to filter the gitIgnore options
     * @return List of WebElements corresponding to the gitIgnore filtered options
     */
    public List<WebElement> filterGitIgnoreOptions(String _filterGitIgnore) {
        gitIgnoreFilterField.sendKeys(_filterGitIgnore);
        WebDriverWait waitUntilFilterIsApplied = new WebDriverWait(driver, 5);
        waitUntilFilterIsApplied.until(ExpectedConditions.invisibilityOf(gitIgnoreNoneOption));
        filteredOptions = driver.findElements(By.cssSelector(filteredGitOptionsSelector));
        return filteredOptions;
    }

    /**
     * Clicking on one of the gitIgnore options based on the String received
     * @param _filterGitIgnore gitIgnore option that will be selected
     */
    public void clickGitIgnoreOption(String _filterGitIgnore) {
        Iterator <WebElement> filteredOption = filteredOptions.iterator();
        while (filteredOption.hasNext()) {
            WebElement currentOption = filteredOption.next();
            if(currentOption.getText().equals(_filterGitIgnore)) {
                currentOption.click();
                break;
            }
        }
    }

    /**
     * Getting the selected gitIgnore option according to received filter
     * @param gitOptionsFilter
     * @return name of the gitIgnore Option
     */
    public String getGitIgnoreOption(String gitOptionsFilter) {
        String optionLabel="";
        List<WebElement> filteredOptions = filterGitIgnoreOptions(gitOptionsFilter);
        Iterator<WebElement> filterIterator = filteredOptions.iterator();
        while(filterIterator.hasNext()) {
            WebElement gitIgnoreOption = filterIterator.next();
            optionLabel = gitIgnoreOption.getText().substring(0, 1);
        }
        return optionLabel;
    }

    public void clickOnSubmitRepo() {
        gitIgnoreCreateRepoCTA.click();
    }
}