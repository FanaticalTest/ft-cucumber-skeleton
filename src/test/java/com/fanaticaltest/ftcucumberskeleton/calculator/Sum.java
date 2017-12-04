package com.fanaticaltest.ftcucumberskeleton.calculator;

public class Sum {

    private int firstIntValue;
    private int secondIntValue;

    public void setFirstIntValue(int firstIntValue) {
        this.firstIntValue = firstIntValue;
    }

    public void setSecondIntValue(int secondIntValue) {
        this.secondIntValue = secondIntValue;
    }

    public Sum() {
    }

    public int calculate() {
        return this.firstIntValue + this.secondIntValue;
    }
}