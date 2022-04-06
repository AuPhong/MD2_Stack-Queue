import java.util.Stack;

public class ReverseElement {
    public static Stack<Integer> reverseInteger(Stack<Integer> stack) {
        Stack<Integer> stack1 = new Stack<>();
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            stack1.push(stack.pop());
        }
        return stack1;
    }

    public static  Stack<String> reverseString(String str) {
        String[] arr = str.split("");
        Stack<String> stack = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            stack.push(arr[i]);
        }
        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        System.out.println(reverseInteger(stack));

        String str = "Phong";
//        String[] arr = str.split("");
//        for (String element:arr) {
//            System.out.println(element);
//        }
        System.out.println(reverseString(str));



    }
}
