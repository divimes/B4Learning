package com.example.entities;

import android.provider.BaseColumns;

public class tables {
    public static abstract class dbcapacitacion implements BaseColumns{
        public static final String ro="create table rol(id_rol integer primary key,nombre_rol text,descripcion_rol text, estatus_rol integer)";

        public static final String usr="create table usuarios(id_usuario integer primary key,usuario text,contrasena text,apellidos text" +
                "direccion text,estatus_usr integer,fecha_inicio_usr integer, fecha_fin_usr integer, id_rol integer, FOREIGN KEY (id_rol) REFERENCES rol(id_rol))";

        public static final String temas="create table temas(id_tema integer primary key, nombre_tema text, descripcion_tema text)";

        public static final String tema_rol="create table tema_rol(id_tema_rol integer primary key,FOREIGN KEY (id_rol) REFERENCES rol(id_rol)" +
                "FOREIGN KEY (id_tema) REFERENCES temas(id_tema) ";
    }
}
