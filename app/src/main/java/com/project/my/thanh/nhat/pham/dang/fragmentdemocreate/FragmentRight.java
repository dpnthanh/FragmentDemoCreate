package com.project.my.thanh.nhat.pham.dang.fragmentdemocreate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nhth1 on 05-Oct-17.
 */

public class FragmentRight extends Fragment{

    TextView textViewname;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right, null);

        textViewname = (TextView) view.findViewById(R.id.TextView_name_Fragmentn_Right);
        textViewname.setText("Nhat Thanh");

        return view;
    }
}
