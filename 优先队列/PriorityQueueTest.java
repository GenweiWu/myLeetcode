package com.njust.learn.queue;

import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

public class PriorityQueueTest
{
    @Test
    public void test01a()
    {
        //默认实现是小顶堆
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(1);
        queue.add(6);
        
        while (!queue.isEmpty())
        {
            System.out.print(queue.poll() + ",");
        }
        //1,5,6,10,
    }
    
    @Test
    public void test01b()
    {
        //自定义比较器实现大顶堆
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        queue.add(10);
        queue.add(5);
        queue.add(1);
        queue.add(6);
        
        while (!queue.isEmpty())
        {
            System.out.print(queue.poll() + ",");
        }
        //10,6,5,1,
    }
    
    //默认是字符串排序
    @Test
    public void test02a()
    {
        Queue<String> queue = new PriorityQueue<>();
        
        queue.add("A3");
        queue.add("V1");
        queue.add("A1");
        queue.add("V2");
        queue.add("A2");
        
        while (!queue.isEmpty())
        {
            System.out.print(queue.poll() + ",");
        }
        //A1,A2,A3,V1,V2,
    }
    
    /**
     * 普通取号A1,A2,A3
     * vip号:V1,V2
     * <p>
     * 如何实现VIP优先
     */
    @Test
    public void test02b()
    {
        Queue<String> queue = new PriorityQueue<>((q1, q2) -> {
            if (q1.charAt(0) == q2.charAt(0))
            {
                return q1.compareTo(q2);
            }
            
            if (q1.charAt(0) == 'V')
            {
                return -1;
            }
            else
            {
                return 1;
            }
            
        });
        
        queue.add("A3");
        queue.add("V1");
        queue.add("A1");
        queue.add("V2");
        queue.add("A2");
        
        while (!queue.isEmpty())
        {
            System.out.print(queue.poll() + ",");
        }
        //V1,V2,A1,A2,A3,
    }
}
