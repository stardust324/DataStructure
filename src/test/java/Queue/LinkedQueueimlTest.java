package Queue;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/13 10:53
 */
class LinkedQueueimlTest {
    @org.junit.jupiter.api.Test
    void teast() {
        LinkedQueueiml<Integer> queue=new LinkedQueueiml<>();
        queue.printData();
        assertTrue(queue.isEmpty());
        for(int i=0;i<10;i++){
            queue.push(i);
        }
        queue.printData();
        assertEquals(10,queue.getLength());
        assertFalse(queue.isEmpty());
        assertEquals(0,queue.pop());
        queue.printData();
        assertEquals(1,queue.peek());
        System.out.println("队首队列："+queue.peek());
        queue.clear();
        queue.printData();
    }

}