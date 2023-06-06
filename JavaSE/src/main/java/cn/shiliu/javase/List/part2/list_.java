package cn.shiliu.javase.List.part2;

import java.util.ArrayList;
import java.util.List;

public class list_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //1. list集合类中元素有序（即添加元素的顺序和取出元素的顺序一致）、且可重复【案例】
        ArrayList list = new ArrayList();
        list.add("shiliu");
        list.add("tom");
        list.add("shiliu001");
        list.add("shiliu002");
        System.out.println("list="+list);

        //2.list集合中的每个元素都有其对应的顺序索引，即支持索引
        //tips：索引是从0开始的
        System.out.println(list.get(3));

        //3.

    }
}
