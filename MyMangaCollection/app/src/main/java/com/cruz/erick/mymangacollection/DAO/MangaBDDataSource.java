package com.cruz.erick.mymangacollection.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.cruz.erick.mymangacollection.model.Manga;

/**
 *
 * O OpenHelper é nosso manipulador de bases de dados
 * como ele funciona?
 *
 * 2 métodos
 *
 * onCreate - que define o que será feito inicialmente na
 *            base de dados - em geral colocamos a rotina
 *            de criação das tabelas
 *
 * onUpgrade- que é executado quando uma versão diferente
 *            da base de dados é encontrada previamente
 *            armazenada
 *
 */
public class MangaBDDataSource extends SQLiteOpenHelper {
    public static final String DB_NAME  = "MANGA_DB";
    public static final String TBL_NAME = "tblMangas";
    public static final String ID = "ID";
    public static final String TITULO = "TITULO";
    public static final String AUTOR = "AUTOR";
    public static final String EDITORA = "EDITORA";
    public static final String NUMERO_DE_VOLUMES = "NUMERO_DE_VOLUMES";
    public static final String VOLUMES_COMPRADOS = "VOLUMES_COMPRADOS";
    public static final String ATIVO = "ATIVO";
    public static final int    DB_VERS  = 1;

    public MangaBDDataSource(Context ctx,  // qual aplicação/activity contém o banco
                             String name,  // nome da base
                             SQLiteDatabase.CursorFactory cursor, // opcional - posso criar uma base a partir de dados previos de outras bases/tabelas
                             int version){  // versao do banco de dados
        super(ctx, name, cursor, version);
    }


    // metodo onCreate invocado implicitamente conforme existencia ou não
    // de uma base de dados no dispositivo associado a aplicativo
    public void onCreate(SQLiteDatabase db){
        String SQL = "CREATE TABLE "+TBL_NAME+ " ( " +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "TITULO VARCHAR(100)," +
                "AUTOR VARCHAR(100)," +
                "EDITORA VARCHAR(50)," +
                "NUMERO_DE_VOLUMES INTEGER," +
                "VOLUMES_COMPRADOS INTEGER," +
                "ATIVO INTEGER)" ;

        db.execSQL(SQL);  // executo a instrução SQL para criar a tabela

        Log.d("MANGABDDataSource","Base de dados criada com sucesso!");

        //Agora serao inseridos todos os mangas no banco de dados

        Manga manga = new Manga();
        ContentValues cv = new ContentValues();

        //Manga 1

        manga.setTitulo("Aoharaido");
        manga.setAutor("Sakisaka Io");
        manga.setEditora("Panini");
        manga.setNumVol(13);
        manga.setVolAtual(0);
        manga.setAtivo(0);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 2

        manga.setTitulo("Bleach");
        manga.setAutor("Tite Kubo");
        manga.setEditora("Panini");
        manga.setNumVol(70);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 3

        manga.setTitulo("Dragon Ball");
        manga.setAutor("Akira Toriyama");
        manga.setEditora("Panini");
        manga.setNumVol(42);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 4

        manga.setTitulo("Fate/Stay Night");
        manga.setAutor("TYPE MOON");
        manga.setEditora("Panini");
        manga.setNumVol(20);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 5

        manga.setTitulo("Naruto Gold");
        manga.setAutor("Masashi Kishimoto");
        manga.setEditora("Panini");
        manga.setNumVol(72);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 6

        manga.setTitulo("Nisekoi");
        manga.setAutor("Komi Naoshi");
        manga.setEditora("Panini");
        manga.setNumVol(23);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 7

        manga.setTitulo("One Piece");
        manga.setAutor("Eiichiro Oda");
        manga.setEditora("Panini");
        manga.setNumVol(62);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 8

        manga.setTitulo("Sankarea");
        manga.setAutor("Hattori Mitsuru");
        manga.setEditora("Panini");
        manga.setNumVol(11);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 9

        manga.setTitulo("Ano Hana");
        manga.setAutor("Mitsu Izumi");
        manga.setEditora("JBC");
        manga.setNumVol(3);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 10

        manga.setTitulo("Card Captors Sakura");
        manga.setAutor("CLAMP");
        manga.setEditora("JBC");
        manga.setNumVol(12);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 11

        manga.setTitulo("Code Geass");
        manga.setAutor("Ichirou Ohkouchi");
        manga.setEditora("JBC");
        manga.setNumVol(8);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 12

        manga.setTitulo("Death Note");
        manga.setAutor("Takeshi Obata");
        manga.setEditora("JBC");
        manga.setNumVol(12);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 13

        manga.setTitulo("Fairy Tail");
        manga.setAutor("Hiro Mashima");
        manga.setEditora("JBC");
        manga.setNumVol(53);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 14

        manga.setTitulo("Fullmetal Alchemist");
        manga.setAutor("Hiromu Arakawa");
        manga.setEditora("JBC");
        manga.setNumVol(54);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 15

        manga.setTitulo("Fullmetal Alchemist ESP");
        manga.setAutor("Hiromu Arakawa");
        manga.setEditora("JBC");
        manga.setNumVol(27);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 16

        manga.setTitulo("Sailor Moon");
        manga.setAutor("Naoko Takeuchi");
        manga.setEditora("JBC");
        manga.setNumVol(12);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 17

        manga.setTitulo("Steins Gate");
        manga.setAutor("Yomi Sarachi");
        manga.setEditora("JBC");
        manga.setNumVol(3);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 18

        manga.setTitulo("Neon Genesis Evangelion");
        manga.setAutor("Yoshiyuki Sadamoto");
        manga.setEditora("JBC");
        manga.setNumVol(28);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 19

        manga.setTitulo("The Seven Deadly Sins");
        manga.setAutor("Nakaba Suzuki");
        manga.setEditora("JBC");
        manga.setNumVol(16);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 20

        manga.setTitulo("XXX Holic");
        manga.setAutor("CLAMP");
        manga.setEditora("JBC");
        manga.setNumVol(38);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 21

        manga.setTitulo("5 Centímetros por Segundo");
        manga.setAutor("Makoto Shinkai");
        manga.setEditora("NewPop");
        manga.setNumVol(2);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 22

        manga.setTitulo("Fate/Zero");
        manga.setAutor("Gen Urobuchi");
        manga.setEditora("NewPop");
        manga.setNumVol(6);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 23

        manga.setTitulo("Madoka Magica");
        manga.setAutor("Magica Quartet");
        manga.setEditora("NewPop");
        manga.setNumVol(3);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 24

        manga.setTitulo("No Game No Life");
        manga.setAutor("Yuu Kamiya");
        manga.setEditora("NewPop");
        manga.setNumVol(6);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 25

        manga.setTitulo("Red Garden");
        manga.setAutor("GONZO");
        manga.setEditora("NewPop");
        manga.setNumVol(4);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 26

        manga.setTitulo("Usagi Drop");
        manga.setAutor("Unita Yumi");
        manga.setEditora("NewPop");
        manga.setNumVol(10);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 27

        manga.setTitulo("Ikkitousen");
        manga.setAutor("Yuji Shiozaki");
        manga.setEditora("Nova Sampa");
        manga.setNumVol(12);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 28

        manga.setTitulo("Nightmare Maker");
        manga.setAutor("Cuvie");
        manga.setEditora("Nova Sampa");
        manga.setNumVol(6);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 29

        manga.setTitulo("Tengen Toppa Gurren-Lagann");
        manga.setAutor("Kazuki Nakashima");
        manga.setEditora("Nova Sampa");
        manga.setNumVol(10);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

        //Manga 30

        manga.setTitulo("Old Boy");
        manga.setAutor("Garon Tsuchiya");
        manga.setEditora("Nova Sampa");
        manga.setNumVol(8);

        cv.put("titulo", manga.getTitulo());
        cv.put("autor", manga.getAutor());
        cv.put("editora", manga.getEditora());
        cv.put("numero_de_volumes", manga.getNumVol());
        cv.put("volumes_comprados", manga.getVolAtual());
        cv.put("ativo", manga.getAtivo());

        db.insert(MangaBDDataSource.TBL_NAME, null, cv);

    }

    // este método também é invocado implicitamente e, em sua lógica,
    // deve vir os procedimentos de atualização das versões do banco
    // oldVersion indica a versão que está no dispositivo
    // newVersion indica a versão que será criada
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        //TODO: update code for database update process
    }

}
