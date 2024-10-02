package tech.icey.panama.annotation;

public @interface enumtype {
    Class<?> value() default Object.class;
}
