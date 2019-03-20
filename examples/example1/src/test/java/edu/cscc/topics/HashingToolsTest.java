package edu.cscc.topics;

import org.junit.Assert;
import org.junit.Test;

import static edu.cscc.topics.HashingTools.*;
import static org.junit.Assert.*;

public class HashingToolsTest {

    @Test
    public void simpleTest() {
        assertEquals("Sha doesn't match", "7509e5bda0c762d2bac7f90d758b5b2263fa01ccbc542ab5e3df163be08e6ca9", hashIt("hello world!"));
    }
}
