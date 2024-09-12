package Queue;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 15:31
 */
public class SeqQueueiml<T> implements SeqQueue<T> {
    private T[] data;
    private int head,tail;
    public static int MAX_SIZE=50;
    public SeqQueueiml(){
        data= (T[]) new Object[MAX_SIZE];
        head=tail=0;
    }
    public SeqQueueiml(int size){
        data= (T[]) new Object[size];
        head=tail=0;
    }
}
