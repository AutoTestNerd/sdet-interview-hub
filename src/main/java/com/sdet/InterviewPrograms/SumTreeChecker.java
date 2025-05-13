package com.sdet.InterviewPrograms;

class BstNode
{
    int data;
    BstNode left,right;
     BstNode(int item)
     {
         data=item;
         left=right=null;
     }
}
public class SumTreeChecker
{
    public static boolean  isSumTreeChecker(BstNode root)
    {
        if(root==null || root.left==null || root.right==null)
        {
            return true;
        }
        int leftSum= sum(root.left);
        int rightSum= sum(root.right);
        if(root.data==leftSum+rightSum && isSumTreeChecker(root.right) && isSumTreeChecker(root.left))
        {
            return true;
        }
            return  false;

    }

    public static int sum(BstNode node)
    {
        if(node==null)
        {
            return 0;
        }
        return sum(node.left)+node.data+sum(node.right);
    }
    public static void main(String[] args)
    {
        BstNode root = new BstNode(26);
        root.left= new BstNode(10);
        root.right = new BstNode(3);
        root.left.left = new BstNode(4);
        root.left.right = new BstNode(6);
        root.right.right= new BstNode(3);
        if (isSumTreeChecker(root))
            System.out.println("The tree is a Sum Tree.");
        else
            System.out.println("The tree is NOT a Sum Tree.");
    }

}
