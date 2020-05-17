package com.cruz.erick.mymangacollection;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

/**
 * Created by erick on 30/07/2016.
 */
public class LogoAnimacao {
    private Bitmap figuras[];
    private int currentImage;
    private int x;
    private int y;
    private int width;
    private int heigth;

    public LogoAnimacao(AssetManager assetManager) {
        try {
            figuras = new Bitmap[3];
            figuras[0] = BitmapFactory.
                    decodeStream(assetManager.open("animacao1.png"));
            figuras[1] = BitmapFactory.
                    decodeStream(assetManager.open("animacao2.png"));
            figuras[2] = BitmapFactory.
                    decodeStream(assetManager.open("animacao3.png"));

            setWidth(figuras[0].getWidth());
            setHeigth(figuras[0].getHeight());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update() {
        currentImage = (currentImage + 1) % figuras.length;

    }

    public void render(Canvas canvas) {
        canvas.drawBitmap(figuras[currentImage], x, y, null);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}