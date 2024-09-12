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

    @Override
    public boolean clear() {
        head=tail=0;
        return true;
    }

    @Override
    public int getLength() {
        return tail-head;
    }

    @Override
    public boolean isEmpty() {
        return head==tail;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return data[head];
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return data[head++];
    }

    @Override
    public void printData() {
        System.out.print("队列中的元素为：");
        int i=head;
        while (i!=tail){
            System.out.print(data[i]+" ");
            i++;
        }
        System.out.println();
    }

    @Override
    public boolean push(T data) {
        if(tail!=MAX_SIZE){
            this.data[tail++]=data;
            return true;
        }else{
            System.out.println("队列已满，无法添加元素");
            return false;
        }

    }
}
