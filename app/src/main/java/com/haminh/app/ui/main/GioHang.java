package com.haminh.app.ui.main;
import com.haminh.app.Book;
import com.haminh.app.BookAdapter;
import com.haminh.app.GioHangAdapter;
import com.haminh.app.R;
import com.haminh.app.ui.main.HienThiSach;

import android.os.Bundle;
import android.util.EventLog;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class GioHang extends Fragment  {
    ListView lvGioHang;
    //Button btnTang,btnGiam;
    View root;
    public ArrayList<Book> books= new ArrayList<>();
    public GioHang(ArrayList<Book> books) {
        this.books=books;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        root = inflater.inflate(R.layout.gio_hang, container, false);
        lvGioHang = (ListView) root.findViewById(R.id.lvGioHang);
        lvGioHang.setAdapter(new GioHangAdapter(this.getContext(),books));
        lvGioHang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                lvGioHang = (ListView) root.findViewById(R.id.lvGioHang);
                lvGioHang.setAdapter(new GioHangAdapter(getContext(),books));
            }
        });
        return root;
    }

}

