package com.dmclabs.stacks;

public class Block {
    private int value;
    private int localMax;

    public Block(int value, int localMax) {
        this.value = value;
        this.localMax = localMax;
    }

    public int getValue() {
        return value;
    }

    public int getLocalMax() {
        return localMax;
    }

    public void setValue(int value)  {
        this.value = value;
    }

    public void setLocalMax(int localMax) {
        this.localMax = localMax;
    }
}
