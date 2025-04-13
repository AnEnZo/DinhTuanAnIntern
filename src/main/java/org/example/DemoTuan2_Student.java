package org.example;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter


public class DemoTuan2_Student extends DemoTuan2_Person {
    private String masv;
    private float DiemChuyenCan;
    private float DiemGiuaKy;
    private float DiemCuoiKy;

    public DemoTuan2_Student(String name, int age, String masv, float diemChuyenCan, float diemGiuaKy, float diemCuoiKy) {
        super(name, age);
        this.masv = masv;
        this.DiemChuyenCan = diemChuyenCan;
        this.DiemGiuaKy = diemGiuaKy;
        this.DiemCuoiKy = diemCuoiKy;
    }

    @Override
    public String toString() {
        return super.toString()+
                " masv='" + masv + '\'' +
                ", DiemChuyenCan=" + DiemChuyenCan +
                ", DiemGiuaKy=" + DiemGiuaKy +
                ", DiemCuoiKy=" + DiemCuoiKy +
                '}';
    }

    void TinhDiemTongKet(){
        float DiemTongKet= 0.1f*DiemChuyenCan + 0.3f*DiemGiuaKy + 0.6f*DiemCuoiKy;
        String thongtin = toString();
        System.out.println(thongtin );
        System.out.println("Điểm Tổng Kết = "+DiemTongKet);
    }
    public static void main(String[] args) {

      DemoTuan2_Student a=new DemoTuan2_Student("Dinh Tuan An",18,"73DCTT",10.0f,7.0f,8.0f);
      a.TinhDiemTongKet();


    }

}
