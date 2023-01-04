package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest{
IsomorphicStrings isomorphicStrings=new IsomorphicStrings();
  void test IsIso(){
  assertEquals(true, isomorphicStrings.isIsomorphic("egg", "add"));
  }
  void test IsIso(){
  assertEquals(false, isomorphicStrings.isIsomorphic("foo", "bar"));
  }
  void test IsIso(){
  assertEquals(true, isomorphicStrings.isIsomorphic("paper", "title"));
  }
  
}
