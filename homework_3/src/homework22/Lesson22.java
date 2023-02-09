package homework22;

/**
 * Java. Homework №22.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 30.01.2023 - 06.02.2023
 */

import java.util.Arrays;

//НЕ ВЕРНО ЗНАЧЕНИЕ СРАВНЕНИЯ МАССИВОВ, ИЩУ ОШИБКУ


public class Lesson22 {
    public static void main(String[] args) throws InterruptedException {
        final int size = 10_000_000;
        float[] arr = new float[size];
        float[] arrS;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        method1(arr);
        System.out.println(arr[0] + " "+ arr[4999999]+" "+arr[9999999]);
        System.out.println("Method1 time: " + (System.currentTimeMillis() - a) + " ms.");
        arrS = Arrays.copyOf(arr, size);
        System.out.println(arrS[0]+" "+arrS[arrS.length-1]);
        a = System.currentTimeMillis();
        method2(arr);
        System.out.println("Method2 time: " + (System.currentTimeMillis() - a) + " ms.");
        System.out.println(Arrays.equals(arr,arrS));
        System.out.println(arr.length+" "+ arrS.length+ " " +arrS[0]+ " " +arr[0]+ " " +arrS[size-1]+ " " +arr[size-1]);
    }

    public static void method1(float []arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static float [] method2(float []arr) throws InterruptedException {
        float [] arr1 = Arrays.copyOf(arr, arr.length/2);
        System.out.println("arr1 length: " + arr1.length + " " + arr1[arr1.length-1]);
        System.out.println(arr1[0]+" " +arr1[arr1.length-1]+ " "+ (arr1.length-1)+" "+ " " +arr[0]+ " " +arr[arr1.length-1]);
        //method1(arr1, arr1.length);
        float [] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        System.out.println("arr2 length: " + arr2.length + " " + arr2[arr2.length-1]);
        System.out.println(arr2[0]+ " " +arr2[arr2.length-1]+ " " + (arr2.length-1)+ " " + " " +arr[arr2.length-1]+ " " +arr[arr1.length+ arr2.length-1] + " " + (arr1.length+ arr2.length-1));
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread1.start();
        thread1.join();
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < arr2.length; i++) {
                arr[i+arr2.length] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread2.start();
        thread2.join();
        return arr;
    }

}

