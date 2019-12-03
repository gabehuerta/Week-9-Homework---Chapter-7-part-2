import java.util.Scanner;

public class RotateRight{

    public static void rotateRight(int[] a, int places)
    {
        if (a.length<=1 || places==0){
            return;
        }
        places = places<0?a.length + places:places;

        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            int newIndex=(i+places)%a.length;
            b[newIndex]=a[i];
        }
        for(int i=0;i<a.length;i++){
            a[i]=b[i];
        }
    }
    private static void display(String header, int[] a)
    {
        System.out.print(header+" ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
       int[] a1 = { 1, 3, 5, 7 };
        display("array before rotation:", a1);
        rotateRight(a1, 2);
        System.out.println("element order should be: 5 7 1 3");
        display("array after rotating 2:", a1);
        System.out.println();

        int[] a2 = { 1, 3, 5, 7 };
        display("array before rotation:", a2);
        rotateRight(a2, 18);
        System.out.println("element order should now be: 5 7 1 3");
        display("array after rotating 18:", a2);
        System.out.println();

        int[] a3 = { 1, 3, 5, 7 };
        display("array before rotation:", a3);
        rotateRight(a3, -1);
        System.out.println("element order should now be: 3 5 7 1");
        display("array after rotating -1:", a3);
        System.out.println();

        int[] a4 = { 1, 3, 5, 7 };
        display("array before rotation:", a4);
        rotateRight(a4, 0);
        System.out.println("element order should now be: 1 3 5 7");
        display("array after rotating 0:", a4);
        System.out.println();

        int[] a5 = { 1 };
        display("array before rotation:", a5);
        rotateRight(a5, 2);
        System.out.println("element order should now be: 1");
        display("array after rotating 2:", a5);
        System.out.println();
    }
}



