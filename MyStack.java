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

    public Object pop() {
        if (!(Stack.isEmpty())) {
            return Stack.remove(0);
        } else {
            return null;
        }
    }

    public void push(Object newItem) {
        Stack.add(0, (String) newItem);
    }


    public void emptyStack() {
        while (!Stack.isEmpty()) {
            pop();
        }
    }
    
    public Object peek() {
        if (!Stack.isEmpty()) {
            return Stack.get(0);
        } else {
            return null;
        }
    }
 
    //display method for pop songs
    public String displayStack1() {
        int i;
        String Message = "";
        if (Stack.isEmpty()) {
            Message = Message.concat("This playlist is empty!");
        } else {
            Message = "The list of pop songs are.. ";
            for (i = 0; i < Stack.size(); i++) {
                Message = Message.concat(Stack.get(i));
            }
        }
        return Message;
    }
    
    //display method for rock songs only
    public String displayStack2() {
        int i;
        String Message = "";
        if (Stack.isEmpty()) {
            Message = Message.concat("This playlist is empty!");
        } else {
            Message = "The list of rock songs are.. ";
            for (i = 0; i < Stack.size(); i++) {
                Message = Message.concat(Stack.get(i));
            }
        }
        return Message;
    }
    
     // Searches for a song in the playlist based on its title
    
        public String search(String song) {
            String result = "The song is not found in the playlist.";
            if (Stack.isEmpty()) {
                result = "This playlist is empty!";
            } else {
                for (String item : Stack) {
                    if (item.contains(song)) {
                        result = "The song is in the playlist.";
                        break;
                    }
                }
            }
            return result;
        }   
    

}