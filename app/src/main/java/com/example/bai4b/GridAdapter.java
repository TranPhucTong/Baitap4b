package com.example.bai4b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    Context context;
    String[] nameSP;
    int[] image1;
    int[] image2;
    String[] giaTien;
    String[] giamgia;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] nameSP, int[] image1){
    this.context = context;
    this.nameSP = nameSP;
    this.image1= image1;
    this.image2=image2;
    this.giaTien=giaTien;
    this.giamgia=giamgia;

    }

    @Override
    public int getCount() {
        return nameSP.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            convertView= inflater.inflate(R.layout.item_gridview,null);
        }
        ImageView imageView = convertView.findViewById(R.id.grid_img);
        TextView textView = convertView.findViewById(R.id.item_text1);
        ImageView imageView1 = convertView.findViewById(R.id.grid_img1);
        TextView textView1 = convertView.findViewById(R.id.gia_tien);
        TextView textView2 = convertView.findViewById(R.id.phan_tram);

        imageView.setImageResource(image1[position]);
        textView.setText(nameSP[position]);

        return convertView;
    }
}
