Feature: Discounts function

  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

  Scenario: Bir Admin olarak indirim kategorisindeki Ekle fonksiyonunu kullanabilme.
    Given Left navdaki modullere tiklatiniz

      | Setup      |
      | Parameters |
      | Discounts  |

    And Add Discount butonuna tıklayınız.
    And Form content bilgilerini giriniz


      | Description      | ali    |
      | Integration Code | 969 |
      | Priority         | 12  |

    And Click on the element in the Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed


  Scenario: Bir Admin olarak indirim kategorisindeki Edit fonksiyonunu kullanabilme.
    Given Left navdaki modullere tiklatiniz

      | Setup      |
      | Parameters |
      | Discounts  |

    And Edit butonuna tıklayınız.
    When Description, Integration Code, Priority

      | Description      | c    |
      | Integration Code | 6969 |
      | Priority         | 7896 |

    And Click on the element in the Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed
  Scenario Outline: Bir Admin olarak indirim kategorisindeki Delete fonksiyonunu kullanabilme.
    Given Left navdaki modullere tiklatiniz

      | Setup      |
      | Parameters |
      | Discounts  |

    Then "<Description>" ismini delete yapin.

    Examples:
      | Description |
      | c       |