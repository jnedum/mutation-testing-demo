# Mutation Testing Demo
This code illustrates the benefits of running a mutation testing library.  This example usese PITest (https://pitest.org) as the library.

## Usage
1. Build and run the tests: `./gradlew build`
2. Run PITest: `./gradlew pitest`
3. Open the coverage report in `/build/reports/pitest/index.html`
4. Note that the code coverage is 100% (domain classes are excluded); however PITest highlights gaps in the tests.
5. Checkout the "good-tests" branch to see the corrected tests, and re-run PITest.
