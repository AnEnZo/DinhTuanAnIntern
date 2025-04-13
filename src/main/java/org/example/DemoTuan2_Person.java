package org.example;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


public class DemoTuan2_Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Thông tin học sinh{" +
                "name='" + name + '\'' +
                ", age=" + age
                ;
    }
}
