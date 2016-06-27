$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "id": "this-is-a-test-feature",
  "description": "",
  "name": "This is a test feature",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 1657064718,
  "status": "passed"
});
formatter.scenario({
  "id": "this-is-a-test-feature;testing-framework",
  "description": "",
  "name": "testing framework",
  "keyword": "Scenario",
  "line": 2,
  "type": "scenario"
});
formatter.step({
  "name": "I open web browser",
  "keyword": "Given ",
  "line": 3
});
formatter.step({
  "name": "navigate to https://www.amazon.com",
  "keyword": "And ",
  "line": 4
});
formatter.match({
  "location": "TestFeature.openBrowser()"
});
formatter.result({
  "duration": 139124373,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com",
      "offset": 12
    }
  ],
  "location": "TestFeature.navigateToUrl(String)"
});
formatter.result({
  "duration": 3298977460,
  "status": "passed"
});
formatter.after({
  "duration": 919615143,
  "status": "passed"
});
});