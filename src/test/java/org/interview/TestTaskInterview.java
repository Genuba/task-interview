package org.interview;

import org.dto.TestDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.v1.interview.InterviewTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestTaskInterview {

    private InterviewTask interviewTask;
    private List<TestDto> testList;

    @BeforeEach
    public void init() {
        interviewTask = new InterviewTask();
        testList = new ArrayList<>(Arrays.asList(
                new TestDto("AABBCCD112233","ABCD123"),
                new TestDto("A1A1B2B2C3C3D112233","A1B2C3D"),
                new TestDto("!@#$$%#$%$%","!@#$%"),
                new TestDto("ABCD123","ABCD123"),
                new TestDto("A C C T T","A CT"),
                new TestDto("",""),
                new TestDto("C","C")
        ));
    }

    @Test
    void removeDuplicatesNotOrderString() {
        for(TestDto test: testList){
            String output = interviewTask.removeDuplicatesNotOrderString(test.input);
            Assertions.assertEquals(test.output,output);
        }
    }

    @Test
    void removeDuplicatesOrderString() {
        String input = "AAABBCCD1122333";
        String expectedOutput = "ABCD123";

        String output = interviewTask.removeDuplicatesOrderString(input);
        Assertions.assertEquals(expectedOutput,output);
    }
}