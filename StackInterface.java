/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package music;

/**
 * 13/03/24
 * @author dongyiyoo
 */
public interface StackInterface {

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

    public int size();

    public void emptyStack();
    
    public Object peek();

    public String displayStack1();
    
    public String displayStack2();

    public String search(String song);
   
}
