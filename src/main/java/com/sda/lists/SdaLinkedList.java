package com.sda.lists;

public class SdaLinkedList {

    private SdaLinkedNode head;
    private SdaLinkedNode last;

    public SdaLinkedList(String value) {
        this.head = new SdaLinkedNode(value);
        this.last = new SdaLinkedNode(value);
    }

    public void add(String value) {
    	SdaLinkedNode newNode = new SdaLinkedNode(value);
    	if (head == null) {
    		head = newNode;
    	} else {
    		SdaLinkedNode last = head;
    		while(last.next != null) {
    			last = last.next;
    		}
    		last.next = newNode;
    	}
    	//last.setNext(add);
    	//last = add;
        // Zaimplementuj mnie
    }

    public String get(int index) {
    	String value = null;
    	if (index >= this.size() || index < 0) {
    		throw new IndexOutOfBoundsException();
    	}
    	if (head == null) {
    		
    	} else if (index == 0) {
    		value = head.value;
    	} else {
    		SdaLinkedNode temp = head.next;
    		while (index > 0) {
    			value = temp.value;
    			index = index - 1;
    		}
    	}
        // Zaimplementuj mnie
        return value;
    }

    public void remove(String value) {
    	
        // Zaimplementuj mnie
    }
    
    public int size() {
    	int counter = 0;
    	
        // Zaimplementuj mnie
        return 0;
    }

    private static class SdaLinkedNode {

        String value;
        SdaLinkedNode next;

        
        
        public SdaLinkedNode(String node) {
            this.value = node;
            this.next = null;
        }
        
        public void setNext(SdaLinkedNode next) {
        	this.next = next;
        }

    }

}
