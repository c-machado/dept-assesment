Feature: As a user I want to be able to create and delete Git repositories through Github's UI.
         So, I can easily manage them

  Background:
    Given I am logged in the Github's website

    Scenario: Successfully create a Github repository
        Given I'm at the homepage
        When I click on the create Repository CTA
        And I submit the new repository's information
        Then I should be at the new repository's page

    Scenario: Repository creation fails when the repository already exists
        Given I'm at the Create a new repository page
        When I fill out a name of an existing repository
        Then I should see an error message

    Scenario: Delete a Github repository
        Given I'm at the settings repository's page
        When I click on the Delete repository CTA
        And I confirm that I want to delete the repository
        Then I should see a message confirming that the repository was deleted

