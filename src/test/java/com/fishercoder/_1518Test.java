package com.fishercoder;

import com.fishercoder.solutions._1518;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1518Test {
    private static _1518.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1518.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(13, solution1.numWaterBottles(9, 3));
    }

}