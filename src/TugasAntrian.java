import java.util.Scanner;
public class TugasAntrian {
    static int ekor = 1;
    static int maxEkor = 5;
    static Scanner masukInt = new Scanner (System.in);
    static Scanner masuk = new Scanner (System.in);
public static void addQueue(String antrian [], String data) 
{
    if (ekor >= maxEkor) 
    {
        System.out.println ("Antrian penuh : ");
    } else {
        System.out.println ("addQueue : " +data);
        ekor++;
        antrian [ekor] = data;
    System.out.println ("deQueue : " + deQueue (antrian));
        bacaAntrian(antrian);
    }
}
public static String deQueue (String antrian[]) {
    String hasil = " ";
    if (ekor<0){
        hasil = "Antrian Kosong";
    }
    else {
        hasil=antrian[0];
        antrian[0] = null;
        for (int i = 1; i<=ekor; i++) {
            antrian [i-1] = antrian [1];
            antrian [1] = null;
        }
        ekor--;
    }
    return (hasil);
}
public static void bacaAntrian (String antrian []) {
    System.out.println("Kondisi Antrian : ");
    for (int i = 0; i<= maxEkor; i++) {
        if (i==ekor)
            System.out.println ((i+1) + "," +antrian [i] + "ekor");
        else
            System.out.println((i+1) + "," + antrian [1]);
    }
}
public static void tampilMenu(){
    System.out.println ("Pilih menu antrian : ");
    System.out.println ("1. addQueue mobil ");
    System.out.println ("2. deQueue mobil ");
    System.out.println ("3. Tampilkan Antrian ");
    System.out.println ("4. Keluar ");
    
    System.out.println ("Masukkan Pilihan : ");
        }
public static void menu (String array [], int a) {
    String mobil = " ";
    int loop;
    if (a==1) {
        while (true) {
            System.out.print ("Tentukan nama mobil yang akan di addQueue : ");
            mobil=masuk.nextLine();
            addQueue(array,mobil);
            
            System.out.println ("ingin addQueue mobil lagi?\n 1. Ya 2. Tidak ");
            loop=masuk.nextInt();
            if(loop==1) {}
            else if(loop==2){
                break;}
            else{
                System.out.println ("opsi tidak ada ");
                break;
            }
        }
    }
    else if (a==2){
        while (true) {
            System.out.println ("deQueue : " + deQueue (array));
            
            System.out.println ("ingin addQueue mobil lagi?\n 1. Ya 2. Tidak ");
            System.out.print ("masukkan pilihan : ");
            loop=masukInt.nextInt();
            if(loop==1) {}
            else if(loop==2){
                break;
            }
            else{
                System.out.println("opsi tidak ada ");
                break;
            }
        }
    }
    else if (a==3){
        bacaAntrian(array);
    }
    else {
        System.out.println ("opsi tidak ada");
        System.out.println ("kondisi antrian akhir");
    }
}
public static void main (String args[]) {
    String antrian [] = new String [10];
    String loop;
    while (true) {
        tampilMenu();
        int pilihan;
        pilihan=masukInt.nextInt();
        menu(antrian,pilihan);
        if(pilihan>=1 && pilihan<=3){}
        else{
            break;}
        bacaAntrian (antrian);
        }
    }
}