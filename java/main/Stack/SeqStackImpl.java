package Stack;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 12:03
 */
public class SeqStackImpl<T> implements SeqStack<T>{
    public static int MAX_SIZE=50;
    private T[] data;
    private int top;

    public SeqStackImpl() {
        this(MAX_SIZE);
    }

    public SeqStackImpl(int size) {
        MAX_SIZE = size;
        data = (T[]) new Object[MAX_SIZE];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean push(T data) {
        if (isFull()){
            return false;
        }else {
            this.data[++top] = data;
            return true;
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return data[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }else {
            return data[top];
        }
    }

    @Override
    public int getLength() {
        return top+1;
    }

    @Override
    public void printData() {
        int temp = top;
        System.out.print("栈中元素为：");
        while (temp >= 0) {
            System.out.print(data[temp--] + " ");
        }
        System.out.println();
    }

    @Override
    public boolean clear() {
        top = -1;
        return true;
    }

    @Override
    public boolean isFull() {
        return top == MAX_SIZE-1;
    }
}
