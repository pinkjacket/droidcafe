package pinkjacket.localcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;

public class ContactActivity extends AppCompatActivity {
    @BindView(R.id.contactEditText) EditText contactEditText;
    @BindView(R.id.submitButton) Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String feedback = contactEditText.getText().toString();
                Intent intent = new Intent(ContactActivity.this, FeedbackActivity.class);
                intent.putExtra("feedback", feedback);
                startActivity(intent);
            }
        });

    }
}
