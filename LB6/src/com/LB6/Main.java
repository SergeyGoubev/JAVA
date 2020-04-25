package com.LB6;

import com.LB6.Node.AbstractNode;
import com.LB6.Node.SimpleNode;
import com.LB6.Node.Operations.MultNode;
import com.LB6.Node.Operations.AddNode;

public class Main {
    public static void main(String[] args) {
        AbstractNode firstTestNode = new MultNode(
                new AddNode(new SimpleNode(5), new SimpleNode(5)),
                new AddNode(new SimpleNode(3), new SimpleNode(1))
        );

        AbstractNode secondTestNode = new MultNode(
                new AddNode(new SimpleNode(5), new SimpleNode(3)),
                new AddNode(new SimpleNode(3), new SimpleNode(1))
        );

        System.out.println("Первое выражение: " + firstTestNode.toString() + "\tРввно: " + firstTestNode.calculate());
        System.out.println("Второе выражение: " + secondTestNode.toString() + "\tРавно: " + secondTestNode.calculate());
    }
}
