package com.qa.BootCamp_Diffiult_Programs;

class DoublyNode {
	int data;
	DoublyNode prev;
	DoublyNode next;

	public DoublyNode(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
class DoublyLinkedList {
	private DoublyNode head;

	public DoublyLinkedList() {
		this.head = null;
	}

	public void insertAtBeginning(int data) {
		DoublyNode newNode = new DoublyNode(data);
		if (head == null) {
			head = newNode;
		} else {

			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void insertAtEnd(int data) {
		DoublyNode newNode = new DoublyNode(data);
		if (head == null) {
			head = newNode;

		} else {
			DoublyNode temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	public void delete(int data) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		DoublyNode temp = head;
		while (temp != null && temp.data != data) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Node with data" + data + "not found");
		} else {
			if (temp.prev != null) {
				temp.prev.next = temp.next;
			} else {
				head = temp.next;
			}
			if (temp.next != null) {
				temp.next.prev = temp.prev;
			}
			System.out.println("Node with data" + data + "deleted");
		}
	}

	public void display() {
		DoublyNode temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}

public class Doubly_LinkedList {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();

		list.insertAtBeginning(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);

		System.out.println("Doubly linked List");
		list.display();
		list.delete(2);

		System.out.println("Doubly Linked List after deletion");
		list.display();

	}
}