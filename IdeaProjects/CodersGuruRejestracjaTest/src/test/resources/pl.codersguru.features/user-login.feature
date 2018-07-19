Feature: CodersGuruLoginPage

  Scenario Outline: Can not login given wrong credentials

    Given browser with Coders Guru Login Page open
    And user input <Username> into Login field
    And user input <Password> into Password field

    Examples:

      | Username | Password        |
      | bartek   | test1234        |
      | marcin   | haselkomocne123 |
