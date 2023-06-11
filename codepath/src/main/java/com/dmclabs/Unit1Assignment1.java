package com.dmclabs;

import com.dmclabs.stacks.FindMaximumStack;

/**
 * Hello world!
 *
 */
public class Unit1Assignment1 
{
    public static void main( String[] args )
    {
        FindMaximumStack stack = new FindMaximumStack();
        stack.push(2);
        stack.findMax();
        stack.push(6);
        stack.findMax();
        stack.pop();
        stack.findMax();
    }
}
