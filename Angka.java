import java.util.Arrays;
import java.util.stream.IntStream;

public class Angka {
    public static void main(String[] args) {
        System.out.println("Kumpulan arrays" );
        int[]ArrayAngka=new int[] {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};



        System.out.println(Arrays.toString(ArrayAngka));


        System.out.print("Menampilkan jumlah angka Yang  Bilanganan Ganjil :  ");
        for (int i = 0; i < ArrayAngka.length; i++){
            if (ArrayAngka [i] % 2!= 0)

            {
                System.out.print(ArrayAngka[i] + " ");
            }

        }
        int jumlah = IntStream.of(ArrayAngka).sum();
        System.out.println("");
        System.out.println("menampilkan Jumlah Dalam angka "+""+jumlah);
    }
}
