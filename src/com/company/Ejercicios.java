package com.company;

public class Ejercicios {
    public static int ejercicio1(int[]numero){
        int index=0;
        int menor=numero[0];

        for(int i=0; i<numero.length;i++){
            if(numero[i]<menor){
                menor=numero[1];
                index=i;
            }
        }
        return index;
    }

    public static boolean ejercicio2(int[]numero){
        for(int i=0;i< numero.length;i++){
            if(i+1 < numero.length){
                if(!(numero[i]<=numero[i+1])){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] ejercicio3(int[]nums){
        int[] inverso=new int[nums.length];
        for(int i=0;i< nums.length;i++){
            inverso[i]=nums[nums.length-1-i];
        }
        return inverso;

    }

    public static int ejercicio4(int[]num, int nums){
        for(int i=0;i<num.length;i++){
            if(num[i]==nums){
                return i;
            }
        }
        return -1;
    }

    public static



























}
