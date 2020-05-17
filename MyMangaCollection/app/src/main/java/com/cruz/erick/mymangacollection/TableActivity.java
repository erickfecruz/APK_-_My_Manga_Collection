package com.cruz.erick.mymangacollection;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cruz.erick.mymangacollection.DAO.MangaDAO;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meus_mangas_layout);
    }

    public void onStart(){
        super.onStart();

        //TITULOS

        int tit1 = R.id.titManga1;
        int tit2 = R.id.titManga2;
        int tit3 = R.id.titManga3;
        int tit4 = R.id.titManga4;
        int tit5 = R.id.titManga5;
        int tit6 = R.id.titManga6;
        int tit7 = R.id.titManga7;
        int tit8 = R.id.titManga8;
        int tit9 = R.id.titManga9;
        int tit10 = R.id.titManga10;
        int tit11 = R.id.titManga11;
        int tit12 = R.id.titManga12;
        int tit13 = R.id.titManga13;
        int tit14 = R.id.titManga14;
        int tit15 = R.id.titManga15;
        int tit16 = R.id.titManga16;
        int tit17 = R.id.titManga17;
        int tit18 = R.id.titManga18;
        int tit19 = R.id.titManga19;
        int tit20 = R.id.titManga20;
        int tit21 = R.id.titManga21;
        int tit22 = R.id.titManga22;
        int tit23 = R.id.titManga23;
        int tit24 = R.id.titManga24;
        int tit25 = R.id.titManga25;
        int tit26 = R.id.titManga26;
        int tit27 = R.id.titManga27;
        int tit28 = R.id.titManga28;
        int tit29 = R.id.titManga29;
        int tit30 = R.id.titManga30;

        int[] titulo = new int[30];
        titulo[0] = tit1;
        titulo[1] = tit2;
        titulo[2] = tit3;
        titulo[3] = tit4;
        titulo[4] = tit5;
        titulo[5] = tit6;
        titulo[6] = tit7;
        titulo[7] = tit8;
        titulo[8] = tit9;
        titulo[9] = tit10;
        titulo[10] = tit11;
        titulo[11] = tit12;
        titulo[12] = tit13;
        titulo[13] = tit14;
        titulo[14] = tit15;
        titulo[15] = tit16;
        titulo[16] = tit17;
        titulo[17] = tit18;
        titulo[18] = tit19;
        titulo[19] = tit20;
        titulo[20] = tit21;
        titulo[21] = tit22;
        titulo[22] = tit23;
        titulo[23] = tit24;
        titulo[24] = tit25;
        titulo[25] = tit26;
        titulo[26] = tit27;
        titulo[27] = tit28;
        titulo[28] = tit29;
        titulo[29] = tit30;

        //LER TITULOS

        for(int i = 1; i <= 30; i++) {
            TextView titManga = (TextView)findViewById(titulo[i-1]);
            MangaDAO mangaDAO = new MangaDAO(this);
            titManga.setText(mangaDAO.readTit(i));
        }


        //AUTOR

        int aut1 = R.id.autManga1;
        int aut2 = R.id.autManga2;
        int aut3 = R.id.autManga3;
        int aut4 = R.id.autManga4;
        int aut5 = R.id.autManga5;
        int aut6 = R.id.autManga6;
        int aut7 = R.id.autManga7;
        int aut8 = R.id.autManga8;
        int aut9 = R.id.autManga9;
        int aut10 = R.id.autManga10;
        int aut11 = R.id.autManga11;
        int aut12 = R.id.autManga12;
        int aut13 = R.id.autManga13;
        int aut14 = R.id.autManga14;
        int aut15 = R.id.autManga15;
        int aut16 = R.id.autManga16;
        int aut17 = R.id.autManga17;
        int aut18 = R.id.autManga18;
        int aut19 = R.id.autManga19;
        int aut20 = R.id.autManga20;
        int aut21 = R.id.autManga21;
        int aut22 = R.id.autManga22;
        int aut23 = R.id.autManga23;
        int aut24 = R.id.autManga24;
        int aut25 = R.id.autManga25;
        int aut26 = R.id.autManga26;
        int aut27 = R.id.autManga27;
        int aut28 = R.id.autManga28;
        int aut29 = R.id.autManga29;
        int aut30 = R.id.autManga30;

        int[] autor = new int[30];
        autor[0] = aut1;
        autor[1] = aut2;
        autor[2] = aut3;
        autor[3] = aut4;
        autor[4] = aut5;
        autor[5] = aut6;
        autor[6] = aut7;
        autor[7] = aut8;
        autor[8] = aut9;
        autor[9] = aut10;
        autor[10] = aut11;
        autor[11] = aut12;
        autor[12] = aut13;
        autor[13] = aut14;
        autor[14] = aut15;
        autor[15] = aut16;
        autor[16] = aut17;
        autor[17] = aut18;
        autor[18] = aut19;
        autor[19] = aut20;
        autor[20] = aut21;
        autor[21] = aut22;
        autor[22] = aut23;
        autor[23] = aut24;
        autor[24] = aut25;
        autor[25] = aut26;
        autor[26] = aut27;
        autor[27] = aut28;
        autor[28] = aut29;
        autor[29] = aut30;

        //LER TITULOS

        for(int i = 1; i <= 30; i++) {
            TextView autManga = (TextView)findViewById(autor[i-1]);
            MangaDAO mangaDAO = new MangaDAO(this);
            autManga.setText(mangaDAO.readAut(i));
        }


        //EDITORA

        int edi1 = R.id.ediManga1;
        int edi2 = R.id.ediManga2;
        int edi3 = R.id.ediManga3;
        int edi4 = R.id.ediManga4;
        int edi5 = R.id.ediManga5;
        int edi6 = R.id.ediManga6;
        int edi7 = R.id.ediManga7;
        int edi8 = R.id.ediManga8;
        int edi9 = R.id.ediManga9;
        int edi10 = R.id.ediManga10;
        int edi11 = R.id.ediManga11;
        int edi12 = R.id.ediManga12;
        int edi13 = R.id.ediManga13;
        int edi14 = R.id.ediManga14;
        int edi15 = R.id.ediManga15;
        int edi16 = R.id.ediManga16;
        int edi17 = R.id.ediManga17;
        int edi18 = R.id.ediManga18;
        int edi19 = R.id.ediManga19;
        int edi20 = R.id.ediManga20;
        int edi21 = R.id.ediManga21;
        int edi22 = R.id.ediManga22;
        int edi23 = R.id.ediManga23;
        int edi24 = R.id.ediManga24;
        int edi25 = R.id.ediManga25;
        int edi26 = R.id.ediManga26;
        int edi27 = R.id.ediManga27;
        int edi28 = R.id.ediManga28;
        int edi29 = R.id.ediManga29;
        int edi30 = R.id.ediManga30;

        int[] edito = new int[30];
        edito[0] = edi1;
        edito[1] = edi2;
        edito[2] = edi3;
        edito[3] = edi4;
        edito[4] = edi5;
        edito[5] = edi6;
        edito[6] = edi7;
        edito[7] = edi8;
        edito[8] = edi9;
        edito[9] = edi10;
        edito[10] = edi11;
        edito[11] = edi12;
        edito[12] = edi13;
        edito[13] = edi14;
        edito[14] = edi15;
        edito[15] = edi16;
        edito[16] = edi17;
        edito[17] = edi18;
        edito[18] = edi19;
        edito[19] = edi20;
        edito[20] = edi21;
        edito[21] = edi22;
        edito[22] = edi23;
        edito[23] = edi24;
        edito[24] = edi25;
        edito[25] = edi26;
        edito[26] = edi27;
        edito[27] = edi28;
        edito[28] = edi29;
        edito[29] = edi30;

        //LER EDITORA

        for(int i = 1; i <= 30; i++) {
            TextView ediManga = (TextView)findViewById(edito[i-1]);
            MangaDAO mangaDAO = new MangaDAO(this);
            ediManga.setText(mangaDAO.readEdi(i));
        }


        //NUMERO VOLUMES

        int nvol1 = R.id.nTot1;
        int nvol2 = R.id.nTot2;
        int nvol3 = R.id.nTot3;
        int nvol4 = R.id.nTot4;
        int nvol5 = R.id.nTot5;
        int nvol6 = R.id.nTot6;
        int nvol7 = R.id.nTot7;
        int nvol8 = R.id.nTot8;
        int nvol9 = R.id.nTot9;
        int nvol10 = R.id.nTot10;
        int nvol11 = R.id.nTot11;
        int nvol12 = R.id.nTot12;
        int nvol13 = R.id.nTot13;
        int nvol14 = R.id.nTot14;
        int nvol15 = R.id.nTot15;
        int nvol16 = R.id.nTot16;
        int nvol17 = R.id.nTot17;
        int nvol18 = R.id.nTot18;
        int nvol19 = R.id.nTot19;
        int nvol20 = R.id.nTot20;
        int nvol21 = R.id.nTot21;
        int nvol22 = R.id.nTot22;
        int nvol23 = R.id.nTot23;
        int nvol24 = R.id.nTot24;
        int nvol25 = R.id.nTot25;
        int nvol26 = R.id.nTot26;
        int nvol27 = R.id.nTot27;
        int nvol28 = R.id.nTot28;
        int nvol29 = R.id.nTot29;
        int nvol30 = R.id.nTot30;

        int[] nv = new int[30];
        nv[0] = nvol1;
        nv[1] = nvol2;
        nv[2] = nvol3;
        nv[3] = nvol4;
        nv[4] = nvol5;
        nv[5] = nvol6;
        nv[6] = nvol7;
        nv[7] = nvol8;
        nv[8] = nvol9;
        nv[9] = nvol10;
        nv[10] = nvol11;
        nv[11] = nvol12;
        nv[12] = nvol13;
        nv[13] = nvol14;
        nv[14] = nvol15;
        nv[15] = nvol16;
        nv[16] = nvol17;
        nv[17] = nvol18;
        nv[18] = nvol19;
        nv[19] = nvol20;
        nv[20] = nvol21;
        nv[21] = nvol22;
        nv[22] = nvol23;
        nv[23] = nvol24;
        nv[24] = nvol25;
        nv[25] = nvol26;
        nv[26] = nvol27;
        nv[27] = nvol28;
        nv[28] = nvol29;
        nv[29] = nvol30;

        //LER NUMERO VOLUMES

        for(int i = 1; i <= 30; i++) {
            TextView numeVol = (TextView)findViewById(nv[i-1]);
            MangaDAO mangaDAO = new MangaDAO(this);
            numeVol.setText(Integer.toString(mangaDAO.readNumVol(i)));
        }

        //VOLUMES Comprado

        int cvol1 = R.id.meusVol1;
        int cvol2 = R.id.meusVol2;
        int cvol3 = R.id.meusVol3;
        int cvol4 = R.id.meusVol4;
        int cvol5 = R.id.meusVol5;
        int cvol6 = R.id.meusVol6;
        int cvol7 = R.id.meusVol7;
        int cvol8 = R.id.meusVol8;
        int cvol9 = R.id.meusVol9;
        int cvol10 = R.id.meusVol10;
        int cvol11 = R.id.meusVol11;
        int cvol12 = R.id.meusVol12;
        int cvol13 = R.id.meusVol13;
        int cvol14 = R.id.meusVol14;
        int cvol15 = R.id.meusVol15;
        int cvol16 = R.id.meusVol16;
        int cvol17 = R.id.meusVol17;
        int cvol18 = R.id.meusVol18;
        int cvol19 = R.id.meusVol19;
        int cvol20 = R.id.meusVol20;
        int cvol21 = R.id.meusVol21;
        int cvol22 = R.id.meusVol22;
        int cvol23 = R.id.meusVol23;
        int cvol24 = R.id.meusVol24;
        int cvol25 = R.id.meusVol25;
        int cvol26 = R.id.meusVol26;
        int cvol27 = R.id.meusVol27;
        int cvol28 = R.id.meusVol28;
        int cvol29 = R.id.meusVol29;
        int cvol30 = R.id.meusVol30;

        int[] cv = new int[30];
        cv[0] = cvol1;
        cv[1] = cvol2;
        cv[2] = cvol3;
        cv[3] = cvol4;
        cv[4] = cvol5;
        cv[5] = cvol6;
        cv[6] = cvol7;
        cv[7] = cvol8;
        cv[8] = cvol9;
        cv[9] = cvol10;
        cv[10] = cvol11;
        cv[11] = cvol12;
        cv[12] = cvol13;
        cv[13] = cvol14;
        cv[14] = cvol15;
        cv[15] = cvol16;
        cv[16] = cvol17;
        cv[17] = cvol18;
        cv[18] = cvol19;
        cv[19] = cvol20;
        cv[20] = cvol21;
        cv[21] = cvol22;
        cv[22] = cvol23;
        cv[23] = cvol24;
        cv[24] = cvol25;
        cv[25] = cvol26;
        cv[26] = cvol27;
        cv[27] = cvol28;
        cv[28] = cvol29;
        cv[29] = cvol30;

        //LER NUMERO VOLUMES

        for(int i = 1; i <= 30; i++) {
            TextView volComp = (TextView)findViewById(cv[i-1]);
            MangaDAO mangaDAO = new MangaDAO(this);
            volComp.setText(Integer.toString(mangaDAO.readVolComp(i)));
        }


        //APARECE MANGA

        int apm1 = R.id.manga1;        int apm2 = R.id.manga2;        int apm3 = R.id.manga3;        int apm4 = R.id.manga4;        int apm5 = R.id.manga5;
        int apm6 = R.id.manga6;        int apm7 = R.id.manga7;        int apm8 = R.id.manga8;        int apm9 = R.id.manga9;        int apm10 = R.id.manga10;
        int apm11 = R.id.manga11;        int apm12 = R.id.manga12;        int apm13 = R.id.manga13;        int apm14 = R.id.manga14;        int apm15 = R.id.manga15;
        int apm16 = R.id.manga16;        int apm17 = R.id.manga17;        int apm18 = R.id.manga18;        int apm19 = R.id.manga19;        int apm20 = R.id.manga20;
        int apm21 = R.id.manga21;        int apm22 = R.id.manga22;        int apm23 = R.id.manga23;        int apm24 = R.id.manga24;        int apm25 = R.id.manga25;
        int apm26 = R.id.manga26;        int apm27 = R.id.manga27;        int apm28 = R.id.manga28;        int apm29 = R.id.manga29;        int apm30 = R.id.manga30;

        int[] apma = new int[30];
        apma[0] = apm1;        apma[1] = apm2;        apma[2] = apm3;        apma[3] = apm4;        apma[4] = apm5;        apma[5] = apm6;
        apma[6] = apm7;        apma[7] = apm8;        apma[8] = apm9;        apma[9] = apm10;        apma[10] = apm11;        apma[11] = apm12;
        apma[12] = apm13;        apma[13] = apm14;        apma[14] = apm15;        apma[15] = apm16;        apma[16] = apm17;        apma[17] = apm18;
        apma[18] = apm19;        apma[19] = apm20;        apma[20] = apm21;        apma[21] = apm22;        apma[22] = apm23;        apma[23] = apm24;
        apma[24] = apm25;        apma[25] = apm26;        apma[26] = apm27;        apma[27] = apm28;        apma[28] = apm29;        apma[29] = apm30;


        for(int i = 1; i <= 30; i++) {
            RelativeLayout linhai = (RelativeLayout) findViewById(apma[i-1]);
            MangaDAO mangaDAO = new MangaDAO(this);
            int check = mangaDAO.readAtivo(i);
            if (check == 0) linhai.setVisibility(View.GONE);
        }
    }







    //BOTÕES REMOVER
    //////////////////////////
    //////////////////////////

    public void removeMan1(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(1);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga1);
        man.setVisibility(View.GONE);
    }

    public void botaoRem1(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan1();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }
    public void removeMan2(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(2);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga2);
        man.setVisibility(View.GONE);
    }

    public void botaoRem2(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan2();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan3(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(3);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga3);
        man.setVisibility(View.GONE);
    }

    public void botaoRem3(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan3();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }
    public void removeMan4(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(4);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga4);
        man.setVisibility(View.GONE);
    }

    public void botaoRem4(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan4();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }
    public void removeMan5(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(5);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga5);
        man.setVisibility(View.GONE);
    }

    public void botaoRem5(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan5();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan6(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(6);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga6);
        man.setVisibility(View.GONE);
    }

    public void botaoRem6(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan6();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan7(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(7);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga7);
        man.setVisibility(View.GONE);
    }

    public void botaoRem7(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan7();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan8(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(8);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga8);
        man.setVisibility(View.GONE);
    }

    public void botaoRem8(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan8();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan9(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(9);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga9);
        man.setVisibility(View.GONE);
    }

    public void botaoRem9(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan9();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan10(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(10);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga10);
        man.setVisibility(View.GONE);
    }

    public void botaoRem10(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan10();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan11(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(11);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga11);
        man.setVisibility(View.GONE);
    }

    public void botaoRem11(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan11();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan12(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(12);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga12);
        man.setVisibility(View.GONE);
    }

    public void botaoRem12(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan12();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan13(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(13);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga13);
        man.setVisibility(View.GONE);
    }

    public void botaoRem13(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan13();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan14(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(14);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga14);
        man.setVisibility(View.GONE);
    }

    public void botaoRem14(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan14();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan15(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(15);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga15);
        man.setVisibility(View.GONE);
    }

    public void botaoRem15(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan15();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan16(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(16);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga16);
        man.setVisibility(View.GONE);
    }

    public void botaoRem16(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan16();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan17(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(17);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga17);
        man.setVisibility(View.GONE);
    }

    public void botaoRem17(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan17();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan18(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(18);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga18);
        man.setVisibility(View.GONE);
    }

    public void botaoRem18(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan18();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan19(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(19);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga19);
        man.setVisibility(View.GONE);
    }

    public void botaoRem19(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan19();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan20(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(20);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga20);
        man.setVisibility(View.GONE);
    }

    public void botaoRem20(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan20();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan21(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(21);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga21);
        man.setVisibility(View.GONE);
    }

    public void botaoRem21(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan21();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan22(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(22);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga22);
        man.setVisibility(View.GONE);
    }

    public void botaoRem22(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan22();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan23(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(23);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga23);
        man.setVisibility(View.GONE);
    }

    public void botaoRem23(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan23();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan24(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(24);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga24);
        man.setVisibility(View.GONE);
    }

    public void botaoRem24(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan24();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan25(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(25);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga25);
        man.setVisibility(View.GONE);
    }

    public void botaoRem25(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan25();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan26(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(26);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga26);
        man.setVisibility(View.GONE);
    }

    public void botaoRem26(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan26();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan27(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(27);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga27);
        man.setVisibility(View.GONE);
    }

    public void botaoRem27(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan27();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan28(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(28);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga28);
        man.setVisibility(View.GONE);
    }

    public void botaoRem28(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan28();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan29(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(29);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga29);
        man.setVisibility(View.GONE);
    }

    public void botaoRem29(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan29();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }

    public void removeMan30(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.removeManga(30);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga30);
        man.setVisibility(View.GONE);
    }

    public void botaoRem30(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(TableActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja remover esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        removeMan30();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Remover Mangá!!!");
        alert.show();
    }





























    //BOTÕES MAIS
    //////////////////////////
    //////////////////////////

    public void botaoMais1(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol1);
        TextView volMaximo = (TextView)findViewById(R.id.nTot1);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(1, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(1)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais2(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol2);
        TextView volMaximo = (TextView)findViewById(R.id.nTot2);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(2, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(2)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais3(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol3);
        TextView volMaximo = (TextView)findViewById(R.id.nTot3);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(3, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(3)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais4(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol4);
        TextView volMaximo = (TextView)findViewById(R.id.nTot4);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(4, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(4)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais5(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol5);
        TextView volMaximo = (TextView)findViewById(R.id.nTot5);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(5, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(5)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais6(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol6);
        TextView volMaximo = (TextView)findViewById(R.id.nTot6);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(6, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(6)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais7(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol7);
        TextView volMaximo = (TextView)findViewById(R.id.nTot7);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(7, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(7)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais8(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol8);
        TextView volMaximo = (TextView)findViewById(R.id.nTot8);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(8, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(8)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais9(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol9);
        TextView volMaximo = (TextView)findViewById(R.id.nTot9);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(9, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(9)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais10(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol10);
        TextView volMaximo = (TextView)findViewById(R.id.nTot10);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(10, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(10)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais11(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol11);
        TextView volMaximo = (TextView)findViewById(R.id.nTot11);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(11, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(11)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais12(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol12);
        TextView volMaximo = (TextView)findViewById(R.id.nTot12);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(12, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(12)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais13(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol13);
        TextView volMaximo = (TextView)findViewById(R.id.nTot13);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(13, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(13)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais14(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol14);
        TextView volMaximo = (TextView)findViewById(R.id.nTot14);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(14, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(14)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais15(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol15);
        TextView volMaximo = (TextView)findViewById(R.id.nTot15);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(15, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(15)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais16(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol16);
        TextView volMaximo = (TextView)findViewById(R.id.nTot16);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(16, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(16)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais17(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol17);
        TextView volMaximo = (TextView)findViewById(R.id.nTot17);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(17, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(17)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais18(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol18);
        TextView volMaximo = (TextView)findViewById(R.id.nTot18);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(18, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(18)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais19(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol19);
        TextView volMaximo = (TextView)findViewById(R.id.nTot19);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(19, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(19)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais20(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol20);
        TextView volMaximo = (TextView)findViewById(R.id.nTot20);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(20, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(20)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais21(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol21);
        TextView volMaximo = (TextView)findViewById(R.id.nTot21);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(21, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(21)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais22(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol22);
        TextView volMaximo = (TextView)findViewById(R.id.nTot22);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(22, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(22)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais23(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol23);
        TextView volMaximo = (TextView)findViewById(R.id.nTot23);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(23, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(23)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais24(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol24);
        TextView volMaximo = (TextView)findViewById(R.id.nTot24);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(24, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(24)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais25(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol25);
        TextView volMaximo = (TextView)findViewById(R.id.nTot25);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(25, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(25)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais26(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol26);
        TextView volMaximo = (TextView)findViewById(R.id.nTot26);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(26, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(26)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais27(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol27);
        TextView volMaximo = (TextView)findViewById(R.id.nTot27);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(27, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(27)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais28(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol28);
        TextView volMaximo = (TextView)findViewById(R.id.nTot28);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(28, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(28)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais29(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol29);
        TextView volMaximo = (TextView)findViewById(R.id.nTot29);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(29, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(29)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMais30(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol30);
        TextView volMaximo = (TextView)findViewById(R.id.nTot30);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        int numMax = Integer.parseInt(volMaximo.getText().toString());
        numAntigo = numAntigo + 1;
        if (numMax >= numAntigo){
            mangaDAO.modificaComprado(30, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(30)));
        }
        else Toast.makeText(this,"Você já completou sua coleção!", Toast.LENGTH_LONG).show();
    }


























    //BOTAO MENOS
    ////////////////
    ////////////////

    public void botaoMenos1(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol1);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(1, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(1)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos2(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol2);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(2, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(2)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos3(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol3);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(3, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(3)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos4(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol4);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(4, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(4)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos5(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol5);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(5, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(5)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos6(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol6);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(6, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(6)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos7(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol7);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(7, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(7)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos8(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol8);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(8, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(8)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos9(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol9);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(9, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(9)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos10(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol10);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(10, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(10)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos11(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol11);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(11, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(11)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos12(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol12);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(12, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(12)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos13(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol13);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(13, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(13)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos14(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol14);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(14, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(14)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos15(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol15);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(15, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(15)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos16(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol16);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(16, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(16)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos17(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol17);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(17, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(17)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos18(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol18);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(18, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(18)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos19(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol19);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(19, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(19)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos20(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol20);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(20, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(20)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos21(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol21);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(21, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(21)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos22(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol22);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(22, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(22)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos23(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol23);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(23, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(23)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos24(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol24);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(24, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(24)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos25(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol25);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(25, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(25)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos26(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol26);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(26, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(26)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos27(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol27);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(27, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(27)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos28(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol28);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(28, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(28)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos29(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol29);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(29, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(29)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

    public void botaoMenos30(View view){
        TextView numComp = (TextView)findViewById(R.id.meusVol30);
        MangaDAO mangaDAO = new MangaDAO(this);
        int numAntigo = Integer.parseInt(numComp.getText().toString());
        numAntigo = numAntigo - 1;
        if (0 <= numAntigo){
            mangaDAO.modificaComprado(30, numAntigo);
            numComp.setText(Integer.toString(mangaDAO.readVolComp(30)));
        }
        else Toast.makeText(this,"Você não possui nenhum volume desta coleção!", Toast.LENGTH_LONG).show();
    }

}
