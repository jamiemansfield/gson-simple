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

/**
 * Utility for ensuring the types of {@link JsonElement elements}.
 *
 * @author Jamie Mansfield
 * @since 0.1.0
 */
public final class GsonRequirements {

    /**
     * Gets the {@link JsonElement} as a {@link JsonObject JSON object}.
     *
     * @param element The element
     * @param name The name of the element
     * @return A JSON object
     * @throws JsonParseException If the element isn't an object
     */
    public static JsonObject requireObject(final JsonElement element, final String name) throws JsonParseException {
        if (!element.isJsonObject()) {
            throw new JsonParseException("Expected '" + name + "' to be an object!");
        }
        return element.getAsJsonObject();
    }

    /**
     * Gets the {@link JsonElement} as a {@link JsonArray JSON array}.
     *
     * @param element The element
     * @param name The name of the element
     * @return A JSON array
     * @throws JsonParseException If the element isn't an array
     */
    public static JsonArray requireArray(final JsonElement element, final String name) throws JsonParseException {
        if (!element.isJsonArray()) {
            throw new JsonParseException("Expected '" + name + "' to be an array!");
        }
        return element.getAsJsonArray();
    }

    /**
     * Gets the {@link JsonElement} as a string.
     *
     * @param element The element
     * @param name The name of the element
     * @return The value
     * @throws JsonParseException If the element isn't a string
     */
    public static String requireString(final JsonElement element, final String name) throws JsonParseException {
        if (!isString(element)) {
            throw new JsonParseException("Expected '" + name + "' to be a string!");
        }
        return element.getAsString();
    }

    /**
     * Gets the {@link JsonElement} as a boolean.
     *
     * @param element The element
     * @param name The name of the element
     * @return The value
     * @throws JsonParseException If the element isn't a boolean
     */
    public static boolean requireBoolean(final JsonElement element, final String name) throws JsonParseException {
        if (!isBoolean(element)) {
            throw new JsonParseException("Expected '" + name + "' to be a boolean!");
        }
        return element.getAsBoolean();
    }

    /**
     * Gets the {@link JsonElement} as an integer.
     *
     * @param element The element
     * @param name The name of the element
     * @return The value
     * @throws JsonParseException If the element isn't an integer
     */
    public static int requireInt(final JsonElement element, final String name) throws JsonParseException {
        if (!isNumber(element)) {
            throw new JsonParseException("Expected '" + name + "' to be an integer!");
        }
        return element.getAsInt();
    }

    /**
     * Gets the {@link JsonElement} as a long.
     *
     * @param element The element
     * @param name The name of the element
     * @return The value
     * @throws JsonParseException If the element isn't a long
     */
    public static long requireLong(final JsonElement element, final String name) throws JsonParseException {
        if (!isNumber(element)) {
            throw new JsonParseException("Expected '" + name + "' to be a long!");
        }
        return element.getAsLong();
    }

    /**
     * Gets the {@link JsonElement} as a double.
     *
     * @param element The element
     * @param name The name of the element
     * @return The value
     * @throws JsonParseException If the element isn't a double
     */
    public static double requireDouble(final JsonElement element, final String name) throws JsonParseException {
        if (!isNumber(element)) {
            throw new JsonParseException("Expected '" + name + "' to be a double!");
        }
        return element.getAsDouble();
    }

    /**
     * Gets the {@link JsonElement} as a float.
     *
     * @param element The element
     * @param name The name of the element
     * @return The value
     * @throws JsonParseException If the element isn't a float
     */
    public static float requireFloat(final JsonElement element, final String name) throws JsonParseException {
        if (!isNumber(element)) {
            throw new JsonParseException("Expected '" + name + "' to be a float!");
        }
        return element.getAsFloat();
    }

    private GsonRequirements() {
    }

}
