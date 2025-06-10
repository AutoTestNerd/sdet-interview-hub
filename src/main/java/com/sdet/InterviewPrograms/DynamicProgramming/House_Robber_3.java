package com.sdet.InterviewPrograms.DynamicProgramming;

//youTube- https://www.youtube.com/watch?v=Nt0IqkcxG80
class TreeNode {
    int data;
    TreeNode left ,right;

    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class House_Robber_3 {

    public static int rob(TreeNode root){
       int[] options = travel(root);
       return Math.max(options[0],options[1]);
    }

    public static  int[] travel (TreeNode root){
        if(root==null){
            return new int[2];
        }

        int[] left_node_choices = travel(root.left);
        int[] right_node_choices = travel(root.right);
        int[] options = new int[2];
        options[0] = root.data+left_node_choices[1]+right_node_choices[1];
        options[1]= Math.max(left_node_choices[0],left_node_choices[1])+Math.max(right_node_choices[0],right_node_choices[1]);

        return options;


    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(9);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(8);
        root.right.right= new TreeNode(7);
        int loot = rob(root);
        System.out.println("Tootal llot  " +loot);

    }
}
