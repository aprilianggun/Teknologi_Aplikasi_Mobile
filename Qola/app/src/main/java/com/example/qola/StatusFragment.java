package com.example.qola;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class StatusFragment extends Fragment {

    ImageView back;
    Button lihatStatus, kembali;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);
        back = view.findViewById(R.id.iv_back_status);
        lihatStatus = view.findViewById(R.id.btn_lihat_status);
        kembali = view.findViewById(R.id.btn_kembali);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_statusFragment_to_OTPFragment);
            }
        });
        lihatStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_statusFragment_to_statusLaundryFragment);
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_statusFragment_to_homeScreenFragment);
            }
        });
        return view;

    }
}