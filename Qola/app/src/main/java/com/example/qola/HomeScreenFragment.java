package com.example.qola;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class HomeScreenFragment extends Fragment {

    Button pilihLayanan, statusLaundry;
    ImageView back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_screen, container, false);
        pilihLayanan = view.findViewById(R.id.btn_pilih_layanan);
        statusLaundry = view.findViewById(R.id.btn_status_laundry);
        back = view.findViewById(R.id.iv_back_home_screen);

        pilihLayanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_homeScreenFragment_to_pilihLayananFragment);
            }
        });
        statusLaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_homeScreenFragment_to_statusLaundryFragment);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_homeScreenFragment_to_mainFragment);
            }
        });

        return view;

    }
}