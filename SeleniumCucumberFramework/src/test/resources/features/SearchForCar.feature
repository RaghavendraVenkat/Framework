@SearchCar
Feature: Search car
  I want to use this to search a car from CarGuides.com.au

  @tag2
  Scenario Outline: Searching of various cars from dropdown
    Given I am on carguides website
    When I select car of <Model> and <Make>
    And I click on Show me cars button
    Then I should be able to see a list of cars displayed with <pageTitle>

    Examples: 
      | Model | Make | pageTitle             |
      | BMW   | 220D | 8 BMW 220Ds for Sale  |
      | Kia   | RIO  | 404 Kia Rios for Sale |
