package com.example.tabbedapplication;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class DeviceInfoActivity extends Dialog implements View.OnClickListener {
    private final String TAG = "MYAPP";

    private TextView textViewStatus;
    private Button buttonClose;
    private TextView textViewAction;
    private Button buttonFD;
    private Button buttonFP;
    private Button buttonRD;
    private Button buttonRP;
    private Button buttonS;

    public DeviceInfoActivity(@NonNull Context context) {
        super(context);
    }

    public static DeviceInfoActivity show(Context context) {
        DeviceInfoActivity dialog = new DeviceInfoActivity(context);
        dialog.show();
        dialog.getWindow().setLayout(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
        return dialog;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "creating DeviceInfoActivity");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_device_info);

        textViewStatus = (TextView) findViewById(R.id.textViewDeviceInfoStatus);
        textViewStatus.setText("status\nstatus1\nstatus2");

        textViewAction = findViewById(R.id.textViewDeviceInfoAction);
        textViewAction.setText("action");

        buttonClose = findViewById(R.id.buttonDeviceInfoClose);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        buttonFD = findViewById(R.id.buttonDeviceInfoFD);
        buttonFD.setOnClickListener(this);
        buttonFP = findViewById(R.id.buttonDeviceInfoFP);
        buttonFP.setOnClickListener(this);
        buttonRD = findViewById(R.id.buttonDeviceInfoRD);
        buttonRD.setOnClickListener(this);
        buttonRP = findViewById(R.id.buttonDeviceInfoRP);
        buttonRP.setOnClickListener(this);
        buttonS = findViewById(R.id.buttonDeviceInfoS);
        buttonS.setOnClickListener(this);
    }

    private void buttonPressed(int pos) {
        Log.d(TAG, "button pressed " + pos);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "assignment button clicked");
        switch (view.getId()) {
            case R.id.buttonDeviceInfoFD:
                buttonPressed(0);
                break;
            case R.id.buttonDeviceInfoFP:
                buttonPressed(1);
                break;
            case R.id.buttonDeviceInfoRD:
                buttonPressed(2);
                break;
            case R.id.buttonDeviceInfoRP:
                buttonPressed(3);
                break;
            case R.id.buttonDeviceInfoS:
                buttonPressed(4);
                break;
            default:
                throw new AssertionError("mudak blya");
        }
    }
}

