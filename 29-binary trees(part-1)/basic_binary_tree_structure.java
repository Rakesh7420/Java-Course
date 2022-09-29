import java.util.LinkedList;
import java.util.Queue;

public class basic_binary_tree_structure {
static class Node{
    int data;
   Node left;
   Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

static class BinaryTree{//o(n)
    static int idx=-1;
    public static Node BuildTree(int Nodes[]){
idx++;
if(Nodes[idx]==-1){
    return null;
}
Node newnode=new Node(Nodes[idx]);
newnode.left=BuildTree(Nodes);
newnode.right=BuildTree(Nodes);
        return newnode;
    }


public static void preorder(Node root){//o(n)
        if(root==null){
//            System.out.print("-1"+" ");//optional
            return;
        }
    System.out.print(root.data+" ");
    preorder(root.left);
   preorder(root.right);

}

public static void inorder(Node root){//o(n)
        if(root==null){
//            System.out.print("-1"+" ");//optional
            return;
        }
        inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}

public static void postorder(Node root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
    System.out.print(root.data+" ");
}

public static  void level_order(Node root){
        if(root==null){
            return;
        }
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
        Node currnode=q.remove();
        if(currnode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }
        else{
            System.out.print(currnode.data+" ");
            if(currnode.left!=null){
                q.add(currnode.left);
            }
            if(currnode.right!=null){
                q.add(currnode.right);
            }
        }}}
}
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);

        tree.preorder(root);
        System.out.println();

        tree.inorder(root);
        System.out.println();

        tree.postorder(root);
        System.out.println();

        tree.level_order(root);
    }
}
