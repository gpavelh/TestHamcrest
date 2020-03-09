package org.example;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.Arrays;
import java.util.List;

public class TestHumanHam {

    @Test
    public void testHumanHam() {
        List<String> jobs = Arrays.asList("Teacher", "Washer", "Sandwich");
        HumanHam vasek = new HumanHam("Vasek", 24, 90.5, jobs);
        assertThat(vasek.getName(),equalTo("Vasek"));
        assertThat(vasek.getName(),anyOf(containsString("ase"), endsWith("ek")));
        assertThat(vasek.getAge(), allOf(greaterThan(7), lessThanOrEqualTo(25),not(20)));
        assertThat(vasek.getJobs(),notNullValue());
        assertThat(jobs, contains("Teacher", "Washer", "Sandwich"));
        assertThat(jobs, hasItem("Sandwich"));
    }
}
