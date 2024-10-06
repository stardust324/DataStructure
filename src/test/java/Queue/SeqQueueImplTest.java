package Queue;

import org.junit.jupiter.api.Test;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 17:33
 */
class SeqQueueImplTest {
    @Test
    void test(){
        SeqQueue<Integer> queue=new SeqQueueImpl<>();
        for(int i = 0; i <=50; i++){
            queue.push(i);
        }
        queue.printData();
        System.out.println("出队："+queue.pop());
        queue.push(50);
        queue.printData();
        System.out.println("读取队首元素："+queue.peek());
        queue.printData();
        System.out.println("队列长度："+queue.getLength());
        queue.clear();
        queue.printData();
        System.out.println(queue.isEmpty());
        queue.push(5);
        queue.printData();
    }

}