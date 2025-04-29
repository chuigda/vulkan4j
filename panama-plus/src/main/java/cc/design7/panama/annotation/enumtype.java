package cc.design7.panama.annotation;

public @interface enumtype {
    Class<?> value() default Object.class;
}
