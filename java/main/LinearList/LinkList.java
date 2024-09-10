package LinearList;

import java.util.LinkedList;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/10 14:03
 */
//后续换成泛型
public class LinkList {
    private int data;
    public static LinkList head=null;
    private LinkList next;
    public LinkList(){
        this.data = 0;
        this.next = null;
    }
    public LinkList(int data){
        this.data = data;
        this.next = null;
    }
    public LinkList(int data,LinkList next){
        this.data = data;
        this.next = next;
    }
    public void setData(int data){
        this.data = data;
    }
    public static void insertTailNode(int data){
        if(head == null){
            head = new LinkList(data);
            return;
        }
        LinkList temp = LinkList.head;
        while (temp.next != null){
            temp= temp.next;
        }
        temp.next = new LinkList(data);
    }
    public static void insertHeadNode(int data){
        if(head == null){
            head = new LinkList(data);
            return;
        }
        LinkList temp = LinkList.head;
        head=new LinkList(data,temp);
    }
    public static boolean insertNode(int data,int index){
        if(index < 0 || index >getLength(head)){
            System.out.println("索引越界");
            return false;
        }
        //没有头结点，所以如果要插入第一个节点，则直接将head指向新的节点即可
        if(index==0){
            LinkList newNode = new LinkList(data);
            newNode.next = head;
            head = newNode;
            return true;
        }
        LinkList temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        LinkList newNode = new LinkList(data);
        newNode.next = temp.next;
        temp.next = newNode;
        return true;
    }
    public static LinkList getNode(int index){
        if(index < 0 || index >getLength(head)){
            System.out.println("索引越界");
            return null;
        }
        LinkList temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        System.out.println("当前索引为"+index+"的数据为："+temp.data);
        return temp;
    }
    public static LinkList locateData(int data) {
        int index=0;
        LinkList temp = head;
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
    public static int getLength(LinkList head) {
        LinkList temp = head;

        int length=0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public static boolean deleteNode(int index){
        if(index < 0 || index >getLength(head)){
            System.out.println("索引越界");
            return false;
        }
        if(index==0){
            head = head.next;
            return true;
        }
        LinkList temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return true;
    }
    public static void printData(){
        LinkList temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    // 初始化链表
    public static boolean initLinkList(LinkList head) {
        // 初始化头结点
        //head=new LinkList();
        // 初始化链表为空
        head=null;
        return true;
    }

}
