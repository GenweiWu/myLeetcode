import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import april.d42b.Solution358;

public class Solution358Test {
    @Test
    public void test01() {
        String expect = "abcabc";
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("aabbcc", 3);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test02() {
        String expect = "";
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("aaabc", 3);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test03() {
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("aaadbbcc", 2);
        Assert.assertTrue(actual.equals("abacabcd") || actual.equals("abacacbd"));
    }

    @Test
    public void test99() {
        String expect = "abcdefghijklmnopqrstuvwxyz";
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("abcdefghijklmnopqrstuvwxyz", 2);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test99a() {
        String expect = "abaca";
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("aaabc", 2);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test99b() {
        String expect = "";
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("aa", 2);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test99c() {
        String expect1 = "cacabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc";
        String expect2 = "cacacbcbacababcacbcbacababcacbcbacababcacbcbacababcacbcbacababcacbcbacababcacbcbacab";
        Solution358 solution358 = new Solution358();
        String actual = solution358
            .rearrangeString("bbabcaccaaabababbaaaaccbbcbacbacacccbbcaabcbcacaaccbabbbbbcacccaccbabaccbacabcabcacb", 2);
        Assert.assertThat(actual, CoreMatchers.either(CoreMatchers.is(expect1)).or(CoreMatchers.is(expect2)));

    }

    @Test
    public void test100a() {
        String expect = "a";
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("a", 0);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test100b() {
        String expect = "aa";
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("aa", 0);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test100c() {
        String expect = "ab";
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("ab", 0);
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test100d() {
        String expect = "";
        Solution358 solution358 = new Solution358();
        String actual = solution358.rearrangeString("aabbcc", 4);
        Assert.assertEquals(expect, actual);
    }
}
