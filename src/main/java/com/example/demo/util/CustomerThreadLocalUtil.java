package com.example.demo.util;

public class CustomerThreadLocalUtil {
    private static final ThreadLocal<Boolean> forceCancelDnThreadLocal = new ThreadLocal<>();

    public CustomerThreadLocalUtil() {
    }

    public static void setForceCancelDn(Boolean forceCancelDn) {
        forceCancelDnThreadLocal.set(forceCancelDn);
    }

    public static Boolean getForceCancelDn() {
        try {
            return forceCancelDnThreadLocal.get() != null && forceCancelDnThreadLocal.get();
        } catch (Exception e) {
            return false;
        }
    }

    public static void delForceCancelDn() {
        forceCancelDnThreadLocal.remove();
    }
}
