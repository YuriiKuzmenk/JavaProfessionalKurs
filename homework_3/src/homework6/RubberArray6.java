package homework6;

public class RubberArray6<G> {
    private G[] array;

    public G get(int idx) {
        return array[idx];
    }

    public void set (int idx, G item) {
        if (array!=null) {
            array[idx]=item;
        }
    }

    public int getSize() {
        if(array!=null) {
            return array.length;
        }
        return 0;
    }

    public void add(G item) {
        if (array==null) {
            array=(G[])new Object[0];
        }
        G[] newArray=(G[]) new Object[array.length+1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length]=item;
        array=newArray;
    }

    public void addAll(G... items) {
        for (G item: items) {
            add(item);
            System.out.println(item + " - was add");
        }
    }

    public boolean remove(G item) {
        for (int i=0; i<array.length; i++) {
            if (array[i].equals(item)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void remove(int idx) {
        if (array!=null && array.length>0) {
            System.out.println("[" + array[idx] + "] - was remove");
            G[] newArray=(G[])new Object[array.length-1];
            System.arraycopy(array, 0, newArray, 0, idx);
            System.arraycopy(array, idx+1, newArray, idx, newArray.length-idx);
            array = newArray;
        }
    }

   public boolean contains(G item) {
        for (G i: array){
            if (i==item) {
                return true;
            }
        }
        return false;
    }

    public G[] toArray() {
        return array;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (array!=null){
            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]);
                if (i< array.length-1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
