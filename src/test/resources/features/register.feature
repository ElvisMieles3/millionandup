Feature: Register
  As: A quality analyst
  I Want: Validate and verify the funcionality of the register on the site https://newdesign.millionandup.com/
  To: Have acces to the portal.


  Scenario: Register the data in the system.
    Given that Elvis is in the portal
    When he enters the credentials
      | email            | name           | phone      |
      | elvism@gmail.com | Elvis M Mieles | 3045410190 |
    Then user should see message ¿Quiere agendar una presentación del proyecto?

  Scenario Outline: Send incomplete data
    Given that Elvis is in the portal
    When he enters the credentials
      | email   | name   | phone   |
      | <email> | <name> | <phone> |
    Then The user should see the validation message Regístrese para ingresar al sitio

    Examples:

      | email                  | name           | phone     |
      | N                      | Navelis Mieles | 304556766 |
      | Navelismielesgmail.com | Navelis Mieles | 304556766 |
      | Navelismieles@gmail    | Navelis Mieles | 304556766 |
      | Navelismieles@gmail    | N              | 304556766 |
      | Navelismieles@gmail    | Nav            | 304556766 |
      | Navelismieles@gmail    | Navelis Mieles | 304       |
      |                        | Navelis Mieles | 304556766 |
      | Navelismieles@gmail    |                | 304556766 |
      | Navelismieles@gmail    | Navelis Mieles |           |





