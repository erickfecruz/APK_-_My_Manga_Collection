package com.cruz.erick.mymangacollection;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cruz.erick.mymangacollection.DAO.MangaDAO;

public class InserirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inserir_layout);
    }

    public void onStart() {
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

        for (int i = 1; i <= 30; i++) {
            TextView titManga = (TextView) findViewById(titulo[i - 1]);
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

        for (int i = 1; i <= 30; i++) {
            TextView autManga = (TextView) findViewById(autor[i - 1]);
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

        for (int i = 1; i <= 30; i++) {
            TextView ediManga = (TextView) findViewById(edito[i - 1]);
            MangaDAO mangaDAO = new MangaDAO(this);
            ediManga.setText(mangaDAO.readEdi(i));
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
            if (check == 1) linhai.setVisibility(View.GONE);
        }

    }








    //BOTÕES INSERIR
    //////////////////////////
    //////////////////////////

    public void insereMan1(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(1);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga1);
        man.setVisibility(View.GONE);
    }

    public void botaoIns1(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan1();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }
    public void insereMan2(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(2);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga2);
        man.setVisibility(View.GONE);
    }

    public void botaoIns2(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan2();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan3(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(3);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga3);
        man.setVisibility(View.GONE);
    }

    public void botaoIns3(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan3();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }
    public void insereMan4(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(4);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga4);
        man.setVisibility(View.GONE);
    }

    public void botaoIns4(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan4();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }
    public void insereMan5(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(5);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga5);
        man.setVisibility(View.GONE);
    }

    public void botaoIns5(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan5();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan6(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(6);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga6);
        man.setVisibility(View.GONE);
    }

    public void botaoIns6(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan6();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan7(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(7);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga7);
        man.setVisibility(View.GONE);
    }

    public void botaoIns7(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan7();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan8(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(8);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga8);
        man.setVisibility(View.GONE);
    }

    public void botaoIns8(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan8();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan9(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(9);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga9);
        man.setVisibility(View.GONE);
    }

    public void botaoIns9(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan9();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan10(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(10);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga10);
        man.setVisibility(View.GONE);
    }

    public void botaoIns10(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan10();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan11(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(11);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga11);
        man.setVisibility(View.GONE);
    }

    public void botaoIns11(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan11();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan12(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(12);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga12);
        man.setVisibility(View.GONE);
    }

    public void botaoIns12(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan12();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan13(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(13);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga13);
        man.setVisibility(View.GONE);
    }

    public void botaoIns13(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan13();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan14(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(14);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga14);
        man.setVisibility(View.GONE);
    }

    public void botaoIns14(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan14();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan15(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(15);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga15);
        man.setVisibility(View.GONE);
    }

    public void botaoIns15(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan15();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan16(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(16);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga16);
        man.setVisibility(View.GONE);
    }

    public void botaoIns16(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan16();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan17(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(17);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga17);
        man.setVisibility(View.GONE);
    }

    public void botaoIns17(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan17();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan18(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(18);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga18);
        man.setVisibility(View.GONE);
    }

    public void botaoIns18(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan18();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan19(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(19);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga19);
        man.setVisibility(View.GONE);
    }

    public void botaoIns19(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan19();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan20(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(20);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga20);
        man.setVisibility(View.GONE);
    }

    public void botaoIns20(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan20();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan21(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(21);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga21);
        man.setVisibility(View.GONE);
    }

    public void botaoIns21(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan21();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan22(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(22);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga22);
        man.setVisibility(View.GONE);
    }

    public void botaoIns22(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan22();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan23(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(23);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga23);
        man.setVisibility(View.GONE);
    }

    public void botaoIns23(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan23();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan24(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(24);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga24);
        man.setVisibility(View.GONE);
    }

    public void botaoIns24(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan24();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan25(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(25);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga25);
        man.setVisibility(View.GONE);
    }

    public void botaoIns25(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan25();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan26(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(26);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga26);
        man.setVisibility(View.GONE);
    }

    public void botaoIns26(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan26();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan27(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(27);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga27);
        man.setVisibility(View.GONE);
    }

    public void botaoIns27(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan27();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan28(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(28);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga28);
        man.setVisibility(View.GONE);
    }

    public void botaoIns28(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan28();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan29(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(29);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga29);
        man.setVisibility(View.GONE);
    }

    public void botaoIns29(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan29();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }

    public void insereMan30(){
        MangaDAO mangaDAO = new MangaDAO(this);
        mangaDAO.insereManga(30);
        RelativeLayout man = (RelativeLayout) findViewById(R.id.manga30);
        man.setVisibility(View.GONE);
    }

    public void botaoIns30(View view){

        AlertDialog.Builder a_builder = new AlertDialog.Builder(InserirActivity.this);
        MangaDAO mangaDAO = new MangaDAO(this);
        a_builder.setMessage("Você deseja adicionar esse mangá da sua lista?").setCancelable(false)
                .setPositiveButton("Sim",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        insereMan30();
                    }
                })
                .setNegativeButton("Não",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }) ;
        AlertDialog alert = a_builder.create();
        alert.setTitle("Adicionar Mangá!!!");
        alert.show();
    }





    //BOTAO BUSCA


    public void buscaTitulo(View view){
        EditText buscTit = (EditText)findViewById(R.id.digTitu);
        String checarTitulo = buscTit.getText().toString().toUpperCase();

        //TITULOS

        int tit1 = R.id.titManga1;        int tit2 = R.id.titManga2;        int tit3 = R.id.titManga3;        int tit4 = R.id.titManga4;        int tit5 = R.id.titManga5;
        int tit6 = R.id.titManga6;        int tit7 = R.id.titManga7;        int tit8 = R.id.titManga8;        int tit9 = R.id.titManga9;        int tit10 = R.id.titManga10;
        int tit11 = R.id.titManga11;        int tit12 = R.id.titManga12;        int tit13 = R.id.titManga13;        int tit14 = R.id.titManga14;        int tit15 = R.id.titManga15;
        int tit16 = R.id.titManga16;        int tit17 = R.id.titManga17;        int tit18 = R.id.titManga18;        int tit19 = R.id.titManga19;        int tit20 = R.id.titManga20;
        int tit21 = R.id.titManga21;        int tit22 = R.id.titManga22;        int tit23 = R.id.titManga23;        int tit24 = R.id.titManga24;        int tit25 = R.id.titManga25;
        int tit26 = R.id.titManga26;        int tit27 = R.id.titManga27;        int tit28 = R.id.titManga28;        int tit29 = R.id.titManga29;        int tit30 = R.id.titManga30;

        int[] titulo = new int[30];
        titulo[0] = tit1;        titulo[1] = tit2;        titulo[2] = tit3;        titulo[3] = tit4;        titulo[4] = tit5;
        titulo[5] = tit6;        titulo[6] = tit7;        titulo[7] = tit8;        titulo[8] = tit9;        titulo[9] = tit10;
        titulo[10] = tit11;        titulo[11] = tit12;        titulo[12] = tit13;        titulo[13] = tit14;        titulo[14] = tit15;
        titulo[15] = tit16;        titulo[16] = tit17;        titulo[17] = tit18;        titulo[18] = tit19;        titulo[19] = tit20;
        titulo[20] = tit21;        titulo[21] = tit22;        titulo[22] = tit23;        titulo[23] = tit24;        titulo[24] = tit25;
        titulo[25] = tit26;        titulo[26] = tit27;        titulo[27] = tit28;        titulo[28] = tit29;        titulo[29] = tit30;

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
            TextView titManga = (TextView)findViewById(titulo[i-1]);
            String checarTitulo2 = titManga.getText().toString().toUpperCase();
            if (!checarTitulo.equals(checarTitulo2)){
                RelativeLayout linhai = (RelativeLayout) findViewById(apma[i-1]);
                linhai.setVisibility(View.GONE);
            }
        }
    }



    public void buscaAutor(View view){
        EditText buscAut = (EditText)findViewById(R.id.digiAut);
        String checarAutor = buscAut.getText().toString().toUpperCase();

        int aut1 = R.id.autManga1;        int aut2 = R.id.autManga2;        int aut3 = R.id.autManga3;        int aut4 = R.id.autManga4;        int aut5 = R.id.autManga5;
        int aut6 = R.id.autManga6;        int aut7 = R.id.autManga7;        int aut8 = R.id.autManga8;        int aut9 = R.id.autManga9;        int aut10 = R.id.autManga10;
        int aut11 = R.id.autManga11;        int aut12 = R.id.autManga12;        int aut13 = R.id.autManga13;        int aut14 = R.id.autManga14;        int aut15 = R.id.autManga15;
        int aut16 = R.id.autManga16;        int aut17 = R.id.autManga17;        int aut18 = R.id.autManga18;        int aut19 = R.id.autManga19;        int aut20 = R.id.autManga20;
        int aut21 = R.id.autManga21;        int aut22 = R.id.autManga22;        int aut23 = R.id.autManga23;        int aut24 = R.id.autManga24;        int aut25 = R.id.autManga25;
        int aut26 = R.id.autManga26;        int aut27 = R.id.autManga27;        int aut28 = R.id.autManga28;        int aut29 = R.id.autManga29;        int aut30 = R.id.autManga30;

        int[] autor = new int[30];
        autor[0] = aut1;        autor[1] = aut2;        autor[2] = aut3;        autor[3] = aut4;        autor[4] = aut5;
        autor[5] = aut6;        autor[6] = aut7;        autor[7] = aut8;        autor[8] = aut9;        autor[9] = aut10;
        autor[10] = aut11;        autor[11] = aut12;        autor[12] = aut13;        autor[13] = aut14;        autor[14] = aut15;
        autor[15] = aut16;        autor[16] = aut17;        autor[17] = aut18;        autor[18] = aut19;        autor[19] = aut20;
        autor[20] = aut21;        autor[21] = aut22;        autor[22] = aut23;        autor[23] = aut24;        autor[24] = aut25;
        autor[25] = aut26;        autor[26] = aut27;        autor[27] = aut28;        autor[28] = aut29;        autor[29] = aut30;

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
            TextView autManga = (TextView)findViewById(autor[i-1]);
            String checarAutor2 = autManga.getText().toString().toUpperCase();
            if (!checarAutor.equals(checarAutor2)){
                RelativeLayout linhai = (RelativeLayout) findViewById(apma[i-1]);
                linhai.setVisibility(View.GONE);
            }
        }
    }





    public void buscaEditora(View view){
        EditText buscEdi = (EditText)findViewById(R.id.digiEdi);
        String checarEditora = buscEdi.getText().toString().toUpperCase();

        int edi1 = R.id.ediManga1;        int edi2 = R.id.ediManga2;        int edi3 = R.id.ediManga3;        int edi4 = R.id.ediManga4;        int edi5 = R.id.ediManga5;
        int edi6 = R.id.ediManga6;        int edi7 = R.id.ediManga7;        int edi8 = R.id.ediManga8;        int edi9 = R.id.ediManga9;        int edi10 = R.id.ediManga10;
        int edi11 = R.id.ediManga11;        int edi12 = R.id.ediManga12;        int edi13 = R.id.ediManga13;        int edi14 = R.id.ediManga14;        int edi15 = R.id.ediManga15;
        int edi16 = R.id.ediManga16;        int edi17 = R.id.ediManga17;        int edi18 = R.id.ediManga18;        int edi19 = R.id.ediManga19;        int edi20 = R.id.ediManga20;
        int edi21 = R.id.ediManga21;        int edi22 = R.id.ediManga22;        int edi23 = R.id.ediManga23;        int edi24 = R.id.ediManga24;        int edi25 = R.id.ediManga25;
        int edi26 = R.id.ediManga26;        int edi27 = R.id.ediManga27;        int edi28 = R.id.ediManga28;        int edi29 = R.id.ediManga29;        int edi30 = R.id.ediManga30;

        int[] edito = new int[30];

        edito[0] = edi1;        edito[1] = edi2;        edito[2] = edi3;        edito[3] = edi4;        edito[4] = edi5;
        edito[5] = edi6;        edito[6] = edi7;        edito[7] = edi8;        edito[8] = edi9;        edito[9] = edi10;
        edito[10] = edi11;        edito[11] = edi12;        edito[12] = edi13;        edito[13] = edi14;        edito[14] = edi15;
        edito[15] = edi16;        edito[16] = edi17;        edito[17] = edi18;        edito[18] = edi19;        edito[19] = edi20;
        edito[20] = edi21;        edito[21] = edi22;        edito[22] = edi23;        edito[23] = edi24;        edito[24] = edi25;
        edito[25] = edi26;        edito[26] = edi27;        edito[27] = edi28;        edito[28] = edi29;        edito[29] = edi30;

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
            TextView ediManga = (TextView)findViewById(edito[i-1]);
            String checarEditora2 = ediManga.getText().toString().toUpperCase();
            if (!checarEditora.equals(checarEditora2)){
                RelativeLayout linhai = (RelativeLayout) findViewById(apma[i-1]);
                linhai.setVisibility(View.GONE);
            }
        }
    }
}
