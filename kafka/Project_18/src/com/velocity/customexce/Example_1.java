package com.velocity.customexce;
//simple custom exception in java
class SimpleCustomException extends Exception{
  //member variable to store our custom message
  String msg;
  SimpleCustomException(String msg){
      //passing the parameter to super class constructor
      super(msg);
      this.msg=msg;
  }
  
  //overriding with our custom message
  @Override
  public String toString(){
      return msg;
  }
}


