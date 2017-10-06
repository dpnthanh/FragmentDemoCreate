package com.project.my.thanh.nhat.pham.dang.fragmentdemocreate;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by nhth1 on 05-Oct-17.
 */

public class FragmentLeft extends Fragment {

    Button btn1, btn2;
    EditText edtName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, null);

        btn1 = (Button) view.findViewById(R.id.Button_Print_Fragment_Left);
        btn2 = (Button) view.findViewById(R.id.Button_ChangeFragment_Left);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentRight fragmentRight = (FragmentRight) fragmentManager.findFragmentById(R.id.Fragment_Right);
                fragmentRight.textViewname.setText(edtName.getText().toString());

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), Main2Activity.class);
                startActivity(intent);
            }
        });

        edtName = (EditText) view.findViewById(R.id.EditText_name_Fagment_Left);

        return view;
    }

//    @Override
//    public void onClick(View view) {
//
//        switch (view.getId()){
//            case R.id.Button_Print_Fragment_Left:
//
//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                FragmentRight fragmentRight = (FragmentRight) fragmentManager.findFragmentById(R.id.Fragment_Right);
//                fragmentRight.textViewname.setText(edtName.getText().toString());
//
//                break;
//            case R.id.Button_ChangeFragment_Left:
//
//                Intent intent = new Intent(getActivity().getApplication(), Main2Activity.class);
//                startActivity(intent);
//
//                break;
//        }
//    }
}
