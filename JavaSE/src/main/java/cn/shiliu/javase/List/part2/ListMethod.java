package cn.shiliu.javase.List.part2;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings("all")

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("刘备");
        list.add("张三丰");
        list.add("刘备");
        //在index=1的位置插入一个对象
        list.add(1,"sb");
        System.out.println("list="+list);

        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");

        list.addAll(1,list2);
        System.out.println("list="+list);

        //int indexOf(Object obj);返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));//返回2

        //int lastIndexOf(Object obj);返回obj在集合中末次出现的位置
        list.add("刘备");
        System.out.println("list="+list);
        System.out.println(list.lastIndexOf("刘备"));

        //Object  remove(int index)：移除指定的index位置的元素，并返回此元素
        list.remove(0);

        System.out.println("list="+list);

        //Object  set(int index.Object ele)：设置指定index位置的元素为ele
        list.set(1,"玛丽");
        System.out.println("list="+list);

        //List submit（int fromIndex,int toIndex);返回从fromIndex到toIndex位置的子集合
        //注意返回的子集合  fromIndex< = resList <toIndex (左开又闭）
        List resList = list.subList(0, 2);
        System.out.println("resList="+resList);

    }
}
