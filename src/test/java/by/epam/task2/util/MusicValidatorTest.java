package by.epam.task2.util;

import org.junit.Assert;
import org.junit.Test;

public class MusicValidatorTest {

    @Test
    public void validatePositiveTest() {
        Assert.assertTrue(MusicValidator.validate("hip_HOP; 2pac; CaliforniaLOVE; 338; false"));
    }

    @Test
    public void validateNegativeTest() {
        Assert.assertFalse(MusicValidator.validate("Рок; Наутилус; Крылья; 350; false"));
    }
}