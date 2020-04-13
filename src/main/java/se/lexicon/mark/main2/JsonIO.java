package se.lexicon.mark.main2;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class JsonIO {
    private ObjectMapper objectMapper;

    public JsonIO() {
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
        objectMapper.registerModule(new JavaTimeModule());
    }

    public <T> boolean writeToJson(List<T> source, File name) {
        boolean success = false;

        try {
            objectMapper.writeValue(name, source);
            success = true;

             } catch (IOException e) {
            e.printStackTrace();
        }
        return success;
    }

    public <T> List<T> readFromJson(File name, Supplier<List<T>> supplier) {
        JavaType type = null;
        if (name.getName().contains("cars")) {
            type = objectMapper.getTypeFactory().constructCollectionType(List.class, CarRegister.class);
        } else if (name.getName().contains("owners")) {
            type = objectMapper.getTypeFactory().
                    constructCollectionType(List.class, OwnerRegister.class);
        }
            List<T> deSerializedList = supplier.get();
            try {
                deSerializedList = objectMapper.readValue(name, type);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return deSerializedList;
        }

}

