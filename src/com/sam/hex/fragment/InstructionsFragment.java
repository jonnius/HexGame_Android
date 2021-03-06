package com.sam.hex.fragment;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sam.hex.R;

/**
 * @author Will Harmon
 **/
public class InstructionsFragment extends HexFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_instructions, null);

        TextView title = (TextView) v.findViewById(R.id.title);
        title.setText(R.string.activity_title_instructions);

        TextView rules = (TextView) v.findViewById(R.id.rules);
        rules.setMovementMethod(LinkMovementMethod.getInstance());

        return v;
    }
}
