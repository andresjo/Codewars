package com.codewars.katas;

import static org.junit.Assert.*;
import org.junit.Test;


public class BeforeAfterPrimesTest {
    
    @Test
    public void test() {
        assertEquals(89, BeforeAfterPrimes.primeBefAft(97)[0]);
        assertEquals(101, BeforeAfterPrimes.primeBefAft(97)[1]);
        assertEquals(97, BeforeAfterPrimes.primeBefAft(100)[0]);
        assertEquals(101, BeforeAfterPrimes.primeBefAft(100)[1]);
        assertEquals(97, BeforeAfterPrimes.primeBefAft(101)[0]);
        assertEquals(103, BeforeAfterPrimes.primeBefAft(101)[1]);
        assertEquals(113, BeforeAfterPrimes.primeBefAft(120)[0]);
        assertEquals(127, BeforeAfterPrimes.primeBefAft(120)[1]);
        assertEquals(127, BeforeAfterPrimes.primeBefAft(130)[0]);
        assertEquals(131, BeforeAfterPrimes.primeBefAft(130)[1]);
    }    
}

