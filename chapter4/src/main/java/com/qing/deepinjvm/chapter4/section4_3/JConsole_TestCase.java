package com.qing.deepinjvm.chapter4.section4_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoqf
 * @date 2022/7/17 6:38
 */
public class JConsole_TestCase {
    static class OOMObject{
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> objList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            OOMObject oomObject = new OOMObject();
            objList.add(oomObject);
        }
        System.gc();

        System.out.println("==============");
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
