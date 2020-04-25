package com.LB6.Node.Operations;

import com.LB6.Node.AbstractNode;

public class MultNode implements AbstractNode {
    private final AbstractNode leftNode;
    private final AbstractNode rightNode;

    public MultNode(AbstractNode leftNode, AbstractNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int calculate() {
        if (leftNode.calculate() == 0)
            return 0;
        else
            return leftNode.calculate() * rightNode.calculate();
    }

    public String toString() {
        return "(" + leftNode.toString() + ") * (" + rightNode.toString() + ")";
    }
}