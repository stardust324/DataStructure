package String;

/**
 * @Description
 * @Author 尘
 * @Date 2024/10/6 22:31
 */
public class SStringImpl implements SString {
    char[] ch=new char[MAX_LENGTH];
    int length;

    SStringImpl(){
        length=0;
    }

    SStringImpl(char[] ch){
        System.arraycopy(ch, 0, this.ch, 0, ch.length);
        length=ch.length;
    }
    @Override
    public char[] strAssign() {
        char[] chars = new char[length];
        if (length > 0) {
            System.arraycopy(ch, 0, chars, 0, length);
        }
        return chars;
    }


    @Override
    public SStringImpl subString( int pos, int len) {
        if (pos>=0&&pos<=length&&len>=0&&pos+len<=length) {
            SStringImpl t=new SStringImpl();
            System.arraycopy(ch, pos, t.ch, 0, len);
            t.length=len;
            return t;
        }
        return null;
    }


    @Override
    public boolean clearString() {
        length = 0;
        ch=new char[MAX_LENGTH];
        return true;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public SStringImpl strCopy() {
        char[] chars = strAssign();
        return new SStringImpl(chars);
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }

}
