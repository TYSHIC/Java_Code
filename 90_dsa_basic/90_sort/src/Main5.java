import java.util.Objects;
import java.util.Scanner;

public class Main5 {
    // 定義鏈結串列
    private static class IntNode {
        public final int value;
        public IntNode next;
        public IntNode previous;

        public IntNode(int value) {
            this.value = value;
        }

        public static void linkTwoNodes(IntNode previous, IntNode next) {
            if (Objects.nonNull(previous)) previous.next = next;
            if (Objects.nonNull(next)) next.previous = previous;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 獲取資料個數
        // 建立鏈結串列
        IntNode firstNode = null, currentNode = null;
        for (int i = 0; i < n; i++) {
            IntNode newNode = new IntNode(scanner.nextInt());
            if (Objects.isNull(firstNode)) {
                currentNode = newNode;
                firstNode = newNode;
            } else {
                IntNode.linkTwoNodes(currentNode, newNode);
                currentNode = newNode;
            }
        }
        // 插入排序
        IntNode sortLastNode = firstNode;
        for (int i = 1; i < n; i++) {
            IntNode keyNode = sortLastNode.next;
            currentNode = sortLastNode;
            while (Objects.nonNull(currentNode) && keyNode.value < currentNode.value)
                currentNode = currentNode.previous;
            if (currentNode == sortLastNode) sortLastNode = sortLastNode.next;
            else {
                IntNode.linkTwoNodes(keyNode.previous, keyNode.next);
                if (Objects.isNull(currentNode)) {
                    IntNode.linkTwoNodes(keyNode, firstNode);
                    firstNode = keyNode;
                } else {
                    IntNode.linkTwoNodes(keyNode, currentNode.next);
                    IntNode.linkTwoNodes(currentNode, keyNode);
                }
            }
        }
        // 輸出
        currentNode = firstNode;
        while (Objects.nonNull(currentNode)) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }
}
