package com.swamperino.jakejubjub.lear;

import android.app.Activity;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by jakej_000 on 1/23/2016.
 */
public class Utility extends Activity{
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
                }
            }
        }catch(Exception e){
            Log.e("Login activity ",e.toString());
        }
        return diffLevel;
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
}
