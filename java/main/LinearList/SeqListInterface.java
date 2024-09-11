package LinearList;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/11 11:53
 */
public interface SeqListInterface<T> {

    boolean addData(T data);
    boolean deleteData(int index);
    T getData(int index);
    int getLength();
    boolean  insertData(T data,int index);
    int locateData(T data);





}
