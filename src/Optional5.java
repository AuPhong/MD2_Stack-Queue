import java.util.Stack;

public class Optional5 {
//    public boolean checkBracket(String str){
//        Stack bstack = new Stack();
//        String[] str1 = str.split("");
//        for (int i = 0; i < str1.length; i++) {
//            if (str1[i].equals("(")){
//                bstack.push(str1[i]);
//            }
//            if (str1[i].equals(")")){
//                if (bstack.isEmpty()){
//                    return false;
//                }
//                else {
//                    String left = bstack.pop()+"";
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b * (s – c)";
        int count1 = 0;
        int count2 = 0;
        count1++;
        for (int i = 0; i < str.length(); i++) {
            System.out.println("check ( ============ " + str.charAt(i));
            if ((str.charAt(i) + "").equals("(")) {
                if (str.charAt(i + 1) + "" != "*" && str.charAt(i + 1) + "" != "/" && str.charAt(i + 1) + "" != "^" && str.charAt(i + 1) + "" != "%" && str.charAt(i + 1) + "" != ")") {
                    if (str.charAt(i - 1) + "" == "*" || str.charAt(i - 1) + "" == "/" || str.charAt(i - 1) + "" == "^" || str.charAt(i - 1) + "" == "%" || str.charAt(i - 1) + "" == ")" || str.charAt(0) + "" == "(") {
                        count1++;
                    }
                }
            }
            if (str.charAt(i) + "" == ")") {
                if (str.charAt(i - 1) + "" != "*" && str.charAt(i - 1) + "" != "/" && str.charAt(i - 1) + "" != "^" && str.charAt(i - 1) + "" != "%" && str.charAt(i - 1) + "" != ")" && str.charAt(i - 1) + "" != "-" && str.charAt(i - 1) + "" != "+"&&str.charAt(0)+""!=")") {
                    if (str.charAt(i + 1) + "" == "*" || str.charAt(i + 1) + "" == "/" || str.charAt(i + 1) + "" == "^" || str.charAt(i + 1) + "" == "%" || str.charAt(i + 1) + "" == "+" || str.charAt(i+1) + "" == "-") {
                        count2++;
                    }
                }
            }

        }
        System.out.println(count1);
        System.out.println(count2);
        if (count1==count2){
            System.out.println("Biểu thức hợp lệ.");
        }
        else {
            System.out.println("Biểu thức không hợp lệ.");
        }
    }

}
