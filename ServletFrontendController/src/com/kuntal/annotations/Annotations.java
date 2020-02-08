package com.kuntal.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author Danech Kuntal
 *
 */
public class Annotations {
	@Target({ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface GET {
	    Class<?>[] groups() default {};
	    String message() default "";
	}
	@Target({ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface POST {
	    Class<?>[] groups() default {};
	    String message() default "";
	}
	@Target({ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface DELETE {
	    Class<?>[] groups() default {};
	    String message() default "";
	}
	@Target({ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface PUT {
	    Class<?>[] groups() default {};
	    String message() default "";
	}
	@Target({ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface TRACE {
	    Class<?>[] groups() default {};
	    String message() default "";
	}
	@Target({ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface OPTION {
	    Class<?>[] groups() default {};
	    String message() default "";
	}
	@Target({ElementType.METHOD, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface HEAD {
	    Class<?>[] groups() default {};
	    String message() default "";
	}
	@Target({ElementType.TYPE, ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface CONTROLLER {
	    Class<?>[] groups() default {};
	    String message() default "";
	}
}
