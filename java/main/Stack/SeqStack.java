package Stack;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 12:00
 */
public interface SeqStack<T>{
    boolean isEmpty();
    boolean push(T data);
    T pop();
    //读栈顶元素
    T peek();
    int getLength();
    void printData();
    boolean clear();
    boolean isFull();

}
