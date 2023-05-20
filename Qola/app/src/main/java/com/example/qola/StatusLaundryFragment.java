package com.example.qola;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class StatusLaundryFragment extends Fragment {

    ImageView back;
    CardView diambil, dicuci, disetrika, diantar;
    Button kembali;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status_laundry, container, false);

        back = view.findViewById(R.id.iv_back_status_laundry);
        kembali = view.findViewById(R.id.btn_kembali_status);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_statusLaundryFragment_to_homeScreenFragment);
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_statusLaundryFragment_to_statusFragment);
            }
        });

        return view;
    }
}