package com.viditva.ecommerce;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.viditva.ecommerce.entity.*;
import com.viditva.ecommerce.serializer.LevelSerializable;
import com.viditva.ecommerce.serializer.LevelSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@ComponentScan("com.viditva.ecommerce.service")
@ComponentScan("com.viditva.ecommerce.dao")
@ComponentScan("com.viditva.ecommerce.controller")*/
public class MyEcommerceApplication {
    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    private static ObjectMapper objectMapper = new ObjectMapper();
    public static void main(String[] args) {
        System.out.println("Starting");
        try {

            SpringApplication.run(MyEcommerceApplication.class, args);
            initSerlizer();
//            initAllSerlizers();
        } catch (Exception e ){
            System.out.println("Error" );
            e.printStackTrace();
        }
        System.out.println("Ending");
    }
    public static void initSerlizer(){
//        ObjectMapper mapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.registerModule(new SimpleModule() {
            @Override
            public void setupModule(SetupContext context) {
                super.setupModule(context);
                context.addBeanSerializerModifier(new BeanSerializerModifier() {
                    @Override
                    public JsonSerializer<?> modifySerializer(SerializationConfig config, BeanDescription desc, JsonSerializer<?> serializer) {
                        if (LevelSerializable.class.isAssignableFrom(desc.getBeanClass())) {
                            return new LevelSerializer((JsonSerializer<Object>) serializer);
                        }
                        return serializer;
                    }
                });
            }
        });



    }

    public static void initAllSerlizers() throws ClassNotFoundException{
       /* addModuleToObjectMapper(Pictures.class);
        addModuleToObjectMapper(Product.class);
        addModuleToObjectMapper(ProductCategory.class);
        addModuleToObjectMapper(Review.class);
        addModuleToObjectMapper(UserDetails.class);
        addModuleToObjectMapper(UserType.class);
        addModuleToObjectMapper(UserTypeMapping.class);*/
    }

   /* public static void addModuleToObjectMapper(Class<? extends LevelSerializable> type) throws ClassNotFoundException{
        SimpleModule module = new SimpleModule();
        module.addSerializer(type, new LevelSerializer());
        System.out.println("Serializer added:" + type);
        objectMapper.registerModule(module);
    }*/
}
