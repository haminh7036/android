package com.haminh.app.ui.main;

import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.Fragment;

import com.haminh.app.Book;
import com.haminh.app.BookAdapter;
import com.haminh.app.GioHangAdapter;
import com.haminh.app.R;
import androidx.lifecycle.ViewModelProviders;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.haminh.app.MainActivity;

public class HienThiSach extends Fragment implements AdapterView.OnItemClickListener {
    public ArrayList<Book> books = new ArrayList<>();

    View root;
    private PageViewModel pageViewModel;

    public HienThiSach(ArrayList<Book> books) {
        this.books=books;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        root = inflater.inflate(R.layout.sanpham, container, false);
        //BookAdapter adapter = new BookAdapter(this,books);
        GridView gridView=(GridView) root.findViewById(R.id.gvSach);

        gridView.setAdapter(new BookAdapter(this.getContext(),books));
        gridView.setOnItemClickListener(this);
        return root;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        //books.get(position).soLuong=books.get(position).soLuong+1;
        books.get(position).soLuong++;
        GridView gridView=(GridView) root.findViewById(R.id.gvSach);
        TextView soLuong=gridView.findViewById(R.id.tvSoLuong);
        soLuong.setText(Integer.toString(books.get(position).soLuong));

        //gridView.setAdapter(new BookAdapter(this.getContext(),books));
    }
    /*public interface frInterface{
        void sendData(int soLuong);
    }*/


//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
//
//    }
}
