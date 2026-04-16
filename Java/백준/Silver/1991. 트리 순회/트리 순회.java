import java.io.*;
import java.util.*;

class Node {
    char data;
    Node left, right;

    Node(char data) {
        this.data = data;
    }
}

public class Main {
    static Node[] tree = new Node[26];

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            tree[i] = new Node((char) ('A' + i));
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            if (left != '.') {
                tree[parent - 'A'].left = tree[left - 'A'];
            }
            if (right != '.') {
                tree[parent - 'A'].right = tree[right - 'A'];
            }
        }

        preOrder(tree[0]);
        System.out.println();
        inOrder(tree[0]);
        System.out.println();
        postOrder(tree[0]);
    }

    public static void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data);
        inOrder(node.right);
    }

    public static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data);
    }
}