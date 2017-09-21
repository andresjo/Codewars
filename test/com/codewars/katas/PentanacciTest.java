package com.codewars.katas;
import static org.junit.Assert.*;

import com.codewars.katas.Pentanacci;
import org.junit.Test;


public class PentanacciTest {

    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    
    @Test
    public void test1() {  
        long[] lstI = new long[] {45, 68, 76, 100, 121};
        long[] resultsI = new long[] {15, 23, 25, 33, 40};
        for (int i = 0; i <= 4; i++) {
            testing(Pentanacci.countOddPentaFib(lstI[i]), resultsI[i]);
        }
    }
    
}
