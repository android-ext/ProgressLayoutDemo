package progresslayoutdemo.wjj.com.progresslayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ((TextView) findViewById(R.id.btn_progress_layout)).setOnClickListener(this);
        ((TextView) findViewById(R.id.btn_dialog)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_progress_layout: {

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            }
            case R.id.btn_dialog: {
               showCustomDialog();
                break;
            }

        }
    }

    private void showCustomDialog() {

        AlterDialogFragment dialogFragment = AlterDialogFragment.newInstance("", "");
        dialogFragment.show(getFragmentManager(), "dialogFragment");
    }
}
