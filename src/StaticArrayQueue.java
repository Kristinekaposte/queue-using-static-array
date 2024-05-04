public class StaticArrayQueue {
    private int[] array;
    private int frontElement; // Front element in the queue
    private int backElement; // Where the next element will be enqueued
    private int arraySize; // Size of array
    private int count; // Number of elements currently in the queue

    public StaticArrayQueue(int size) {
        array = new int[size];
        arraySize = size;
        frontElement = 0;
        backElement = -1;
        count = 0;
    }

    // Method to add an element to back of queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            backElement = (backElement + 1) % arraySize;
            array[backElement] = item;
            count++;
        }
    }

    // Method to delete element from the queue front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int item = array[frontElement];
            frontElement = (frontElement + 1) % arraySize;
            count--;
            return item;
        }
    }

    // Method to check whether a queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Method to check whether a queue is full
    public boolean isFull() {
        return (count == arraySize);
    }

    // Method to print a queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements are: ");
            for (int i = 0; i < count; i++) {
                System.out.print(array[(frontElement + i) % arraySize] + " ");
            }
            System.out.println();
        }
    }

    // Method to clear all queue
    public void clear() {
        frontElement = 0;
        backElement = -1;
        count = 0;
    }

    // Method to output the size of a queue
    public int size() {
        return count;
    }
}