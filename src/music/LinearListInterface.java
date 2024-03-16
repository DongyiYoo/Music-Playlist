/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package music;

/**
 * 15/03/24
 * @author dongyiyoo
 */
public interface LinearListInterface {
    
    public boolean isEmpty();

    public int size();

    public Object get(int iIndex);

    public void remove(int iIndex);

    public void add(int iIndex, Object element);

    public String printList();

    public String printListBwd();
    
    public Object getLast();

}
