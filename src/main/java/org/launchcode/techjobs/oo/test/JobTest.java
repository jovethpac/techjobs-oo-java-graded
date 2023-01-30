package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;  //assertequals, assertTrue, assertfalse

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
//create two JOB objects using the empty constructor...without passing in information
        Job emptyJob1 = new Job();
        Job emptyJob2 = new Job();
        //assertNotEquals. Does the id of the first job created match up with the other one//create two jobs and make sure that the two IDs are different
        assertNotEquals(emptyJob1.getId(),emptyJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        // You don't need to use instanceOf to test that the fields in
        // your Job object have the correct types. You just need to test
        // that the fields are getting set to what you expect them to be.
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester",job1.getName());
        assertEquals("ACME",job1.getEmployer().getValue());
        assertEquals("Desert",job1.getLocation().getValue());
        assertEquals("Quality Control",job1.getPositionType().getValue());
        assertEquals("Persistence",job1.getCoreCompetency().getValue());


    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        //make two tests equal and then run assertFalse which is same syntax as assertTrue
        assertFalse(job1.equals(job2));
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
