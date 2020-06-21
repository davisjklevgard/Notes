package IntroductionToDataStructuresAndAlgorithmsInJava.StacksAndQueues;

public class Queues {
    /*
        Queues
            Abstract data type
            structure is the same as the real world queue
            FIFO First In, First Out
            Can be called a container
                front end is the head, rear end is the tail
        Enqueue
            method for inserting an element into a queue
                will be inserted at the tail and will move forward as far as it can towards the head.
            sort of pushes the element to the front

        Dequeue
            operation of removing an element
            removes elements at the head.

        Peek
            similar to stack as it returns the value of the head without removing the element
        isEmpty
            tests if the queue is empty or not
        size
            Returns the number of elements present in the queue


        Real World Examples
            queue of people at a ticket booth
            Vehicles at a toll
            Phone-answering system
            Luggage checking machine
            Patients at a doctor's office

     */

        private int arr[];  		// array to store queue elements
        private int front;  		// front points to front element in the queue
        private int rear;   		// rear points to last element in the queue
        private int capacity;   	// maximum capacity of the queue
        private int count;  		// current size of the queue

        // Constructor to initialize queue
        Queues(int size)
        {
            arr = new int[size];
            capacity = size;
            front = 0;
            rear = -1;
            count = 0;
        }

        // Utility function to remove front element from the queue
        public void dequeue()
        {
            // check for queue underflow
            if (isEmpty())
            {
                System.out.println("UnderFlow\nProgram Terminated");
                System.exit(1); // System.exit terminates the current running JVM
            }

            System.out.println("Removing " + arr[front]);

            front = (front + 1) % capacity;
            count--;
        }

        // Utility function to add an item to the queue
        public void enqueue(int item)
        {
            // check for queue overflow
            if (isFull())
            {
                System.out.println("OverFlow\nProgram Terminated");
                System.exit(1);
            }

            System.out.println("Inserting " + item);

            rear = (rear + 1) % capacity;
            arr[rear] = item;
            count++;
        }

        // Utility function to return front element in the queue
        public int peek()
        {
            if (isEmpty())
            {
                System.out.println("UnderFlow\nProgram Terminated");
                System.exit(1);
            }
            return arr[front];
        }

        // Utility function to return the size of the queue
        public int size()
        {
            return count;
        }

        // Utility function to check if the queue is empty or not
        public Boolean isEmpty()
        {
            return (size() == 0);
        }

        // Utility function to check if the queue is full or not
        public Boolean isFull()
        {
            return (size() == capacity);
        }

        // Queue implementation in java
        public static void main (String[] args)
        {
            // create a queue of capacity 5
            Queues q = new Queues(5);

            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);

            System.out.println("Front element is: " + q.peek());
            q.dequeue();
            System.out.println("Front element is: " + q.peek());

            System.out.println("Queue size is " + q.size());

            q.dequeue();
            q.dequeue();

            if (q.isEmpty())
                System.out.println("Queue Is Empty");
            else
                System.out.println("Queue Is Not Empty");
        }
}
