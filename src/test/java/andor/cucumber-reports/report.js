$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:andor/datatable.feature");
formatter.feature({
  "name": "Facebook login",
  "description": "  I login to facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I enter url",
  "keyword": "Given "
});
formatter.match({
  "location": "example66.i_enter_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "yuva",
        "@567"
      ]
    },
    {
      "cells": [
        "rekha",
        "@789"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "example66.i_enter_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login",
  "keyword": "When "
});
formatter.match({
  "location": "example66.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "example66.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:andor/example4and.feature");
formatter.feature({
  "name": "buy products in testmeapp",
  "description": "  I want to login in testmeapp",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enters username as \"yuvarekha\"",
  "keyword": "Given "
});
formatter.match({
  "location": "example55.i_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enters password as \"yuva345\"",
  "keyword": "And "
});
formatter.match({
  "location": "example55.i_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked to  login",
  "keyword": "Then "
});
formatter.match({
  "location": "example55.i_clicked_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UAT"
    }
  ]
});
formatter.step({
  "name": "I want to search productname as \"handbag\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I add a product to cart",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the product is added to cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
formatter.scenario({
  "name": "logout successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I ckicked on logout button",
  "keyword": "And "
});
formatter.match({
  "location": "example55.i_ckicked_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
});