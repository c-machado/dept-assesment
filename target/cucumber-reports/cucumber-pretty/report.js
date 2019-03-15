$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("manageRepositories.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want to be able to create and delete Git repositories through Github\u0027s UI.",
  "description": "       So, I can easily manage them",
  "id": "as-a-user-i-want-to-be-able-to-create-and-delete-git-repositories-through-github\u0027s-ui.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3287185439,
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
  "duration": 4633116150,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Delete a Github repository",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-create-and-delete-git-repositories-through-github\u0027s-ui.;delete-a-github-repository",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I\u0027m at the settings repository\u0027s page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateRepository.iMAtTheSettingsRepositorySPage()"
});
formatter.result({
  "duration": 1188042887,
  "status": "passed"
});
});