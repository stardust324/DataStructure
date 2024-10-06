package LinearList ;
import LinearList.SingleLinkedListImpl.Node;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/11 12:04
 */
public interface SingleLinkedList<T>{
    boolean deleteNode(int index);
    int getLength();
    Node<T> getNode(int index);
    void insertHeadNode(T data);
    boolean insertNode(T data,int index);
    void insertTailNode(T data);
    Node<T> locateData(T data);
    void printData();
}
