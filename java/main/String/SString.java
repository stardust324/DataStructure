package String;

/**
 * @Description
 * @Author 尘
 * @Date 2024/10/6 22:30
 */
public interface SString {
    int MAX_LENGTH = 51;

    /**
     * 赋值给chars
     */
    char[] strAssign();

    SStringImpl strCopy() ;

    int getLength();
    boolean isEmpty();
    boolean clearString();

    static int strCompare(SStringImpl str1, SStringImpl str2) {
        if (str1.length==str2.length) {
            for (int i = 0; i < str1.length; i++) {
                if (str1.ch[i]>str2.ch[i]) {
                    return 1;
                }
                if (str1.ch[i]<str2.ch[i]) {
                    return -1;
                }
            }
            return 0;
        }
        if(str1.length>str2.length){
            return 1;
        }else {
            return -1;
        }
    }

    static SStringImpl concat(SStringImpl str1, SStringImpl str2) {
        char[] chars = new char[str1.length+str2.length];
        if (str1.length > 0) {
            System.arraycopy(str1.ch, 0, chars, 0, str1.length);
        }
        if (str2.length > 0) {
            System.arraycopy(str2.ch, 0, chars, str1.length, str2.length);
        }
        return new SStringImpl(chars);
    }

    SStringImpl subString(int pos,int len);
    static int index(SStringImpl str1,SStringImpl str2) {
        for(int i=0;i<str1.length;i++){
            if(str1.ch[i]==str2.ch[0]){
                for(int j=0;j<str2.length;j++){
                    if(str1.ch[i+j]!=str2.ch[j]){
                        break;
                    }
                    if(j==str2.length-1){
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    void print();
}
