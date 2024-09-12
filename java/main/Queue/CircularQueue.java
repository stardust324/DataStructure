package Queue;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 16:47
 */
public interface CircularQueue <T>{
    boolean clear();
    int getLength();
    boolean isEmpty();
    T peek();
    T pop();
    void printData();
    boolean push(T data);

}
