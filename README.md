# quarkusAllureDemo - Instructions to Observe the issue 
This project to demonstrate the issue with @QuarkusTest , allure Step .

Two test present in the project
1. DemoClassTest : A @QuarkusTest, a test that shows failures with 'Steps' of allure
2. NonQuarkusTest : A normal Junit test, that shows 'steps' of allure working fine. 
# Steps to Recreate
1. Run the following command
```shell script
./gradlew clean test
```
Observations:
1. Logs - logs should show the error
   DemoClassTest > testHelloEndpoint() STANDARD_OUT
   2021-09-16 09:22:30,640 ERROR [io.qam.all.AllureLifecycle] (Test worker) Could not start step: no test case running
   2021-09-16 09:22:32,400 ERROR [io.qam.all.AllureLifecycle] (Test worker) Could not update step: no step running
   2021-09-16 09:22:32,401 ERROR [io.qam.all.AllureLifecycle] (Test worker) Could not stop step: no step running
2. Report
   open ./build/reports/allure-report/index.html using intelli->open with a browser. 
   Steps are generated for NonQuarkusTest but not DemoClassTest
   

# General Instruction of quarkusAllureDemo project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./gradlew quarkusDev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./gradlew build
```
It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./gradlew build -Dquarkus.package.type=native
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./build/quarkusAllureDemo-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling.

## Related guides


## Provided examples

### RESTEasy Reactive example

Rest is easy peasy & reactive with this Hello World RESTEasy Reactive resource.

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
