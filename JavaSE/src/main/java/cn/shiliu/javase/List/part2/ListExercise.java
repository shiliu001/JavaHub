package cn.shiliu.javase.List.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List集合练习
 */
public class ListExercise {
    /**
     * 添加10个以上的元素（比如String “hello"），在2号位置插入一个元素”韩顺平教育“，
     * 获得第五个元素，删除第六个元素，修改第七个元素，在使用迭代器遍历集合
     * 要求：使用List的实现类ArrayList完成，
     */
    public static void main(String[] args) {
        //以及和的形式添加值
//        List list = new ArrayList();
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//        list.add("ddd");
//        list.add("eee");
//        list.add("qqq");
//        list.add("www");
//        list.add("eee");
//        list.add("yyy");
//        list.add("iii");
        //以循环的方式去添加值
        List list = new ArrayList();
        for (int i = 0;i<12;i++){
            list.add("hello"+i);
        }
        System.out.println("list="+list);

        //2号位置插入一个元素"韩顺平教育"
        list.add(2,"韩顺平教育");
        System.out.println("list="+list);

        //获得第五个元素
        System.out.println("获得第五个元素"+list.get(4));

        //删除第六个元素
        list.remove(5);
        System.out.println("list="+list);
        //修改第七个元素
        list.set(6,"三国演义");
        System.out.println("list="+list);
        //迭代器和for循环遍历集合
        //迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj="+obj);
        }
        //增强for循环
        for (Object obj :list) {
            System.out.println("pbj="+obj);
        }
    }
}
