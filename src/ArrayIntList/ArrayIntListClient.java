package ArrayIntList;
public class ArrayIntListClient {

    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(3);
        System.out.println(list + " " + list.size( ));
        list.add(1);
        System.out.println(list + " " + list.size( ));
        list.add(4);
        System.out.println(list + " " + list.size( ));
        list.add(1);
        System.out.println(list + " " + list.size( ));
        list.add(5);
        System.out.println(list + " " + list.size( ));
        list.add(9);
        System.out.println(list + " " + list.size( ));
        list.add(0, 7);
        System.out.println(list + " " + list.size( ));
        list.remove(0);
        System.out.println(list + " " + list.size( ));
        list.clear();
        System.out.println(list + " " + list.size( ));
    }
}
