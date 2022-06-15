/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainenkap;

/**
 *
 * @author Adrian
 */
public class Modifier {
    protected String nama = "Adrian Pramana Wijaya";//bisa beda class tapi harus satu package
    String sekolah = "SMK Telkom Malang Shandy Putra";//default bisa beda class tapi harus satu package
    private final String kelas = "XRPL2";//private hanya bisa di akses di class itu sendiri
    public String absen = "5";// bisa di buka di semua class
            
    public void ukl(){
        System.out.println("Sekolah saya di "+sekolah);
    }
    public void ukl1(){
        System.out.println("nama saya "+nama);
    }
    public void ukl2(){
        System.out.println("saya berada di kelas "+kelas);
    }
    public void ukl3(){
        System.out.println("saya absen "+absen);
    }
    
}
    
    

