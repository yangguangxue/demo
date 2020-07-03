package com.ygx.demo.untils;

public enum RoleEnmu implements RoleOperation {

    ROLE_ROOT_ADMIN{
        @Override
        public String op() {
            return "ROLE_ROOT_ADMIN"+"has AA permission";
        }
    },
    ROLE_ORDER_ADMIN{
        @Override
        public String op() {
            return "ROLE_ORDER_ADMIN"+"has BB permission";
        }
    },
    ROLE_NORMAL{
        @Override
        public String op() {
            return "ROLE_NORMAL"+"has CC permission";
        }
    }
}
