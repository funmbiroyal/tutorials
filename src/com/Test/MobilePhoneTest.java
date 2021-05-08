package com.Test;

import com.mavenMobile.MobilePhone;
import com.mavenMobile.PhoneManufacturer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MobilePhoneTest {
    MobilePhone myPhone;
    MobilePhone joyPhone;
    MobilePhone francisPhone;

    @BeforeEach
    void setUp(){
         myPhone = new MobilePhone("myimei", PhoneManufacturer.APPLE);
        myPhone.setModel("iphone xs max");
        myPhone.setStorageSpace(512);
        myPhone.makeCall(1234567);

         joyPhone = new MobilePhone("joyimei",PhoneManufacturer.MOTOROLA);
        joyPhone.makeCall(668011111);

         francisPhone = new MobilePhone("francisimei",PhoneManufacturer.IPHONE);
        francisPhone.makeCall(668011111);
        francisPhone.setStorageSpace(512);

        MobilePhone.setSimCardSlots(1);
    }
    @Test
    void showSimCardSlots(){
        System.out.println("Slot count in my phone is " + myPhone.getSimCardSlots());
        System.out.println("Slot count in joy's phone is " + joyPhone.getSimCardSlots());
        System.out.println("Slot count in francis's phone is " + francisPhone.getSimCardSlots());
    }
}
