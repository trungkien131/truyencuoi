package com.example.truyencuoi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private ArrayList<person> truyentranh;

    public PersonAdapter(Context context, ArrayList<person> list) {
        truyentranh = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivicon;
        TextView tvName;

        // Viewholder này đại diện cho ta đã làm gì trong đối tượng person như thêm ảnh và thêm text vào
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivicon = itemView.findViewById(R.id.ic_icon);
            tvName = itemView.findViewById(R.id.tv_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }


    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1, parent, false);

        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(truyentranh.get(position));

        holder.tvName.setText(truyentranh.get(position).getName());
        holder.ivicon.setImageResource(truyentranh.get(position).getResuorid());
    }


    @Override
    public int getItemCount() {
        return truyentranh.size();
    }
}
//
//
//
//
//
//
// extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
//    ArrayList<person> mlis;
//
//    public void setdata(ArrayList<person> list) {
//        this.mlis = list;
//        notifyDataSetChanged();
//    }
//
//    @NonNull
//    @Override
//    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1, parent, false);
//        return new PersonViewHolder(view);
//    }
//
//
//    @Override
//    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
//        person user = mlis.get(position);
//        holder.img.setImageResource(user.getResuorid());
//        holder.tvname.setText(user.getName());
//
//    }
//
//
//    @Override
//    public int getItemCount() {
//        return mlis.size();
//    }
//
//
//    // giữ 1 vị trí cho ta để ta có thể chuyền dữ liệu vào image và textview
//    public class PersonViewHolder extends RecyclerView.ViewHolder {
//        ImageView img;
//        TextView tvname;
//
//        public PersonViewHolder(@NonNull View itemView) {
//            super(itemView);
//            img = itemView.findViewById(R.id.ic_icon);
//            tvname = itemView.findViewById(R.id.tv_name);
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                }
//            });
//        }
//    }
//
//}
