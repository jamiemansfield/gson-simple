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
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireDouble;
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireFloat;
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireInt;
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireLong;
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireObject;
import static me.jamiemansfield.gsonsimple.GsonRequirements.requireString;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * Utility for grabbing {@link JsonElement elements} from
 * {@link JsonObject JSON objects}.
 *
 * @author Jamie Mansfield
 * @since 0.1.0
 */
public final class GsonObjects {

    /**
     * Gets an {@link JsonElement element} from the given {@link JsonObject object},
     * throwing a {@link JsonParseException} if not present.
     *
     * @param object The JSON object
     * @param key The key of the entry
     * @return The JSON element
     * @throws JsonParseException If the object is missing the entry
     */
    public static JsonElement get(final JsonObject object, final String key) throws JsonParseException {
        if (!object.has(key)) {
            throw new JsonParseException("Object missing '" + key + "' entry!");
        }
        return object.get(key);
    }

    /**
     * Gets an {@link JsonObject object} from the given {@link JsonObject object},
     * throwing a {@link JsonParseException} if not present.
     *
     * @param object The JSON object
     * @param key The key of the entry
     * @return The JSON object
     * @throws JsonParseException If the object is missing the entry, or it isn't an object
     */
    public static JsonObject getObject(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireObject(value, key);
    }

    /**
     * Gets an {@link JsonArray array} from the given {@link JsonObject object},
     * throwing a {@link JsonParseException} if not present.
     *
     * @param object The JSON object
     * @param key The key of the entry
     * @return The JSON array
     * @throws JsonParseException If the object is missing the entry, or it isn't an array
     */
    public static JsonArray getArray(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireArray(value, key);
    }

    /**
     * Gets a string from the given {@link JsonObject object}, throwing a
     * {@link JsonParseException} if not present.
     *
     * @param object The JSON object
     * @param key The key of the entry
     * @return The value
     * @throws JsonParseException If the object is missing the entry, or it isn't a string
     */
    public static String getString(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireString(value, key);
    }

    /**
     * Gets a boolean from the given {@link JsonObject object}, throwing a
     * {@link JsonParseException} if not present.
     *
     * @param object The JSON object
     * @param key The key of the entry
     * @return The value
     * @throws JsonParseException If the object is missing the entry, or it isn't a boolean
     */
    public static boolean getBoolean(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireBoolean(value, key);
    }

    /**
     * Gets an integer from the given {@link JsonObject object}, throwing a
     * {@link JsonParseException} if not present.
     *
     * @param object The JSON object
     * @param key The key of the entry
     * @return The value
     * @throws JsonParseException If the object is missing the entry, or it isn't an integer
     */
    public static int getInt(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireInt(value, key);
    }

    /**
     * Gets a double from the given {@link JsonObject object}, throwing a
     * {@link JsonParseException} if not present.
     *
     * @param object The JSON object
     * @param key The key of the entry
     * @return The value
     * @throws JsonParseException If the object is missing the entry, or it isn't a double
     */
    public static double getDouble(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireDouble(value, key);
    }

    /**
     * Gets a long from the given {@link JsonObject object}, throwing a
     * {@link JsonParseException} if not present.
     *
     * @param object The JSON object
     * @param key The key of the entry
     * @return The value
     * @throws JsonParseException If the object is missing the entry, or it isn't a long
     */
    public static long getLong(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireLong(value, key);
    }

    /**
     * Gets a float from the given {@link JsonObject object}, throwing a
     * {@link JsonParseException} if not present.
     *
     * @param object The JSON object
     * @param key The key of the entry
     * @return The value
     * @throws JsonParseException If the object is missing the entry, or it isn't a float
     */
    public static float getFloat(final JsonObject object, final String key) throws JsonParseException {
        final JsonElement value = get(object, key);
        return requireFloat(value, key);
    }

    private GsonObjects() {
    }

}
