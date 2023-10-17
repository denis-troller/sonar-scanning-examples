package com.acme.module2;

import java.util.List;

public class Module2
{
  public List<Integer> getList() {
    return null;
  }


  public boolean isEmpty(List<Integer> list)
  {
    int i=0;
    List<Integer> arr = null;
    i = i + list.size();
    if(i > 0){
      if(i *5 < 50){
        if(i-2 > 2) {
          if(i+12 > 8) {
            if(i*6 > 24) {
              if(i/2 < 10) {
                return !arr.isEmpty();
              }
            }
          }
        }
      }
    }
    return i == 0;
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
