package com.kinandcarta.modernization.mutationtestingdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class Applicant {

    Double minSalaryExpectation;
    Listing currentMatch = null;

}
