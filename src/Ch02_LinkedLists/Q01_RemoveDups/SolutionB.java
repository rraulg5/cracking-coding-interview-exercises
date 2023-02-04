package Ch02_LinkedLists.Q01_RemoveDups;

import java.util.HashSet;

public class SolutionB {

    static void deleteDups(LinkedListNode node) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;

        while (node != null) {
            if (set.contains(node.data)) {
                previous.next = node.next;
            } else {
                set.add(node.data);
                previous = node;
            }
            node = node.next;
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