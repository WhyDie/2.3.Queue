package ua.whydie;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        System.out.println(queue); //isEmpty
        //queue.dequeue(); //isEmpty ERROR
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        queue.remove();
        queue.remove();
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        queue.add(6); //isFull ERROR
    }
}