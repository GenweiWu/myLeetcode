package com.njust.learn.tree;

import org.junit.Test;

/**
 * 动态创建二叉查找树BST
 */
public class TreeDemo2
{
    @Test
    public void test01()
    {
        int[] array = {2, 3, 1, 4, 5};
        TreeNode treeNode = createTree(array);
        System.out.println("preOrderTraverse==>");
        TreeDemo.preOrderTraverse(treeNode);
        
        System.out.println("inOrderTraverse==>");
        TreeDemo.inOrderTraverse(treeNode);
        
        System.out.println("postOrderTraverse==>");
        TreeDemo.postOrderTraverse(treeNode);
    }
    
    private static TreeNode createTree(int[] treeArray)
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
