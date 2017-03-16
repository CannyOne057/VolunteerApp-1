package com.example.cc_3.volunteerapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

/**
 * Created by CC-3 on 3/13/2017.
 */

public class CommunityFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_community, container, false);
        MainActivity activity = (MainActivity) getActivity();
        DatabaseReference myRef = activity.mDatabase.getReference("community-service");
        return rootView;
    }
}
