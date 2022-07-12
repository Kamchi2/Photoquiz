package com.example.photoquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class GameFragment extends Fragment {
    String first,second,third,four,level,answer,hintText;
    Button applyBtn, backBtn;
    EditText editText;
    ImageView firstImg,secondImg,thirdImg,fourImg;
    ImageButton hint;
    TextView currentLevel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firstImg = view.findViewById(R.id.firstImg);
        secondImg = view.findViewById(R.id.secondImg);
        thirdImg = view.findViewById(R.id.thirdImg);
        fourImg = view.findViewById(R.id.fourImg);
        currentLevel = view.findViewById(R.id.level);
        hint = view.findViewById(R.id.hintBtn);
        backBtn = view.findViewById(R.id.back);
        applyBtn = view.findViewById(R.id.applyBtn);
        editText = view.findViewById(R.id.answerEdit);

        first = getArguments().getString("first");
        second = getArguments().getString("second");
        third = getArguments().getString("third");
        four = getArguments().getString("four");
        level = getArguments().getString("level");
        hintText = getArguments().getString("hint");
        answer = getArguments().getString("answer");

        currentLevel.setText(level);

        Glide.with(requireContext()).load(first).into(firstImg);
        Glide.with(requireContext()).load(second).into(secondImg);
        Glide.with(requireContext()).load(third).into(thirdImg);
        Glide.with(requireContext()).load(four).into(fourImg);
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(requireContext())
                        .setTitle("Подсказка")
                        .setMessage(hintText)

                        // Specifying a listener allows you to take an action before dismissing the dialog.
                        // The dialog is automatically dismissed when a dialog button is clicked.
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continue with delete operation
                            }
                        })

                        // A null listener allows the button to dismiss the dialog and take no further action.
                        .setNegativeButton(android.R.string.no, null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        });
        applyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().trim().equalsIgnoreCase(answer)) {
                    Toast.makeText(requireContext(), "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(requireContext(), "Неправильно", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}