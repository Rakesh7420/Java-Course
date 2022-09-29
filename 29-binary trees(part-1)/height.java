public class height {
    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int CalHeight(Node root){
        if(root==null){
            return 0;
        }

        int lh=CalHeight(root.left);
        int rh=CalHeight(root.left);
        return Math.max(lh,rh)+1;

    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int Leftcount=count(root.left);
        int Rightcount=count(root.right);
        return Leftcount+Rightcount+1;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
    }

    public static void main(String[] args) {
/*
                    1
                 /     \
                2       3
              /   \   /   \
             4    5  6    7

 */

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("height = "+CalHeight(root));
        System.out.println("count "+count(root));
        System.out.println("sum = "+sum(root));
    }
}
