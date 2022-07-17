package com.qing.deepinjvm.chapter4.section4_3;

/**
 * -Xmx10m -XX:+UseSerialGC -XX:-UseCompressOops
 * @author guoqf
 * @date 2022/7/16 16:06
 */
public class JHSDB_TestCase {
    static class Test{
        static ObjectHolder staticObj = new ObjectHolder(1, "static");

        ObjectHolder instanceObj = new ObjectHolder(2, "instance");


        void foo() {
            ObjectHolder localObj = new ObjectHolder(3, "local");
            System.out.println("done");

        }
    }


    private static class ObjectHolder{

        private int age;

        private String name;


        public ObjectHolder(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.foo();
    }
}
