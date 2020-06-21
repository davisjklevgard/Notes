package IntroductionToDataStructuresAndAlgorithmsInJava.StacksAndQueues;

import java.util.Stack;

public class Stacks {
    /*
        Stacks
            one of the very basic data structures
            can be thought of as a container, where you insert data at the top
            every new data element put into the stack sits on top
            LIFO
                Last In First Out
        Push
            inserting new data into the top of a stack
        Removing data
            can only remove the top data element
            called popping an item from the top of the stack
            or pop operation
        Peek
            reads the value of the topmost data element without removing it and returns the value.

        Real World Application:
            Undo mechanism
                in text editors
            stack of plates or books
            Support for recursion
                Activation records of method calls

     */
    //pushing element on top of the stack
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++){
            stack.push(i);
        }
    }
    //Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop: ");

        for (int i = 0; i < 5; i++){
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    //Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in the dtack
    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
