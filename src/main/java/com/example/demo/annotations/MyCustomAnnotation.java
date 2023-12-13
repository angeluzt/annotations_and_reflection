package com.example.demo.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.CLASS) //Annotations are to be recorded in the class file by the compiler but
                                    // need not be retained by the VM at run time
//@Retention(RetentionPolicy.SOURCE) //Annotations are to be discarded by the compiler.
@Retention(RetentionPolicy.RUNTIME) //Annotations are to be recorded in the class file by the compiler and
                                    // Retained by the VM at run time
@Target(ElementType.TYPE)
public @interface MyCustomAnnotation {
    String value() default "default value"; // String element with a default value
    int count() default 0;                  // Integer element with a default value
    boolean enabled() default true;         // Boolean element with a default value

    // You can add more elements as needed
    // ReturnType elementName() default DefaultValue;
}
