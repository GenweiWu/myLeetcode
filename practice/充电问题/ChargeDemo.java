package com.njust.learn;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ChargeDemo
{
    //每次充电能跑的公里数
    private double chargePower = 3;
    
    boolean isAtHome = false;
    
    int MAX = 4;
    
    @Test
    public void testCharge()
    {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < MAX; i++)
        {
            path.add("");
        }
        doCharge(path, 0, 0d, isAtHome, MAX);
        
    }
    
    @Test
    public void testCharge222()
    {
        chargePower = 3.3;
        List<String> path = new ArrayList<>();
        for (int i = 0; i < MAX; i++)
        {
            path.add("");
        }
        doCharge(path, 0, 0d, isAtHome, MAX);
        
    }
    
    @Test
    public void testCharge333()
    {
        chargePower = 3.5;
        List<String> path = new ArrayList<>();
        for (int i = 0; i < MAX; i++)
        {
            path.add("");
        }
        doCharge(path, 0, 0d, isAtHome, MAX);
        
    }
    
    private void doCharge(List<String> path, int pathIndex, double total, boolean isAtHome, int MAX)
    {
        if (total < 0)
        {
            System.out.println("[失败的]" + String.join(" , ", path));
            return;
        }
        
        if (pathIndex == MAX)
        {
            System.out.println(String.join(" , ", path));
            return;
        }
        
        double oldTotal = total;
        if (isAtHome)
        {
            //charge
            total = total + chargePower * 5 - 10;
            path.set(pathIndex, "在家充电==>去公司10公里:" + total);
            doCharge(path, pathIndex + 1, total, false, MAX);
            
            //no charge
            total = oldTotal;
            
            total = total - 10;
            path.set(pathIndex, "在家!!!充电==>去公司10公里:" + total);
            doCharge(path, pathIndex + 1, total, false, MAX);
            
        }
        else
        {
            //charge
            total = total + chargePower * 4 - 10;
            path.set(pathIndex, "在公司充电==>回家10公里:" + total);
            doCharge(path, pathIndex + 1, total, true, MAX);
            
            //no charge
            total = oldTotal;
            
            total = total - 10;
            path.set(pathIndex, "!!!在公司不充电==>回家10公里:" + total);
            doCharge(path, pathIndex + 1, total, true, MAX);
        }
    }
}
