/*
 * This file is part of gson-simple, licensed under the MIT License (MIT).
 *
 * Copyright (c) Jamie Mansfield <https://www.jamiemansfield.me/>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package me.jamiemansfield.gsonsimple;

import static me.jamiemansfield.gsonsimple.GsonChecks.isBoolean;
import static me.jamiemansfield.gsonsimple.GsonChecks.isNumber;
import static me.jamiemansfield.gsonsimple.GsonChecks.isString;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public final class GsonRequirements {

    public static JsonObject requireObject(final JsonElement element, final String errorMessage) throws JsonParseException {
        if (!element.isJsonObject()) {
            throw new JsonParseException(errorMessage);
        }
        return element.getAsJsonObject();
    }

    public static JsonArray requireArray(final JsonElement element, final String errorMessage) throws JsonParseException {
        if (!element.isJsonArray()) {
            throw new JsonParseException(errorMessage);
        }
        return element.getAsJsonArray();
    }

    public static String requireString(final JsonElement element, final String errorMessage) throws JsonParseException {
        if (!isString(element)) {
            throw new JsonParseException(errorMessage);
        }
        return element.getAsString();
    }

    public static boolean requireBoolean(final JsonElement element, final String errorMessage) throws JsonParseException {
        if (!isBoolean(element)) {
            throw new JsonParseException(errorMessage);
        }
        return element.getAsBoolean();
    }

    public static int requireInt(final JsonElement element, final String errorMessage) throws JsonParseException {
        if (!isNumber(element)) {
            throw new JsonParseException(errorMessage);
        }
        return element.getAsInt();
    }

    public static long requireLong(final JsonElement element, final String errorMessage) throws JsonParseException {
        if (!isNumber(element)) {
            throw new JsonParseException(errorMessage);
        }
        return element.getAsLong();
    }

    public static double requireDouble(final JsonElement element, final String errorMessage) throws JsonParseException {
        if (!isNumber(element)) {
            throw new JsonParseException(errorMessage);
        }
        return element.getAsDouble();
    }

    public static float requireFloat(final JsonElement element, final String errorMessage) throws JsonParseException {
        if (!isNumber(element)) {
            throw new JsonParseException(errorMessage);
        }
        return element.getAsFloat();
    }

    private GsonRequirements() {
    }

}
