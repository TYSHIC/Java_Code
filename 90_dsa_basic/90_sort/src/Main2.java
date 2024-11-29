import java.util.Objects;
import java.util.Scanner;

public class Main2 {
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
            if (Objects.isNull(currentNode)) {
                currentNode = newNode;
                firstNode = newNode;
            } else {
                IntNode.linkTwoNodes(currentNode, newNode);
                currentNode = newNode;
            }
        }
        // 選擇排序
        IntNode sortLastNode = null;
        for (int i = 0; i < n - 1; i++) {
            IntNode minNode = null;
            currentNode = Objects.isNull(sortLastNode) ? firstNode : sortLastNode.next;
            for (int j = i; j < n; j++) {
                if (Objects.isNull(minNode) || currentNode.value < minNode.value)
                    minNode = currentNode;
                currentNode = currentNode.next;
            }
            IntNode.linkTwoNodes(minNode.previous, minNode.next);
            if (Objects.isNull(sortLastNode)) {
                IntNode.linkTwoNodes(minNode, firstNode);
                firstNode = minNode;
            } else {
                IntNode.linkTwoNodes(minNode, sortLastNode.next);
                IntNode.linkTwoNodes(sortLastNode, minNode);
            }
            sortLastNode = minNode;
        }
        // 輸出
        currentNode = firstNode;
        while (Objects.nonNull(currentNode)) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }
}
