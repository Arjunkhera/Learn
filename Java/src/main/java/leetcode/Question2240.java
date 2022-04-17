package leetcode;

public class Question2240 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long res = 0;

        while(total >= 0) {
            res += (total / cost2) + 1;
            total -= cost1;
        }

        return res;
    }
}
