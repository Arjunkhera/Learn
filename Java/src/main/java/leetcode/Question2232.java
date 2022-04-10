package leetcode;

public class Question2232 {
    public String minimizeResult(String expression) {

        String[] arr = expression.split("\\+");
        String a = arr[0], b = arr[1];

        int minValue = Integer.MAX_VALUE;
        String res = "";

        for(int i = a.length() - 1; i >= 0; i--) {
            String l1 = a.substring(0, i), lmid = a.substring(i, a.length());
            int valLeft = l1.isEmpty() ? 1 : Integer.parseInt(l1);
            int valLeftMid = Integer.parseInt(lmid);

            for(int j = 0; j < b.length(); j++) {
                String rmid = b.substring(0, j + 1), r1 = b.substring(j + 1, b.length());
                int valRight = r1.isEmpty() ? 1 : Integer.parseInt(r1);
                int valRightMid = Integer.parseInt(rmid);

                int total = valLeft * (valLeftMid + valRightMid) * valRight;
                if(total < minValue) {
                    minValue = total;

                    StringBuilder ans = new StringBuilder();
                    if(l1.isEmpty()) {
                        ans.append("(").append(lmid);
                    } else {
                        ans.append(l1).append("(").append(lmid);
                    }
                    ans.append("+").append(rmid).append(")");
                    if(!r1.isEmpty()) {
                        ans.append(r1);
                    }
                    res = ans.toString();
                }
            }
        }

        return res;
    }
}
