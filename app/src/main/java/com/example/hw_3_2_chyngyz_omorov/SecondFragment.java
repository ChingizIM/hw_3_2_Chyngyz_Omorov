package com.example.hw_3_2_chyngyz_omorov;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    private TextView value;
    public static final String KEY_FOR_BUNDLE = "key.String";
    private Button plus;

    private String sum ;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        value = view.findViewById(R.id.value_two);

        if (getArguments()!=null) {
            String val = getArguments().getString(FirstFragment.KEY_FOR_BUNDLE);
            value.setText(String.valueOf(val));
        }
        plus = view.findViewById(R.id.plus_two);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(KEY_FOR_BUNDLE, value.getText().toString());

                ThirdFragment thrFragment= new ThirdFragment();
                thrFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, thrFragment).addToBackStack(null).commit();

                value.setText(String.valueOf(sum));

            }
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}