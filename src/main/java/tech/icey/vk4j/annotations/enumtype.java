package tech.icey.vk4j.annotations;

public @interface enumtype {
    Class<?> value() default Object.class;
    String comment() default "";
}
