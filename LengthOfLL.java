package linkedList;


//package com.journaldev.ds;

public class LengthOfLL {

	public class Node {

		int data;

		Node next;

	}

	public Node head;
	public Node tail;
	public int size;

	public int getFirst() throws Exception {

		if (this.size == 0) {

			throw new Exception("linked list is empty");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {

		if (this.size == 0) {

			throw new Exception("linked list is empty");
		}
		return this.tail.data;
	}

	public void display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	public void addFirst(int item) {

		Node nn = new Node();

		nn.data = item;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size = this.size + 1;

		} else {

			nn.next = this.head;

			this.head = nn;

			this.size = this.size + 1;

		}

	}

	public int length() {

		Node temp = this.head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {

		LengthOfLL ll = new LengthOfLL();

		ll.addFirst(10);

		ll.addFirst(20);

		ll.addFirst(30);

		ll.addFirst(40);

		ll.addFirst(50);

		System.out.println("Length of Linked List is " + ll.length());

	}

}
