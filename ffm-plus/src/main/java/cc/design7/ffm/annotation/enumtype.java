package cc.design7.ffm.annotation;

public @interface enumtype {
    Class<?> value() default Object.class;
}
