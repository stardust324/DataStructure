package LinearList;

import org.junit.jupiter.api.Test;

/**
 * @Description
 * @Author 尘
 * @Date 2024/9/11 11:28
 */
class SeqListImplTest {

    @Test
    void test(){
        SeqList<Integer> SeqList= new SeqListImpl<>();
        for(int i=0;i<10;i++){
            SeqList.addData(i);
        }
        SeqList.getData(5);
        SeqList.getLength();
        SeqList.deleteData(5);
        SeqList.getLength();



    }

}