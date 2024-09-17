package com.assignment;

import java.util.LinkedList;
import java.util.Queue;

public class POCQueue {

    public static void main(String[] args) {
        // Create a queue
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Remove an element from the queue
        int removed = queue.remove();
        System.out.println("Removed element: " + removed);

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peek at the front element of the queue
        int front = queue.peek();
        System.out.println("Front element: " + front);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}
