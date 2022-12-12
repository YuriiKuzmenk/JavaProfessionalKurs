package algoritms;
/*
public class HighArray {
    private long[] a; // инкапсулируем переменные
    private int nElems;

    public HighArray(int max) { //Создали конструктор
        a = new long[max];      // Выделяем память для массива
        nElems = 5;             // Счетчик добавленных элементов
    }

    public boolean find(long searchKey) {     // Поиск элемента
        int i;                              //Переменная - итератор
        for (i = 0; i < nElems; i++)      //Перебираем элементы в цикле
            if (a[i] == searchKey) break; //Если нашли совпадение, выходим из цикла

        if (i == nElems)   //Если перебрали весь массив, возвращаем false
            return false;
        else
            return true;    // В противном случае возвращаем
    }

    // Пример метода с полной трассировкой его работы
    // public boolean find(long searchKey){  // Поиск єлемента
    //      int i;                          // Переменная - итератор по массиву
    //      for (i = 0; i < nElems; i++) {  // Перебираем єлементы в цикле
    //          if (a[i] == searchKey)      // Если нашли совпадение, выходим из цикла
    //


    // Метод для вставки элемента в массив
    public void insert(long value){   //

        if(a.length*0.8 <= nElems) {      //
            long[] temp = a;
            a = new long[a.length*2];   // Выделяем дополнительную память
            copyArray(temp);            // Копируем старый
            System.out.println("Выделили память");
        }
            a[nElems] = value;    // Вставка элемента в позицию
            nElems++;           // Увеличение счетчика позиций
    }

    private void copyArray(long[] temp) {
        for (int i =0; i < temp.length; i++) {
            a[i] = temp[i];
        }
    }

    public boolean delete(long value){
        int i;
        for (i=0;i<nElems; i++) // Перебираем добавленные элементы
            if(value==a[i])
                break;          // Если совпали значения, выходи из цикла
        if(i == nElems)         //Если перебрали весь массив, возвращаем false
            return false;
            else{               // В противном случае
                for(int j=0; j < nElems; j++)// Сдвигаем все элементы после совпавших элементов
                    a[j]=a[j+1];    // Сдвиг
                nElems--;       // Сокращаем счетчик на 1
                return true;    // Возвращаем true
        }
    }

    public void sort(){
        long temp;
        for (int i=0; i < nElems; i++) {
            for (int j = 0; j < nElems; j++) {
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] =;
                    a[j] =;
                }
            }
        }
    }

    public void display(){
        for (int i=0; i < nElems; i++)
            System.out.print(a[i] + " ");
            System.out.println();
    }
}
*/
