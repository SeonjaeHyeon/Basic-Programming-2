// Exercise 7-9

import java.util.Vector;

interface IStack<T> {
    T pop();
    boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
    private Vector<T> data = new Vector<T>();
    
    @Override
    public T pop() {
        if(data.size() == 0) {
            return null;
        }

        return data.remove(data.size() - 1);
    }

    @Override
    public boolean push(T ob) {
        try {
            data.add(ob);
        } catch(Exception e) {
            return false;
        }

        return true;
    }
}

public class ch7exercise9 {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i = 0; i < 10; i++) stack.push(i);  // 10개의 정수 푸시
        while(true) {  // 스택이 빌 때까지 pop
            Integer n = stack.pop();
            if(n == null) break;  // 스택이 빈 경우
            System.out.print(n + " ");
        }
    }
}
