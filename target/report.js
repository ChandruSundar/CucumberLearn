$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/AddCustomer.feature");
formatter.feature({
  "name": "Demo Telecom",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on telecom application",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.user_clicks_on_telecom_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Customer flow validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user needs to fill up the details",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.user_needs_to_fill_up_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.user_verify_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on telecom application",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.user_clicks_on_telecom_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Customer flow validation by 1 dimensional list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user needs to fill up the details by 1 dimensional list",
  "rows": [
    {
      "cells": [
        "java",
        "Selenium",
        "java@gmail.com",
        "Chennai",
        "0002992"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.user_needs_to_fill_up_the_details_by_dimensional_list(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomer.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.user_verify_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});