# Mutation Testing Demo
This code illustrates the benefits of running a mutation testing library.  This example usese PITest (https://pitest.org) as the library.

## Example App
This example code highlights a portion of job board functionality.  There is a `Listing` domain object and a `Applicant` domain object.

The JobService will attempt to match Applicants with Listings.  If the minimum salary for the Listing meets the Applicant's minimum salary, then a match can occur, and the Listing should be attached as "currently matched" to the Applicant.

## Usage
1. Build and run the tests: `./gradlew test`
2. Run PITest: `./gradlew pitest`
3. Open the coverage report in `/build/reports/pitest/index.html`
4. Note that the code coverage is 100% (domain classes are excluded); however PITest highlights gaps in the tests.
5. Also note that the code is broken!  The service sets the current listing to a match outside of the `if` statement.
5. Checkout the "good-tests" branch to see the corrected code and tests, and re-run PITest.
