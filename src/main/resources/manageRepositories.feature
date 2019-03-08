Feature: As a user I want to be able to create and delete Git repositories through Github's UI.
         So, I can easily manage them

  Background: I should be logged in the Github's website

    Scenario: Create a Github repository
      Given I'm at the homepage
      When I click on the create Repository CTA
      And I submit the new repository's information
      Then I should be at the new repository's page

    Scenario: Delete a Github repository
      Given I'm at the settings repository's page
      When I click on the Delete repository CTA
      And I confirm that I want to delete the repository
      And I search for the deleted repository
      Then I should see zero results

