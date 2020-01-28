package com.example.b4learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.entities.DBHelper;
import com.example.seguridad.cifrar;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    private Cursor fila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText) findViewById(R.id.etusuario);
        et2= (EditText) findViewById(R.id.etcontrasena);
    }

    public void ingresar(View v){
        DBHelper admin=new DBHelper(this);
        SQLiteDatabase db=admin.getWritableDatabase();
        String usuario=et1.getText().toString();
        String contrasena=et2.getText().toString();
        //cifrar ci=new cifrar();
        //String aux = ci.md5(contrasena);
        fila=db.rawQuery("select usuario,contrasena from usuarios where usuario='"+usuario+"' and contrasena='"+contrasena+"'",null);

        if (fila.moveToFirst()){
            String usua=fila.getString(0);
            String pass=fila.getString(1);
            if (usuario.equals(usua)&&contrasena.equals(pass)){
                Intent ven=new Intent(this,Menulearning.class);
                startActivity(ven);
                et1.setText("");
                et2.setText("");
                Toast toast = Toast.makeText(getApplicationContext(), "Bienvenido  "+usuario, Toast.LENGTH_SHORT);
                toast.show();
            }else{
                Toast toast = Toast.makeText(getApplicationContext(), "usuario o contraseña incorrectos"+usuario, Toast.LENGTH_SHORT);
                toast.show();
            }

        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "usuario o contraseña incorrectos", Toast.LENGTH_SHORT);
            toast.show();
        }



    }
    public void registro(View v){
       // Intent ven=new Intent(this,Registro.class);
        //startActivity(ven);
    }

    public void salir(View v){
        finish();
        //System.exit(0);
    }
}
