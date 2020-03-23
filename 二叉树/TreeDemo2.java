package com.njust.learn.tree;

import java.util.LinkedList;

import org.junit.Test;

/**
 * 动态创建树
 * <p>
 * 1. 动态创建二叉查找树BST
 * 2. 层次遍历生成树
 */
public class TreeDemo2
{
    @Test
    public void test01()
    {
        int[] array = {2, 3, 1, 4, 5};
        TreeNode treeNode = createBSTTree(array);
        System.out.println("preOrderTraverse==>");
        TreeDemo.preOrderTraverse(treeNode);
        
        System.out.println("inOrderTraverse==>");
        TreeDemo.inOrderTraverse(treeNode);
        
        System.out.println("postOrderTraverse==>");
        TreeDemo.postOrderTraverse(treeNode);
    }
    
    @Test
    public void test02()
    {
        Integer[] treeArray = {1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8};
        
        TreeNode rootNode = createTreeByLevel(treeArray);
        System.out.println(rootNode);
    }
    
    /**
     * 2.层次遍历生成树
     *
     * <pre>
     * {1,2,3,4,5,null,6,7,null,null,null,null,8}
     *
     * 生成
     *                 1
     *                / \
     *              2   3
     *            / \    \
     *           4  5     6
     *          /          \
     *         7            8
     *
     * </pre>
     */
    
    private TreeNode createTreeByLevel(Integer[] treeArray)
    {
        if (treeArray.length == 0)
        {
            return null;
        }
        
        //生成节点时加到末尾，处理结束(子节点都处理完)的从头弹出去
        LinkedList<TreeNode> handleList = new LinkedList<>();
        
        TreeNode rootNode = new TreeNode(treeArray[0]);
        handleList.add(rootNode);
        
        int index = 1;
        while (!handleList.isEmpty())
        {
            if (index > treeArray.length - 1)
            {
                break;
            }
            
            TreeNode treeNode = handleList.peek();
            if (treeNode.getLeftNode() == null)
            {
                //handle left node
                Integer value = treeArray[index++];
                if (value != null)
                {
                    TreeNode newNode = new TreeNode(value);
                    treeNode.setLeftNode(newNode);
                    handleList.add(newNode);
                    System.out.println(treeNode.getValue() + "/" + value);
                }
                else
                {
                    System.out.println(treeNode.getValue() + "/" + null);
                }
                
                //handle right node
                value = treeArray[index++];
                if (value != null)
                {
                    TreeNode newNode = new TreeNode(value);
                    treeNode.setRightNode(newNode);
                    handleList.add(newNode);
                    System.out.println(treeNode.getValue() + "\\" + value);
                }
                else
                {
                    System.out.println(treeNode.getValue() + "\\" + null);
                }
                
                handleList.pollFirst();
                
            }
        }
        
        return rootNode;
    }
    
    /**
     * 1. 动态创建二叉查找树BST
     */
    private static TreeNode createBSTTree(int[] treeArray)
    {
        TreeNode rootNode = null;
        
        for (int i : treeArray)
        {
            if (rootNode == null)
            {
                rootNode = new TreeNode(i);
            }
            else
            {
                TreeNode tempNode = rootNode;
                
                while (true)
                {
                    if (i < tempNode.getValue())
                    {
                        if (tempNode.getLeftNode() == null)
                        {
                            tempNode.setLeftNode(new TreeNode(i));
                            break;
                        }
                        else
                        {
                            tempNode = tempNode.getLeftNode();
                        }
                    }
                    else
                    {
                        if (tempNode.getRightNode() == null)
                        {
                            tempNode.setRightNode(new TreeNode(i));
                            break;
                        }
                        else
                        {
                            tempNode = tempNode.getRightNode();
                        }
                    }
                }
                
            }
            
        }
        
        return rootNode;
        
    }
    
}
