package tech.icey.vk4j.annotations;

public @interface pointer {
    Class<?> value() default Object.class;
    String comment() default "";
}
