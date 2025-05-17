package club.doki7.ffm.annotation;

public @interface enumtype {
    Class<?> value() default Object.class;
}
