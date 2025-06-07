package com.edurekademo.utilities;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdderTest {
    @Test
    public void testAdd() {
        Adder adder = new Adder();
        assertEquals(5, adder.add(2, 3));
    }
}
