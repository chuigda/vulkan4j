package tech.icey.vk4j.annotation;

public @interface enumtype {
    Class<?> value() default Object.class;
}
