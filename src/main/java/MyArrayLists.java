package main.java;


public class MyArrayLists<T> {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList);
        myArrayList.add(11);
        myArrayList.add(111);
        myArrayList.add(1222);
        myArrayList.add(13);
        myArrayList.add(18);
        myArrayList.add(17);
        myArrayList.add(1000);
        myArrayList.add(111111);
        myArrayList.add(18);
        myArrayList.add(17);
        myArrayList.add(1000);
        myArrayList.add(111111);
        myArrayList.add(18);
        myArrayList.add(17);
        myArrayList.add(1000);
        myArrayList.add(111111);
        System.out.println(myArrayList);
        System.out.println("Количество заполненных элементов в списке : "+myArrayList.size());
        System.out.println("get(index=5)= " + myArrayList.get(5));
        myArrayList.remove(2);
        System.out.println(myArrayList);
        System.out.println("Количество заполненных элементов в списке : "+myArrayList.size());
        myArrayList.clear();
        System.out.println(myArrayList);
    }
}
