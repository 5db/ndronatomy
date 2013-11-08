package com.ndronatomy.omy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OmyActivity extends Activity {
    public static final String EXTRA_MESSAGE = "com.ndronatomy.omy.Message";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    /**
     * Called when user clicks on the send message button
     *
     * @param view
     */
    public void sendMessage(View view) {

        // Intent Constructor takes 2 parameters:
        //  - Context as its first parameter (this is used because Activity class is subclass  of Context)
        //  - App component to which the system should deliver the Intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }
}
