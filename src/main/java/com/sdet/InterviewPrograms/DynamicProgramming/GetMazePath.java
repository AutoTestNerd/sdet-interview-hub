package com.sdet.InterviewPrograms.DynamicProgramming;
//youtTube- https://www.youtube.com/watch?v=7i41gZLXe5k

import java.util.ArrayList;

public class GetMazePath
{
    public static ArrayList<String> GetUniquePath(int sr, int sc , int m, int n){
        if(sr==m && sc==n){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hPaths= new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
        ArrayList<String> paths = new ArrayList<>();

if(sc< n){
    hPaths=GetUniquePath(sr,sc+1,m,n);
    System.out.println("Hpath " + hPaths);

}
if(sr<m){
    vPaths = GetUniquePath(sr+1,sc,m,n);
    System.out.println("vpath " + vPaths);

}
        for (String hPath:hPaths)
        {
                 paths.add("h"+hPath);

        }
        for (String vPath:vPaths)
        {

            paths.add("v" + vPath);

        }

        return paths;
    }
    public static void main(String[] args) {
        int m =3;
        int n=3;
        ArrayList<String> result =  GetUniquePath(1,1,m,n);
        System.out.println("All Unique Paths:" +result);
//        for (String path : result) {
//            System.out.println(path);
//        }
    }
}
