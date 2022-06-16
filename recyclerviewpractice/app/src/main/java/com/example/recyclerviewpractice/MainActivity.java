package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainAdapter adapter;                                                                                                // MainAdapter 필드
        RecyclerView recyclerView;                                                                                          // RecyclerView 필드


        ArrayList<MainData> mainData = new ArrayList<>();                                                                   // Maindata arraylist 필드

       for(int i = 1; i<15; i++){                                                                                           // 반복문으로 15개의 리스트 선언
           mainData.add(new MainData(R.drawable.ic_launcher_background, "정승훈", "09월 11일"));               // 배열에 값 추가
       }


        recyclerView = findViewById(R.id.rv);                                                                               // 리사이클러뷰 아이디 연겨ㅕㄹ
        adapter = new MainAdapter(this, mainData);                                                               // 어댑터 연결
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));        // 리니어 레이아웃 매니저로 레이아웃 배치


    }


}