$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("manageRepositories.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want to be able to create and delete Git repositories through Github\u0027s UI.",
  "description": "       So, I can easily manage them",
  "id": "as-a-user-i-want-to-be-able-to-create-and-delete-git-repositories-through-github\u0027s-ui.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4623949846,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am logged in the Github\u0027s website",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateRepository.iAmLoggedInTheGithubSWebsite()"
});
formatter.result({
  "duration": 3110295483,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Successfully create a Github repository",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-create-and-delete-git-repositories-through-github\u0027s-ui.;successfully-create-a-github-repository",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I\u0027m at the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on the create Repository CTA",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I submit the new repository\u0027s information",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be at the new repository\u0027s page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateRepository.iMAtTheHomepage()"
});
formatter.result({
  "duration": 57663897,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iClickOnTheCreateRepositoryCTA()"
});
formatter.result({
  "duration": 907824135,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iSubmitTheNewRepositorySInformation()"
});
formatter.result({
  "duration": 5554281933,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iShouldBeAtTheNewRepositorySPage()"
});
formatter.result({
  "duration": 33945944,
  "status": "passed"
});
formatter.after({
  "duration": 171318010,
  "status": "passed"
});
formatter.before({
  "duration": 1402621508,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am logged in the Github\u0027s website",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateRepository.iAmLoggedInTheGithubSWebsite()"
});
formatter.result({
  "duration": 2797241340,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Repository creation fails when the repository already exists",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-create-and-delete-git-repositories-through-github\u0027s-ui.;repository-creation-fails-when-the-repository-already-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I\u0027m at the Create a new repository page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I fill out a name of an existing repository",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateRepository.iMAtTheCreateANewRepositoryPage()"
});
formatter.result({
  "duration": 851116394,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iFillOutANameOfAnExistingRepository()"
});
formatter.result({
  "duration": 642257865,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iShouldSeeAnErrorMessage()"
});
formatter.result({
  "duration": 476074461,
  "status": "passed"
});
formatter.after({
  "duration": 113246677,
  "status": "passed"
});
formatter.before({
  "duration": 1537788908,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am logged in the Github\u0027s website",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateRepository.iAmLoggedInTheGithubSWebsite()"
});
formatter.result({
  "duration": 2801580057,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Delete a Github repository",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-create-and-delete-git-repositories-through-github\u0027s-ui.;delete-a-github-repository",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I\u0027m at the settings repository\u0027s page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I click on the Delete repository CTA",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I confirm that I want to delete the repository",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should see a message confirming that the repository was deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateRepository.iMAtTheSettingsRepositorySPage()"
});
formatter.result({
  "duration": 1754353779,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iClickOnTheDeleteRepositoryCTA()"
});
formatter.result({
  "duration": 547936247,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iConfirmThatIWantToDeleteTheRepository()"
});
formatter.result({
  "duration": 1398560714,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iShouldSeeAMessageConfirmingThatTheRepositoryWasDeleted()"
});
formatter.result({
  "duration": 67342920,
  "status": "passed"
});
formatter.after({
  "duration": 161558338,
  "status": "passed"
});
});