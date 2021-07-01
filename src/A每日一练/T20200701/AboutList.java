package A每日一练.T20200701;

import domain.ListNode;

/**
 * 反转、合并、找交点、是否有环
 */
public class AboutList {
    public static void main(String[] args) {
        ListNode listNode = ListNode.create();
        fanzhuan(listNode);
    }


    public static void fanzhuan(ListNode listNode){
        ListNode pre=null;
        ListNode head=listNode;
        while (head!=null){
            ListNode tmp=head.next;
            head.next=pre;
            pre=head;
            head=tmp;
        }
        System.out.println(pre);


    }
    public static ListNode hebing(ListNode l1,ListNode l2){
        ListNode pre=new ListNode(-1);
        if(l1==null) return l2;
        if(l2==null) return l1;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                pre.next=l1;
                l1=l1.next;
            }else{
                pre.next=l2;
                l2=l2.next;
            }
            pre=pre.next;
        }
        /**
         * 错误写法
         *         pre=l1==null?l2:l1;
         *         return pre;
         */
        pre.next=l1==null?l2:l1;
        return pre.next;
    }
    public static ListNode zhaojiaodian(ListNode l1,ListNode l2){
        while (l1!=l2){
                l1=l1==null?l2:l1.next;
                l2=l2==null?l1:l2.next;
        }
        return l1;
    }
    public static boolean shifouyouhuan(ListNode listNode){
        ListNode slow=listNode;
        ListNode fast=listNode.next;
        while (slow!=fast){
            if(fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
