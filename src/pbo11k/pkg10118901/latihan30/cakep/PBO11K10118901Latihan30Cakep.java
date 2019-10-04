/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan30.cakep;
import java.util.*;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Text warna cakep
 */
public class PBO11K10118901Latihan30Cakep {

    public static final String NORMAL = "\u001b[0m";
    public static final String MERAH = "\u001b[31m";
    public static final String HIJAU = "\u001b[32m";
    public static final String KUNING = "\u001b[33m";
    public static final String BIRU = "\u001b[34m";
    public static final String UNGU = "\u001b[35m";
    public static final String BIRUMUDA = "\u001B[36m";
    public static final String PUTIH = "\u001B[37m";
    public static void tc(String warna,String teks) {
        System.out.print(warna+teks+ NORMAL);
    }
    public static void tcln(String warna,String teks) {
        System.out.println(warna+teks+ NORMAL);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cek;
        tc(MERAH, "Kamu");
        tc(HIJAU, " ngerjain sendiri");
        tc(KUNING, " latihan 17 sampe");
        tc(BIRU," latihan 30 ini?\nJawab");
        tc(MERAH, " (yoi/enggak) : ");
        cek = input.next();
        if(cek.toLowerCase().equals("yoi")) {
            System.out.println("");
            tc(MERAH,"Cakep bener. ");
            tcln(UNGU,"Good Job");
        } else {
            System.out.println("");
            tcln(MERAH,"Tetep cakep sih");
            tcln(BIRUMUDA,"Sing penting paham konsep nya yee.");
            System.out.println("Keep The Code work dude");
        }
        
        
    }
    
}
