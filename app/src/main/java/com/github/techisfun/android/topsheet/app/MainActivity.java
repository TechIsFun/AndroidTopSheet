package com.github.techisfun.android.topsheet.app;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.github.techisfun.android.topsheet.TopSheetBehavior;
import com.github.techisfun.android.topsheet.TopSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTopSheet(View v) {
        View sheet = findViewById(R.id.top_sheet);
        TopSheetBehavior.from(sheet).setState(TopSheetBehavior.STATE_EXPANDED);
    }

    public void openBottomSheet(View v) {
        View sheet = findViewById(R.id.bottom_sheet);
        BottomSheetBehavior.from(sheet).setState(BottomSheetBehavior.STATE_EXPANDED);
    }

    public void openTopSheetDialog(View view) {
        TopSheetDialog dialog = new TopSheetDialog(this);
        dialog.setContentView(R.layout.sheet_content);
        dialog.show();
    }

    public void openBottomSheetDialog(View view) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.sheet_content);
        bottomSheetDialog.show();
    }
}
