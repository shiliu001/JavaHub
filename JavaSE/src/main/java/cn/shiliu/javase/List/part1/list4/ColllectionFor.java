package cn.shiliu.javase.List.part1.list4;

import cn.shiliu.javase.List.part1.entity.Book;

import java.util.ArrayList;
import java.util.Collection;

public class ColllectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        //老韩解读：
        //1.适用增强for在Collection集合
        //2.增强for底层其实还是一个迭代器
        //3.增强for可以理解成就是一个简化版本的迭代器遍历
        //4.快捷方式 I
        for (Object book :col) {
            System.out.println("book"+book);
        }
        for (Object o  :col) {

        }

//        //增强for循环也可以直接在数组上面适用
//        int[] nums = {1,10,20,30,40};
//        for (int i : nums) {
//            System.out.println("i="+i);
//        }
    }
}
