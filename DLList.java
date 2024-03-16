/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

/**
 * 15/03/24
 * @author dongyiyoo
 */

public class DLList implements LinearListInterface {

    private DlNode head;
    private DlNode last;
    private DlNode currNode;
    private int iSize;

    DLList() {
        head = null;
        last = null;
        iSize = 0;
        currNode = head;
    }

    public boolean isEmpty() {
        return (iSize == 0);
    }

    public int size() {
        return iSize;
    }

    public void add(int inIndex, Object inElement) {
        DlNode newNode = new DlNode(inElement, null, null);
        if (iSize == 0) {

            head = newNode;
            last = newNode;
        } else {
            if (inIndex == 1) {

                newNode.setNext(head);
                head.setPrev(newNode);
                head = newNode;
            } else if (inIndex == (iSize + 1)) {

                newNode.setPrev(last);
                last.setNext(newNode);
                last = newNode;
            } else {

                setCurrent(inIndex);
                newNode.setNext(currNode);
                DlNode prev = currNode.getPrev();
                newNode.setPrev(prev);
                prev.setNext(newNode);
                currNode.setPrev(newNode);
            }
        }
        iSize++;
    }

    public void remove(int iIndex) {
        if (iSize > 0) {
          
            if (iIndex == 1) {
                head = head.getNext();
                head.setPrev(null);
            } 
            else if (iIndex == iSize) {
                last = last.getPrev();
                last.setNext(null);
            } else {
               
                setCurrent(iIndex);
                DlNode prev = currNode.getPrev();
                DlNode next = currNode.getNext();
                prev.setNext(next);
                next.setPrev(prev);
            }
            currNode = null;
            iSize--;
        } else {
            System.out.println("The list is empty. No songs to be removed");
        }
    }

    private void setCurrent(int inIndex) {
        currNode = head;
        for (int iCount = 1; iCount < inIndex; iCount++) {
            currNode = currNode.getNext();
        }
    }

    public Object get(int iIndex) {
        setCurrent(iIndex);
        return currNode;
    }
    
    public String printList() {
        String allItems = new String();
        for (DlNode aNode = head; aNode != null; aNode = aNode.getNext()) {
            String oneItem = (aNode.getElement()).toString();
            allItems = allItems + oneItem + ", ";
        }
        return allItems;
        
        
    }

    public String printListBwd() {
        String allItems = new String();
        for (DlNode aNode = last; aNode != null; aNode = aNode.getPrev()) {
            String oneItem = (aNode.getElement()).toString();
            allItems = allItems + oneItem + ", ";
        }
        return allItems;
    }


}
