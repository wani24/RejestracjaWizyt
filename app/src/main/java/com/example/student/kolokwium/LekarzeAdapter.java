package com.example.student.kolokwium;

/**
 * Created by student on 2018-01-17.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LekarzeAdapter extends RecyclerView.Adapter<LekarzeAdapter.ViewHolder> {

    private ArrayList<Lekarze> lekarze = new ArrayList<>();
    private OnClickPlace listener;

    LekarzeAdapter(ArrayList<Lekarze> lekarze , OnClickPlace listener)
    {
        this.lekarze = lekarze;
        this.listener = listener;


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, null);

        return new ViewHolder(itemLayoutView, listener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setImie(lekarze.get(position).getImie());
        holder.setNazwisko(lekarze.get(position).getNazwisko());
        holder.setSpecjalizacja(lekarze.get(position).getSpecjalizacja());



    }

    @Override
    public int getItemCount() {
        return lekarze.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.imie_l)
        TextView name;

        @BindView(R.id.nazwisko_l)
        TextView cost;

        @BindView(R.id.spec_l)
        TextView spec;

        private OnClickPlace listener;



        public ViewHolder(View itemView, OnClickPlace listener) {

            super(itemView);
            ButterKnife.bind(this,itemView);
            this.listener = listener;


        }

        private void setImie (String imie){name.setText(imie);}
        private void setNazwisko(String nazwisko) {cost.setText(nazwisko);}
        private void setSpecjalizacja(String specjalizacja){spec.setText(specjalizacja);}


        public void OnClick(View view)
        {
            listener.onClickPlace(view, getAdapterPosition());


        }
    }


}
