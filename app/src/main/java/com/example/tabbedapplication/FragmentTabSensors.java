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
 * Use the {@link FragmentTabSensors#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTabSensors extends Fragment {

    TextView textHeader;
    RecyclerView recyclerView;

    public FragmentTabSensors() {
    }

    public static FragmentTabSensors newInstance() {
        return new FragmentTabSensors();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_sensors, container, false);

        textHeader = view.findViewById(R.id.textViewSensorsStatus);
        textHeader.setText("Status of sensor reads");

        recyclerView = view.findViewById(R.id.recyclerViewSensors);
        recyclerView.setAdapter(new FragmentTabSensorsAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
