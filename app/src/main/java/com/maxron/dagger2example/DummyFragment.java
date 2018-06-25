package com.maxron.dagger2example;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerFragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DummyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DummyFragment extends DaggerFragment {

    private static final String TAG = DummyFragment.class.getSimpleName();
    @BindView(R.id.display)
    TextView display;
    Unbinder unbinder;

    @Inject Car mCar;

    public DummyFragment() {
        // Required empty public constructor
    }

    public static DummyFragment newInstance() {
        DummyFragment fragment = new DummyFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dummy, container, false);
        unbinder = ButterKnife.bind(this, view);
        Log.d(TAG, "onCreateView: Car brand: " + mCar.getBrand());
        display.setText(mCar.getBrand());
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
