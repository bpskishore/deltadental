
Feature: Search Doctor from particular zip code and filter western dental from results
  I want to use this template for my feature file

  @tag1
  Scenario: Find Doctor from western dental for zip code 94105
    Given click on find dentist from home page
    When select zip code as 94105 and provider as "DeltaCare USA" from dropdown
    Then  search "western dental" from search page

