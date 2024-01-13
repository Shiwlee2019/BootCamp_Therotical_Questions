package com.qa.BootCamp_Diffiult_Programs;

class StackNode {
    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomStack {
    private StackNode top;

    public CustomStack() {
        this.top = null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed to the stack");
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        int poppedValue = top.data;
        top = top.next;
        System.out.println(poppedValue + " popped from the stack");
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        StackNode temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Stack_Using_LinkedList {

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.pop();
        stack.display();
    }
}

