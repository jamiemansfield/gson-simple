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

import com.google.gson.JsonElement;

/**
 * Simple checks to determine the underlying type of a
 * {@link JsonElement JSON element.}
 *
 * @author Jamie Mansfield
 * @since 0.1.0
 */
public final class GsonChecks {

    /**
     * Establishes whether the {@link JsonElement JSON element} represents
     * a string.
     *
     * @param element The element to check
     * @return {@code true} if the element represents a string;
     *         otherwise {@code false}
     */
    public static boolean isString(final JsonElement element) {
        return element.isJsonPrimitive() &&
                element.getAsJsonPrimitive().isString();
    }

    /**
     * Establishes whether the {@link JsonElement JSON element} represents
     * a boolean.
     *
     * @param element The element to check
     * @return {@code true} if the element represents a boolean;
     *         otherwise {@code false}
     */
    public static boolean isBoolean(final JsonElement element) {
        return element.isJsonPrimitive() &&
                element.getAsJsonPrimitive().isBoolean();
    }

    /**
     * Establishes whether the {@link JsonElement JSON element} represents
     * a number.
     *
     * @param element The element to check
     * @return {@code true} if the element represents a number;
     *         otherwise {@code false}
     */
    public static boolean isNumber(final JsonElement element) {
        return element.isJsonPrimitive() &&
                element.getAsJsonPrimitive().isNumber();
    }

    private GsonChecks() {
    }

}
