public class lecture1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=next;
        }
    }
   public static Node head;
    public static  Node tail;
    public static  int size;
    public void AddLast(int data){
        Node newnode=new Node(data);
         size++;
         if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void Addlastt(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
       tail=newnode;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx,int data){
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1) {
            temp = temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public int RemoveFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
           int val= head.data;
           head=tail=null;
           return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int ResmoveLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;       //or tail.data
            head=tail=null;
            size=0;
            return val;
        }
//        prev: i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;           //i.e.tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int itr_search(int key){
       Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int helper (Node head,int key){

        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recursive_search(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void DeleteNthNodeFromEnd(int n){
//        we took n==size bcz we are doing this from start instead of end bcz this is much shorter than doing from end
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz ){        //          here sz=size; we took this bcz n=size from end means n=start
            head=head.next;
            return;
        }
        //need to reach n from ed i.e.sz-n from start(i.e.1)
        int i=1;
        int iToFIndTill=sz-n;        // from start
        Node prev=head;
        while(i<iToFIndTill){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    private Node findMid(Node head){
        //fast-slow method
        Node slow=head;
        Node fast =head;

     while(fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
     }
        return slow;
    }

    public boolean checkpalindrome(){
        if(head==null ||head.next==null){
            return true;
        }
        //find mid
        Node mid=findMid(head);
        //reveerse
        Node prev=null;
        Node curr=mid;
        while (curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        Node right=prev;    ///right half head
        Node left=head;
        while(right!=null){
            if(left.data!= right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static boolean iscycle(){    //floyds cycle finding method
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow==fast){
                return true;//cycle exist
            }
        }
        return false;
    }


    private Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//midNode
    }

    private Node merge (Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp=mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        //for remaining
        while (head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;

    }
    public Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getmid(head);
        //left and right MS
        Node righthead=mid.next;
        mid.next=null;
        Node newLeft=mergesort(head);
        Node newRight=mergesort(righthead);
        //merge
        return merge(newLeft,newRight);
    }

    public void zigzag(){
        //mid
      Node slow=head;
      Node fast=head.next;
      while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
      Node mid=slow;

        //reverse
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
Node nextL,nextR;

        //alt merege or zigzag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

//for mergesort & zigzag
public static void main(String[] args) {
    lecture1 ll=new lecture1();
    ll.AddLast(1);
    ll.AddLast(2);
    ll.AddLast(3);
    ll.AddLast(4);
    ll.AddLast(5);
    //for zigzag
    ll.print();
    ll.zigzag();
    ll.print();
//    //mergersort
//    ll.head=ll.mergesort(ll.head);
//    ll.print();


}


    //thsi main function is only for iscycle
//    public static void main(String[] args) {
//        head=new Node(1);
//        head.next=new Node(2);
//        head.next.next=new Node(3);
//        head.next.next.next=head;
//        System.out.println(iscycle());
//
//    }
   /*
    public static void main(String[] args) {
        lecture1 ll=new lecture1();

        ll.Addlastt(1);
        ll.Addlastt(2);
        ll.Addlastt(2);
        ll.Addlastt(1);
        ll.print();
        System.out.println(ll.checkpalindrome());

//        ll.AddFirst(2);
//        ll.AddFirst(1);
//        ll.Addlastt(4);
//        ll.Addlastt(5);
//        ll.Addlastt(6);
//        ll.addMiddle(2,3);
//        ll.print();
//        ll.DeleteNthNodeFromEnd(3);
//        ll.print();
//        ll.reverse();
//        ll.print();
//        int key=4;
////        System.out.println(ll.itr_search(key));
//        System.out.println(ll.recursive_search(key));
////        System.out.println(ll.size);
//        ll.RemoveFirst();
//        ll.print();
//        System.out.println(ll.size);
//        ll.ResmoveLast();
//        ll.print();
//        System.out.println(ll.size);
    }
    */

}
