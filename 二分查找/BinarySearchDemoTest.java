import org.junit.Assert;
import org.junit.Test;

import erfen.BinarySearchDemo;

public class BinarySearchDemoTest {
    @Test
    public void testBinarySearch() {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 7;
        int expectIndex = 3;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.binarySearch(nums, target));
    }

    @Test
    public void testBinarySearch2() {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 9;
        int expectIndex = 4;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.binarySearch(nums, target));
    }

    @Test
    public void testBinarySearch3() {
        int[] nums = {1, 3, 5, 7, 9};
        int target = -1;
        int expectIndex = -1;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.binarySearch(nums, target));
    }

    @Test
    public void testBinarySearch4() {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 15;
        int expectIndex = -1;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.binarySearch(nums, target));
    }

    @Test
    public void testLeftBound1() {
        int[] nums = {1, 5, 5, 5, 9};
        int target = 5;
        int expectIndex = 1;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.leftBound(nums, target));
    }

    @Test
    public void testLeftBound1b() {
        int[] nums = {1, 5, 5, 5, 9};
        int target = 6;
        int expectIndex = -1;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.leftBound(nums, target));
    }

    @Test
    public void testLeftBound1c() {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 7;
        int expectIndex = 3;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.leftBound(nums, target));
    }

    @Test
    public void testLeftBound2() {
        int[] nums = {1, 5, 5, 5, 9};
        int target = -2;
        int expectIndex = -1;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.leftBound(nums, target));
    }

    @Test
    public void testLeftBound3() {
        int[] nums = {1, 5, 5, 5, 9};
        int target = 15;
        int expectIndex = -1;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.leftBound(nums, target));
    }

    @Test
    public void testLeftBound4() {
        int[] nums = {1, 2, 5, 5, 9};
        int target = 5;
        int expectIndex = 2;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.leftBound(nums, target));
    }

    @Test
    public void testRightBound1() {
        int[] nums = {1, 5, 5, 5, 9};
        int target = 5;
        int expectIndex = 3;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.rightBound(nums, target));
    }

    @Test
    public void testRightBound1b() {
        int[] nums = {1, 5, 5, 5, 9};
        int target = 6;
        int expectIndex = -1;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.rightBound(nums, target));
    }

    @Test
    public void testRightBound1c() {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 7;
        int expectIndex = 3;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.rightBound(nums, target));
    }

    @Test
    public void testRightBound2() {
        int[] nums = {1, 5, 5, 5, 9};
        int target = -2;
        int expectIndex = -1;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.rightBound(nums, target));
    }

    @Test
    public void testRightBound3() {
        int[] nums = {1, 5, 5, 5, 9};
        int target = 15;
        int expectIndex = -1;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.rightBound(nums, target));
    }

    @Test
    public void testRightBound4() {
        int[] nums = {1, 2, 5, 5, 9};
        int target = 5;
        int expectIndex = 3;

        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        Assert.assertEquals(expectIndex, binarySearchDemo.rightBound(nums, target));
    }
}
