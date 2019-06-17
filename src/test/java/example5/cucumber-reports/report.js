$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:andor/example4and.feature");
formatter.feature({
  "name": "buy products in testmeapp",
  "description": "  I want to login in testmeapp",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "payment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UAT"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I ant to select the payment option",
  "keyword": "Given "
});
formatter.match({
  "location": "example55.i_ant_to_select_the_payment_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered bank name as \"icici\"",
  "keyword": "And "
});
formatter.match({
  "location": "example55.i_entered_bank_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked to  proceed for payment",
  "keyword": "Then "
});
formatter.match({
  "location": "example55.i_clicked_to_proceed_for_payment()"
});
formatter.result({
  "status": "passed"
});
});