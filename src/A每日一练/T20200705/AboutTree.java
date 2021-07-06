package A每日一练.T20200705;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import domain.TreeNode;

/**
 * 前、中、后、层
 */
public class AboutTree {
    public static void main(String[] args) {
        TreeNode t=TreeNode.create();
        qian(t);
        System.out.println("-------");
        zhong(t);
        System.out.println("-------");
        hou(t);
        System.out.println("-------");
        ceng(t);
    }

    public static void qian(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null||!stack.empty()){
            while (root!=null){
                System.out.println(root.val);
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            root=root.right;
        }
    }
    public static void zhong(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null||!stack.empty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            System.out.println(root.val);
            root=root.right;
        }
    }
    public static void hou(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        LinkedList<Integer> res=new LinkedList<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode pop = stack.pop();
            res.addFirst(pop.val);
            if(pop.left!=null){
                stack.push(pop.left);
            }
            if(pop.right!=null){
                stack.push(pop.right);
            }
        }
        System.out.println(res);
    }
    public static void ceng(TreeNode root){
        List<List<Integer>> lists=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> res=new ArrayList<>();
            int level=queue.size();
            for (int i=0;i<level;i++){
                TreeNode poll = queue.poll();
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
                res.add(poll.val);
            }
            lists.add(res);
        }
        System.out.println(lists);

    }


    public static void q(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null||!stack.empty()){
            while (root!=null){
                System.out.println(root.val);
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            root=root.right;
        }
    }
    public static void z(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null||!stack.empty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            System.out.println(root.val);
            root=root.right;
        }
    }
    public static void h(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        LinkedList<TreeNode> queue=new LinkedList<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode pop = stack.pop();
            queue.addFirst(pop);
            if(pop.left!=null){
                stack.push(pop.left);
            }
            if(pop.right!=null){
                stack.push(pop.right);
            }
        }


    }
    public static void c(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int level=queue.size();
            List<Integer> t=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode poll = queue.poll();
                t.add(poll.val);
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
            }
            res.add(t);
        }
    }

}
