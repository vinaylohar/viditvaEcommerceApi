package com.viditva.ecommerce.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class LevelSerializer extends JsonSerializer<LevelSerializable> {
    private JsonSerializer<Object> defaultSerializer;

      public LevelSerializer(JsonSerializer<Object> serializer) {
          System.out.println("LevelSerializer!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
          defaultSerializer = serializer;
      }
    private static ThreadLocal<Integer> depth = new ThreadLocal<Integer>() {

        @Override
        protected Integer initialValue() {
            return 0;
        }

    };

    private String parentClass;
    @Override
    public void serialize(LevelSerializable value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        System.out.println("parentClass:" + parentClass);
        if(parentClass==null){
            parentClass = value.getClass().getName();
            System.out.println("New parentClass:" + parentClass);
        }else if(parentClass!= null && parentClass.equals(value.getClass().getName())){
            return;
        }
        defaultSerializer.serialize(value, jsonGenerator, serializerProvider);

/*        if (value.getLevel() > 1)
            return;
        defaultSerializer.serialize(value, jsonGenerator, serializerProvider);*/
    }

    @Override
    public boolean isEmpty(SerializerProvider provider, LevelSerializable value) {
        return (value == null || value.getLevel() > 1);
    }

}
