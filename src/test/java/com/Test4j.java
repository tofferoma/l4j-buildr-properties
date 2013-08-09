package com;

import org.apache.log4j.Logger;
import org.junit.Test;


import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

public class Test4j {

  Logger log = Logger.getLogger(getClass());
  static List<String> arguments;
  static {
    RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
    arguments = runtimeMxBean.getInputArguments(); 
  }
  
  @Test
  public void test() throws Exception {
    System.out.println("static");
    for(String a:arguments) {
      System.out.println(a);
    }    
    System.out.println("dyn");
    RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
    List<String> arguments2 = runtimeMxBean.getInputArguments();
    for(String a:arguments2) {
      System.out.println(a);
    }
    new Java().test();
  }
  
}

