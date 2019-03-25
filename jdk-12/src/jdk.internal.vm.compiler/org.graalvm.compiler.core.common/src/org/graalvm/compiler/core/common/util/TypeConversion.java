/*
 * Copyright (c) 2015, 2018, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


package org.graalvm.compiler.core.common.util;

/**
 * Provides low-level value checks and conversion for signed and unsigned values of size 1, 2, and 4
 * bytes.
 */
public class TypeConversion {

    public static boolean isS1(long value) {
        return value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE;
    }

    public static boolean isU1(long value) {
        return value >= 0 && value <= 0xFF;
    }

    public static boolean isS2(long value) {
        return value >= Short.MIN_VALUE && value <= Short.MAX_VALUE;
    }

    public static boolean isU2(long value) {
        return value >= 0 && value <= 0xFFFF;
    }

    public static boolean isS4(long value) {
        return value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE;
    }

    public static boolean isU4(long value) {
        return value >= 0 && value <= 0xFFFFFFFFL;
    }

    public static byte asS1(long value) {
        assert isS1(value);
        return (byte) value;
    }

    public static byte asU1(long value) {
        assert isU1(value);
        return (byte) value;
    }

    public static short asS2(long value) {
        assert isS2(value);
        return (short) value;
    }

    public static short asU2(long value) {
        assert isU2(value);
        return (short) value;
    }

    public static int asS4(long value) {
        assert isS4(value);
        return (int) value;
    }

    public static int asU4(long value) {
        assert isU4(value);
        return (int) value;
    }
}