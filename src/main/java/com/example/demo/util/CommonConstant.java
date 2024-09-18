package com.example.demo.util;

import java.math.BigDecimal;

public interface CommonConstant {

    String System = "System";

    String SSOC_OS = "SSOC-OS";

    String Request_User = "OMS_API";

    String BASE_PACKAGE = "com.lenovo.ssoc.os";
    /**
     * 标识位
     */
    interface Flag {
        String Y = "Y";
        String N = "N";
        String X = "X";
        Boolean TRUE = true;
        Boolean FALSE = false;
        Integer INT_TRUE = 1;
        Integer INT_FALSE = 0;
        String SUCCESS = "SUCCESS";
        String FAILED = "FAILED";
        String ERROR = "ERROR";
        String INIT = "INIT";
        String ACCEPT = "ACCEPT";
        String REJECT = "REJECT";
        String PENDING = "PENDING";
        String LOCAL = "LOCAL";
        String CLIAM = "CLIAM";
        String NEW = "NEW";
        String RELEASE = "RELEASE";
        String CUTOVER = "CUTOVER";
    }

    interface StringPool {
        String EMPTY = "";
        String SPACE = " ";
        String COLON = ":";
        String COMMA = ",";
        String STAR = "*";
        String STAR3 = "***";
        String POUND = "#";
        String DASH = "-";
        String DOT = ".";
        String PIPE = "|";
        String UNDERSCORE = "_";
        String SLASH = "/";
        String BACK_SLASH = "\\";
        String NEWLINE = "\n";
        String ZERO = "0";
        String ZERO_FULL = "000000000000000000";
        String COMMON = "COMMON";
        String DEFAULT = "DEFAULT";
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";
        String G = "G";
        String H = "H";
        String I = "I";
        String J = "J";
        String K = "K";
        String L = "L";
        String M = "M";
        String N = "N";
        String O = "O";
        String P = "P";
        String R = "R";
        String S = "S";
        String T = "T";
        String U = "U";
        String V = "V";
        String W = "W";
        String X = "X";
        String Y = "Y";
        String Z = "Z";

        String ADD = "+";
        String SUBTRACT = "-";
        String EQUAL = "=";
        String MULTIPLY = "*";
        String DIVIDE = "/";
        String SEMICOLON = ";";
        String IN_LOWERCASE = "in";
        String IN = "IN";
        String AND = "AND";
        String OR = "OR";
        String EQUALS = "=";
        String LEFT_BRACKET = "(";
        String RIGHT_BRACKET = ")";
        String SINGLE_QUOTE = "'";
        String ALL = "ALL";
    }

    interface OrderType {
        /**
         * Microsoft Managed Freight
         */
        String MMF = "MMF";
    }

    interface ResponseCode {
        String SUCCESS = "200";
        String ATP_FAILED = "002";

        String ORDER_SUCCESS = "900";
        String ORDER_FAILED = "999";
        String ORDER_CANCEL_SUCCESS = "950";
        String ORDER_CANCEL_FAILED = "951";

        String ACCEPT = "Accept";
        String REJECT = "Reject";
    }

    /**
     * 扩展字段常量
     */
    interface ExtendField {
        String FIELD_NAME = "_extendField";
        /**
         * mahi atp secc 返回 fsl数据
         */
        String ATP_FSL = "ATP_FSL";
        /**
         * pcgmsd atp secc 返回 inventory数据
         */
        String ATP_INVENTORY = "ATP_INVENTORY";
        /**
         * mahi atp secc 返回 pudo数据
         */
        String ATP_PUDO = "ATP_PUDO";
        /**
         * SECC/WMS通知状态变更数据
         */
        String STATUS = "STATUS";
        /**
         * SECC/WMS发货通知数据
         */
        String ASN = "ASN";
        /**
         * 订单结果
         */
        String ORDER_RESULT = "orderResultVo";
        /**
         * 记录订单状态变更前的原始状态
         */
        String originalItemStatus = "originalItemStatus";

        /**
         * 订单CutOver标识
         */
        String demolitionFlag = "demolitionFlag";
        String originalOrderNo = "originalOrderNo";
        String originalOrderItem = "originalOrderItem";

        String S4RequestNo = "S4RequestNo";
    }

    /**
     * 日期格式
     */
    interface Pattern {
        String DATE = "yyyy-MM-dd";
        String DATETIME = "yyyy-MM-dd HH:mm:ss";
        String DATETIME_MM = "yyyy-MM-dd HH:mm";
        String DATETIME_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
        String TIME = "HH:mm";
        String TIME_SS = "HH:mm:ss";
        String SYS_DATE = "yyyy/MM/dd";
        String SYS_DATETIME = "yyyy/MM/dd HH:mm:ss";
        String SYS_DATETIME_MM = "yyyy/MM/dd HH:mm";
        String SYS_DATETIME_SSS = "yyyy/MM/dd HH:mm:ss.SSS";
        String NONE_DATE = "yyyyMMdd";
        String NONE_DAY = "yyyyMM";
        String NONE_TIME_SS = "HHmmss";
        String NONE_DATETIME = "yyyyMMddHHmmss";
        String NONE_DATETIME_MM = "yyyyMMddHHmm";
        String NONE_DATETIME_SSS = "yyyyMMddHHmmssSSS";
        String CST_DATETIME = "EEE MMM dd HH:mm:ss 'CST' yyyy";
        String YYYYMMDD_HH_mm_ss="yyyyMMdd HH:mm:ss";
    }

    /**
     * 正则
     */
    interface Regular {
        String LETTER = ".*[A-Za-z].*";
        String NUMBER = "^[0-9]*$";
        String LETTER_NUMBER_UNDERLINE = "^\\w+$";
        //yyyyMMdd格式校验
        String NONE_DATE_VALID = "((\\d{3}[1-9]|\\d{2}[1-9]\\d|\\d[1-9]\\d{2}|[1-9]\\d{3})(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)";
        //HHmmss格式校验
        String NONE_TIME_SS_VALID = "([0-1]?[0-9]|2[0-3])([0-5][0-9])([0-5][0-9])";
        String MAIL = "^[A-Za-z0-9\\u4e00-\\u9fa5._-]+@[a-zA-Z0-9._-]+(\\.[a-zA-Z0-9._-]+)+$";
        String PHONE = "^(((\\+\\d{2}-)?0\\d{2,3}-\\d{7,8})|((\\+\\d{2}-)?(\\d{2,3}-)?([1][3,4,5,7,8][0-9]\\d{8})))$";
        String PASSWORD = "^[a-zA-Z]\\w{5,17}$";
        String PREFIX_ZERO = "^0+(?!$)";
    }

    interface ConstantNumber {
        String dummyPrice = "0.01";
        int INT_MINUS_1 = -1;
        int INT_0 = 0;
        int INT_1 = 1;
        int INT_2 = 2;
        int INT_3 = 3;
        int INT_4 = 4;
        int INT_9 = 9;
        int INT_10 = 10;
        int INT_15 = 15;
        int INT_20 = 20;
        int INT_60 = 60;
        int HUNDRED = 100;
        int TWO_HUNDRED = 200;
        int FIVE_HUNDRED = 500;
        int THOUSAND = 1000;
        int TEN_THOUSAND = 10000;
        int HUNDRED_THOUSAND = 100000;
        long LONG_200 = 200L;
        String STRING_0 = "0";
        String STRING_MINUS_1 = "-1";
        String STRING_1 = "1";
        String STRING_2 = "2";
        String STRING_3 = "3";
        String STRING_00 = "00";
        String STRING_02 = "02";
        String STRING_05 = "05";
        String STRING_07 = "07";
        String STRING_08 = "08";
        String STRING_14 = "14";
        String STRING_99 = "99";
        long LONG_MINUS_1 = -1L;
        long LONG_0 = 0L;
        long LONG_1 = 1L;
        long LONG_2 = 2L;
        long LONG_3 = 3L;
        long LONG_99999 = 99999L;
        byte BYTE_0 = 0;
        byte BYTE_1 = 1;
        byte BYTE_2 = 2;
        byte BYTE_3 = 3;
        byte BYTE_4 = 4;
        byte BYTE_5 = 5;
        byte BYTE_6 = 6;
        byte BYTE_7 = 7;
        byte BYTE_8 = 8;
        byte BYTE_9 = 9;
        BigDecimal DECIMAL_0 = BigDecimal.ZERO;
        BigDecimal DECIMAL_1 = BigDecimal.ONE;
        BigDecimal DECIMAL_2 = BigDecimal.valueOf(2L);
        BigDecimal DECIMAL_3 = BigDecimal.valueOf(3L);
        BigDecimal DECIMAL_4 = BigDecimal.valueOf(4L);
        BigDecimal DECIMAL_5 = BigDecimal.valueOf(5L);
        BigDecimal DECIMAL_6 = BigDecimal.valueOf(6L);
        BigDecimal DECIMAL_7 = BigDecimal.valueOf(7L);
        BigDecimal DECIMAL_8 = BigDecimal.valueOf(8L);
        BigDecimal DECIMAL_9 = BigDecimal.valueOf(9L);
        BigDecimal DECIMAL_MINUS_1 = BigDecimal.valueOf(-1L);
        BigDecimal DECIMAL_HUNDRED = BigDecimal.valueOf(100L);
        BigDecimal DECIMAL_MILLION = BigDecimal.valueOf(1000000L);

        //30分钟毫秒
        Long MILLIS_30_MIN = 1800000L;
        Long MILLIS_1_HOUR = 3600000L;
        Long MILLIS_4_HOUR = 14400000L;
        Long MILLIS_1_DAY = 86400000L;
        //1年毫秒
        Long MILLIS_1_YEAR = 31536000000L;

        //默认分批查询一批次数
        Integer PAGE_SIZE = 10000;

        //Excel支持最大行数
//        Integer EXCEL_MAX_SIZE = 1048576;
        Integer EXCEL_MAX_SIZE = 1000000;

        String DN_ETA_DATE = "20991231000000";
        Long DN_ETA_DATE_COMPARE = 4039344000000L;
    }

    interface HttpCode {
        int OK = 200;
        int CREATED = 201;
        int ACCEPTED = 202;
        int NO_CONTENT = 204;
        int BAD_REQUEST = 400;
        int UNAUTHORIZED = 401;
        int FORBIDDEN = 403;
        int NOT_FOUND = 404;
        int METHOD_NOT_ALLOWED = 405;
        int CONFLICT = 409;
        int INTERNAL_SERVER_ERROR = 500;
        int SERVICE_UNAVAILABLE = 503;
    }

    interface ContentType {
        String JSON_UTF8 = "application/json;charset=UTF-8";
        String JSON = "application/json";
        String XML = "application/xml";
        String FORM = "application/x-www-form-urlencoded";
        String MULTIPART = "multipart/form-data";
        String EXCEL = "application/vnd.ms-exce";
        String FILE = "Content-disposition";
    }

    interface TimeZone {
        String UTC = "UTC";
        String GMT = "GMT";
        String UTC_8 = "UTC+8";
    }

    interface Language {
        String EN = "en";
    }

    interface Es {
        String KEYWORD = "keyword";
    }

    interface MicroService {
        String AUTH = "SSC--auth";
        String SCS = "SSC--scs";
        String WMS = "SSC--wms";
    }

    interface BasisBean {
        String Order = "basisOrderDomainService";
        String Stock = "basisStockDomainService";
        String Delivery = "basisDeliveryDomainService";
    }

}
