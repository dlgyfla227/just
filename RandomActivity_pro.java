package com.example.fooddiary3.random;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fooddiary3.R;

import java.util.Random;

public class RandomActivity_pro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randomfood);

        random_food();

        Button another = (Button) findViewById(R.id.another);
        another.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random_food();
            }
        });
        //star_car
        Button choose = (Button) findViewById(R.id.choose);
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button previous = (Button) findViewById(R.id.btn_previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void random_food(){
        //랜덤 함수 생성
        final Random rand = new Random();
        // 앱 실행시 서버 아이콘 랜덤 생성
        final int[] server_ico = {R.drawable.pro_almond, R.drawable.pro_beef,
                R.drawable.pro_broccoli , R.drawable.pro_cheese, R.drawable.pro_chicken,
                R.drawable.pro_duck, R.drawable.pro_egg , R.drawable.pro_mackerel,
                R.drawable.pro_milk, R.drawable.pro_peanut, R.drawable.pro_salmon ,
                R.drawable.pro_shrimp, R.drawable.pro_soybean, R.drawable.pro_tofu};

        int server_num = rand.nextInt(server_ico.length);

        final ImageView server_img = (ImageView)findViewById(R.id.foodimage);

        server_img.setBackgroundResource(server_ico[server_num]);

        //서버아이콘과 서버 이름 매칭시키는 소스코드
        final TextView server_text1 = (TextView)findViewById(R.id.foodname);
        final TextView server_text2 = (TextView)findViewById(R.id.information);

        if(server_ico[server_num] == R.drawable.pro_soybean){
            server_text1.setText("대두");
            server_text2.setText("100g당 34g");}
        else if (server_ico[server_num] == R.drawable.pro_tofu){
            server_text1.setText("두부");
            server_text2.setText("100g당 8g");}
        else if (server_ico[server_num] == R.drawable.pro_shrimp){
            server_text1.setText("새우");
            server_text2.setText("칼로리가 낮으며 오메가-3 지방산이 풍부");}
        else if (server_ico[server_num] == R.drawable.pro_salmon){
            server_text1.setText("연어");
            server_text2.setText("100g당 20g");}
        else if (server_ico[server_num] == R.drawable.pro_peanut){
            server_text1.setText("땅콩");
            server_text2.setText("100g당 26g");}
        else if (server_ico[server_num] == R.drawable.pro_mackerel){
            server_text1.setText("고등어");
            server_text2.setText("오메가-3 지방산,\n" + "심장건강, 뇌기능 향상");}
        else if (server_ico[server_num] == R.drawable.pro_egg){
            server_text1.setText("달걀");
            server_text2.setText("100g당 11g");}
        else if (server_ico[server_num] == R.drawable.pro_duck){
            server_text1.setText("오리고기");
            server_text2.setText("100g당 18g");}
        else if (server_ico[server_num] == R.drawable.pro_chicken){
            server_text1.setText("닭가슴살");
            server_text2.setText("100g당 35g");}
        else if (server_ico[server_num] == R.drawable.pro_cheese){
            server_text1.setText("치즈");
            server_text2.setText("");}
        else if (server_ico[server_num] == R.drawable.pro_broccoli){
            server_text1.setText("브로콜리");
            server_text2.setText("");}
        else if (server_ico[server_num] == R.drawable.pro_beef){
            server_text1.setText("소등심");
            server_text2.setText("100g당 21g");}
        else if (server_ico[server_num] == R.drawable.pro_almond){
            server_text1.setText("아몬드");
            server_text2.setText("100g당 23g");}
        else if (server_ico[server_num] == R.drawable.pro_milk){
            server_text1.setText("우유");
            server_text2.setText("");}
    }
}