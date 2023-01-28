package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void emptyTest() {
        assertEquals(1, 1);
    }

    @Test
    public void testSettingJobId() {

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        // You don't need to use instanceOf to test that the fields in
        // your Job object have the correct types. You just need to test
        // that the fields are getting set to what you expect them to be.
    }

    @Test
    public void testJobsForEquality() {

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        // Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        // ID:  1
        // Name: Web Developer
        // Employer: LaunchCode
        // Location: St. Louis
        // Position Type: Front-end developer
        // Core Competency: JavaScript
    }

    @Test
    public void testToStringHandlesEmptyField() {
        // What if one of the fields is empty?
        // Job job2 = new Job("", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        // ID:  1
        // Name: Data not available
        // Employer: LaunchCode
        // Location: St. Louis
        // Position Type: Front-end developer
        // Core Competency: JavaScript
    }

}
