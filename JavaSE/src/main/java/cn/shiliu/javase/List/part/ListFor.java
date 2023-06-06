package cn.shiliu.javase.List.part;

import java.util.*;

public class ListFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //List 接口的实现子类  Vector LinkedList
//        ArrayList list1 = new ArrayList();
//        List list1 = new Vector();
        List list1 = new LinkedList();
        list1.add("jack");
        list1.add("tom");
        list1.add("123");
        list1.add("322");

        //第一种遍历-迭代器遍历
        System.out.println("--------迭代器遍历------");
        Iterator iteratored = list1.iterator();
        while (iteratored.hasNext()) {
            Object obj1 =  iteratored.next();
            System.out.println(obj1);

        }
        System.out.println("--------增强for循环------");
        //第二种遍历-增强for循环
        for (Object obj2 : list1) {
            System.out.println(obj2);

        }
        System.out.println("--------普通for循环------");
        //第三种 普通for循环
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("对象="+list1.get(i));
        }


    }
}
