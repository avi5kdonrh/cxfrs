package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestClass {
 private String val1;
 private int val2;

    public static void main(String[] args) throws Exception{
        TestClass testClass = new TestClass("List",1);
        ObjectMapper objectMapper  = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(System.out,testClass);
    }
    public TestClass(String val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }
}
