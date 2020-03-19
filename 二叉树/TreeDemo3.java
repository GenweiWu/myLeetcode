package com.njust.learn.tree;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

/**
 * 1. 查询树的最大值
 * <p>
 * 2、求树的深度
 * 3、求树的宽度
 */
public class TreeDemo3
{
    @Test
    public void testMax()
    {
        TreeNode treeNode = generateTree();
        Assert.assertEquals(76, getTreeMax(treeNode));
    }
    
    @Test
    public void testDepth()
    {
        TreeNode treeNode = generateTree();
        int depth = getTreeDepth(treeNode);
        Assert.assertEquals(5, depth);
    }
    
    @Test
    public void testWidth()
    {
        TreeNode treeNode = generateTree();
        int width = getTreeWidth(treeNode);
        Assert.assertEquals(4, width);
    }
    
    /**
     * 查询树的最大值
     */
    private int getTreeMax(TreeNode treeNode)
    {
        if (treeNode == null)
        {
            return -1;
        }
        
        int leftMax = getTreeMax(treeNode.getLeftNode());
        int rightMax = getTreeMax(treeNode.getRightNode());
        int max = Math.max(leftMax, rightMax);
        max = Math.max(max, treeNode.getValue());
        
        return max;
    }
    
    /**
     * 求树的深度
     */
    private int getTreeDepth(TreeNode treeNode)
    {
        if (treeNode == null)
        {
            return 0;
        }
        
        int leftDepth = getTreeDepth(treeNode.getLeftNode());
        int rightDepth = getTreeDepth(treeNode.getRightNode());
        
        int depth = Math.max(leftDepth, rightDepth);
        return depth + 1;
        
    }
    
    /**
     * 求树的宽度
     */
    private int getTreeWidth(TreeNode treeNode)
    {
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(treeNode);
        
        int maxWidth = 1;
        int curWidth = 1;
        
        while (!linkedList.isEmpty())
        {
            while (curWidth != 0)
            {
                TreeNode node = linkedList.poll();
                System.out.print(node.getValue() + ",");
                --curWidth;
                
                TreeNode leftNode = node.getLeftNode();
                if (leftNode != null)
                {
                    linkedList.add(leftNode);
                }
                
                TreeNode rightNode = node.getRightNode();
                if (rightNode != null)
                {
                    linkedList.add(rightNode);
                }
            }
            System.out.println();
            
            curWidth = linkedList.size();
            maxWidth = Math.max(maxWidth, curWidth);
            
        }
        
        return maxWidth;
    }
    
    /**
     * <pre>
     *                   8
     *                /   \
     *              3     10
     *             / \      \
     *            1   76     14
     *               / \    /  \
     *              4  7   13  55
     *                  \      /
     *                  66    16
     * </pre>
     */
    private static TreeNode generateTree()
    {
        TreeNode treeNode1 = new TreeNode(8);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(10);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(76);
        TreeNode treeNode6 = new TreeNode(14);
        TreeNode treeNode7 = new TreeNode(4);
        TreeNode treeNode8 = new TreeNode(7);
        TreeNode treeNode9 = new TreeNode(13);
        TreeNode treeNode10 = new TreeNode(66);
        TreeNode treeNode11 = new TreeNode(55);
        TreeNode treeNode12 = new TreeNode(16);
        
        treeNode1.setLeftNode(treeNode2);
        treeNode1.setRightNode(treeNode3);
        treeNode2.setLeftNode(treeNode4);
        treeNode2.setRightNode(treeNode5);
        treeNode5.setLeftNode(treeNode7);
        treeNode5.setRightNode(treeNode8);
        treeNode3.setRightNode(treeNode6);
        treeNode6.setLeftNode(treeNode9);
        treeNode8.setRightNode(treeNode10);
        treeNode6.setRightNode(treeNode11);
        treeNode11.setLeftNode(treeNode12);
        
        return treeNode1;
    }
}
