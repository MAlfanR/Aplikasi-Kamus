

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M Alfan R
 */
public class insertdata {
  int nim;
  String tgl;
    
    public void insert(){
        Scanner a = new Scanner (System.in);
        System.out.println("Masukkan data mahasiswa");
        System.out.print("Nim :");
        nim = a.nextInt();
        System.out.println("\n tanggal lahir :");
        tgl = a.nextLine();
        
    }
    
}
