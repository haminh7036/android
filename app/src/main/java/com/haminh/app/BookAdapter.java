package com.haminh.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {
    //private onBookClickListener mListener;
    public BookAdapter(Context context, ArrayList<Book> books){
        super(context,R.layout.sach,books);
    }




    public View getView(int position, View convertView, ViewGroup parent){
        Book book=getItem(position);
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder=new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.sach,parent,false);
            viewHolder.giaTien=convertView.findViewById(R.id.tvGiaTien);
            viewHolder.hinhAnh=convertView.findViewById(R.id.ivSach);
            viewHolder.tenSach=convertView.findViewById(R.id.tvTenSach);
            viewHolder.soLuong=convertView.findViewById(R.id.tvSoLuong);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) convertView.getTag();
        }
        viewHolder.hinhAnh.setImageResource(book.hinhAnh);
        viewHolder.tenSach.setText(book.tenSach);
        viewHolder.giaTien.setText(Integer.toString(book.giaTien));
        viewHolder.soLuong.setText(Integer.toString(book.soLuong));
        notifyDataSetChanged();
        return convertView;
    }
    private static class ViewHolder{
        ImageView hinhAnh;
        TextView tenSach;
        TextView giaTien;
        TextView soLuong;
    }

}
