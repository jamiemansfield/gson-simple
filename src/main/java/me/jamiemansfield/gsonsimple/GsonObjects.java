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

import static me.jamiemansfield.gsonsimple.GsonRequirements.requireArray;
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireBoolean;
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireInt;
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireObject;
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireString;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public final class GsonObjects {

    public static JsonElement get(final JsonObject object, final String key) throws JsonParseException {
        if (!object.has(key)) {
            throw new JsonParseException("Object missing '" + key + "' entry!");
        }
        return object.get(key);
    }

    public static JsonObject getObject(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireObject(value, "'" + key + "' entry must be an object!");
    }

    public static JsonArray getArray(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireArray(value, "'" + key + "' entry must be an array!");
    }

    public static String getString(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireString(value, "'" + key + "' entry must be a string!");
    }

    public static boolean getBoolean(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireBoolean(value, "'" + key + "' entry must be a boolean!");
    }

    public static int getInt(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireInt(value, "'" + key + "' entry must be an int!");
    }

    private GsonObjects() {
    }

}
