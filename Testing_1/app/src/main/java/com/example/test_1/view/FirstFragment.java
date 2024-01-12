package com.example.test_1.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.test_1.R;
import com.google.android.material.textfield.TextInputEditText;


public class FirstFragment extends Fragment {

    Button btn;
    TextInputEditText txtn;

    int flag=0;

    LottieAnimationView toggle1;
    LottieAnimationView toggle2;

    Button signUp;

    public FirstFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        btn = view.findViewById(R.id.bu1);

        //toggle1 button
        toggle1 =view.findViewById(R.id.toggle1);
        toggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeState(toggle1);
            }
        });

        //toggle2 button

        toggle2 =view.findViewById(R.id.toggle2);
        toggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeState(toggle2);
            }
        });

        // button toast

        signUp=view.findViewById(R.id.bu2);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastPopup("SignIN Successful");
                log("but1","To loginf and toast",null);
            }
        });

        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn.setOnClickListener(v -> onGoToSecond());
    }


    private void onGoToSecond() {
        txtn = getView().findViewById(R.id.namein);
        String name_value = String.valueOf(txtn.getText());
        FirstFragmentDirections.ToSecondAction action = FirstFragmentDirections.toSecondAction();
        action.setNameArg(name_value);
        Navigation.findNavController(btn).navigate((NavDirections) action);

    }
    private void changeState(LottieAnimationView toggle) {

        if (flag == 0) {
            toggle.setMinAndMaxProgress(0f, 0.43f); //Here, calculation is done on the basis of start and stop frame divided by the total number of frames
            toggle.playAnimation();
            flag = 1;
        } else {
            toggle.setMinAndMaxProgress(0.5f, 1f);
            toggle.playAnimation();
            flag = 0;
        }
    }

    //toast logic
    private void toastPopup(String msg){
        Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public void log (String tag, String message, Throwable exception) {
        Log.i(tag, message, exception);
    }
}