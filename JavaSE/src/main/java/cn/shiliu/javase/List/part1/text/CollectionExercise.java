package cn.shiliu.javase.List.part1.text;

import cn.shiliu.javase.List.part1.entity.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 随堂测试
 */
public class CollectionExercise {
    /**
     * 1.创建三个Dog（name,age}对象，放入到ArrayList中，赋值给什么
     * 2.用迭代器和增强for循环两种方式来遍历
     * 3.重写Dog的toString方法，输出name和age
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /**
         * ArrayList dogList = new ArrayList()和List dogList = new ArrayList();
         *的两种写法其实都一样，因为ArrayList接口实现了 List接口，而List接口实现了Collection接口
         * 根据接口的多态的传递规则，ArrayList接口可以付给List引用，也可以赋给而List接口实现了Collection接口来引用。
     * @param args
         */
//        ArrayList dogList = new ArrayList();
        List dogList = new ArrayList();

        dogList.add(new Dog("dahuang",10));
        dogList.add(new Dog("beibei",9));
        //for循环
        for (Object dog : dogList) {
            System.out.println("dog="+dog);
        }
        
        //迭代器
        Iterator i = dogList.iterator();//先通过dogList去拿到一个迭代器
        while (i.hasNext()) {
            Object dog =  i.next();
            System.out.println("dog"+dog);
        }
    }



}
