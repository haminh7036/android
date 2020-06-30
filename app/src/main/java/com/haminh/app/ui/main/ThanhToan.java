package com.haminh.app.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.haminh.app.Book;
import com.haminh.app.R;

import java.util.ArrayList;

public class ThanhToan extends Fragment implements View.OnClickListener {
    public ArrayList<Book> books = new ArrayList<>();
    View root;
    EditText etHoTen,etDiaChi,etSdt;
    TextView tvTongTien;
    Button btnThanhToan;
    int tongTien=0;
    public ThanhToan(ArrayList<Book>books){
        this.books=books;
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        root=inflater.inflate(R.layout.bill,container,false);
        etDiaChi=(EditText) root.findViewById(R.id.etDiaChi);
        etHoTen=(EditText) root.findViewById(R.id.etHoTen);
        etSdt=(EditText) root.findViewById(R.id.etSoDT);
        tvTongTien=(TextView) root.findViewById(R.id.tvTongTien);
        btnThanhToan=(Button) root.findViewById(R.id.btnThanhToan);
        btnThanhToan.setOnClickListener(this);
        if(tongTien!=0)
            tongTien=0;
        for (Book book:books
             ) {
            if(book.soLuong>0){
                int S=book.soLuong*book.giaTien;

                tongTien+=S;
            }
        }
        tvTongTien.setText(Integer.toString(tongTien));
        //root.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        if(R.id.btnThanhToan==v.getId()){
            Toast.makeText(getContext(),"Đã đặt hàng",Toast.LENGTH_LONG).show();
        }
        tvTongTien.setText(Integer.toString(tongTien));
    }
}
