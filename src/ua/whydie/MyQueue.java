package ua.whydie;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueue {
    public static final int INITIAL_CAPACITY = 10;
    private int size;
    private int front = -1;
    private int rear = -1;
    private int[] items;

    public MyQueue() {
        size = INITIAL_CAPACITY;
        items = new int[size];
    }

    public MyQueue(int size) {
        this.size = size;
        this.items = new int[size];
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public boolean isFull() {
        return rear + 1 == front;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }


    public void add(int item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        items[rear] = item;
    }

    public int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int result = items[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }
}
