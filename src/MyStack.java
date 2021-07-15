import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5,6,7,8,9};
        Stack<Integer> Stack = new Stack<>();
        for(int i=0;i<Array.length;i++){
            System.out.println(Stack.push(Array[i]));
        }
        for(int i=0;i< Stack.size()+Array.length;i++){
            Array[i] = Stack.pop();
            System.out.println(Array[i]);
        }
    }
}
