
package erfen;

public class BinarySearchDemo {
    /**
     * 在nums数组中查找target，找到返回下标；没找到则返回-1
     * 
     * @return 返回下标,没找到返回-1
     */
    public int binarySearch(int[] nums, int target) {
        // [0,len-1]
        int left = 0;
        int right = nums.length - 1;

        // [left,mid-1] [mid+1,right]
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }

        return -1;
    }

    public int leftBound(int[] nums, int target) {
        // [0,len-1]
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                right = mid - 1;
            }
        }

        if (left >= nums.length || nums[left] != target) {
            return -1;
        }

        return left;
    }

    public int rightBound(int[] nums, int target) {
        // [0,len-1]
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                left = mid + 1;
            }
        }

        if (right < 0 || nums[right] != target) {
            return -1;
        }

        return right;

    }
}
