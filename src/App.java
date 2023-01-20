import ArraysAndStrings.MyStringBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        MyStringBuilder sb = new MyStringBuilder("Hello ");
        String world = "World";
        String exclamationMark = "!";

        /* StringBuilder before appending */
        System.out.println("Builder: " + sb);

        /* Appending */
        sb.append(world);
        sb.append(exclamationMark);

        /* StringBuilder before appending */
        System.out.println("After append: " + sb);

        sb.reverse();
        System.out.println("After reversed: " + sb);
    }
}
