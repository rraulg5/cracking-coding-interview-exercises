import ArraysAndStrings.MyHashTable;

public class App {
    public static void main(String[] args) throws Exception {
        MyHashTable<Integer, String> hashTable = new MyHashTable<Integer, String>();

        hashTable.put(101, "Raul");
        hashTable.put(102, "Pau");
        hashTable.put(102, "Paulina");
        hashTable.put(103, "Grumpy");
        hashTable.put(104, "Nova ");
        hashTable.put(105, "Squanchi");
        hashTable.put(106, "Huevo");
        hashTable.put(107, "Piraña");
        hashTable.put(108, "Remove me");

        for (int i = 110; i < 200; i++) {
            hashTable.put(i, "Test" + i);
        }

        System.out.println(hashTable.toString());

        System.out.println(hashTable.size());
        System.out.println(hashTable.get(101));
        System.out.println(hashTable.get(102));
        System.out.println(hashTable.get(90));
        System.out.println(hashTable.remove(108));
        System.out.println(hashTable.size());
    }
}
