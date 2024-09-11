package LinearList;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/8 19:40
 */
public class SeqListiml<T> implements SeqList<T> {
    public static int MAX_SIZE = 100;
    private T[] data;
    private int length;
    public SeqListiml(){
        data = (T[]) new Object[MAX_SIZE];
        length = 0;
        System.out.println("初始化默认数组成功");
    }
    public SeqListiml(int size){
        if(size<0){
            data =  (T[]) new Object[MAX_SIZE];
        }else{
            MAX_SIZE+=size;
            data =  (T[]) new Object[MAX_SIZE];
        }
        length = 0;
        System.out.println("初始化数组成功");
    }


    @Override
    public boolean addData(T data){
        if(length >= MAX_SIZE){
            System.out.println("数组已满");
            return false;
        }
        this.data[++length] = data;
        System.out.println("添加数据："+data);
        return true;
    }
    @Override
    public boolean deleteData(int index){
        if(index < 0 || index >length){
            System.out.println("索引越界");
            return false;
        }
        T temp=this.data[index];
        //索引范围0~length-1
        for(int i=index;i<length-1;i++){
            this.data[i] = this.data[i+1];
        }
        length--;
        System.out.println("删除索引为"+index+"的数据为："+temp);
        return true;
    }


    @Override
    public boolean  insertData(T data, int index) {
        //若length的值为5，则数组最大索引为4，可以在索引为5的位置插入数据。
        if(index < 0 || index >  length){
            System.out.println("索引越界");
            return false;
        }
        if(length >= MAX_SIZE){
            System.out.println("数组已满");
            return false;
        }
        for(int end=length;end>index;end--){
            this.data[end]=this.data[end-1];
        }
        this.data[index] = data;
        length++;
        System.out.println("插入索引为"+index+"的数据为："+data);
        return true;
    }


    @Override
    public T getData(int index) {
        if(index < 0 || index >length){
            System.out.println("索引越界");
            return null;
        }
        System.out.println("当前索引为"+index+"的数据为："+data[index]);
        return  data[index];
    }

    @Override
    public int getLength() {
        System.out.println("当前数组长度为："+length);
        return length;
    }

    @Override
    public int locateData(T data) {
        int index=0;
        for(T temp:this.data){
            if(temp==data){
                return index;
            }
            index++;
        }
        System.out.println("未找到数据");
        return -1;
    }
}
