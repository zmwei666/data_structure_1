//假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。 
//
// 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[
//i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。 
//
// 示例 1: 
//
// 
//输入: g = [1,2,3], s = [1,1]
//输出: 1
//解释: 
//你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
//虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
//所以你应该输出1。
// 
//
// 示例 2: 
//
// 
//输入: g = [1,2], s = [1,2,3]
//输出: 2
//解释: 
//你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
//你拥有的饼干数量和尺寸都足以让所有孩子满足。
//所以你应该输出2.
// 
//
// 
//
// 提示： 
//
// 
// 1 <= g.length <= 3 * 10⁴ 
// 0 <= s.length <= 3 * 10⁴ 
// 1 <= g[i], s[j] <= 2³¹ - 1 
// 
//
// Related Topics 贪心 数组 双指针 排序 👍 833 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 分发饼干
 * @author CodeTheory
 * @date 2024-03-07 17:24:07
 */
public class P455_AssignCookies{
	 public static void main(String[] args) {
	 	 Solution solution = new P455_AssignCookies().new Solution();
		 System.out.println(solution.findContentChildren(new int[]{1, 2, 7, 10}, new int[]{1, 3, 5, 9}));
		 System.out.println(solution.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
	 }
	 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int max = 0;
		for (int i = 0, j = 0; i < s.length && j < g.length; i++) {
			if (g[j] <= s[i]) {
				max++;
				j++;
			}
		}
		return max;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}