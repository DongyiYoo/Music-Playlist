/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author dongyiyoo
 */
public class Stack implements StackInterface {
    
    private ArrayList<String> Stack;

    /**
     * Create a new instance of Stack
     */
    public Stack() {
        Stack = new ArrayList<String>();
    }

    public int size() {
        return Stack.size();

    }

    public boolean isEmpty() {
        return Stack.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the top of the stack and returns it
     */
    public Object pop() {
        if (!(Stack.isEmpty())) {
            return Stack.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts an item onto the top of the stack
     */
    public void push(Object newItem) {
        Stack.add(0, (String) newItem);
    }
    
    public void move(String genre, JTextArea popTa, JTextArea rockTa) {
    if (!isEmpty()) {
        String song = (String) pop();
        if (genre.equals("POP")) {
            popTa.append(song + "\n");
        } else if (genre.equals("ROCK")) {
            rockTa.append(song + "\n");
        }
    } else {
        System.out.println("The stack is empty!");
    }
}


    // removes all elements from the stack
    public void emptyStack() {
        while (!Stack.isEmpty()) {
            pop();
        }
    }

    // return a String object that consists of all elements from the stack
    // a FOR loop is used here, but you can use an Iterator instead
    public String displayStack() {
        int iCount;
        String sMessage = "";
        if (Stack.isEmpty()) {
            sMessage = sMessage.concat("The Stack is EMPTY!");
        } else {
            sMessage = "The Stack contains: ";
            for (iCount = 0; iCount < Stack.size(); iCount++) {
                sMessage = sMessage.concat(Stack.get(iCount));
                sMessage = sMessage.concat("; ");
            }
        }
        return sMessage;
    }
    
}
