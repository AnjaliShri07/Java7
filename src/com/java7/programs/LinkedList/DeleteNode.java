package com.java7.programs.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class DeleteNode {
       public static void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
       }

    public static void main(String[] args) {
        // Creating the linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        // Assuming we want to delete the node with value 5
        ListNode nodeToDelete = head.next; // This is the node with value 5

        // Calling the deleteNode method
        DeleteNode solution = new DeleteNode();
        deleteNode(nodeToDelete);

        // Printing the modified linked list: should be 4 -> 1 -> 9
        printList(head);
    }

    // Helper method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}


