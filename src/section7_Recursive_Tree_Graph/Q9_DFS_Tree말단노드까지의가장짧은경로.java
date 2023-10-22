package section7_Recursive_Tree_Graph;
class Node{
    int data;
    Node lt,rt;
    Node(int val){
        this.data = val;
        lt = rt = null;
    }
}
public class Q9_DFS_Tree말단노드까지의가장짧은경로 {
    Node root;
    public int dfs(int L, Node root){
        if(root.lt == null && root.rt == null){
            return L;
        }else{
            return Math.min(dfs(L+1,root.lt), dfs(L+1,root.rt));
        }

    }
    public static void main(String[] args) {
        Q9_DFS_Tree말단노드까지의가장짧은경로 tree = new Q9_DFS_Tree말단노드까지의가장짧은경로();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.dfs(0,tree.root));

    }
}
