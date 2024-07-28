package com.leetcode.apr2022.linkedlist;

public class LinkedListImplementation implements MyList {

	int size;
    int capacity;
    Node head;
    Node tail;

    LinkedListImplementation(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
    	
		/*
		 * if(size==0) { return true; }else { return false; }
		 */
       return this.size == 0;
    }

    @Override
    public boolean add(int a) {
        //1. create node
        Node newNode = new Node();
        newNode.data = a;
        //2. establish link only if tail is not NULL
        if(tail != null)
            tail.next = newNode;
        //3. move tail
        tail = newNode;
        //4. incr size
        size++;
        //Only for 1st node do this extra step. Set head to the newNode
        if(head == null)
            head = newNode;

        return true;
    }

    @Override
    public boolean remove(int a) {
        Node curr = head;
        Node prev = null;
        //identify the node
        while(curr != null){
            if(curr.data == a){ //identified
                //cut the connection
                prev.next = curr.next;
                if(curr == head) // only needed if node to be deleted is the head node
                    head = curr.next;
                if(curr == tail) // only needed if node to be deleted is the tail node
                    tail = prev;
                //decrement size
                size--;
            }
            prev = curr;
            curr = curr.next;
        }
        return true;
    }

    @Override
    public int get(int index) {
        Node curr = head;
        int i = 0;
        while(curr != null){
            if(i == index)
                return curr.data;
            else
                i++;
        }
        return 0;
    }

    @Override
    public boolean set(int index, int a) {
        return false;
    }

    @Override
    public boolean clear() {
        this.size = 0;
        this.head = null;
        this.tail = null;
        return false;
    }

}
