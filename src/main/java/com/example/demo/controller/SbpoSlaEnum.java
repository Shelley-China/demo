package com.example.demo.controller;


import com.example.demo.util.ToolUtil;

public enum SbpoSlaEnum {

    /**
     *
     */
    URGENT_1HR("1HR", 1, "Urgent"),
    URGENT_2HR("2HR", 2, "Urgent"),
    URGENT_4HR("4HR", 3, "Urgent"),
    URGENT_6HR("6HR", 4, "Urgent"),
    URGENT_8HR("8HR", 5, "Urgent"),
    URGENT_SAME_BD("SAME BD", 6, "Normal"),
    Normal_NBD("NBD", 7, "Normal"),
    Normal_2BD("2BD", 8, "Normal"),
    Normal_3BD("3BD", 9, "Normal"),
    Normal_5BD("5BD", 10, "Normal"),
    Normal_DEFAULT("default", 100, "Normal");

    /**
     * name
     */
    private String name;

    /**
     * sort value
     */
    private int value;

    /**
     * type
     */
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private static SbpoSlaEnum[] enumArr = new SbpoSlaEnum[]{URGENT_1HR, URGENT_2HR, URGENT_4HR, URGENT_6HR,
            URGENT_8HR, URGENT_SAME_BD,  Normal_NBD, Normal_2BD, Normal_3BD, Normal_5BD};

    private SbpoSlaEnum(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public static SbpoSlaEnum getSlaEnum(String name) {
        for (int i = 0; i < enumArr.length; i++) {
            if (enumArr[i].name.equals(name)) {
                return enumArr[i];
            }
        }
        return Normal_DEFAULT;
    }

    public static int compareWith(String name1, String name2) {
        if(ToolUtil.equals(String.valueOf(getSlaEnum(name2).value),String.valueOf(getSlaEnum(name1).value))) {
            return 0;
        }
       // return String.valueOf(getSlaEnum(name2).value).compareTo(String.valueOf(getSlaEnum(name1).value));
        return -(getSlaEnum(name1).value - getSlaEnum(name2).value);
    }

}
