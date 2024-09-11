package LinearList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/11 15:04
 */
class DoubleLinkListimlTest {
    @Test
    void test(){
        DoubleLinkList<Integer> linkList = new DoubleLinkListiml<Integer>();
        linkList.insertHeadNode(1);
        linkList.insertHeadNode(2);
        linkList.insertTailNode(3);
        System.out.println(linkList.getLength());
        linkList.printData();
        linkList.deleteNode(2);
        linkList.printData();
        linkList.insertNode(4,1);
        linkList.printData();
        linkList.getNode(1);
        linkList.locateData(4);

    }

}