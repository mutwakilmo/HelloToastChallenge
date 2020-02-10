package com.mutwakilmo.android.hellotoastchallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /**
     * Displays two Buttons and a TextView.
     * - Pressing the TOAST button shows a Toast.
     * - Pressing the COUNT button increases the displayed mCount.
     *
     */

        private int mCount = 0;
        private TextView mShowCount;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mShowCount = (TextView) findViewById(R.id.show_count);
        }

        /*
         * Shows a Toast when the TOAST button is clicked.
         *
         * @param view The view that triggered this onClick handler.
         *             Since a toast always shows on the top,
         *             the passed in view is not used.
         */
        public void showToast(View view) {
            Toast toast = Toast.makeText(this, R.string.toast_message,
                    Toast.LENGTH_SHORT);
            toast.show();
        }

        /*
         * Increments the number in the TextView when the COUNT button is clicked.
         *
         * @param view The view that triggered this onClick handler.
         *             Since the count always appears in the TextView,
         *             the passed in view is not used.
         */
        public void countUp(View view) {
            mCount++;
            if (mShowCount != null)
                mShowCount.setText(Integer.toString(mCount));
        }
}
