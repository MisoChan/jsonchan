package com.launchpersimmonseeds.jsonchan.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@java.lang.annotation.Retention(RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonValue {
    String column();
}
