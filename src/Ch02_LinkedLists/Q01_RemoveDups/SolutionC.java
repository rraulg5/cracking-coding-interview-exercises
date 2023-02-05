package Ch02_LinkedLists.Q01_RemoveDups;

import Ch02_LinkedLists.LinkedListNode;

public class SolutionC {

    static void deleteDups(LinkedListNode node) {
        LinkedListNode current = node;
        LinkedListNode runner = null;
        LinkedListNode previous = null;

        while (current != null) {
            previous = current;
            runner = node.next;

            while (runner != null) {
                if (node.data == runner.data) {
                    previous.next = runner.next;
                } else {
                    previous = runner;
                }
                runner = runner.next;
            }

            current = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode(1);
        LinkedListNode head = list;
        list.append(2);
        list.append(3);
        list.append(1);
        list.append(2);
        list.append(1);
        list.append(1);

        while (list != null) {
            System.out.println(list.data);
            list = list.next;
        }
        System.out.println("------------");

        list = head;
        deleteDups(list);
        while (list != null) {
            System.out.println(list.data);
            list = list.next;
        }
    }
}