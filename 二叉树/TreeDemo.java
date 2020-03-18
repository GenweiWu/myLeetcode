package com.njust.learn.tree;

import java.util.LinkedList;

/**
 * 实现二叉树遍历
 * <p>
 * - 先序遍历
 * - 中序遍历
 * - 后续遍历
 * - 层次遍历
 */
public class TreeDemo
{
    public static void main(String[] args)
    {
        TreeNode rootNode = generateTree2();
        
        System.out.println("preOrderTraverse==>");
        preOrderTraverse(rootNode);
        
        System.out.println("inOrderTraverse==>");
        inOrderTraverse(rootNode);
        
        System.out.println("postOrderTraverse==>");
        postOrderTraverse(rootNode);
        
        System.out.println("levelTraverse==>");
        levelTraverse(rootNode);
    }
    
    /**
     * 先序遍历
     */
    public static void preOrderTraverse(TreeNode treeNode)
    {
        if (treeNode != null)
        {
            System.out.println(treeNode.getValue());
            preOrderTraverse(treeNode.getLeftNode());
            preOrderTraverse(treeNode.getRightNode());
        }
        
    }
    
    /**
     * 中序遍历
     */
    public static void inOrderTraverse(TreeNode treeNode)
    {
        if (treeNode != null)
        {
            inOrderTraverse(treeNode.getLeftNode());
            System.out.println(treeNode.getValue());
            inOrderTraverse(treeNode.getRightNode());
        }
    }
    
    /**
     * 后序遍历
     */
    public static void postOrderTraverse(TreeNode treeNode)
    {
        if (treeNode != null)
        {
            postOrderTraverse(treeNode.getLeftNode());
            postOrderTraverse(treeNode.getRightNode());
            System.out.println(treeNode.getValue());
        }
    }
    
    /**
     * 层次遍历
     */
    private static void levelTraverse(TreeNode rootNode)
    {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(rootNode);
        
        System.out.println(rootNode.getValue());
        while (!list.isEmpty())
        {
            TreeNode curNode = list.poll();
            TreeNode leftNode = curNode.getLeftNode();
            TreeNode rightNode = curNode.getRightNode();
            
            if (leftNode != null)
            {
                System.out.println(leftNode.getValue());
                list.add(leftNode);
            }
            if (rightNode != null)
            {
                System.out.println(rightNode.getValue());
                list.add(rightNode);
            }
        }
        
    }
    
    /**
     * <pre>
     *       10
     *      /  \
     *    9    20
     *       /   \
     *      15   35
     * </pre>
     */
    private static TreeNode generateTree()
    {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(35);
        
        treeNode1.setLeftNode(treeNode2);
        treeNode1.setRightNode(treeNode3);
        
        treeNode3.setLeftNode(treeNode4);
        treeNode3.setRightNode(treeNode5);
        
        return treeNode1;
    }
    
    /**
     * <pre>
     *                   8
     *                /   \
     *              3     10
     *             / \      \
     *            1   6     14
     *               / \    /
     *              4  7   13
     *
     * </pre>
     */
    private static TreeNode generateTree2()
    {
        TreeNode treeNode1 = new TreeNode(8);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(10);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(14);
        TreeNode treeNode7 = new TreeNode(4);
        TreeNode treeNode8 = new TreeNode(7);
        TreeNode treeNode9 = new TreeNode(13);
        
        treeNode1.setLeftNode(treeNode2);
        treeNode1.setRightNode(treeNode3);
        treeNode2.setLeftNode(treeNode4);
        treeNode2.setRightNode(treeNode5);
        treeNode5.setLeftNode(treeNode7);
        treeNode5.setRightNode(treeNode8);
        treeNode3.setRightNode(treeNode6);
        treeNode6.setLeftNode(treeNode9);
        
        return treeNode1;
    }
    
}
