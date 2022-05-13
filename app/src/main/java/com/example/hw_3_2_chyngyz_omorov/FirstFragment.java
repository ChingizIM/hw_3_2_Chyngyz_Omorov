package com.example.hw_3_2_chyngyz_omorov;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class FirstFragment extends Fragment {
public static final String KEY_FOR_BUNDLE = "key.String";
private Button plus;
private EditText count;
private String sum ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    plus = view.findViewById(R.id.plus);
    count = view.findViewById(R.id.count);


    plus.setOnClickListener(new View.OnClickListener() {

        private Object FirstFragment;

        @Override
        public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(KEY_FOR_BUNDLE, count.getText().toString());

                SecondFragment secFragment= new SecondFragment();
                secFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, secFragment).addToBackStack(null).commit();

                count.setText(String.valueOf(sum));

            //if (count == null)
            
                   // Toast.makeText(<FirstFragment>, "Please long press the key", Toast.LENGTH_LONG ).show();


        }
    });

    }
}