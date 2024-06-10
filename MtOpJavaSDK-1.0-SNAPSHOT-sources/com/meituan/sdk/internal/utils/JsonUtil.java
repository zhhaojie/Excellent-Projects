package com.meituan.sdk.internal.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Type;

public class JsonUtil {
    private static final Gson gson = new GsonBuilder()
            .disableHtmlEscaping()
            .registerTypeAdapter(Void.class, VoidTypeAdapter.getVoidTypeAdapter())
            .registerTypeAdapter(void.class, VoidTypeAdapter.getVoidTypeAdapter())
            .create();

    private JsonUtil() {
    }

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }


    public static <T> T fromJson(String json, Class<T> tClass) {
        return gson.fromJson(json, tClass);
    }

    public static <T> T fromJson(String json, Type type) {
        return gson.fromJson(json, type);
    }

    private static final class VoidTypeAdapter extends TypeAdapter<Void> {
        private static final TypeAdapter<Void> voidTypeAdapter = new VoidTypeAdapter();

        private VoidTypeAdapter() {
        }

        static TypeAdapter<Void> getVoidTypeAdapter() {
            return voidTypeAdapter;
        }

        @Override
        @SuppressWarnings("resource")
        public void write(final JsonWriter out, final Void value)
                throws IOException {
            out.nullValue();
        }

        @Override
        public Void read(final JsonReader in)
                throws IOException {
            // Skip the current JSON tokens stream value entirely
            in.skipValue();
            return null;
        }
    }
}
