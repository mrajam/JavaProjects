package com.hackerrank;

import java.io.*;
import java.util.*;

public class ListOfList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> resList = new ArrayList<>();
        for(int i=0;i<n;i++){
            int q = sc.nextInt();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j=0;j<q;j++){
                li.add(sc.nextInt());
            }
            resList.add(li);
        }
        System.out.println(resList.toString());
        int queries = sc.nextInt();
        for(int i=0;i<queries;i++){
            int liNum = sc.nextInt();
            int indexNum = sc.nextInt();
            if(liNum <= 0 || indexNum <= 0 || liNum > resList.size()) {
                System.out.println("ERROR!");
            }else if(resList.get(liNum-1).size() < indexNum){
                System.out.println("ERROR!");
            }else{
                System.out.println(resList.get(liNum-1).get(indexNum-1));
            }
        }
    }
}