package Queue;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 15:31
 */
public interface SeqQueue <T>{
    boolean clear();
    int getLength();
    boolean isEmpty();
    T peek();
    T pop();
    void printData();
    boolean push(T data);
}
