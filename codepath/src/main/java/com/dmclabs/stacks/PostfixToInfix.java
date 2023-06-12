package com.dmclabs.stacks;

import java.util.*;

public class PostfixToInfix {

    private Deque<String> stack;
    
    public PostfixToInfix() {
        stack = new ArrayDeque<>();
    }

    public String getInfixExpression(String expression) {
        expression = expression.strip().replace(" ","");
        for (Character charc :expression.toCharArray()) {
            if (isOperand(charc)) {
                stack.push(charc.toString());
            } else {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                StringBuilder str = new StringBuilder();
                str.append("(");
                str.append(op2);
                str.append(charc);
                str.append(op1);
                str.append(")");
                stack.push(str.toString());
            }
        }
        return stack.peek();
    }

    public boolean isOperand(Character operand) {
        return (
            (operand >= 'a' && operand <= 'z') ||
            (operand >= 'A' && operand <= 'Z')
        );
    }
}
