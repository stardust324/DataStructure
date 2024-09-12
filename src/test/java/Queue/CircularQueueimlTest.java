package Queue;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 21:19
 */
class CircularQueueimlTest {
    @org.junit.jupiter.api.Test
    void test() {
        CircularQueue<Integer> queue=new CircularQueueiml<>();
        for(int i=0;i<=50;i++){
            queue.push(i);
        }
        queue.printData();
        System.out.println(queue.pop());
        queue.printData();
        System.out.println(queue.peek());
        queue.printData();
        System.out.println(queue.getLength());
        System.out.println(queue.push(49));
        queue.printData();
        System.out.println(queue.isEmpty());
        queue.clear();
        queue.printData();
        System.out.println(queue.isEmpty());

    }

}