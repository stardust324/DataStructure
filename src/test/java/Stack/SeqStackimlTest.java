package Stack;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 14:03
 */
class SeqStackimlTest {
    @org.junit.jupiter.api.Test
    void test() {
        SeqStack<Integer> stack = new SeqStackiml<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("读栈顶元素"+stack.peek());
        stack.printData();
        System.out.println("取栈顶元素"+stack.pop());
        stack.printData();
        System.out.println("长度"+stack.getLength());
        stack.clear();
        stack.printData();

    }

}