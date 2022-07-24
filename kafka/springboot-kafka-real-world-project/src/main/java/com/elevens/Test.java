package com.elevens;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String str  = "India is my country";
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            }else{
                counter = hashMap.get(arr[i]);
                hashMap.put(arr[i],counter+1);
            }
        }
        System.out.println(hashMap);
    }
}
