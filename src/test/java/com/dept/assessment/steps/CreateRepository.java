package com.dept.assessment.steps;

import com.dept.assessment.consts.Constants;
import com.dept.assessment.pages.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class CreateRepository {

    private WebDriver driver;
    private LoginPage loginpPage;
    private HomePage homePage;
    private RepositoryPage repositoryPage;
    private CreateRepositoryPage createRepoPage;
    private SettingsPage settingsPage;
    private String repoName = "DeptAssesment";
    private String repoDescription = "Dept assessment repo for testing purposes";
    private String gitOptionsFilter = "J";
    private String gitIgnoreTemplate = "Java";
    private String deletedMessageSubstring = "was successfully deleted.";

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    }

    @Given("^I am logged in the Github's website$")
    public void iAmLoggedInTheGithubSWebsite() {
        driver.get(Constants.LOGIN_URL);
        loginpPage = new LoginPage(driver);
        loginpPage.enterUsername(Constants.USERNAME);
        loginpPage.enterPassword(Constants.PASSWORD);
        loginpPage.clickLoginButton();
    }

    @Given("^I'm at the homepage$")
    public void iMAtTheHomepage() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isPageOpen());
    }

    @When("^I click on the create Repository CTA$")
    public void iClickOnTheCreateRepositoryCTA() {
        homePage.clickStartAProjectCTA();
    }

    @And("^I submit the new repository's information$")
    public void iSubmitTheNewRepositorySInformation() {
        createRepoPage = new CreateRepositoryPage(driver);
        createRepoPage.enterRepoName(repoName);
        createRepoPage.enterRepoDescription(repoDescription);
        createRepoPage.selectPrivateRepo();
        createRepoPage.checkCreateReadme();
        createRepoPage.openGitIgnoreOptions();
        Assert.assertTrue(createRepoPage.getGitIgnoreOption(gitOptionsFilter).equals(gitOptionsFilter));
        createRepoPage.clickGitIgnoreOption(gitIgnoreTemplate);
        createRepoPage.clickOnSubmitRepo();
    }

    @Then("^I should be at the new repository's page$")
    public void iShouldBeAtTheNewRepositorySPage() {
        repositoryPage = new RepositoryPage(driver);
        Assert.assertTrue(repositoryPage.getRepositoryName().equals(repoName));
    }

    @Given("^I'm at the Create a new repository page$")
    public void iMAtTheCreateANewRepositoryPage() {
        driver.get(Constants.NEW_REPO_URL);
        Assert.assertTrue(driver.getCurrentUrl().equals(Constants.NEW_REPO_URL));
    }

    @When("^I fill out a name of an existing repository$")
    public void iFillOutANameOfAnExistingRepository() {
        createRepoPage = new CreateRepositoryPage(driver);
        createRepoPage.enterRepoName(repoName);
    }

    @Then("^I should see an error message$")
    public void iShouldSeeAnErrorMessage() {
        Assert.assertTrue(createRepoPage.errorExistingRepo.isDisplayed());
    }

    @Given("^I'm at the settings repository's page$")
    public void iMAtTheSettingsRepositorySPage() {
        homePage = new HomePage(driver);
        repositoryPage = new RepositoryPage(driver);
        homePage.filterRepositoryByKeyword(repoName);
        homePage.clickOnFirstResultLink();
        repositoryPage.clickOnSettingsTab();
    }

    @When("^I click on the Delete repository CTA$")
    public void iClickOnTheDeleteRepositoryCTA() {
        settingsPage = new SettingsPage(driver);
        settingsPage.clickDeleteRepositoryCTA();
    }

    @And("^I confirm that I want to delete the repository$")
    public void iConfirmThatIWantToDeleteTheRepository() {
        settingsPage.enterRepoNameToDelete(repoName);
        settingsPage.clickConfirmDeleteAction();
    }

    @Then("^I should see a message confirming that the repository was deleted$")
    public void iShouldSeeAMessageConfirmingThatTheRepositoryWasDeleted() {
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.deletedRepoMessage.getText().contains(deletedMessageSubstring));
    }

    @After
    public void close(){
        driver.close();
    }
}
