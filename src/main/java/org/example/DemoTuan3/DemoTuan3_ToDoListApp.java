package org.example.DemoTuan3;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DemoTuan3_ToDoListApp {

    static Scanner sc=new Scanner(System.in);
    static Map<LocalDate,List<String>> todolist=new HashMap<>();
    static DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static void main(String[] args) {

        boolean running=true;

        while(running){
            System.out.println("TODO MENU:");
            System.out.println("1:xem danh sách công việc");
            System.out.println("2:thêm công việc");
            System.out.println("3:sửa công việc");
            System.out.println("4:xóa công việc");
            System.out.println("5:thoát chương trình");
            System.out.print("Mời chọn:");
            try{
                int choice = Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 1: showtask();
                        break;
                    case 2: addtask();
                        break;
                    case 3: updatetask();
                        break;
                    case 4: deletetask();
                        break;
                    case 5: System.exit(0);
                    default:
                        System.out.println("lựa chọn k có trong menu");
                }

            } catch (Exception e) {
                System.out.println("có lỗi "+e.getMessage());
            }

        }

    }


    static void showtask(){
        try{
            System.out.println("Nhập ngày(theo định dạng:dd-MM-yyy) muốn xem:");
            LocalDate date=LocalDate.parse(sc.nextLine(),formatter);
            List<String> task=todolist.getOrDefault(date,new ArrayList<>());//key không tồn tại trả về defaultValue
            if(task.isEmpty()){
                System.out.println("không có công việc nào.");
            }else{
                System.out.println("Danh sách các việc trong ngày "+date+" là:");
                for(String s:task){
                    System.out.println(s);
                }
            }

        }catch(Exception e){
            System.out.println("có lỗi "+e.getMessage());
        }
    }


    static void addtask(){
        try{
            System.out.println("Nhập ngày(theo định dạng:dd-MM-yyy) muốn thêm công việc:");
            LocalDate date=LocalDate.parse(sc.nextLine(),formatter);
            System.out.println("Nhập công việc muốn thêm:");
            String task=sc.nextLine();

            todolist.putIfAbsent(date,new ArrayList<>());
            todolist.get(date).add(task);

            System.out.println("Thêm công việc thành công:");
        }catch(Exception e){
            System.out.println("Lỗi nhập ngày tháng k đúng định dạng");
        }
    }

    static void updatetask(){
        try{
            System.out.println("Nhập ngày(theo định dạng:dd-MM-yyy) muốn sửa:");
            LocalDate date=LocalDate.parse(sc.nextLine(),formatter);
            List<String> task=todolist.get(date); //key không tồn tại trả về null
            if(task==null||task.isEmpty()){
                System.out.println("không có công việc nào để cập nhật");
                return;
            }
            System.out.println("Danh sách các việc trong ngày "+date+" là:");
            for(int i=0;i<task.size();i++){
                System.out.println((i+1)+"."+task.get(i));
            }
            System.out.println("nhập số thứ tự công việc muốn sửa:");
            int index= Integer.parseInt(sc.nextLine())-1;
            if(index>=0&&index<task.size()){
                System.out.println("nhập nội dung công việc mới:");
                String newtask=sc.nextLine();
                task.set(index,newtask);
                System.out.println("sửa thành công.");
            }else{
                System.out.println("số thứ tự không hợp lệ");
            }
        }catch(Exception e){
            System.out.println("có lỗi "+e.getMessage());
        }
    }

    static void deletetask(){
        try{
            System.out.println("nhập ngày(theo định dạng:dd-MM-yyy) muốn xóa:");
            LocalDate date=LocalDate.parse(sc.nextLine(),formatter);
            List<String> task=todolist.get(date);
            if(task==null||task.isEmpty()){
                System.out.println("k có công việc nào trong ngày để xóa cả");
                return;
            }
            for(int i=0;i<task.size();i++){
                System.out.println((i+1)+"."+task.get(i));
            }
            System.out.println("chọn số thứ tự công việc muốn xóa:");
            int index=Integer.parseInt(sc.nextLine())-1;
            if(index>=0&&index<task.size()){
            task.remove(index);
                System.out.println("xóa thành công.");
            }else{
                System.out.println("lỗi nhập sai số thứ tự");
            }
        }catch(Exception e){
            System.out.println("lỗi "+e.getMessage());
        }
    }



}
