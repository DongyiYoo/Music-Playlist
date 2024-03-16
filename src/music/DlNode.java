/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

/**
 * 15/03/24
 * @author dongyiyoo
 */

    public class DlNode {
        
        private Object element;
	private DlNode next;
	private DlNode prev;

    public DlNode(Object inElement, DlNode inNext, DlNode inPrevious){
	element = inElement;
	next = inNext;
        prev = inPrevious;
    }
    public DlNode getNext() {
	return next;
    }
    public void setNext(DlNode inNext) {
	next = inNext;
    }
    public DlNode getPrev() {
	return prev;
    }
    public void setPrev(DlNode inPrevious) {
	prev = inPrevious;
    }
    public Object getElement() {
        return element;
    }

    public void setElement(Object inElement) {
	element = inElement;
    }
    
    }
    
