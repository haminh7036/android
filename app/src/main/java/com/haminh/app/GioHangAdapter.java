package com.haminh.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.haminh.app.Book;
import com.haminh.app.R;

import java.util.ArrayList;

public class GioHangAdapter extends ArrayAdapter<Book> {
    //Button btnTang,btnGiam;
    private static class ViewHolder{
        TextView tvTenSach,tvSoLuong;
    }

    public GioHangAdapter(Context context, ArrayList<Book> books){
        super(context, R.layout.one_cart,books);
    }
    public View getView (final int position, View convertView, ViewGroup parent){
        Book book=getItem(position);
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.one_cart,parent,false);
            viewHolder.tvSoLuong=(TextView) convertView.findViewById(R.id.tvSoLuong);
            viewHolder.tvTenSach=(TextView) convertView.findViewById(R.id.tvTenSach);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvTenSach.setText(book.tenSach);
        viewHolder.tvSoLuong.setText(Integer.toString(book.soLuong));
        /*btnGiam=convertView.findViewById(R.id.btnGiam);
        btnTang=convertView.findViewById(R.id.btnTang);
        btnTang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book1=getItem(position);
                if(v.getId()==R.id.btnTang){
                    book1.soLuong++;
                    v.setTag(book1);
                }
            }
        });
        btnGiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book1=getItem(position);
                if(v.getId()==R.id.btnGiam){
                    book1.soLuong--;
                    v.setTag(book1);
                }
            }
        });*/

        return convertView;
    }
}
