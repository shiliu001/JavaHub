package cn.shiliu.javase.List.part1.list3;

import cn.shiliu.javase.List.part1.entity.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *Iterator循环方法
 */
public class CollectionIterator {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
//        System.out.println("col="+col);
//        System.out.println("-------------------------");
//        //遍历集合
//        //1.先得到 col（集合）对应的迭代器
        Iterator iterator = col.iterator();
//        //2.使用while循环进行遍历
//        while(iterator.hasNext()){ //判断集合中是否还有数据
//            //返回下一个元素，类型是Object
//            Object obj = iterator.next();
//            //todo 编译类型必须要搞懂，编译类型是编译类型，运行类型又不一样。 顾名思义  程序在编译时是一种对象，在运行的时候又是另一种对象
//
//            System.out.println("obj="+obj);
//        }
        //写while的一个快捷键  快速生成的快捷键
        //ctrl+j可以显示所有快捷键的快捷键
        // 输入”itit“,回车就行
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj= " + obj);
        }
        //3.当退出while循环后，这是irerator迭代器，指向最后的元素
//        iterator.next();//控制台会报错 报错类型为 NoSuchElementException

        //4.再次遍历，需要重置我们的迭代器的目的 是为了避免报错 NoSuchElementException，
        iterator = col.iterator();
        System.out.println("-------第二次遍历--------");
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj="+obj);
        }
    }
}

