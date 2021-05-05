package com.prateekcode.octproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prateekcode.octproject.R;
import com.prateekcode.octproject.databinding.FragmentTextBinding;


public class TextFragment extends Fragment {

    private FragmentTextBinding binding;

    public TextFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTextBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        String scannedText = getArguments().getString("scanned");
        binding.scannedText.setText(scannedText);

        return view;
    }
}