package com.example.tabbedapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTabMain#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTabMain extends Fragment implements View.OnClickListener{
    private final String TAG = "MYAPP";

    private View view;
    private Button buttonFD;
    private Button buttonFP;
    private Button buttonRD;
    private Button buttonRP;
    private Button buttonS;

    public FragmentTabMain() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentTabMain newInstance() {
        return new FragmentTabMain();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_tab_main, container, false);
        buttonFD = view.findViewById(R.id.buttonMainFD);
        buttonFP = view.findViewById(R.id.buttonMainFP);
        buttonRD = view.findViewById(R.id.buttonMainRD);
        buttonRP = view.findViewById(R.id.buttonMainRP);
        buttonS = view.findViewById(R.id.buttonMainS);

        buttonFD.setOnClickListener(this);
        buttonFP.setOnClickListener(this);
        buttonRD.setOnClickListener(this);
        buttonRP.setOnClickListener(this);
        buttonS.setOnClickListener(this);

        return view;
    }

    private void buttonPressed(int pos) {
        Log.d(TAG, "button pressed " + pos);
        DeviceInfoActivity.show(getContext());
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG,"assignment button clicked");
        switch (view.getId()) {
            case R.id.buttonMainFD: buttonPressed(0);break;
            case R.id.buttonMainFP: buttonPressed(1);break;
            case R.id.buttonMainRD: buttonPressed(2);break;
            case R.id.buttonMainRP: buttonPressed(3);break;
            case R.id.buttonMainS: buttonPressed(4);break;
            default:
                throw new AssertionError("mudak blya");
        }

    }
}
