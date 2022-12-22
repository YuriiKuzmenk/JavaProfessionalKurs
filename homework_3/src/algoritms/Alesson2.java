package algoritms;

/*
План занятия
1) Массивы

Теория
Структура данных - способ организации данных в памяти, подразумевающий определенный алгоритм работы с собой.
Алгоритм - последовательность действий
Массив - структура данных, которая хранит данные в сплошной области памяти (по аналогии с лесным или жилым массивом).
Массивы позволяют получать доступ к своим элементам по индексу, таким образом зная адресс начала массива достаточно просто прибавить к нему количество индексов, умноженное на размер элемента массива, чтобы вычислить адрес требуемого элемента.
Недостаток массива - необходимость соблюдения сплошной области в памяти, таким образом для вставки и удаления элементов приходится выполнять большое количество операций.

Чтобы объявить массив в Java нужно указать его тип, присвоить ему имя и віделить для него память:
Указываю тип    Переменная         Выделяю память
    int[]            arr     =       new int[10]
  Доступ к элементу массива можно получить по его индексу:
  имя массива   индекс  присваиваем значение
        arr       [1]  =        10;
        length - метод, который возвращает размер массива
*/

/*
Заметки
Структура данных всегда подразумевает алгоритм
Алгоритмы не всегда нуждаются в специальных структурах данных

Локальная переменная определена в методе и видна только в нем, глобальная определена в классае и видна в нем или даже за его пределами в зависимости от модификатора доступа

Инкапсуляция - погружение в класс, как правило инкапсуляция подразумевает разработку уровня доступа к данным


*/
/*
import java.util.Random;

public class Alesson2 {

    static int [] arr = new int [10];   //Декларация массива

    static Random random = new Random;  //Генератор ПСЕВДОслучайных   чисел

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {  //Вывожу массив до инициализации
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(10);          //Инициализирую массив псевдослучайными числами в диапазоне до 10
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        LowArray lowArray=new LowArray(100); // Создать объект, в котором будет массив на 100 элементов

        LowArray.setElem(0, 77);    //Добавляем элементы в массив
        LowArray.setElem(1, 15);
        LowArray.setElem(2, 58);
        LowArray.setElem(3, 23);
        LowArray.setElem(4, 87);
        LowArray.setElem(5, 12);

        System.out.println(lowArray.getElem(5));    //Получаем элементы массива
        System.out.println(lowArray.getElem(20));
        //System.out.println(lowArray.getElem(101));   Обратились к элементу за границей массива

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