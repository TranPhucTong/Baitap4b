package com.example.bai4b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.bai4b.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] capName={"Cáp chuyển từ Cổng USB sang PS2...",
                "Cáp chuyển từ Cổng USB sang PS2...",
                "Cáp chuyển từ Cổng USB sang PS2...",
                "Cáp chuyển từ Cổng USB sang PS2...",
                "Cáp chuyển từ Cổng USB sang PS2...",
                "Cáp chuyển từ Cổng USB sang PS2..."};
        int[] capImages = {R.drawable.giacchuyen_1,
                R.drawable.daynguon_1,
                R.drawable.dauchuyendoipsps2_1,
                R.drawable.dauchuyendoi_1,
                R.drawable.carbusbtops2_1,
                R.drawable.daucam_1,
        };
        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,capName,capImages);
        binding.gridView.setAdapter(gridAdapter);

        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"You Clicked on"+capName[position],Toast.LENGTH_SHORT).show();

            }
        });


    }
}