Feature: Item Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Categories page

  Scenario Outline:
    When User create a item categories name as "<InventoryItemName>" user type as "<UserTypeOption>"
    Then Success message should be displayed
    When User delete the "<InventoryItemName>"
    Then Success message should be displayed


    Examples:
      | InventoryItemName | UserTypeOption |
      | Laptop0z1            | Tenant Admin   |
      | WhiteBoard0z1       | Administrator  |
      | Projector0z1        | Guest          |


