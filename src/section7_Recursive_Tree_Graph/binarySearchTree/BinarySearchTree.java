package section7_Recursive_Tree_Graph.binarySearchTree;

class Node{
    int data;
    Node lt, rt;
    public Node(int val){ // 처음 생성될때.
        data = val;
        lt = rt = null;
    }
}
public class BinarySearchTree {
    Node root;
    public void DFS(Node root){
        if(root == null){
            return;
        }else{
            // 중위순회
            DFS(root.lt); // 왼쪽 자식노드
            System.out.println(root.data+" ");
            DFS(root.rt); //오른쪽 자식노드
        }

    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);

        tree.root.lt.lt= new Node(4);
        tree.root.lt.rt = new Node(5);

        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);

    }
}
