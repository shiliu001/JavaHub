package cn.shiliu.javase.List.part1.list2;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection方法
 */
public class CollectionMecthod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList<>();
        //1. add方法：添加单个元素 (单列集合）
        list.add("shiliu");
        list.add("10");
        list.add(true);
        System.out.println("list=" + list);

        //2. remove方法：删除指定的元素
        //list.remove(0);//删除集合中的第一个元素
        list.remove(true);//删除某个指定的元素
        System.out.println("list=" + list);

        //3.contains方法：查找元素是否存在   输出值为true/false。
        System.out.println(list.contains("jack"));

        //4.size：获取元素的个数
        System.out.println(list.size());

        //5.isEmpty:判断是否为空   输出值为true/false。
        System.out.println(list.isEmpty());

        //6.clear:清楚集合中的所有元素
        list.clear();
        System.out.println("list=" + list);

        //7.addAll方法：添加多个元素(将一个元素里面的方法添加到另一个元素里面）
        ArrayList list2 = new ArrayList<>();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list=" + list);

        //8.containsAll:删除多个元素
        System.out.println(list.containsAll(list2));

        //9.removeAll:删除多个元素
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println("list=" + list);
    }
}
