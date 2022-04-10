package com.gl.sort;

public class NoteCounter {
    public static void main(String[] args) {
        int[] notes = {100, 20, 50, 10, 5, 1};
        int[] noteCounter = new int[notes.length];
        int amount = 999;
        for(int index =0; index < notes.length ; index++){
            if(amount > notes[index]){
                noteCounter[index] = amount/notes[index];
                amount = amount - noteCounter[index] * notes[index];
            }
        }
        if(amount > 0){
            System.out.println("Can not tender exact change is " + amount);
        } else {
            for (int j = 0 ; j < noteCounter.length ; j++){
                if(noteCounter[j] != 0) {
                    System.out.println(notes[j]+"::"+noteCounter[j]);
                }
            }
        }
    }
}
