import java.util.Scanner;
class laporan {
	public String no_lap;
	public String tgl_lap ;
	public String jenis_lap;
	public void  cetak (){
    Scanner input = new Scanner (System.in);
    System.out.println ("908kt ");
    
	System.out.println ("23 November 2001 ");
	  
	System.out.println ("Keuangan ");
	
	}
	public void ubah_lap () {
    int ubah;
      Scanner input = new Scanner (System.in);
      do{
      	System.out.print("mengubah laporan :");
      
      	  	  	ubah = input.nextInt();
      	  	  	if (ubah==1){
      	  	  		System.out.print("laporan telah tercetak");
      	  	  	}else if (ubah==2) {
      	  	  	System.out.print("menghapus laporan ");

      	  	  	}

      	  	  	} while (ubah==3);
    }
	}