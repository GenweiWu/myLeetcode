# myLeetcode

- https://labuladong.gitbook.io/algo/di-ling-zhang-bi-du-xi-lie


## 基础

### 1. 数组排序
> 升序很简单
```java
int[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};        
         Arrays.sort(a);
```
> 降序，需要转换成Integer再排序
```java
int[] sorted = IntStream.of(a)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .mapToInt(i -> i)
        .toArray();

```

