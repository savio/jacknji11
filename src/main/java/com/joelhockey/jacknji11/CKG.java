/*
 * Copyright 2010 Joel Hockey (joel.hockey@gmail.com).  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *
 * THIS SOURCE CODE IS PROVIDED BY JOEL HOCKEY WITH A 30-DAY MONEY BACK
 * GUARANTEE.  IF THIS CODE DOES NOT MEAN WHAT IT SAYS IT MEANS WITHIN THE
 * FIRST 30 DAYS, SIMPLY RETURN THIS CODE IN ORIGINAL CONDITION FOR A PARTIAL
 * REFUND.  IN ADDITION, I WILL REFORMAT THIS CODE USING YOUR PREFERRED
 * BRACE-POSITIONING AND INDENTATION.  THIS WARRANTY IS VOID IF THE CODE IS
 * FOUND TO HAVE BEEN COMPILED.  NO FURTHER WARRANTY IS OFFERED.
 */

package com.joelhockey.jacknji11;

import java.util.Map;

/**
 * CKG_? constants.
 * @author Joel Hockey (joel.hockey@gmail.com)
 */
public class CKG {
    public static final int MGF1_SHA1   = 0x00000001;
    public static final int MGF1_SHA256 = 0x00000002;
    public static final int MGF1_SHA384 = 0x00000003;
    public static final int MGF1_SHA512 = 0x00000004;
    public static final int MGF1_SHA224 = 0x00000005;

    /** Maps from int value to String description (variable name). */
    private static final Map<Integer, String> I2S = C.createI2SMap(CKG.class);
    /**
     * Convert int constant value to name.
     * @param ckg value
     * @return name
     */
    public static final String I2S(int ckg) { return C.i2s(I2S, CKG.class.getSimpleName(), ckg); }
}
