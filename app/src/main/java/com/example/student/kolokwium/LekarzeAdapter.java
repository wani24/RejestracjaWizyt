package com.example.student.kolokwium;


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
        holder.setGprzyjec(lekarze.get(position).getGprzyjec());



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

        @BindView(R.id.przyj_l)
        TextView przyj;

        private OnClickPlace listener;



        public ViewHolder(View itemView, OnClickPlace listener) {

            super(itemView);
            ButterKnife.bind(this,itemView);
            this.listener = listener;


        }

        private void setImie (String imie){name.setText(imie);}
        private void setNazwisko(String nazwisko) {cost.setText(nazwisko);}
        private void setGprzyjec(String gprzyjec){przyj.setText(gprzyjec);}


        public void OnClick(View view)
        {
            listener.onClickPlace(view, getAdapterPosition());


        }
    }


}
