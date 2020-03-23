package com.njust.learn.tree;

import lombok.Getter;
import lombok.Setter;

public class TreeNode
{
    @Getter
    private int value;
    
    @Getter
    @Setter
    private TreeNode leftNode;
    
    @Getter
    @Setter
    private TreeNode rightNode;
    
    public TreeNode(int value)
    {
        this.value = value;
    }
    
    @Override
    public String toString()
    {
        return "TreeNode{" +
            "value=" + value +
            ", leftNode=" + leftNode +
            ", rightNode=" + rightNode +
            '}';
    }
}
