import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一串数字：");
        String str=in.nextLine();
        String array1[]=str.split(",");
        int array2[]=new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i]=Integer.parseInt(array1[i]);
        }
        fun(array2,array2.length);
        System.out.println("排序后的结果：");
        display(array2);
        System.out.println("");
        System.out.println("请输入另一串数字:");
        String str2=in.nextLine();
        String array3[]=str2.split(",");
        int array4[]=new int[array3.length];
        for (int i = 0; i < array4.length; i++) {
            array4[i]=Integer.parseInt(array3[i]);
        }
        int combine[]=new int[array2.length+ array4.length];
        for (int i = 0; i < combine.length; i++) {
            if (i< array2.length){
                combine[i]=array2[i];
            }
            else {
                combine[i] = array4[i- array2.length];
            }
        }
        fun(combine, combine.length);
        System.out.println("合并后的结果为：");
        display(combine);
    }
    public static void fun(int arr[],int x){
        for (int i = 0; i < x-1; i++) {
            for (int j = 1; j <x-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp;
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i< arr.length-1){
                System.out.print(",");
            }
        }
    }
}

