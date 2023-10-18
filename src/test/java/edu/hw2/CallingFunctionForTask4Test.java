package edu.hw2;

import edu.hw2.task4.CallingInfo;

public class CallingFunctionForTask4Test {
    public static CallingInfo function1(){
        return  function2();
    }
    public static CallingInfo function2(){
        return CallingInfo.callingInfo();
    }
}

