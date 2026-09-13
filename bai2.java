import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai:");
        float a=sc.nextFloat();
        System.out.println("nhap chieu rong:");
        float b=sc.nextFloat();
        System.out.println("chu vi hinh chu nhat:"+((a+b)*2));
        System.out.println("dien tich hinh chu nhay:"+(a*b));
        sc.close();
    }
}
