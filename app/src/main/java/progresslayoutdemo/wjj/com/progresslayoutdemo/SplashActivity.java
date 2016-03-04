package progresslayoutdemo.wjj.com.progresslayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private Handler myHandler = new Handler();
    private Runnable mStartRunnable = new Runnable() {

        @Override
        public void run() {

            Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
            SplashActivity.this.startActivity(mainIntent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().getDecorView().post(new Runnable() {

            @Override
            public void run() {
                myHandler.postDelayed(mStartRunnable, 1000);
            }
        });
    }
}
