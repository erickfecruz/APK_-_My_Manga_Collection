package com.cruz.erick.mymangacollection;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by erick on 28/07/2016.
 */
public class ViewLogo extends View {
    private float x;
    private float y;
    private Paint paint;
    private AssetManager assetManager;
    private Bitmap logoFundo;
    private LogoAnimacao logotipo;

    public ViewLogo(Context ctx){
        super(ctx);
        paint = new Paint();
        assetManager = ctx.getAssets();
        try {
            logoFundo  = BitmapFactory.decodeStream(assetManager.open("loading_fundo.png"));
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        logotipo = new LogoAnimacao(assetManager);
        logotipo.setX(100);
        logotipo.setY(230);

        RefreshThread thread = new RefreshThread();
        thread.start();

    }

    public void onDraw(Canvas canvas){

        Rect dest = new Rect(0, 0, getWidth(), getHeight());
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        canvas.drawBitmap(logoFundo,null, dest, paint);
        logotipo.render(canvas);

    }

    public void update(){
        logotipo.update();
    }

    private class RefreshThread extends Thread{
        public void run(){
            try{
                while(true){
                    ViewLogo.this.update();
                    ViewLogo.this.postInvalidate();
                    Thread.sleep(80);
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }


}