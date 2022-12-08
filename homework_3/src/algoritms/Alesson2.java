/*package algoritms;

import java.util.Random;

public class Alesson2 {
    static int [] arr = new int [10];
    static Random random = new Random;

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        LowArray lowArray=new LowArray(100); // Создать объект, в котором будет массив на 100 элементов

        LowArray.setElem(0, 77);
        LowArray.setElem(1, 15);
        LowArray.setElem(2, 58);
        LowArray.setElem(3, 23);
        LowArray.setElem(4, 87);
        LowArray.setElem(5, 12);

        System.out.println(lowArray.getElem(5));
        System.out.println(lowArray.getElem(20));
        //System.out.println(lowArray.getElem(101));

        HighArray highArray = new HighArray(10);

        highArray.insert(10);
        highArray.insert(21);
        highArray.insert(34);
        highArray.insert(54);
        highArray.insert(85);

        highArray.display();

        System.out.println(highArray.find(85));

        highArray.delete(54);

        highArray.display();

        highArray.sort();

        highArray.display();
        highArray.insert(34);
        highArray.insert(54);
        highArray.insert(85);
        highArray.display();
    }
}
*/