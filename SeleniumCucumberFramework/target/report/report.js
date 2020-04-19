$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SearchForCar.feature");
formatter.feature({
  "name": "Search car",
  "description": "  I want to use this to search a car from CarGuides.com.au",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SearchCar"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Searching of various cars from dropdown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I am on carguides website",
  "keyword": "Given "
});
formatter.step({
  "name": "I select car of \u003cModel\u003e and \u003cMake\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on Show me cars button",
  "keyword": "And "
});
formatter.step({
  "name": "I should be able to see a list of cars displayed with \u003cpageTitle\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Model",
        "Make",
        "pageTitle"
      ]
    },
    {
      "cells": [
        "BMW",
        "220D",
        "8 BMW 220Ds for Sale"
      ]
    },
    {
      "cells": [
        "Kia",
        "RIO",
        "404 Kia Rios for Sale"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Searching of various cars from dropdown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SearchCar"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on carguides website",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchForCar.i_am_on_carguides_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select car of BMW and 220D",
  "keyword": "When "
});
formatter.match({
  "location": "SearchForCar.i_select_car_of(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Show me cars button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchForCar.i_click_on_Show_me_cars_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see a list of cars displayed with 8 BMW 220Ds for Sale",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchForCar.i_should_be_able_to_see_a_list_of_cars_displayed_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching of various cars from dropdown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SearchCar"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on carguides website",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchForCar.i_am_on_carguides_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select car of Kia and RIO",
  "keyword": "When "
});
formatter.match({
  "location": "SearchForCar.i_select_car_of(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Show me cars button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchForCar.i_click_on_Show_me_cars_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see a list of cars displayed with 404 Kia Rios for Sale",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchForCar.i_should_be_able_to_see_a_list_of_cars_displayed_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});