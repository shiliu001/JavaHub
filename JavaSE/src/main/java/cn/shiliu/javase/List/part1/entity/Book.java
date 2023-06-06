package cn.shiliu.javase.List.part1.entity;

/**
 * 书籍类
 */
public class Book {
    //书名
    private String name;
    /**
     * 作者
     */
    private String author;
    /**
     * 价钱
     */
    private double price;

    //构造器
    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //get方法
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    //set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString方法
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

}
