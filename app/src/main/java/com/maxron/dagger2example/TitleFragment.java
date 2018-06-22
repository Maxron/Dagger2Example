package com.maxron.dagger2example;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TitleFragment extends Fragment {

    private static final String TITLE_KEY = "title";
    TextView tv;

    public static TitleFragment getInstance(String title) {
        TitleFragment fragment = new TitleFragment();
        Bundle args = new Bundle();
        args.putString(TITLE_KEY, title);
        fragment.setArguments(args);
        return fragment;
    }

    public TitleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_title, container, false);
        tv = view.findViewById(R.id.tv_text);
        tv.setText(getArguments().getString(TITLE_KEY));
        return view;
    }

}
