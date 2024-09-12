package Stack;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 14:18
 */
public interface LinkedStack <T>{
    boolean clear();
    boolean isEmpty();
    T peek();
    T pop();
    void printData();
    boolean push(T data);
    int getLength();
}
