package com.aruforce.array;

/**
 *  买卖股票最佳时机
 *  @author Aruforce
 *  @see <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/">leetCode Link</a>
 */
public class Q122 {
    /**
     * 解题思路:
     *  已知条件:
     *      1. 我们当前手里有没有股票
     *      2. 我们今天已经知道明天的价格
     *  基于以上两点 我们来做 决策
     *      1. 我们持有股票
     *          1.1 明天价格下跌  今天卖出
     *          1.2 明天价格上涨  今天不卖
     *      2.  我们未持有股票
     *          1.1 明天价格下跌  今天不买
     *          1.2 明天下个上涨  今天买入
     */
    public static int maxProfit(int[] prices) {
        int profit = 0;
        boolean hold = false;
        int hold_price = 0;
        for (int i = 0; i < prices.length; i++) {
            int tod_price = prices[i];
            int tom_price = 0;
            if (i + 1 < prices.length) {
                tom_price = prices[i + 1];
            }
            if (hold) {
                if (tod_price > tom_price) {
                    profit = profit + tod_price - hold_price;
                    hold = false;
                }
            } else {
                if (tod_price < tom_price) {
                    hold = true;
                    hold_price = tod_price;
                }
            }
        }
        return profit;
    }
}
