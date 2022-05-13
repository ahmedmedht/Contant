package com.example.session4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.CustomViewHolder> {

    private ArrayList<PixaBayModel> info;
    public interface onclickitemlis{
        void onclicklis(int pos);
    }
    private onclickitemlis mlis;
    public void setitemclick(onclickitemlis lis){
        mlis=lis;
    }
    public CustomRecyclerAdapter(ArrayList<PixaBayModel> info) {
        this.info = info;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recycler_pixabay, parent, false);
        return new CustomViewHolder(view,mlis);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.userName.setText( info.get(position).userName );

    }

    @Override
    public int getItemCount() {
        return info.size();
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView userName ;
        public CustomViewHolder(@NonNull View itemView , onclickitemlis lis) {
            super(itemView);
            userName = itemView.findViewById(R.id.txtUserName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lis!=null && getAdapterPosition()!=RecyclerView.NO_POSITION){
                        lis.onclicklis(getAdapterPosition());
                    }
                }
            });


        }
    }
}