package section7_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int data;
    Node2 lt, rt;
    public Node2(int val){
        data = val;
        lt = rt = null;
    }
}
public class Q10_BFS_Tree말단노드까지의짧은경로 {
    Node2 root;
    public static int BFS(Node2 root){
        Queue<Node2> queue = new LinkedList<>();
        int L=0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                Node2 node = queue.poll();
                if(node.lt != null ){
                    queue.offer(node.lt);
                }if(node.rt != null ){
                    queue.offer(node.rt);
                }if(node.lt == null && node.rt ==null){
                    return L;
                }

                L++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Q10_BFS_Tree말단노드까지의짧은경로 tree = new Q10_BFS_Tree말단노드까지의짧은경로();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        System.out.println(Q10_BFS_Tree말단노드까지의짧은경로.BFS(tree.root));
    }
}
