package com.kinandcarta.modernization.mutationtestingdemo;

import com.kinandcarta.modernization.mutationtestingdemo.domain.Applicant;
import com.kinandcarta.modernization.mutationtestingdemo.domain.Listing;

public class JobService {

    public boolean isJobMatch(Listing listing, Applicant applicant) {
        boolean isMatch = false;

        if ( listing.minSalary() >= applicant.minSalaryExpectation() ) {
            isMatch = true;
            applicant.currentMatch(listing);
        }
        return isMatch;
    }
}
