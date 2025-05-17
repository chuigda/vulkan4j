package club.doki7.ffm.annotation;

import java.lang.annotation.Documented;

@Documented
public @interface enumtype {
    Class<?> value() default Object.class;
}
