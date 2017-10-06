package com.project.my.thanh.nhat.pham.dang.fragmentdemocreate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by nhth1 on 06-Oct-17.
 */

public class ChooseFragment extends Fragment{

    Button btn1, btn2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_choose, null);

        btn1 = (Button) view.findViewById(R.id.ButtonFrag1);
        btn2 = (Button) view.findViewById(R.id.ButtonFrag2);

        final FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentLeft fragmentLeft = new FragmentLeft();
                fragmentManager.beginTransaction().replace(R.id.FrameLayout_Main2, fragmentLeft).commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentRight fragmentRight = new FragmentRight();
                fragmentManager.beginTransaction().replace(R.id.FrameLayout_Main2, fragmentRight).commit();
            }
        });

        return view;
    }

}
