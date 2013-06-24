import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolciy.RUNTIME)

public @interface SQLInteger {
	String name() default "";
	Constraints constraints() default @Constraints;
}