import java.io.*;
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");

        System.out.println("Original String: " + sb);

        // delete() method: deletes the characters in a substring
        sb.delete(7, 12); // delete "World"
        System.out.println("After delete(): " + sb);

        // deleteCharAt() method: deletes the character at the specified index
        sb.deleteCharAt(6); // delete ","
        System.out.println("After deleteCharAt(): " + sb);
    }
}
