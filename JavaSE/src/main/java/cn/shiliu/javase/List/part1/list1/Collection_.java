package cn.shiliu.javase.List.part1.list1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Collection_ {
    @SuppressWarnings("all")//抑制警告错误
    public static void main(String[] args) {
        //笔记
        /**
         * 集合（Collection）
         * 1. 集合主要是两组（单列集合，双列集合）
         * 2.Collection有两个重要的子接口 List Set  他们的实现子类都是单列集合
         * 3.Map接口䣌实现子类是双列集合 存放的是<Ksy Value>
         *集合的框架体系图（两张）背下来
         */

        //单列集合的例子
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        System.out.println("arrayList = "+arrayList);

        //双列集合
        HashMap hashMap = new HashMap();
        hashMap.put("1","beijing");
        hashMap.put("2","shanghai");
        System.out.println("hashMap = "+hashMap);


    }
}
