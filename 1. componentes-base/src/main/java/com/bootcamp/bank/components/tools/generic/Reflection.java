package com.bootcamp.bank.components.tools.generic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection {
	
   static <T> void inspect(Class<T> klazz) {
        Field[] fields = klazz.getDeclaredFields();
        System.out.printf("%d fields:%n", fields.length);
        for (Field field : fields) {
            System.out.printf("%s %s %s%n",
                Modifier.toString(field.getModifiers()),
                field.getType().getSimpleName(),
                field.getName()
            );
        }
    }
	/*
	 * public static <T> String toString(Class<T> klazz, T obj) { Field[] fields =
	 * klazz.getDeclaredFields(); String result=klazz.getName() +":{"; for (Field
	 * field : fields) { result =String.join(field.getName()+": "+obj.);
	 * System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()),
	 * field.getType().getSimpleName(), field.getName() ); } return result +"}"; }
	 */
}
