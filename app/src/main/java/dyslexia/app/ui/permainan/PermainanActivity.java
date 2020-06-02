package dyslexia.app.ui.permainan;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import dyslexia.app.ui.feature.MenuActivity;
import dyslexia.app.R;
import dyslexia.app.ui.permainan.alphabetSpeech.AlphabetSpeechActivity;
import dyslexia.app.ui.permainan.kuis.KuisActivity;
import dyslexia.app.ui.permainan.susunAlfabet.UppercaseActivity;

public class PermainanActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan);

        CardView speech = findViewById(R.id.speechAlphabet);
        speech.setOnClickListener(view -> {
            startActivity(new Intent(PermainanActivity.this, AlphabetSpeechActivity.class));
        });

        CardView kuis = findViewById(R.id.kuis);
        kuis.setOnClickListener(view -> {
            startActivity(new Intent(PermainanActivity.this, KuisActivity.class));
        });


        CardView alfabet = findViewById(R.id.susunabjad);
        alfabet.setOnClickListener(view -> {
            startActivity(new Intent(PermainanActivity.this, UppercaseActivity.class));
        });

    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
