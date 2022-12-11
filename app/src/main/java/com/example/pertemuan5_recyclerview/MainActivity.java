package com.example.pertemuan5_recyclerview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[], s2[],s3[];
    int images[] =
            {R.drawable.bukualadin,R.drawable.buku100,R.drawable.ensiklopedia,R.drawable.anakbetawi};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.makanan);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.star);
        BukuAdapter appAdapter = new
                BukuAdapter(this,s1,s2,s3,images);
        recyclerView.setAdapter(appAdapter);
        recyclerView.setLayoutManager(new
                LinearLayoutManager(this));
    }
}
