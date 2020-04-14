package com.example.tabbedapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTabConnect#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTabConnect extends Fragment {

    private TextView textStatus;
    private RecyclerView recyclerView;

    public FragmentTabConnect() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentTabConnect newInstance() {
        return new FragmentTabConnect();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_tab_connect, container, false);
        textStatus = view.findViewById(R.id.textViewConnectStatus);
        textStatus.setText("Status of sensor reads");

        recyclerView = view.findViewById(R.id.recyclerViewDevices);
        recyclerView.setAdapter(new FragmentTabConnectAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
