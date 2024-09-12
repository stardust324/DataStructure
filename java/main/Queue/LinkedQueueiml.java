package Queue;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 21:39
 */
public class LinkedQueueiml <T> implements LinkedQueue<T>{

    private Node<T> head;
    private Node<T> tail;

    public static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data=data;
            next=null;;
        }
        Node(T data, Node<T> node){
            this.data=data;
            next=node;
        }
    }
    //带头结点
    LinkedQueueiml(){
        head=new Node<>(null);
        tail=head;
    }
    @Override
    public boolean clear() {
        tail=head;
        return true;
    }

    @Override
    public int getLength() {
        if(head!=tail){
            return tail.next.data==null?0:getLength()+1;
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            return null;
        }else {
            return head.next.data;
        }
    }
    @Override
    public T pop() {
        if(isEmpty()){
            return null;
        }
        Node<T> p=head.next;
        head.next=p.next;
        if(tail==p){
            tail=head;
        }
        return p.data;
    }

    @Override
    public void printData() {
        Node<T> p=head.next;
        while (p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
    }

    @Override
    public boolean push(T data) {
        tail.next=new Node<>(data);
        tail=tail.next;
        return true;
    }



}
