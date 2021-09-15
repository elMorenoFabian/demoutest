@stories
Feature:  Utest
  as user register in utest.com

  @scenario1
  Scenario: Register user
    Given user wants register in page
    When user fill user registration
    | name      | lastName       | email                 | birthMont | birthDay | birthYear | lenguage | city   | zip    | country  | osPc  | osVersion | osLenguage | password       | passwordConfirm |
    | test name | test last name | testuser2@testuser2.com | January   | 10       | 1990      | spanish  | Bogota | 111144 | Colombia | Linux | openSUSE  | Spanish    | %hC55U4cdA#Vm8 | %hC55U4cdA#Vm8  |
    Then user register success
    | headerTitle                                                             |
    | Welcome to the world's largest community of freelance software testers! |