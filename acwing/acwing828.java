package javaSE;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class acwing828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            //System.out.println(s);
            if(Objects.equals(s, "push")){
                int k = scanner.nextInt();
                stk.push(k);
            }else if(Objects.equals(s, "pop")){
                stk.pop();
            }else if(Objects.equals(s, "empty")){
                if(stk.empty()){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            } else if (Objects.equals(s, "query")) {
                System.out.println(stk.peek());
            }
        }
    }
}
