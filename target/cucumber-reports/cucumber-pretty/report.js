$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("manageRepositories.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want to be able to create and delete Git repositories through Github\u0027s UI.",
  "description": "       So, I can easily manage them",
  "id": "as-a-user-i-want-to-be-able-to-create-and-delete-git-repositories-through-github\u0027s-ui.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2694218004,
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
  "duration": 2786519013,
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
  "duration": 41713496,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iClickOnTheCreateRepositoryCTA()"
});
formatter.result({
  "duration": 581069358,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iSubmitTheNewRepositorySInformation()"
});
formatter.result({
  "duration": 5303386236,
  "status": "passed"
});
formatter.match({
  "location": "CreateRepository.iShouldBeAtTheNewRepositorySPage()"
});
formatter.result({
  "duration": 39491431,
  "status": "passed"
});
});