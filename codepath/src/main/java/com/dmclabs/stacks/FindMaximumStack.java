package com.dmclabs.stacks;

import java.util.Deque;

import com.dmclabs.stacks.components.Block;

import java.util.ArrayDeque;

public class FindMaximumStack {
    private Deque<Block> stack;

    public FindMaximumStack() {
        stack = new ArrayDeque<>();
    }

    public int findMax() {
        if (!stack.isEmpty()) {
            System.out.println("Maximum value in the stack: " + stack.peek().getLocalMax());
            return stack.peek().getLocalMax();
        }
        return stack.hashCode();
    }

    private void push(Block block) {
        if (stack.isEmpty()) {
            block.setLocalMax(block.getValue());
        } else if (block.getValue() >= stack.peek().getLocalMax()) {
            block.setLocalMax(block.getValue());
        } else {
            block.setLocalMax(stack.peek().getLocalMax());
        }
        stack.push(block);
        System.out.println(block.getValue() + " inserted in stack.");
    }

    public void push(int value) {
        this.push(new Block(value,0));
    }

    public Block pop() {
        System.out.println("Element popped.");
        return stack.pop();
    }
}


