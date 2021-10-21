$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/test.feature");
formatter.feature({
  "line": 1,
  "name": "Login and Adding Watches functionality",
  "description": "As a new user I want to adding the watches successfully",
  "id": "login-and-adding-watches-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 52939343100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As a new User should adding the watches successfully",
  "description": "",
  "id": "login-and-adding-watches-functionality;as-a-new-user-should-adding-the-watches-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter the email \"lameertha11@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the Password \"Lamee1988\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I searching link\"Garmin Forerunner 45S Sports Watch Black\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I adding to The GarminSmart Watch in the cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I searching link\"Garmin QuickFit 22mm Silicone Watch Band - Amp Yellow\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I adding to TheGarminQuickFit band in the cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on checkOutLink",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on card summary",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should get iteams added message \"Items\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.iAmOnLoginPage()"
});
formatter.result({
  "duration": 4651830400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginLink()"
});
formatter.result({
  "duration": 12115400600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lameertha11@gmail.com",
      "offset": 19
    }
  ],
  "location": "LoginStepdefs.iEnterTheEmail(String)"
});
formatter.result({
  "duration": 1326320300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lamee1988",
      "offset": 22
    }
  ],
  "location": "LoginStepdefs.iEnterThePassword(String)"
});
formatter.result({
  "duration": 1703281400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 9467811300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Garmin Forerunner 45S Sports Watch Black",
      "offset": 17
    }
  ],
  "location": "LoginStepdefs.iSearchingLink(String,String)"
});
formatter.result({
  "duration": 351300,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.takealot.cucumber.stepdefs.LoginStepdefs.iSearchingLink(String,String) in file:/C:/Users/rakul/IdeaProjects/takealot-cucumber-project/target/test-classes/\u0027 with pattern [^I searching link\"([^\"]*)\"$] is declared with 2 parameters. However, the gherkin step has 1 arguments [Garmin Forerunner 45S Sports Watch Black]. \nStep: And I searching link\"Garmin Forerunner 45S Sports Watch Black\"\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepdefs.iAddingToTheGarminSmartWatchInTheCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Garmin QuickFit 22mm Silicone Watch Band - Amp Yellow",
      "offset": 17
    }
  ],
  "location": "LoginStepdefs.iSearchingLink(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefs.iAddingToTheGarminQuickFitBandInTheCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnCheckOutLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnCardSummary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Items",
      "offset": 35
    }
  ],
  "location": "LoginStepdefs.iShouldGetIteamsAddedMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 5252482900,
  "status": "passed"
});
});