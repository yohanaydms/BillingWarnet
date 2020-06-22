public class ProgramAntrian {
    static int ekor = -1;
    static int maxEkor = 9;
     public static void addQueue (String antrian [] , String data)
     {
         if (ekor >= maxEkor)
         {
            System.out.println ("Antrian penuh"); 
         }
         else
         {
             System.out.println ("addQueue : " +data);
             ekor++;
             antrian [ekor] = data;
         }
     }
     public static String deQueue (String antrian [])
     {
         String hasil = " ";
         if (ekor < 0)
         {
             hasil = "Antrian kosong";
         }
         else
         {
             hasil = antrian [0];
             antrian [0] = null;
             for (int i = 1; i<=ekor; i++)
             {
                 antrian [i-1] = antrian [i];
                 antrian [i] = null;
             }
             ekor--;
         }
         return (hasil);
     }
     public static void bacaAntrian (String antrian [])
     {
         System.out.println ("Kondisi antrian : ");
         for (int i =0; i <= maxEkor; i++)
         {
             if (i==ekor)
                 System.out.println ((i+1) + "." + antrian [i] + "ekor");
             else
                 System.out.println ((i+1) + "." + antrian [i]);
         }
     }
     public static void main (String args [])
     {
         String antrian[] = new String [10];
         addQueue (antrian, "Mobil A");
         addQueue (antrian, "Mobil B");
         addQueue (antrian, "Mobil C");
         addQueue (antrian, "Mobil D");
         System.out.println();
         bacaAntrian (antrian);
         System.out.println();
         
     }
}
