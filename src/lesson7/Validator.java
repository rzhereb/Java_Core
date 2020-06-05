package lesson7;

import java.lang.reflect.Field;

public final class Validator {

    public static void validateInt(Class<?> someClass, Object object) {
        Field[] declaredFields = someClass.getDeclaredFields();
        Class<?> aClass = object.getClass();
        System.out.println(aClass);
        for (Field declaredField : declaredFields) {
            if (declaredField.getType().equals(int.class)) {
                if (declaredField.isAnnotationPresent(ValidateInt.class)) {
                    try {
                        ValidateInt annotation = declaredField.getAnnotation(ValidateInt.class);
                        declaredField.setAccessible(true);
                        int fieldInt = declaredField.getInt(object);
                        if (fieldInt > annotation.max() || fieldInt < annotation.min()) {
                            System.out.println("WRONG VALUE: " + fieldInt);
                            declaredField.setInt(object, annotation.defaultValue());
                        }

                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
