package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Hạ còn vương nắng ", "Đạt Kaa", R.raw.haconvuongnangdatkaakido));
        arrayList.add(new Music("Người mình thương không thương mình", "Minh Anh Quân Idol", R.raw.nguoiminhthuongkhongthuongminhanhquanidol));
        arrayList.add(new Music("Lệ duyên tình", "K-ICM, Long Nón Lá", R.raw.leduyentinhkatmlongnonla));
        arrayList.add(new Music("Sắp 30", "Trịnh Đình Quang", R.raw.sap30trinhdinhquang));
        arrayList.add(new Music("Anh thề đấy", "Thanh Hưng", R.raw.anhthedaythanhhung));
        arrayList.add(new Music("Chỉ là không cùng nhau Live Version", "Tăng Phúc, Trương Thảo Nhi", R.raw.chilakhongcungnhautangphuctruongthaonhi));
        arrayList.add(new Music("Răng khôn", "Phí Phương Anh, RIN9", R.raw.rangkhonphiphuonganhrin9));
        arrayList.add(new Music("Khi em lớn", "Orange, Hoàng Dũng", R.raw.khiemlonorangehoangdung));
        arrayList.add(new Music("Vách ngọc ngà", "Anh Rồng, Phan Ann", R.raw.vachngocnganewversiong5rsquadphanann));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    } }
