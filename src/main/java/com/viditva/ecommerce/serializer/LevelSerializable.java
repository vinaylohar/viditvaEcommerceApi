package com.viditva.ecommerce.serializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("level")
public interface LevelSerializable {
    public static final Integer DEFAULT_LEVEL = 1;
    public int getLevel();
}
