import java.util.Scanner;
public class bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen a");
        int a=sc.nextInt();
        System.out.println("nhap so nguyen b");
        int b=sc.nextInt();
        System.out.println("1. Tinh tong");
        System.out.println("2. Tinh hieu");
        System.out.println("3. Tinh tich"); 
        System.out.println("4. Tinh thuong"); 
        System.out.print("Nhap lua chon: ");
        int chon = sc.nextInt();
        switch(chon){
            case 1:
                System.out.println("tong:"+(a+b));
                break;
            case 2:
                System.out.println("hieu:"+(a-b));
                break;
            case 3:
                System.out.println("tich:"+(a*b));
                break;
            case 4:
                if(b!=0){
                    System.out.println("thuong:"+((double) a/b));
                }
                else{
                    System.out.println("khong the chia");
                }
                break;
            default:
                System.out.println("lua chon khong hop le");
        }
        sc.close();
    }
}