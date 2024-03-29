package com.jdbc.jwt.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum Status {
    NEW("Новый"),
    BLOCK("Заблокирован"),
    UNLOCK("Разблокированный"),
    DELETE("Удаленный")
    ;
    String DESCRIPTION;



}
