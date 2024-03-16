/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

import java.util.ArrayList;

/**
 *
 * @author dongyiyoo
 */

public class MyStack implements StackInterface {

    private ArrayList<String> Stack;

    /**
     * Create a new instance of Stack
     */
    public MyStack() {
        Stack = new ArrayList<String>();
    }

    public int size() {
        return Stack.size();

    }

    public boolean isEmpty() {
        return Stack.isEmpty();
    }

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

    // removes all elements from the stack
    public void emptyStack() {
        while (!Stack.isEmpty()) {
            pop();
        }
    }
 

    // return a String object that consists of all elements from the stack
    
    public String displayStack() {
        int i;
        String Message = "";
        if (Stack.isEmpty()) {
            Message = Message.concat("This playlist is empty!");
        } else {
            Message = "The list of songs are.. ";
            for (i = 0; i < Stack.size(); i++) {
                Message = Message.concat(Stack.get(i));
            }
        }
        return Message;
    }
    
     // Searches for a song in the playlist based on its title and genre.
       
        public String search(String song, String genre) {
        String result = "";
        if (Stack.isEmpty()) {
            result = "This playlist is empty!";
        } else {
            boolean found = false;
            for (int i = 0; i < Stack.size(); i++) {
                String item = Stack.get(i);
                if (item.contains(song) && item.contains(genre)) {
                    found = true;
                    result = "The song is in the list";
                    break;
                }
            }
            if (!found) {
                result = "The song is not found in the playlist.";
            }
        }
        return result;
    }


}
