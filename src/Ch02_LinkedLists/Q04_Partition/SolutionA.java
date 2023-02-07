package Ch02_LinkedLists.Q04_Partition;

import Ch02_LinkedLists.LinkedListNode;

public class SolutionA {

    public static LinkedListNode partition(LinkedListNode head, int x) {
        LinkedListNode left = null, rigth = null, node = head;

        while (node != null) {
            if (node.data < x && left == null) {
                left = new LinkedListNode(node.data);
            } else if (node.data < x && left != null) {
                left.append(node.data);
            } else if (node.data >= x && rigth == null) {
                rigth = new LinkedListNode(node.data);
            } else if (node.data >= x && rigth != null) {
                rigth.append(node.data);
            }

            node = node.next;
        }

        LinkedListNode newList = left;
        if (left != null) {

            while (left.next != null) {
                left = left.next;
            }
            left.next = rigth;
        } else {
            newList = rigth;
        }

        return newList;
    }

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode(3);
        LinkedListNode head = list;
        list.append(5);
        list.append(8);
        list.append(5);
        list.append(10);
        list.append(2);
        list.append(1);

        // Print original list
        while (head != null) {
            System.out.print(head.data + "-> ");
            head = head.next;
        }

        head = list;
        list = partition(head, 5);

        head = list;
        System.out.println("\n=====================");
        // Print partitioned list
        while (head != null) {
            System.out.print(head.data + "-> ");
            head = head.next;
        }
    }
}
