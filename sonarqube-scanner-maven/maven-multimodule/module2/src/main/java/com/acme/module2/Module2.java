package com.acme.module2;

import java.util.List;

public class Module2 {

  public List getList() {
    return null;
  }

  public bool IsEmpty(List list)
  {
    if(list.size() ==0) {
      return true;
    }
    else
    {
      return false;
    }
  }

  public boolean simpleTest2(){
    return getList().size() > 10;
  }

  public boolean simpleTest(List<Integer> list){
    return (list.size() > 10);
  }

  public void coveredByUnitTest() {
    System.out.println("This method is covered by unit test");
  }

  public void coveredByIntegrationTest() {
    System.out.println("This method is covered by integration test");
  }

  public void uncovered() {
    System.out.println("This method is not covered");
  }
}
