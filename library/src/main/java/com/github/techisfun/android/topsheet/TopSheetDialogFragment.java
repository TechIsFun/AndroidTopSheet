package com.github.techisfun.android.topsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

/**
 * Created by andrea on 23/08/16.
 */
public class TopSheetDialogFragment extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new TopSheetDialog(getContext(), getTheme());
    }
}
