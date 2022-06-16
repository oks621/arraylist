package main.java;


public class MyArrayLists {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList);
        myArrayList.add(11);
        myArrayList.add(111);
        myArrayList.add(1222);
        myArrayList.add(13);
        myArrayList.add(18);
        myArrayList.add(17);
        myArrayList.add(1000);
        myArrayList.add(1);
        System.out.println(myArrayList);
        System.out.println("get(index=15)= " + myArrayList.get(15));
        myArrayList.remove(12);
        myArrayList.clear();
        System.out.println(myArrayList);
    }
}
