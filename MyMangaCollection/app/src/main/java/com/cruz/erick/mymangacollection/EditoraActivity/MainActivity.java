 package com.cruz.erick.mymangacollection.EditoraActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.cruz.erick.mymangacollection.R;

import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends FragmentActivity {

    FragmentManager fragmentManager;
    String jbclogo = "http://jbchost.com.br/mangasjbc/images/logo-mangasjbc.png" ;
    String newpoplogo="http://www.newpop.com.br/wp-content/themes/newpop2/img/logo.png" ;
    String paninilogo="http://2.bp.blogspot.com/-fEmrg0rJkiI/VYHgJhKnotI/AAAAAAAAEfo/s4PC6JG8HGk/s1600/Logo%2BPanini%2BManga%2Bde%2BPanini%2BComics.jpg";
    String novasampalogo="https://www.editoranovasampa.com.br/image/novasampalogotipo.png" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editora);
        fragmentManager = getSupportFragmentManager();
    }

    public void ativaFragmento1(View view){
        Fragmento1 f1 = new Fragmento1();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.conteudo, f1);
        ft.addToBackStack("f1");
        ft.commit();
        new Downloadlogo().execute(jbclogo);

    }
    public void ativaFragmento2(View view){
        Fragmento2 f2 = new Fragmento2();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.conteudo, f2);
        ft.addToBackStack("f2");
        ft.commit();
        new Downloadlogo().execute(newpoplogo);


    }
    public void ativaFragmento3(View view){
        Fragmento3 f3 = new Fragmento3();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.conteudo, f3);
        ft.addToBackStack("f3");
        ft.commit();
        ImageView imagem = (ImageView) findViewById(R.id.logo);
        new Downloadlogo().execute(paninilogo);


    }
    public void ativaFragmento4(View view){
        Fragmento4 f4 = new Fragmento4();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.conteudo, f4);
        ft.addToBackStack("f4");
        ft.commit();
        new Downloadlogo().execute(novasampalogo);


    }
        private class Downloadlogo extends AsyncTask<String, Void, Bitmap> {
            public void onPreExecute() {
                Toast.makeText(MainActivity.this, "Iniciando Download da Imagem", Toast.LENGTH_SHORT).show();
            }

            public Bitmap doInBackground(String... param) {
                try {
                    URL url1 = new URL(param[0]);
                    HttpURLConnection httpClient = (HttpURLConnection) url1.openConnection();
                    Bitmap figura = null;
                    if (httpClient.getResponseCode() == HttpURLConnection.HTTP_OK) {
                        figura = BitmapFactory.decodeStream(httpClient.getInputStream());
                    }
                    httpClient.disconnect();
                    return figura;
                } catch (Exception ex) {
                    Log.d("DOWNLOADDAIMAGE", ex.getMessage());
                }
                return null;
            }

            public void onPostExecute(Bitmap result) {
                if (result == null) {
                    Toast.makeText(MainActivity.this, "Erro ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Download concluido", Toast.LENGTH_SHORT).show();
                    ImageView imagem = (ImageView) findViewById(R.id.logo);
                    imagem.setImageBitmap(result);
                }

            }
        }



}

