Feature: Reservation
  As: A Quality Analyst
  I want: Validate and verify the funcionality of the reservation on the site https://newdesign.millionandup.com/#initial
  To: Have access to the portal

  Background: Register the data in the System
    Given that Elvis is in the portal
    When he enters the credentials
      | email            | name           | phone      |
      | elvism@gmail.com | Elvis M Mieles | 3045410190 |

  Scenario: The user wants to make a reservation
    When The User in the reservation form enters the data
      | hour | day |
      | 1 PM | 3   |
    Then the user must see the reservation confirmation Su presentación del proyecto se programó con éxito. Uno de nuestros agentes se contactará en breve para brindarle detalles.



