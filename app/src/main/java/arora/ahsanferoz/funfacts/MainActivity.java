package arora.ahsanferoz.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private Colors mColors = new Colors();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFactTextView = (TextView) findViewById(R.id.textview);
        mShowFactButton = (Button) findViewById(R.id.showFactFun);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        mShowFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get the fact
                String fact = mFactBook.getFact();
                mFactTextView.setText(fact);

                //Get the new color
                int color = mColors.getColor();
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        });
    }
}
