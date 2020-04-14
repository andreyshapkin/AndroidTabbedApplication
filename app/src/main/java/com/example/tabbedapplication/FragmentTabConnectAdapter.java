package com.example.tabbedapplication;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class FragmentTabConnectAdapter extends RecyclerView.Adapter<FragmentTabConnectAdapter.MyViewHolder> {
    private final String TAG = "MYAPP";
    private Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: inflating activity");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_tab_connect_item, parent, false);
        this.context = parent.getContext();
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called " + position);
        holder.textViewDevice.setText("ID_" + position);

        final View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: switch state changed " + String.valueOf(position));
                buttonClicked(position);
            }
        };
        holder.textViewDevice.setOnClickListener(onClickListener);

        if ((position&1) ==0) {
            holder.layout.setBackgroundColor(Color.parseColor("#EFF8F7"));
        } else {
            holder.layout.setBackgroundColor(Color.parseColor("#EEF4EA"));
        }
    }

    public void buttonClicked(final int position) {
        Log.d(TAG, "buttonClicked: " + position);
    }

    @Override
    public int getItemCount() {
        int result = 30;
        Log.d(TAG, "getItemCount: " + result);
        return result;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final String TAG = "MYAPP";

        LinearLayout layout;
        TextView textViewDevice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.d(TAG, "MyViewHolder: creating holder");
            textViewDevice = itemView.findViewById(R.id.textViewConnectItemDevice);
            layout = itemView.findViewById(R.id.layoutConnectItem);
        }
    }
}
