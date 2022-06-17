package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobTest {

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("Test 2", 2),
                new Job("Test 1", 1)
        );
        Assert.assertTrue(rsl > 0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("Test 2", 2),
                new Job("Test 1", 1)
        );
        Assert.assertFalse(rsl > 0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmpAscPriority = new JobAscByPriority();
        int rsl = cmpAscPriority.compare(
                new Job("Test 2", 2),
                new Job("Test 1", 1)
        );
        Assert.assertTrue(rsl > 0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("Test 2", 2),
                new Job("Test 1", 1)
        );
        Assert.assertFalse(rsl > 0);
    }

    @Test
    public void whenComparatorAscByNameAndAscPriority() {
        Comparator<Job> cmpAscNameAscPriority = new JobAscByName().thenComparing(new JobAscByPriority());
        List<Job> rsl = Arrays.asList(
                new Job("Test 3", 3),
                new Job("Test 2", 1),
                new Job("Test 1", 4),
                new Job("Test 2", 2),
                new Job("Test 1", 5)
        );
        rsl.sort(cmpAscNameAscPriority);
        List<Job> expected = Arrays.asList(
                new Job("Test 1", 4),
                new Job("Test 1", 5),
                new Job("Test 2", 1),
                new Job("Test 2", 2),
                new Job("Test 3", 3)
        );
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenComparatorAscByNameAndDescPriority() {
        Comparator<Job> cmpAscNameDescPriority = new JobAscByName().thenComparing(new JobDescByPriority());
        List<Job> rsl = Arrays.asList(
                new Job("Test 3", 3),
                new Job("Test 2", 1),
                new Job("Test 1", 4),
                new Job("Test 2", 2),
                new Job("Test 1", 5)
        );
        rsl.sort(cmpAscNameDescPriority);
        List<Job> expected = Arrays.asList(
                new Job("Test 1", 5),
                new Job("Test 1", 4),
                new Job("Test 2", 2),
                new Job("Test 2", 1),
                new Job("Test 3", 3)
        );
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenComparatorDescByNameAndAscPriority() {
        Comparator<Job> cmpDescNameAscPriority = new JobDescByName().thenComparing(new JobAscByPriority());
        List<Job> rsl = Arrays.asList(
                new Job("Test 3", 3),
                new Job("Test 2", 1),
                new Job("Test 1", 4),
                new Job("Test 2", 2),
                new Job("Test 1", 5)
        );
        rsl.sort(cmpDescNameAscPriority);
        List<Job> expected = Arrays.asList(
                new Job("Test 3", 3),
                new Job("Test 2", 1),
                new Job("Test 2", 2),
                new Job("Test 1", 4),
                new Job("Test 1", 5)
        );
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenComparatorDescByNameAndDescPriority() {
        Comparator<Job> cmpDescNameDescPriority = new JobDescByName().thenComparing(new JobDescByPriority());
        List<Job> rsl = Arrays.asList(
                new Job("Test 3", 3),
                new Job("Test 2", 1),
                new Job("Test 1", 4),
                new Job("Test 2", 2),
                new Job("Test 1", 5)
        );
        rsl.sort(cmpDescNameDescPriority);
        List<Job> expected = Arrays.asList(
                new Job("Test 3", 3),
                new Job("Test 2", 2),
                new Job("Test 2", 1),
                new Job("Test 1", 5),
                new Job("Test 1", 4)
        );
        Assert.assertEquals(rsl, expected);
    }
}