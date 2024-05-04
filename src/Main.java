public class Main {
    public static void main(String[] args) {
        StaticArrayQueue queue = new StaticArrayQueue(5); // created fixed size array

        queue.enqueue(1); // add 1
        queue.enqueue(2); // add 2
        queue.enqueue(3); // add 3

        queue.display();  // displays queue elements (1,2,3)

        queue.dequeue(); // removed 1
        queue.dequeue(); //  removed 2

        queue.display();  // displays 3

        queue.enqueue(4); // add 4
        queue.enqueue(5); // add 5
        queue.enqueue(6); // add 6

        queue.display();  // displays (3,4,5,6)

        System.out.println("Queue size is: " + queue.size());  // size of queue is 4

        queue.clear(); // clears all elements

        queue.display();  // displays queue elements after clearing -> its empty

        System.out.println("Queue size is: " + queue.size()); // size of queue is 0
    }
}