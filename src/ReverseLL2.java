import java.util.LinkedList;

public class ReverseLL2 {

    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

    public static ListNode reverse(ListNode head){
        if(head==null || head.next == null)
            return head;
        else{
            ListNode newNode=reverse(head.next);
            ListNode front=head.next;
            front.next=head;
            head.next=null;
            return newNode;
        }
    } 
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode leftPointer=new ListNode();
        ListNode rightPointer=new ListNode();
        ListNode forward=new ListNode();
        if(head.next==null || left==right)
            return head;
        while(temp!=null){          //placing left and right pointers
            if(temp.val==left){    //also pointers before and after their respectives
                leftPointer=temp.next;
            }
            if(temp.val==right)
                rightPointer=temp;
            temp=temp.next;
        }
        if(rightPointer.next!=null)
            forward=rightPointer.next;

        rightPointer.next=null;     //breaking the link to reverse within

        leftPointer=reverse(leftPointer);

     //attaching the front after reversing
        temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=leftPointer;

          //attach the end if there's one
        if(forward!=null){    
            temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=forward;  
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode prev=head;
        int[] arr=new int[]{2,3,4,5};
        for(int i=0;i<arr.length;i++){
            ListNode newNode=new ListNode(arr[i]);
            prev.next=newNode;
        }
        int left=2,right=4;
        head=reverseBetween(head,left,right);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
}
