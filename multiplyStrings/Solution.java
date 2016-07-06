public class Solution {
public String multiply(String num1, String num2) {
    if (num1.equals("0") || num2.equals("0")) {
        return "0";
    }
    String p = new StringBuilder(num1).reverse().toString();
    String q = new StringBuilder(num2).reverse().toString();
    Stack<String> stack = new Stack<String>();
    int carry = 0;
    int prod;
    for (int i = 0; i < p.length(); i++) {
        int n = p.charAt(i) - 48;
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < q.length(); j++) {
            int m = q.charAt(j) - 48;
            prod = (n * m) + carry;
            carry = prod / 10;
            prod = prod % 10;
            sb.append(prod);
        }
        if (carry != 0) {
            sb.append(carry);
        }
        carry = 0;           
        sb = sb.reverse();
        for (int k = 0; k < i; k++) {
            sb.append('0');
        }
        System.out.println(sb.toString());
        stack.push(sb.toString());
    }
    while (stack.size() != 1) {
        String s1 = stack.pop();
        String s2 = stack.pop();
        String s3 = sum(s1, s2);
        stack.push(s3);
    }
    return stack.pop();
}
    
private String sum(String s1, String s2) {
    s1 = new StringBuilder(s1).reverse().toString();
    s2 = new StringBuilder(s2).reverse().toString();
    int carry = 0;
    int size = Math.max(s1.length(), s2.length());
    int i = 0;
    StringBuilder sb = new StringBuilder();
    while (i < size) {
        int num1 = 0;
        int num2 = 0;
        if (i < s1.length()) {
            num1 = s1.charAt(i) - 48;
        }
        if (i < s2.length()) {
            num2 = s2.charAt(i) - 48;
        }
        int sum = num1 + num2 + carry;
        carry = sum / 10;
        sum = sum % 10;
        sb.append(sum);
        i++;
    }
    if (carry != 0) {
        sb.append(carry);
    }
    return sb.reverse().toString();
    }
}