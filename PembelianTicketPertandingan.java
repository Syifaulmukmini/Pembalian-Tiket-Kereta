import java.util.Scanner;

public class PembelianTicketPertandingan{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		String nama, email, tiket;
		int pilih, jmlah, pilihan;
		String hp;
		int price;
		boolean ulangin = false;

 
		/*while(ulangin){
			if(pertandingan == 1){


				ulangin =  false;
			}else if( pertandingan ==  2){

				ulangin = false;
			}else{
				System.out.println("Pertandingan tersebut tidak ada dalam list");
			}
		}*/
		do{
			ulangin = false;
			System.out.println("1. Liverpool FC vs Bayern Munich");
			System.out.println("2. Manchester United vs Chelsea FC");

			System.out.println("");
			System.out.println("Ingin menonton pertangingan apa?");
			int pertandingan = scan.nextInt();
			if (pertandingan == 1 || pertandingan == 2) {
				System.out.print("Input Nama: ");
				nama = scan.next();
				System.out.print("Input Email: ");
				email = scan.next();
				System.out.print("Input No Hp: ");
				hp = scan.next();

				String zonain = ""; int hargain = 0; int totalin = 0;

				System.out.println("");
				System.out.println("Daftar harga tiket");
				System.out.println(" ");
				System.out.println("No. 	Zone	Price");
				System.out.println(" ");
				System.out.println("1. 	South:  Rp. 100.000");
				System.out.println("2. 	West :  Rp. 150.000");
				System.out.println("3. 	North:  Rp. 100.000");
				System.out.println("4. 	East :  Rp. 150.000");
				System.out.println("5. 	VIP  :  Rp. 250.000");
				System.out.println("6. 	VVIP :  Rp. 400.000");
				System.out.println(" ");

				System.out.print("Pilih Tiket : ");
				pilihan = scan.nextInt();

				switch(pilihan){
					case 1: 

						System.out.println(" ");
						System.out.print("Input Jumlah: ");
						jmlah = scan.nextInt();
						price = (jmlah * 100000);

						if (jmlah > 4) {
							System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
							break;
						}
						else{
							System.out.println(" ");
							System.out.println("Zone        : South" );
							System.out.println("Price       : Rp. " + price);
							System.out.println("Jumlah tiket: " + jmlah);

							System.out.println(" ");
							System.out.println("Konfirmasi Pemesanan");
							System.out.println(" ");
							System.out.println("Nama: " + nama);
							System.out.println("Email: " + email);
							System.out.println("No Hp: " + hp);
							System.out.println(" ");
							System.out.println("Zone        : South" );
							System.out.println("Price       : Rp. " + price);
							System.out.println("Jumlah tiket: " + jmlah);
							zonain = "South"; hargain = price; totalin = jmlah;
							break;
						}
					case 2: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 150000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								break;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : West" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								zonain = "West"; hargain = price; totalin = jmlah;
								break;
							}
					case 3: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 100000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								break;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : North" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								zonain = "North"; hargain = price; totalin = jmlah;
								break;
							}
					case 4: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 150000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								break;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : East" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								zonain = "East"; hargain = price; totalin = jmlah;
								break;
							}
					case 5: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 250000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								break;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : VIP" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								zonain = "VIP"; hargain = price; totalin = jmlah;
								break;
							}
					case 6: 
							System.out.println(" ");
							System.out.print("Input Jumlah: ");
							jmlah = scan.nextInt();
							price = (jmlah * 400000);

							if (jmlah > 4) {
								System.out.println("Maaf jumlah maksimal pemesanan 4 tiket");
								break;
							}
							else{
								System.out.println(" ");
								System.out.println("Zone        : VVIP" );
								System.out.println("Price       : Rp. " + price);
								System.out.println("Jumlah tiket: " + jmlah);
								zonain = "VIP"; hargain = price; totalin = jmlah;
								break;
							}
					default:
							System.out.println("Tidak ada pilihan tersebut");
				}
					if(hargain != 0){
					System.out.println("Pilih metode pembayaran:");
					System.out.println("1. Bank Transfer");
					System.out.println("2. Indomaret atau Alfamart");
					System.out.print("Pilih: ");
					int metode = scan.nextInt();

					//String convertHarga = hargain;
					String ambilNama = nama.substring(0, 2); 
					String ambilHp = hp.substring(10); 
					//String totalinPart2 = Integer.toString(totalin);
					

					if(metode == 1){
						System.out.println("Transfer ke rekening BCA 08121313618 a.n DADANG SUDRAJAT sebesar " + hargain);
					}
					else if (metode == 2) {
						System.out.println("Berikut unique code kamu " +ambilNama.toUpperCase()+ambilHp+zonain.toUpperCase()+totalin);
					}else{
						System.out.println("Pilihan tidak ada");
					}

				}

				break;

				/**/



				
			}else{
				System.out.println("Maaf pertandingan tidak ada dalam list");
				System.out.println("");
				ulangin = true;
			}
		}while(ulangin);
			
	}
}