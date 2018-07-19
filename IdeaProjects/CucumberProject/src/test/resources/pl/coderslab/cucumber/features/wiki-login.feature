Feature: Wikipedia Login Page

  Scenario Outline: Can not login given wrong credentials

    Given browser with Wikipedia Login Page open
    And user input <login> into Login field
    And user input <password> into Password field

    Examples:

      | login  | password        |
      | bartek | test1234        |
      | marcin | haselkomocne123 |
