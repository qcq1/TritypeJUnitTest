package cn.wxl475.tritypejunittest;
import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        TritypMutantOne tri1 = new TritypMutantOne();
        TritypMutantTwo tri2 = new TritypMutantTwo();
        assertEquals(4, tri.Triang(1, 1, 2));
        assertEquals(2, tri1.Triang(2, 2, 3));
        assertEquals(2, tri2.Triang(2, 2, 3));
    }
}