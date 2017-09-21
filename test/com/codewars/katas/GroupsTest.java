package com.codewars.katas;

import com.codewars.katas.Groups;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GroupsTest{
  
  @Test
  public void testCorrectGroups() {
    assertEquals("That group was matched correctly", Groups.groupCheck("({})"), true);
    assertEquals("That group was matched correctly",Groups.groupCheck("[[]()]"), true);
    assertEquals("That group was matched correctly",Groups.groupCheck("[{()}]"), true);
    assertEquals("That group was matched correctly",Groups.groupCheck("()"), true);
    assertEquals("That group was matched correctly",Groups.groupCheck("([])"), true);
    assertEquals("That group was matched correctly",Groups.groupCheck("{}([])"), true);
    assertEquals("That group was matched correctly",Groups.groupCheck("{[{}[]()[]{}{}{}{}{}{}()()()()()()()()]{{{[[[((()))]]]}}}}(())[[]]{{}}[][][][][][][]({[]})"), true);
    assertEquals("That group was matched correctly",Groups.groupCheck(""), true);
  }
  
  @Test
  public void testBadlyMatchedGroups() {
    assertEquals("That group was matched incorrectly",Groups.groupCheck("{(})"), false);
    assertEquals("That group was matched incorrectly",Groups.groupCheck("[{}{}())"), false);
    assertEquals("That group was matched incorrectly",Groups.groupCheck("{)[}"), false);
    assertEquals("That group was matched incorrectly",Groups.groupCheck("[[[]])"), false);
    assertEquals("That group was matched incorrectly",Groups.groupCheck("()[]{]"), false);
    assertEquals("That group was matched incorrectly",Groups.groupCheck("{([]})"), false);
  }
  
  @Test
  public void testOpenOrPrematurelyClosedGroups() {
    assertEquals("That group was left open or prematurely closed",Groups.groupCheck("([]"), false);
    assertEquals("That group was left open or prematurely closed",Groups.groupCheck("[])"), false);
    assertEquals("That group was left open or prematurely closed",Groups.groupCheck("([]))"), false);
    assertEquals("That group was left open or prematurely closed",Groups.groupCheck("{{))"), false);
    assertEquals("That group was left open or prematurely closed",Groups.groupCheck("{}{"), false);
    assertEquals("That group was left open or prematurely closed",Groups.groupCheck("{"), false);
    assertEquals("That group was left open or prematurely closed",Groups.groupCheck("]"), false);
    assertEquals("That group was left open or prematurely closed",Groups.groupCheck("{{{{{{{{{{{((((((([])))))))}}}}}}}}}}"), false);
  }
}