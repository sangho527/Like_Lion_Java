package algorithm;

import java.util.EmptyStackException;

public class Stack01 {

    private int top;
    private Integer[] arr;

    public Stack01() {
        this.arr = new Integer[10000];
    }

    public Stack01(int size){
        this.arr = new Integer[10000];
    }

    public void push(int value) {
        this.arr[this.top++] = value;
    }

    public int pop() {
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        return this.arr[--this.top];
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty();
    }

    public Integer[] getArr() {
        return arr;
    }
}
