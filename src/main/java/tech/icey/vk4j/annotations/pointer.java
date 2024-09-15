package tech.icey.vk4j.annotations;

public @interface pointer {
    Class<?> target() default Object.class;
    String comment() default "";
}
