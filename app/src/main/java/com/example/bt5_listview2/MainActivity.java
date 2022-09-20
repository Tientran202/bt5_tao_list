package com.example.bt5_listview2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonAn ;
    ArrayList<monAn> arrayMonAn;
    moanadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        adapter = new moanadapter(this,R.layout.dongmonan,arrayMonAn);

        lvMonAn.setAdapter(adapter);

        lvMonAn.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                xacnhanxoa(i);
                return false;
            }
        });
    }

    public void anhXa(){
        lvMonAn = (ListView) findViewById(R.id.lv_monAn);
        arrayMonAn= new ArrayList<>();
        arrayMonAn.add(new monAn("Bún","Bún xào chua ngọt",R.drawable.bun));
        arrayMonAn.add(new monAn("Hủ tiếu","Hủ tiếu Nam Vang",R.drawable.hutieu));
        arrayMonAn.add(new monAn("Cháo lòng","Cháo lòng bì ",R.drawable.cholong));
        arrayMonAn.add(new monAn("Bánh canh","Bánh canh thập cẩm",R.drawable.banhcanh));
        arrayMonAn.add(new monAn("Mì quảng","Mì quảng gà",R.drawable.miquang));
    }
    private void xacnhanxoa(int xoa){
        AlertDialog.Builder alerdialog = new AlertDialog.Builder(this);
        alerdialog.setTitle("Thông báo");
        alerdialog.setTitle("Bạn muốn xóa "+arrayMonAn.get(xoa).getMota()+" không!!");
        alerdialog.setPositiveButton("Xác nhận xóa", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Đã xóa món "+ arrayMonAn.get(xoa).getTen(), Toast.LENGTH_SHORT).show();
                arrayMonAn.remove(xoa);
                adapter.notifyDataSetChanged();

            }
        });
        alerdialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alerdialog.setIcon(R.mipmap.ic_launcher);
        alerdialog.show();

    }
}