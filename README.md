### Local setup
- Install Java 8.
- Install Chrome.
- Install Lombok plugin in IntelliJ Idea.

### How to run tests
Tests can be run via Maven, for example:
clean integration-test serenity:aggregate -DskipTests=false
Test report is here: target/site/serenity/index.html

For debugging purposes tests can be run via JUnit.