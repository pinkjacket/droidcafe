package pinkjacket.localcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;

public class FeedbackActivity extends AppCompatActivity {
    @BindView(R.id.feedbackTextView) TextView feedbackTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Intent intent = getIntent();
        String feedback = intent.getStringExtra("feedback");
        feedbackTextView.setText(feedback);
    }
}
