import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 51; i++) {
            arrayList.add(i, random.nextInt(1, 101));

        }
        ArrayList<Integer> arrayjup = new ArrayList<>();
        ArrayList<Integer> arraytak = new ArrayList<>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                arrayjup.add(i);
           }else {
                arraytak.add(i);
           }
        }
  System.out.println("--------------------------------Обший Сандар--------------------------------------------------------");
  System.out.println(arrayList);
  System.out.println("====================================================================================================");
  System.out.println("---------------------------------Жуп Сандар-------------------------------------------------------");
  System.out.println(arrayjup);
  System.out.println("====================================================================================================");
  System.out.println("-------------------------------Так Сандар---------------------------------------------------------");
  System.out.println(arraytak);
  System.out.println("====================================================================================================");
    }
    }
