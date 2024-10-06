package LinearList;

import org.junit.jupiter.api.Test;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/11 11:06
 */
class SingleLinkedListImplTest {

    @Test
    void test(){
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedListImpl<Integer>();
        singleLinkedList.insertHeadNode(1);
        singleLinkedList.insertHeadNode(2);
        singleLinkedList.insertTailNode(3);
        System.out.println(singleLinkedList.getLength());
        singleLinkedList.printData();
        singleLinkedList.deleteNode(2);
        singleLinkedList.printData();
        singleLinkedList.insertNode(4,1);
        singleLinkedList.printData();
        singleLinkedList.getNode(1);
        singleLinkedList.locateData(4);

    }
}