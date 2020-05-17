package com.cruz.erick.mymangacollection.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by root on 05/07/16.
 */
public class MangaDAO implements DAO {

    private MangaBDDataSource dataSource;

    public MangaDAO(Context ctx){
        dataSource = new MangaBDDataSource(ctx,
                                           MangaBDDataSource.DB_NAME,
                                           null,
                                           MangaBDDataSource.DB_VERS);
    }

    @Override
    public void create(Object o) {

    }

    //LER TITULOS

    public String readTit(int i){
        try{
            // defino as colunas que quero recuperar
            String colunas[] = {"titulo"};
            //  vou manipular a versão "read" da minha base
            SQLiteDatabase db = dataSource.getReadableDatabase();

            // preparar a Query e recuperar em um objeto do tipo "cursor"
            Cursor cursor = db.query(false,                       // quero distinct?
                                     MangaBDDataSource.TBL_NAME,  // nome da tabela
                                     colunas,                     // quais colunas retornar?
                                     MangaBDDataSource.ID+" = '"+ i +"'",                        // tem where?
                                     null,                        // parametros do where
                                     null,                        // groupby
                                     null,                        // colunas do having
                                     null,                        // order by
                                     null);                       // limit

            // se houver resultados, já vai pro primeiro registro
            if (cursor.moveToFirst()){
                // crio meu array de retorno
                String titulo = "";

                do{
                    titulo = cursor.getString(0);
                } while (cursor.moveToNext());
                db.close();
                cursor.close();
                return titulo;
            }

        }
        catch(Exception ex){
            Log.d("MANGADAO.READTITULO", ex.getMessage());
        }
        return null;
    }



    //LER AUTORES

    public String readAut(int i){
        try{
            // defino as colunas que quero recuperar
            String colunas[] = {"autor"};
            //  vou manipular a versão "read" da minha base
            SQLiteDatabase db = dataSource.getReadableDatabase();

            // preparar a Query e recuperar em um objeto do tipo "cursor"
            Cursor cursor = db.query(false,                       // quero distinct?
                    MangaBDDataSource.TBL_NAME,  // nome da tabela
                    colunas,                     // quais colunas retornar?
                    MangaBDDataSource.ID+" = '"+ i +"'",                        // tem where?
                    null,                        // parametros do where
                    null,                        // groupby
                    null,                        // colunas do having
                    null,                        // order by
                    null);                       // limit

            // se houver resultados, já vai pro primeiro registro
            if (cursor.moveToFirst()){
                // crio meu array de retorno
                String titulo = "";

                do{
                    titulo = cursor.getString(0);
                } while (cursor.moveToNext());
                db.close();
                cursor.close();
                return titulo;
            }

        }
        catch(Exception ex){
            Log.d("MANGADAO.READAUTOR", ex.getMessage());
        }
        return null;
    }


    //LER EDITORA

    public String readEdi(int i){
        try{
            // defino as colunas que quero recuperar
            String colunas[] = {"editora"};
            //  vou manipular a versão "read" da minha base
            SQLiteDatabase db = dataSource.getReadableDatabase();

            // preparar a Query e recuperar em um objeto do tipo "cursor"
            Cursor cursor = db.query(false,                       // quero distinct?
                    MangaBDDataSource.TBL_NAME,  // nome da tabela
                    colunas,                     // quais colunas retornar?
                    MangaBDDataSource.ID+" = '"+ i +"'",                        // tem where?
                    null,                        // parametros do where
                    null,                        // groupby
                    null,                        // colunas do having
                    null,                        // order by
                    null);                       // limit

            // se houver resultados, já vai pro primeiro registro
            if (cursor.moveToFirst()){
                // crio meu array de retorno
                String titulo = "";

                do{
                    titulo = cursor.getString(0);
                } while (cursor.moveToNext());
                db.close();
                cursor.close();
                return titulo;
            }

        }
        catch(Exception ex){
            Log.d("MANGADAO.READEDITORA", ex.getMessage());
        }
        return null;
    }


    //LER NUMERO DE VOLUMES

    public int readNumVol(int i){
        try{
            // defino as colunas que quero recuperar
            String colunas[] = {"numero_de_volumes"};
            //  vou manipular a versão "read" da minha base
            SQLiteDatabase db = dataSource.getReadableDatabase();

            // preparar a Query e recuperar em um objeto do tipo "cursor"
            Cursor cursor = db.query(false,                       // quero distinct?
                    MangaBDDataSource.TBL_NAME,  // nome da tabela
                    colunas,                     // quais colunas retornar?
                    MangaBDDataSource.ID+" = '"+ i +"'",                        // tem where?
                    null,                        // parametros do where
                    null,                        // groupby
                    null,                        // colunas do having
                    null,                        // order by
                    null);                       // limit

            // se houver resultados, já vai pro primeiro registro
            if (cursor.moveToFirst()){
                // crio meu array de retorno
                int numVol = 0;

                do{
                    numVol = cursor.getInt(0);
                } while (cursor.moveToNext());
                db.close();
                cursor.close();
                return numVol;
            }

        }
        catch(Exception ex){
            Log.d("MANGADAO.READNUMVOL", ex.getMessage());
        }
        return 0;
    }

    //LER VOLUMES COMPRADOS

    public int readVolComp(int i){
        try{
            // defino as colunas que quero recuperar
            String colunas[] = {"volumes_comprados"};
            //  vou manipular a versão "read" da minha base
            SQLiteDatabase db = dataSource.getReadableDatabase();

            // preparar a Query e recuperar em um objeto do tipo "cursor"
            Cursor cursor = db.query(false,                       // quero distinct?
                    MangaBDDataSource.TBL_NAME,  // nome da tabela
                    colunas,                     // quais colunas retornar?
                    MangaBDDataSource.ID+" = '"+ i +"'",                        // tem where?
                    null,                        // parametros do where
                    null,                        // groupby
                    null,                        // colunas do having
                    null,                        // order by
                    null);                       // limit

            // se houver resultados, já vai pro primeiro registro
            if (cursor.moveToFirst()){
                // crio meu array de retorno
                int comVol = 0;

                do{
                    comVol = cursor.getInt(0);
                } while (cursor.moveToNext());
                db.close();
                cursor.close();
                return comVol;
            }

        }
        catch(Exception ex){
            Log.d("MANGADAO.READNUMVOL", ex.getMessage());
        }
        return 0;
    }


    //LER TITULOS

    public int readAtivo(int i){
        try{
            // defino as colunas que quero recuperar
            String colunas[] = {"ativo"};
            //  vou manipular a versão "read" da minha base
            SQLiteDatabase db = dataSource.getReadableDatabase();

            // preparar a Query e recuperar em um objeto do tipo "cursor"
            Cursor cursor = db.query(false,                       // quero distinct?
                    MangaBDDataSource.TBL_NAME,  // nome da tabela
                    colunas,                     // quais colunas retornar?
                    MangaBDDataSource.ID+" = '"+ i +"'",                        // tem where?
                    null,                        // parametros do where
                    null,                        // groupby
                    null,                        // colunas do having
                    null,                        // order by
                    null);                       // limit

            // se houver resultados, já vai pro primeiro registro
            if (cursor.moveToFirst()){
                // crio meu array de retorno
                int ativo = 5;

                do{
                    ativo = cursor.getInt(0);
                } while (cursor.moveToNext());
                db.close();
                cursor.close();
                return ativo;
            }

        }
        catch(Exception ex){
            Log.d("MANGADAO.READATIVO", ex.getMessage());
        }
        return 5;
    }

    public void modificaComprado(int id, int numNovo){
        SQLiteDatabase db = dataSource.getReadableDatabase();
        db.execSQL("UPDATE "+MangaBDDataSource.TBL_NAME+" SET "+MangaBDDataSource.VOLUMES_COMPRADOS+"="+numNovo+" WHERE "+MangaBDDataSource.ID+"="+id);
    }

    public void removeManga(int id){
        SQLiteDatabase db = dataSource.getReadableDatabase();
        db.execSQL("UPDATE "+MangaBDDataSource.TBL_NAME+" SET "+MangaBDDataSource.ATIVO+"="+0+" WHERE "+MangaBDDataSource.ID+"="+id);
    }

    public void insereManga(int id){
        SQLiteDatabase db = dataSource.getReadableDatabase();
        db.execSQL("UPDATE "+MangaBDDataSource.TBL_NAME+" SET "+MangaBDDataSource.ATIVO+"="+1+" WHERE "+MangaBDDataSource.ID+"="+id);
    }

    @Override
    public Object read(Object o) {
        return null;
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void delete(Object o) {

    }


}
