package Java.grundlagen.j6.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)

public @interface Excercise1 {
    String[] authors();
    String description() default "";
    String version() default "0.0.1";
}