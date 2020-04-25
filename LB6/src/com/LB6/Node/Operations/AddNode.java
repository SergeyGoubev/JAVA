package com.LB6.Node.Operations;

import com.LB6.Node.AbstractNode;

public class AddNode implements AbstractNode {
    private final AbstractNode leftNode;
    private final AbstractNode rightNode;

    public AddNode(AbstractNode leftNode, AbstractNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int calculate() {
        return leftNode.calculate() - rightNode.calculate();
    }

    public String toString() {
        return "(" + leftNode.toString() + ") - (" + rightNode.toString() + ")";
    }
}

