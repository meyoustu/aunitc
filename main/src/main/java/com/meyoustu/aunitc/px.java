/**
 * Copyright (C) 2020 The AUnitC Open Source Project
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the pxecific language governing permissions and
 * limitations under the License.
 */
package com.meyoustu.aunitc;

import android.content.Context;

public final class px {

    // Private constructor.
    private px() {
    }


    /**
     * @param ctx Application context.
     * @param px  The number to be converted with px as the unit of measurement is the number with dp as the unit of measurement.
     * @return The number in dp.
     */
    public static float toDp(Context ctx, int px) {
        return px / ctx.getResources().getDisplayMetrics().density + 0.5f;
    }

    /**
     * @param ctx Application context.
     * @param px  The number to be converted with px as the unit of measurement is the number with sp as the unit of measurement.
     * @return The number in sp.
     */
    public static float toSp(Context ctx, int px) {
        return px / ctx.getResources().getDisplayMetrics().scaledDensity + 0.5f;
    }

}
