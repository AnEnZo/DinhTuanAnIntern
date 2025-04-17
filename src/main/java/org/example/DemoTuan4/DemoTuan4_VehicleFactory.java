package org.example.DemoTuan4;

public class DemoTuan4_VehicleFactory {
    public static DemoTuan4_Vehicle createvehicle(String type){

        if(type==null||type.isEmpty()){
            throw new IllegalArgumentException("phương tiện không được null");
        }
        switch(type.toLowerCase()){
          case "bicycle": return new DemoTuan4_Bicycle();
          case "motobike": return new DemoTuan4_Motobike();
          case "car": return new DemoTuan4_Car();
          default: throw new IllegalArgumentException("phương tiện k hợp lệ");
      }

    }
}
