package com.example.student.kolokwium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.wybierz_lekarza)
    void OnClick()
    {
        Intent intent = new Intent(this, Main2Activity.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
