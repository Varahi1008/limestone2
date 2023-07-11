@tag
Feature: LimeRoad Order for a Men product

  @tag
  Scenario: To search a product for men
    Given User launch the url "https://www.limeroad.com/"
    And User click on shop men

  @tag
  Scenario: Look out for a Jean Model
    Given User click on jean
    When Choose the fisrt model
        
  @tag
  Scenario: Grab the needed jean 
  	Given User click on first product
  	When Select size
  	Then  Add to Cart
    