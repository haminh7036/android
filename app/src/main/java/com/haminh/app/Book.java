package com.haminh.app;

import java.util.ArrayList;

public class Book {
    public String tenSach;
    public int hinhAnh;
    public int giaTien;
    public int id;
    public int soLuong;
    public Book(int id,String tenSach,int hinhAnh,int giaTien,int soLuong){
        this.giaTien=giaTien;
        this.hinhAnh=hinhAnh;
        this.tenSach=tenSach;
        this.id=id;
        this.soLuong=soLuong;
    }
    public Book(int soLuong){
        this.soLuong=soLuong;
    }
    public Book(){

    }
    public static ArrayList<Book> getData(){
        ArrayList<Book> books=new ArrayList<>();
        int[] ids={0,1,2,3};
        String [] names={"Tận thế nếu không bận, anh cứu chúng em nhé?","Your name","Ngày mai tôi biến mất","Hành trình của Elaina"};
        int[] images={R.drawable.demo,R.drawable.demo2,R.drawable.demo3,R.drawable.demo4};
        int[] costs={70000,50000,60000,85000};
        for (int i=0;i<names.length;i++){
            Book book = new Book(ids[i],names[i],images[i],costs[i],0);
            books.add(book);
        }
        return books;
    }
}
