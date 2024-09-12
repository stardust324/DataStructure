package Queue;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 16:48
 */
public class CircularQueueiml <T> implements CircularQueue<T>{

    public static int MAX_SIZE=50;
    private int head;
    private int tail;
    private T[] data;
    CircularQueueiml(){
        this(MAX_SIZE);
    }
    CircularQueueiml(int size) {
        MAX_SIZE=size;
        data=(T[]) new Object[MAX_SIZE];
        head=tail=0;
        size=0;
    }


    @Override
    public boolean clear() {
        head=tail=0;
        return true;
    }

    @Override
    public int getLength() {
        return (tail-head+MAX_SIZE)%MAX_SIZE;
    }

    @Override
    public boolean isEmpty() {
        return head==tail;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            System.out.println("队列为空");
            return null;
        }
        return data[head];
    }

    @Override
    public T pop() {
        if (tail==head){
            System.out.println("队列为空");
            return null;
        }
        T temp=data[head];
        head=(head+1)%MAX_SIZE;
        return temp;
    }

    @Override
    public void printData() {
        int i=head;
        System.out.print("队列元素为：");
        while (i!=tail){
            System.out.print(data[i]+" ");
            i=(i+1)%MAX_SIZE;
        }
        System.out.println();
    }

    @Override
    public boolean push(T data) {
        if ((tail+1)%MAX_SIZE==head){
            System.out.println("队列已满");
            return false;
        }
        this.data[tail]=data;
        tail=(tail+1)%MAX_SIZE;
        return true;
    }
}
