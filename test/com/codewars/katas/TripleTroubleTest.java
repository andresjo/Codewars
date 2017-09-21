package com.codewars.katas;

import com.codewars.katas.TripleTrouble;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class TripleTroubleTest {

    @Test
    public void test1(){
      assertEquals(1, TripleTrouble.tripleDouble(451999277L, 41177722899L));
    }


    @Test
    public void test2(){
      assertEquals(0, TripleTrouble.tripleDouble(1222345L, 12345L));    
    }
    
    @Test
    public void test3(){
      assertEquals(0, TripleTrouble.tripleDouble(12345L, 12345L));
    }
    @Test
    public void test4(){
      assertEquals(1, TripleTrouble.tripleDouble(666789L, 12345667L));
    }
    @Test
    public void test5(){
      assertEquals(1, TripleTrouble.tripleDouble(10560002L, 100L));
    }
    public static void randomTest(){
      Random rn = new Random();
      long n1=10L+rn.nextInt(1000000000);
      long n2=10L+rn.nextInt(1000000000);
      assertEquals(sol(n1,n2), TripleTrouble.tripleDouble(n1,n2));
    }
    
    private static int sol(long num1, long num2){
      String s1=Long.toString(num1);
      String s2=Long.toString(num2);
      char tmp=s2.charAt(0);
      for(int i=1;i<s2.length();i++){
        if(s2.charAt(i)==tmp){
          for(int j=0;j<s1.length()-2;j++){
            if(s1.charAt(j)==tmp && s1.charAt(j)==s1.charAt(j+1)&&s1.charAt(j+2)==tmp) return 1;
          }
        } else tmp=s2.charAt(i);
      }
      return 0;
    }
    
}