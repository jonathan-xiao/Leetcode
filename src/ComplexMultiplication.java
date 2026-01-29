public class ComplexMultiplication {
    public String complexNumberMultiply(String num1, String num2) {
        String[] str1 = num1.split("\\+");
        String[] str2 = num2.split("\\+");
        int a1 = 0;
        int a2 = 0;
        int b1 = 0;
        int b2 = 0;
        boolean neg = false;
        if (str1[0].charAt(0) == '-') {
            neg = true;
        }
        String temp = str1[0];
        String tempnum = temp.replaceAll("[^\\d]", "");
        a1 = Integer.parseInt(tempnum);
        if (neg) {
            a1 = -a1;
        }
        neg = false;
        if (str1[1].charAt(0) == '-') {
            neg = true;
        }
        temp = str1[1];
        tempnum = temp.replaceAll("[^\\d]", "");
        a2 = Integer.parseInt(tempnum);
        if (neg) {
            a2 = -a2;
        }
        neg=false;
        if (str2[0].charAt(0) == '-') {
            neg = true;
        }
        temp = str2[0];
        tempnum = temp.replaceAll("[^\\d]", "");
        b1 = Integer.parseInt(tempnum);
        if (neg) {
            b1 = -b1;
        }
        neg=false;
        if (str2[1].charAt(0) == '-') {
            neg = true;
        }
        temp = str2[1];
        tempnum = temp.replaceAll("[^\\d]", "");
        b2 = Integer.parseInt(tempnum);
        if (neg) {
            b2 = -b2;
        }
        String answer = "";
        answer += Integer.toString(a1*a2-b1*b2);
        answer += "+";
        answer += Integer.toString(a1*b2+a2*b1);
        answer += "i";
        return answer;


    }
}
