package com.example.qola;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.chaos.view.PinView;


public class OTPFragment extends Fragment {

    EditText pinView;
    ImageView back;
    Button konfirmasi;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_o_t_p, container, false);
        pinView = view.findViewById(R.id.pin_view);
        back = view.findViewById(R.id.back_otp);
        konfirmasi = view.findViewById(R.id.btn_konfirmasi);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_OTPFragment_to_totalFragment);
            }
        });

        konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pinView.getText().toString().length() == 4) {
                    Toast.makeText(getActivity(), "Berhasil", Toast.LENGTH_SHORT).show();
                    Navigation.findNavController(view).navigate(R.id.action_OTPFragment_to_statusFragment);
                }
                else {
                    Toast.makeText(getActivity(), "Masukkan 4 digit PIN", Toast.LENGTH_SHORT).show();

                }

            }
        });

//        pinView.requestFocus();
//        InputMethodManager inputMethodManager = (InputMethodManager) requireContext().getSystemService(Context.INPUT_METHOD_SERVICE);
//        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,InputMethodManager.HIDE_IMPLICIT_ONLY);
//
//        pinView.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (s.toString().length() == 4) {
//                    Toast.makeText(getContext(), "Working", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

        return view;
    }
}