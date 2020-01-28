package com.example.entities;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.seguridad.cifrar;


public class DBHelper  extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "capacitacionphon.db";

    //public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
    //    super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    //}

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //cifrar ci=new cifrar();
        String aux = ("admin");
        db.execSQL(tables.dbcapacitacion.usr);//tabla usuarios
        db.execSQL(tables.dbcapacitacion.ro);//tabla rol
        db.execSQL(tables.dbcapacitacion.temas);//tabla temas
        db.execSQL(tables.dbcapacitacion.tema_rol);//tabla temas_rol
        //db.execSQL("create table usuarios(codigo integer primary key,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(01,'admin',"+aux+")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //cifrar ci=new cifrar();
        String aux = ("admin");
        db.execSQL("DROP TABLE IF EXISTS usuarios");
        db.execSQL("DROP TABLE IF EXISTS rol");
        db.execSQL("DROP TABLE IF EXISTS temas");
        db.execSQL("DROP TABLE IF EXISTS tema_rol");

        db.execSQL(tables.dbcapacitacion.usr);
        db.execSQL("insert into usuarios values(01,'admin',"+aux+")");
        db.execSQL(tables.dbcapacitacion.ro);
        db.execSQL(tables.dbcapacitacion.temas);
        db.execSQL(tables.dbcapacitacion.tema_rol);
    }
}
