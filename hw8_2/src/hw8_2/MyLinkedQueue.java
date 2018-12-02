package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	class Node{
		int data;
		Node link;
		Node(int data) {
			this.data=data;
			this.link=null;
		}
	}
	int instance=0;
	Node front=null,rear=null;
	public boolean isEmpty() {
		return front==null;
	}
	public void enQueue(int data) {
		Node n=new Node(data);
		if (front==null&&rear==null) {
			front=n;
			rear=n;
			instance++;
		}else {
			rear.link=n;
			rear=rear.link;
			instance++;
		}
	}
	public int deQueue() {
		if(this.isEmpty()) throw new NoSuchElementException();
		else {
			int r=front.data;
			front=front.link;
			if(this.isEmpty()) rear=null;
			instance--;
			return r;
		}
	}
	public int peek() {
		if(this.isEmpty()) throw new NoSuchElementException();
		else return front.data;
	}
	public int size() {
		return instance;
	}
}
