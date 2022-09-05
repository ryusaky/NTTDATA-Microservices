package com.bootcamp.bank.components.dto;

import java.lang.reflect.Field;

public class BaseDto {

	@Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
    
        Class<?> thisClass = null;
        try {
            thisClass = Class.forName(this.getClass().getName());
    
            Field[] aClassFields = thisClass.getDeclaredFields();
            sb.append(this.getClass().getSimpleName() + " [ ");
            for(Field field : aClassFields){
                String fName = field.getName();
                field.setAccessible(true);
                sb.append("(" + field.getType() + ") " + fName + " = " + field.get(this) + ", ");
            }
            sb.append("]");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
