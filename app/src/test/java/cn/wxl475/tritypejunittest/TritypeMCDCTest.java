package cn.wxl475.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    // 是否有边小于等于0
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(1, 1, 1));
        assertEquals(4, tri.Triang(0, 1, 1));
        assertEquals(4, tri.Triang(1, 0, 1));
        assertEquals(4, tri.Triang(1, 1, 0));
    }
}