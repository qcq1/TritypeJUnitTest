package cn.wxl475.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {
    // 是否有边小于等于0

    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, 1, 1));
        assertEquals(1, tri.Triang(2, 3, 4));
    }

}