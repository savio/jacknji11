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

import com.sun.jna.Callback;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;

public class CK_C_INITIALIZE_ARGS extends Structure {
    public CK_CREATEMUTEX CreateMutex;
    public CK_DESTROYMUTEX DestroyMutex;
    public CK_LOCKMUTEX LockMutex;
    public CK_UNLOCKMUTEX UnlockMutex;
    public NativeLong flags;
    public Pointer pReserved;
    
    public interface CK_CREATEMUTEX extends Callback {
        NativeLong invoke(PointerByReference mutex);
    }
    public interface CK_DESTROYMUTEX extends Callback {
            NativeLong invoke(Pointer mutex);
    }
    public interface CK_LOCKMUTEX extends Callback {
            NativeLong invoke(Pointer mutex);
    }
    public interface CK_UNLOCKMUTEX extends Callback {
        NativeLong invoke(Pointer mutex);
    }
}