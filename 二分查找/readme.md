## 二分查找

- https://labuladong.gitbook.io/algo/suan-fa-si-wei-xi-lie/er-fen-cha-zhao-xiang-jie
- https://labuladong.gitbook.io/algo/gao-pin-mian-shi-xi-lie/koko-tou-xiang-jiao

## 算法模板
```
1. [0,len-1]
2. [left,right]
-->mid因为mid分析过了
左移[left,mid-1]   右移[mid+1,right]

3. 求左边界
左移[left,mid-1],left=mid+1可能右侧溢出

4. 求右边界
右移[mid+1,right],right=mid-1可能左溢出

```


```java
int binary_search(int[] nums, int target) {
    int left = 0, right = nums.length - 1; 
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid - 1; 
        } else if(nums[mid] == target) {
            // 直接返回
            return mid;
        }
    }
    // 直接返回
    return -1;
}

int left_bound(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid - 1;
        } else if (nums[mid] == target) {
            // [左移]别返回，锁定左侧边界
            right = mid - 1;
        }
    }
    // 最后要检查 left 越界的情况[左边界，所以返回left;同时left唯一操作是+1,所以可能右侧溢出]
    if (left >= nums.length || nums[left] != target)
        return -1;
    return left;
}


int right_bound(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid - 1;
        } else if (nums[mid] == target) {
            // [右移]别返回，锁定右侧边界
            left = mid + 1;
        }
    }
    // 最后要检查 right 越界的情况[右边界，所以返回right;同时right唯一操作是-1,所以可能左侧溢出]
    if (right < 0 || nums[right] != target)
        return -1;
    return right;
}
```
