package com.kelab.info.base.constant;

public class UserRoleConstant {

    public static final int ADMIN = 1;
    public static final int TEACHER = 2;
    public static final int ACM_ER = 3;
    public static final int STUDENT = 4;
    public static final int NOT_LOGIN = 5;

    public static String parseConstantName(Integer roleId) {
        switch (roleId) {
            case 1:return "ADMIN";
            case 2:return "TEACHER";
            case 3:return "ACM_ER";
            case 4:return "STUDENT";
            case 5:return "NOT_LOGIN";
        }
        return "NOT_SET";
    }
}
