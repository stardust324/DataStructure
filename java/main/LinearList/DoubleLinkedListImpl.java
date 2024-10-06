package LinearList;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/11 10:43
 */
public class DoubleLinkedListImpl<T> implements DoubleLinkedList<T> {

    private Node<T> head;
    public static class Node<T>{
        private T data;
        private Node<T> prior;
        private Node<T> next;
        Node(T data,Node<T> prior,Node<T> next){
            this.data = data;
            this.prior= prior;
            this.next = next;
        }
        Node(T data){
            this.data = data;
            this.prior= null;
            this.next = null;
        }
    }
    public DoubleLinkedListImpl(){
        //不带头结点
        head =null;
    }
    @Override
    public  void insertTailNode(T data){
        if(head == null){
            head = new Node<T>(data);
            return;
        }
        Node<T> temp = head;
        while (temp.next != null){
            temp= temp.next;
        }
        temp.next = new Node<T>(data,temp,null);
    }
    @Override
    public  void insertHeadNode(T data){
        if(head == null){
            head = new Node<T>(data);
            return;
        }
        head.prior=new Node<T>(data,null,head);
        head=head.prior;
    }
    @Override
    public boolean insertNode(T data, int index){
        if(index < 0 || index >getLength()){
            System.out.println("索引越界");
            return false;
        }
        //没有头结点，所以如果要插入第一个节点，则直接将head指向新的节点即可
        if(index==0){
            head.prior=new Node<T>(data,null,head);
            head=head.prior;
            return true;
        }
        Node<T> temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        Node<T> newNode = new Node<>(data,temp,temp.next);
        if(temp.next!=null){
            temp.next.prior = newNode;
        }

        temp.next = newNode;
        return true;
    }
    @Override
    public Node<T> getNode(int index){
        if(index < 0 || index >getLength()){
            System.out.println("索引越界");
            return null;
        }
        Node<T>  temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        System.out.println("当前索引为"+index+"的数据为："+temp.data);
        return temp;
    }
    @Override
    public Node<T> locateData(T data) {
        int index=0;
        Node<T> temp = head;
        while(temp!=null){
            if(temp.data == data){
                System.out.println("当前数据为"+data+"的索引为："+index);
                return temp;
            }
            temp = temp.next;
            index++;
        }

        System.out.println("未找到数据");
        return null;
    }

    @Override
    public int getLength() {
        Node<T>  temp = head;

        int length=0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    @Override
    public boolean deleteNode(int index){
        if(index < 0 || index >getLength()){
            System.out.println("索引越界");
            return false;
        }
        if(index==0){
            head = head.next;
            return true;
        }
        Node<T> temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(temp.next!=null){
            temp.next.prior = temp;
        }
        return true;
    }
    @Override
    public void printData(){
        Node<T> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            if(temp.prior!=null){
                System.out.print("前置结点值为"+temp.prior.data+" ");
            }
            temp = temp.next;
        }
        System.out.println();
    }



}
