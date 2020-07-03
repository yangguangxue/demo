package com.ygx.demo.test;

import com.ygx.demo.untils.RoleEnmu;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(RoleEnmu.valueOf("ROLE_ROOT_ADMIN").op());
    }
}
