Feature: verifying adactin login details

  Scenario Outline: verifying adackin login with valid credentials
    Given user is on the adactin login page
    When user should enter "<username>" and "<password>"
    When user should click login button
    When user shoud select "<Location>","<Hotels>","<Room Type>" click search box
    And Select the hotel and click continue button
    And fill the personel details and click the booknow button "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Expiry month>","<Expiry year>","<CVV Number>"
    Then user should verify after login success message .

    Examples: 
      | username     | password  | Location  | Hotels         | Room Type | First Name | Last Name | Billing Address | Credit Card No   | Credit Card Type | Expiry month | Expiry year | CVV Number |
      | 1karthikeyan | 123karthi | Sydney    | Hotel Creek    | Standard  | prasanth   | A         | omr             | 1122334455664422 | VISA             | December     |        2022 |        677 |
   #   | 1karthikeyan | 123karthi | Melbourne | Hotel Sunshine | Standard  | prasanth   | A         | chennai         | 1122334455664422 | VISA             | December     |        2022 |        677 |
    #  | 1karthikeyan | 123karthi | Brisbane  | Hotel Cornic   | Standard  | prasanth   | A         | selam           | 1122334455664422 | VISA             | December     |        2022 |        677 |
    #  | 1karthikeyan | 123karthi | London    | Hotel Hervey   | Standard  | prasanth   | A         | trichy          | 1122334455664422 | VISA             | December     |        2022 |        677 |
   #   | 1karthikeyan | 123karthi | Sydney    | Hotel Creek    | Standard  | prasanth   | A         | pudukkottai     | 1122334455664422 | VISA             | December     |        2022 |        677 |
   #   | 1karthikeyan | 123karthi | Melbourne | Hotel Sunshine | Standard  | prasanth   | A         | omr             | 1122334455664422 | VISA             | December     |        2022 |        677 |
   #   | 1karthikeyan | 123karthi | Brisbane  | Hotel Cornic   | Standard  | prasanth   | A         | cbe             | 1122334455664422 | VISA             | December     |        2022 |        677 |
   #   | 1karthikeyan | 123karthi | London    | Hotel Hervey   | Standard  | prasanth   | A         | dindugul        | 1122334455664422 | VISA             | December     |        2022 |        677 |
   #   | 1karthikeyan | 123karthi | Sydney    | Hotel Cornic   | Standard  | prasanth   | A         | palani          | 1122334455664422 | VISA             | December     |        2022 |        677 |
   #   | 1karthikeyan | 123karthi | Melbourne | Hotel Sunshine | Standard  | prasanth   | A         | vellur          | 1122334455664422 | VISA             | December     |        2022 |        677 |
