import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import tree.TreeNode;

/**
 * leetcode辅助
 * <p>
 * 参考
 * https://leetcode-cn.com/problems/delete-leaves-with-a-given-value/
 */
public class TreeNodeUtil
{
    public static TreeNode createTreeByLevel(Integer[] treeArray)
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
            if (treeNode.left == null)
            {
                //handle left node
                Integer value = treeArray[index++];
                if (value != null)
                {
                    TreeNode newNode = new TreeNode(value);
                    treeNode.left = newNode;
                    handleList.add(newNode);
                    //System.out.println(treeNode.val + "/" + value);
                }
                else
                {
                    //System.out.println(treeNode.val + "/" + null);
                }
                
                if (index > treeArray.length - 1)
                {
                    break;
                }
                
                //handle right node
                value = treeArray[index++];
                if (value != null)
                {
                    TreeNode newNode = new TreeNode(value);
                    treeNode.right = newNode;
                    handleList.add(newNode);
                    //System.out.println(treeNode.val + "\\" + value);
                }
                else
                {
                    //System.out.println(treeNode.val + "\\" + null);
                }
                
                handleList.pollFirst();
                
            }
        }
        
        return rootNode;
    }
    
    public static Integer[] outputTreeByLevel(TreeNode rootNode)
    {
        if (rootNode == null)
        {
            return new Integer[0];
        }
        
        List<Integer> result = new ArrayList<>();
        
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(rootNode);
        
        result.add(rootNode.val);
        
        while (!list.isEmpty())
        {
            TreeNode poll = list.poll();
            if (poll.left != null || poll.right != null)
            {
                if (poll.left != null)
                {
                    list.add(poll.left);
                    result.add(poll.left.val);
                }
                else
                {
                    result.add(null);
                }
                
                if (poll.right != null)
                {
                    list.add(poll.right);
                    result.add(poll.right.val);
                }
                else
                {
                    result.add(null);
                }
            }
        }
        
        return result.toArray(new Integer[0]);
        
    }
}
