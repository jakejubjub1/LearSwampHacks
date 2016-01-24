package com.swamperino.jakejubjub.lear;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.swamperino.jakejubjub.lear.Charas;
import com.swamperino.jakejubjub.lear.R;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;


public class LevelActivity extends Activity {
    int[] user;
    String dialogue;
    Charas[] array;
    /*
    public void starting(int level) {

    }*/

    //read in dialogue set to string
   /*
    public class {
        public View fragmentD(){
            View view = inflater.inflate(R.layout.fragmentD, container, false);
        }
    }
    */
    //Generate the fragments in for loop
    //submit processes the information, checks values
    public boolean evaluate(Charas[] ch, int[] user) {

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        Intent intent=getIntent();
        int dif=Integer.parseInt(intent.getStringExtra(Level_Select.EXTRA_MESSAGE));
        int[] diff=getDiffLevel();
        int level=diff[dif]+(dif*3);
        String filename = "level_" + level + ".txt";
        try {//Reads in file to dialogue
            InputStream inputStream = openFileInput(filename);
            if (inputStream != null) {
                BufferedReader buff = new BufferedReader(new InputStreamReader(inputStream));
                String recieve="";
                StringBuilder builder = new StringBuilder();
                while (!((recieve = buff.readLine()).contains("%"))) {
                    builder.append(recieve);
                }
                builder.append(recieve);
                dialogue = builder.toString();
                int num = Integer.parseInt(buff.readLine());
                Charas[] array = new Charas[num];
                for (int i = 0; i < num; i++) {
                    int value = Integer.parseInt(buff.readLine());
                    String name = buff.readLine();
                    array[i].setName(name);
                    array[i].setValue(value);
                }
                inputStream.close();
            }
        } catch (Exception e) {
            Log.e("Login activity ", e.toString());
        }
    }
    public int[] getDiffLevel(){
        int[] diffLevel=new int[4];
        String filename="difflevel.txt";
        try{
            InputStream inputStream= openFileInput(filename);
            if(inputStream!=null){
                InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
                BufferedReader buff=new BufferedReader(inputStreamReader);
                for(int i=0;i<4;i++){
                    diffLevel[i]=Integer.parseInt(buff.readLine());
                    char1.addView();
                }
            }
        }catch(Exception e){
            Log.e("Login activity ",e.toString());
        }
        return diffLevel;
    }
    public void setDiffLevel(String level) {
        String filename = "difflevel.txt";
        try {
            BufferedWriter buf = new BufferedWriter(new FileWriter(filename));
            buf.write(level);
            buf.close();
        }
        catch(Exception e){
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }
    public int[] getCurrentLevel(){
        int[] level=new int[2];
        String filename="currlevel.txt";
        try{
            InputStream inputStream=openFileInput(filename);
            if(inputStream!=null){
                InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
                BufferedReader buff=new BufferedReader(inputStreamReader);
                for(int i=0;i<2;i++){
                    level[i]=Integer.parseInt(buff.readLine());
                }
            }
        }catch(Exception e){
            Log.e("Login activity ",e.toString());
        }
        return level;
    }

    @Override
    public void onStart() {
        super.onStart();
        int diffLevel[]=getDiffLevel();
        int current[]=getCurrentLevel();
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle app bar item clicks here. The app bar
        // automatically handles clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onStop() {
        super.onStop();

    }
}
