# Selenium + TestNG + Cucumber Hybrid (POM + Extent + Excel)

## How to run
1. Install JDK 11+ and Maven.
2. Ensure Google Chrome is installed.
3. From the project root, run:
   ```bash
   mvn test -Dheadless=false
   ```
   (Set `headless=true` in `src/test/resources/config.properties` to run headless.)

## What it includes
- Selenium 4, TestNG 7, Cucumber 7
- Page Object Model
- WebDriverManager for driver binaries
- Extent Reports (see `target/spark` and `target/extent-report`)
- Cucumber HTML/JSON reports in `target/`
- Excel-driven test data (`src/test/resources/testdata/users.xlsx`)
- Screenshots on failure in `target/screenshots`

## Demo site
Using https://the-internet.herokuapp.com/login

## Structure
- `com.framework.driver.DriverFactory` – WebDriver init & options
- `com.framework.base.BasePage` – waits & helpers
- `com.framework.pages.*` – POM classes
- `com.framework.stepdefinitions.*` – Gherkin glue + assertions
- `com.framework.hooks.ApplicationHooks` – Cucumber hooks + screenshots
- `com.framework.runners.*` – TestNG runners
- `src/test/resources/features` – Gherkin features
- `src/test/resources/testdata/users.xlsx` – Excel data
