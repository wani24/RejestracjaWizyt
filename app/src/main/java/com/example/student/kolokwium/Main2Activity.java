package com.example.student.kolokwium;

/**
 * Created by student on 2018-01-17.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recView;
    String lekarzeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setLayoutManager(layoutManager);

        final ArrayList<Lekarze> lekarze = new ArrayList<>();

        lekarze.add(new Lekarze("Jan","Kowalski","dermatolog" ));
        lekarze.add(new Lekarze("Andrzej","Nijaki","dermatolog" ));
        lekarze.add(new Lekarze("Jozin","Zbazin","dermatolog" ));
        lekarze.add(new Lekarze("Adolf","Stalin","dermatolog" ));




        OnClickPlace listener = new OnClickPlace() {
                @Override
                public void onClickPlace(View view, int position) {
                    lekarzeText = lekarze.get(position).getNazwisko();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("CoffeeName", lekarzeText);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }


       };

        LekarzeAdapter lekarzeAdapter = new LekarzeAdapter(lekarze, listener );
        recView.setAdapter(lekarzeAdapter);

    }
}