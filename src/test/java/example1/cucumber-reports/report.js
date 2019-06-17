$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:example1/login.feature");
formatter.feature({
  "name": "TestMe sign In",
  "description": "  I want to signIn to TestMe app",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Signout successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UAT"
    }
  ]
});
formatter.step({
  "name": "signout is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "cucumlogin.signout_is_clicked()"
});
formatter.result({
  "status": "passed"
});
});