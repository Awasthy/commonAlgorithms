public class Solution {
    public String intToRoman(int num) {
        StringBuffer output = new StringBuffer();
        while(num > 0) {
            if (num >= 1000) {
                num = num - 1000;
                output.append("M");
            } else if (num >= 500) {
                num = num - 500;
                output.append("D");
            } else if (num >= 100) {
                num = num - 100;
                output.append("C");
            } else if (num >= 50) {
                num = num - 50;
                output.append("L");
            } else if (num >= 10) {
                num = num - 10;
                output.append("X");
            } else if (num >= 5) {
                num = num - 5;
                output.append("V");
            } else if (num >= 1) {
                num = num - 1;
                output.append("I");
            }
        }
        String result = output.toString();
        result = result.replaceAll("DCCCC", "CM").replaceAll("LXXXX", "XC").replaceAll("VIIII", "IX");
        result = result.replaceAll("CCCC", "CD").replaceAll("XXXX", "XL").replaceAll("IIII", "IV");
        return result;
    }
}