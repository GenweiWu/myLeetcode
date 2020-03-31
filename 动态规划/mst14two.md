[面试题14- II. 剪绳子 II](https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/)
==

## 1.动态规划

### 1.1
```
f(x)表示绳子长度为x时，得到的相乘的最大值

f(x) = 1*f(x-1)  //过滤掉，划不来
f(x) = 2*f(x-2) 
...
f(x)  = (x-2)*f(2) 
f(x)  = (x-1)*f(1) //过滤掉，划不来
```

### 1.2 code

- 注意：要用BigInteger否则int会溢出

```java
package mst14two;

import java.math.BigInteger;

public class Solution {
    public int cuttingRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        // n>=4
        // 注意中间过程可以不切割
        BigInteger[] result = new BigInteger[n + 1];
        result[1] = BigInteger.valueOf(1);
        result[2] = BigInteger.valueOf(2);
        result[3] = BigInteger.valueOf(3);

        for (int index = 4; index <= n; index++) {
            result[index] = BigInteger.valueOf(-1);
            for (int i = 2; i <= index - 2; i++) {
                int j = index - i;
                BigInteger mix = result[i].multiply(result[j]);
                result[index] = mix.max(result[index]);
            }
        }

        BigInteger ret = result[n];
        return ret.mod(BigInteger.valueOf(1000000007)).intValue();
    }
}
```

## TODO:贪心算法
