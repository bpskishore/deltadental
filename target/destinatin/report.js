$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("example.feature");
formatter.feature({
  "line": 2,
  "name": "Search Doctor from particular zip code and filter western dental from results",
  "description": "I want to use this template for my feature file",
  "id": "search-doctor-from-particular-zip-code-and-filter-western-dental-from-results",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Find Doctor from western dental for zip code 94105",
  "description": "",
  "id": "search-doctor-from-particular-zip-code-and-filter-western-dental-from-results;find-doctor-from-western-dental-for-zip-code-94105",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "click on find dentist from home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "select zip code as 94105 and provider as \"DeltaCare USA\" from dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "search \"western dental\" from search page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.click_on_find_dentist_from_home_page()"
});
formatter.result({
  "duration": 5109424315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "94105",
      "offset": 19
    },
    {
      "val": "DeltaCare USA",
      "offset": 42
    }
  ],
  "location": "StepDef.specifyZipAndProvider(int,String)"
});
formatter.result({
  "duration": 2743781080,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "western dental",
      "offset": 8
    }
  ],
  "location": "StepDef.searchProvider(String)"
});
formatter.result({
  "duration": 698354046,
  "status": "passed"
});
});