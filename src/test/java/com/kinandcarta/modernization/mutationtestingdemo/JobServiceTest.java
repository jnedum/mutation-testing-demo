package com.kinandcarta.modernization.mutationtestingdemo;

import com.kinandcarta.modernization.mutationtestingdemo.domain.Applicant;
import com.kinandcarta.modernization.mutationtestingdemo.domain.Listing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobServiceTest {

    @Test
    public void testIsJobMatchExpectFalse() {
        Listing listing = new Listing().minSalary(60000.0);
        Applicant applicant = new Applicant().minSalaryExpectation(50000.0);

        JobService jobService = new JobService();
        assertEquals(true, jobService.isJobMatch(listing, applicant));
        assertEquals(listing, applicant.currentMatch());
    }

}
