package Stack;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/12 14:18
 */
public class LinkedStackiml <T> implements LinkedStack<T>{
    private Node<T> top;
    public static class Node<T>{
        private T data;
        private Node<T> next;
        Node(T data,Node<T> next){
            this.data=data;
            this.next=next;
        }
    }
    public LinkedStackiml(){
        top=null;
    }

    @Override
    public boolean clear() {
        top=null;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            return null;
        }else {
            return top.data;
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }else {
            T temp=top.data;
            top=top.next;
            return temp;
        }
    }

    @Override
    public void printData() {
        System.out.print("栈中元素为：");
        Node<T> temp=top;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    @Override
    public boolean push(T data) {
        top= new Node<>(data, top);
        return true;
    }

    @Override
    public int getLength() {
        int length=0;
        Node<T> temp=top;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

}

