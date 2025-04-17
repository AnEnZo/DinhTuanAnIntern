package org.example.DemoTuan2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
