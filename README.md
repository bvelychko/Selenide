# Ideals UI Automation Hometask

**Tech stack:**
Java 8 (Install docs)
Maven (Install docs)
Selenide (Will be installed automatically)
TestNG (Will be installed automatically)
Allure (Install docs)
Please see pom.xml file for more details on application modules

**Supports Browsers**
Chrome (latest version)

**Source code**
Source code (git repo) is available at ```https://github.com/bvelychko/Selenide```

**Common execution variables and rules:**

mvn clean test -Dbrowser=chrome -Dsuite=sso2 -Denv=dev -DtestrailIntegration=false -DtestrailRunId=2400 -Dheadless=true -Dremote=false -DgridEndpoint=http://localhost:4444/wd/hub

Where:
- -Dsuite=sso2 (Mandatory, need to set suite xml name from "src/test/resources/suites" folder)
- -Denv=dev (Mandatory, need to set ENV against tests will be run (dev, stage, uat) and according to env will set specific properties to test run)
- -Dfeature.name=vdr4-1324 (Optional, by default EMPTY, using only with -Denv=feature)
- -Dbrowser=chrome (Optional, by default "Chrome", options: "ie, edge, chrome, firefox, safari")
- -Dheadless=true (Optional, by default "false" applicable to "chrome" and "firefox" only)
- -Dremote=false (Optional, by default "false", works with -DgridEndpoint)
- -DthreadCount=2 (Optional, by default "2", BrowserStack supports only 2 but localy could set any value 1,2,3,4 etc.)
- -DgridEndpoint=http://localhost:4444/wd/hub (Optional , by default "http://localhost:4444/wd/hub")
- -DtestrailIntegration=false (Optional, by default "false", toogle to turnOn/Off intergation with TestRail, , works with -DtestrailRunId)
- -DtestrailRunId=2400 (Optional, by default "2400", prepared TestRail Run Tests and set RunId where after Test execution will be set all test result)