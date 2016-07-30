package com.lifeistech.android.jankencamp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //cpuの画像
    ImageView cpu;
    //playerの画像
    ImageView player;
    //結果の文字
    TextView result;
    //ランダムな数字を発生させる
    Random r = new Random();
    //勝敗の表示
    TextView textView2;
    int count1;
    int count2;
    int count3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpu = (ImageView) findViewById(R.id.cpu);
        player = (ImageView) findViewById(R.id.player);
        result = (TextView) findViewById(R.id.result);
        textView2 = (TextView) findViewById(R.id.textView2);
        count1 = 0;
        count2 = 0;
        count3 = 0;
    }

    //グーボタンを押した時
    public void goo(View v) {
        //プレーヤーの手をグーに
        player.setImageResource(R.drawable.goo);

        //0〜2までのランダムの数を取り出す
        int random = r.nextInt(3);

        if (random == 0) {
            //相手の手がグーの時
            cpu.setImageResource(R.drawable.goo);
            result.setText("引き分けです！");
            count3 ++;
        } else if (random == 1) {
            //相手の手がチョキの時
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの勝ちです！");
            count1 ++;
        } else if (random == 2) {
            //相手の手がパーの時
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの負けです！");
            count2 ++;
        }
        textView2.setText(count1 +"勝"+ count2 +"敗"+ count3 +"分け");
    }

    //チョキボタンを押した時
    public void choki(View v) {
        //プレーヤーの手をチョキに
        player.setImageResource(R.drawable.choki);

        //0〜2までのランダムの数を取り出す
        int random = r.nextInt(3);

        if (random == 0) {
            //相手の手がグーの時
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの負けです！");
            count2 ++;
        } else if (random == 1) {
            //相手の手がチョキの時
            cpu.setImageResource(R.drawable.choki);
            result.setText("引き分けです！");
            count3 ++;
        } else if (random == 2) {
            //相手の手がパーの時
            cpu.setImageResource(R.drawable.paa);
            result.setText("あなたの勝ちです！");
            count1 ++;
        }
        textView2.setText(count1 +"勝"+ count2 +"敗"+ count3 +"分け");
    }

    //パーボタンを押した時
    public void paa(View v) {
        //プレーヤーの手をパーに
        player.setImageResource(R.drawable.paa);

        //0〜2までのランダムの数を取り出す
        int random = r.nextInt(3);

        if (random == 0) {
            //相手の手がグーの時
            cpu.setImageResource(R.drawable.goo);
            result.setText("あなたの勝ちです！");
            count1 ++;
        } else if (random == 1) {
            //相手の手がチョキの時
            cpu.setImageResource(R.drawable.choki);
            result.setText("あなたの負けです！");
            count2 ++;
        } else if (random == 2) {
            //相手の手がパーの時
            cpu.setImageResource(R.drawable.paa);
            result.setText("引き分けです！");
            count3 ++;
        }
        textView2.setText(count1 +"勝"+ count2 +"敗"+ count3 +"分け");
    }

}
