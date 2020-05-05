package com.LB6.Node;

public class SimpleNode implements AbstractNode {
    private final int value;

    public SimpleNode(int value) {
        this.value = value;
    }

    @Override
    public int calculate()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return String.valueOf(value);
    }
}