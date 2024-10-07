package String;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description
 * @Author 尘
 * @Date 2024/10/7 22:13
 */
class SStringImplTest {
    @Test
    void test() {
        SStringImpl s = new SStringImpl(new char[]{'a', 'b', 'c'});
        assertEquals(3, s.getLength());
        assertFalse(s.isEmpty());
        char[] chars = s.strAssign();
        System.out.println(Arrays.toString(chars));
        SStringImpl s1 = s.strCopy();
        SStringImpl s2 = s.subString(1, 2);
        s2.print();
        System.out.println(SString.index(s1, s2));
        SStringImpl s3 = SString.concat(s1, s2);
        s3.print();
        System.out.println(SString.strCompare(s1, s2));
        assertTrue(s.clearString());
        assertTrue(s.isEmpty());

    }

}