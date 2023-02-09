package Ch02_LinkedLists.Q05_SumLists;

import Ch02_LinkedLists.LinkedListNode;

public class SolutionA {

    static LinkedListNode sumLists(LinkedListNode a, LinkedListNode b) {
        int numA = 0, numB = 0;
        int result = 0, resultBackup = 0;
        int factor = 1, factorCount = 0;
        LinkedListNode resultList = null;

        while (a != null) {
            numA = numA + a.data * factor;
            factor = factor * 10;
            a = a.next;
        }
        factor = 1;

        while (b != null) {
            numB = numB + b.data * factor;
            factor = factor * 10;
            b = b.next;
        }
        factor = 1;

        result = numA + numB;
        resultBackup = result;
        while (resultBackup / 10 != 0) {
            factorCount++;
            resultBackup = resultBackup / 10;
            factor = factor * 10;
        }

        while (factorCount >= 0) {
            int num = result / factor;
            result = result - num * factor;
            if (resultList == null) {
                resultList = new LinkedListNode(num);
            } else {

                resultList.append(num);
            }
            factor = factor / 10;
            factorCount--;
        }

        // revese list
        LinkedListNode head = resultList;
        LinkedListNode prev = null;
        while (head != null) {
            LinkedListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        resultList = prev;

        return resultList;
    }

    public static void main(String[] args) {
        LinkedListNode listA = new LinkedListNode(9);
        listA.append(7);
        listA.append(8);

        LinkedListNode listB = new LinkedListNode(6);
        listB.append(8);
        listB.append(5);

        LinkedListNode result = sumLists(listA, listB);
        while (result != null) {
            System.out.print(result.data + " -> ");
            result = result.next;
        }
    }
}
