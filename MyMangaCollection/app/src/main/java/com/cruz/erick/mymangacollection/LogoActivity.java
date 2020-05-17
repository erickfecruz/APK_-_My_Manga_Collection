package com.cruz.erick.mymangacollection;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ViewLogo viewLogo = new ViewLogo(this);
        setContentView(viewLogo);
        new SplashThread().start();
    }

    private class SplashThread extends Thread {
        public void run(){
            try{
                Thread.sleep(6000);
                Intent intent = new Intent(LogoActivity.this, MenuActivity.class);
                startActivity(intent);
                LogoActivity.this.finish();

            }
            catch(Exception ex){
                Log.d("THREAD_ACTIVITY","Deu pau nervoso...");
            }
        }
    }
}
