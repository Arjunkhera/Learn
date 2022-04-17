package leetcode;

public class Question2241 {
    class ATM {
        long[] store;
        int[] values;

        public ATM() {
            this.store = new long[5];
            this.values = new int[]{20, 50, 100, 200, 500};
        }

        public void deposit(int[] banknotesCount) {
            for(int i = 0; i < 5; i++) {
                this.store[i] += banknotesCount[i];
            }
        }

        public int[] withdraw(int amount) {
            long[] res = new long[5];
            long count;

            for(int note = 4; note >= 0 && amount > 0; note--) {
                count = amount/this.values[note];
                count = Math.min(count, this.store[note]);

                this.store[note] -= count;
                res[note] += count;
                amount = amount - (int)(count*this.values[note]);
            }

            if(amount != 0) {
                for(int i = 0; i < 5; i++) {
                    this.store[i] += res[i];
                }
                return new int[]{-1};
            }

            int[] ans = new int[5];
            for(int i = 0; i < 5; i++) {
                ans[i] = (int) res[i];
            }

            return ans;
        }
    }

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
}
