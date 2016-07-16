public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        StringBuilder asb = new StringBuilder(a);
        StringBuilder bsb = new StringBuilder(b);
        
        int i = 0;
        int carry = 0;
        
        asb.reverse();
        bsb.reverse();
        
        while (i != Math.max(asb.length(), bsb.length())) {
            int ai = 0;
            int bi = 0;
            if (i < asb.length()) {
                if (asb.charAt(i) == '1')
                    ai = 1;
            }
            if (i < bsb.length()) {
                if (bsb.charAt(i) == '1')
                    bi = 1;
            }
            int sum = carry + ai + bi;
            switch (sum) {
                case 1 : carry = 0;
                    sum = 1;
                    break;
                case 2 : sum = 0;
                    carry = 1;
                    break;
                case 3 : sum = 1;
                    carry = 1;
            }
            answer.append(sum);
            i++;
        }
        if (carry == 1) {
            answer.append(carry);
        }
        return answer.reverse().toString();
    }
}