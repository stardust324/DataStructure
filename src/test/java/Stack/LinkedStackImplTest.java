package Stack;

import org.junit.jupiter.api.Test;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 14:49
 */
class LinkedStackImplTest {
    @Test
    void test() {
        LinkedStack<Integer> stack = new LinkedStackImpl<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printData();
        System.out.println("读栈顶元素"+stack.peek());
        stack.printData();
        System.out.println("取栈顶元素"+stack.pop());
        stack.printData();
        System.out.println("长度"+stack.getLength());
        stack.clear();
        stack.printData();
    }

}