package net.gopine.events;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The class used to subscribe events to the EventManager.
 * @author MatthewTGM | MatthewTGM#4058
 * @since b0.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EventSubscriber {

    byte value() default EventPriority.THIRD;

}
