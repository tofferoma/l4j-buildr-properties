package com;


import org.apache.log4j.Logger;

class Java {

  Logger log = Logger.getLogger(getClass());
  
  public void test() throws Exception {
    log.error("something is strange");
  }
  
}

