package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DemoTuan1_Caculate {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    boolean running=true;
    while(running){

        System.out.println("Chọn chức năng:");
        System.out.println("1: Cộng");
        System.out.println("2: Trừ");
        System.out.println("3: Nhân");
        System.out.println("4: Chia");
        System.out.println("5: Thoát");
        System.out.print("Nhập lựa chọn của bạn:");
        int choose;
        try{
            choose = sc.nextInt();
        }catch(InputMismatchException e){
           System.out.println("vui lòng nhập số từ 1->5");
           sc.nextLine();
           continue;
        };
        if (choose == 5) {
            System.out.println("Thoát chương trình");
            break;
        }
        double a,b;
        try{
            System.out.println("vui lòng nhập số a");
            a=sc.nextDouble();
            System.out.println("vui lòng nhập số b");
            b=sc.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("bạn phải nhập số ");
            sc.nextLine();
            continue;
        }
        switch(choose){
            case 1:
                Double kq1=a+b;
                System.out.println("kết quả phép cộng: "+kq1);
                break;
            case 2:
                Double kq2=a-b;
                System.out.println("kết quả phép trừ: "+kq2);
                break;
            case 3:
                Double kq3=a*b;
                System.out.println("kết quả phép nhân: "+kq3);
                break;
            case 4:
                if(b==0){
                    System.out.println("không thể chia.");
                }else{
                    Double kq4=a/b;
                    System.out.println("kết quả phép chia: "+kq4);
                }
                break;
            default:
                System.out.println("Lựa chọn k hợp lệ vui lòng chọn lại");
         }

    }

sc.close();

    }
}
