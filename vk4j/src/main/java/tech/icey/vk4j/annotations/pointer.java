package tech.icey.vk4j.annotations;

/// A marker annotation to indicate that the annotated value is a pointer.
///
/// This annotation has two usages:
/// <ul>
///     <li>When used on a {@link java.lang.foreign.MemorySegment}, this indicates what the segment
///         "points to" (i.e. the target type of the pointer).</li>
///     <li>When used on Vulkan command parameter, this indicates that the parameter (struct,
///         union or handle)is passed as a pointer. When passing a parameter as a pointer, the
///         "content" of the parameter may be modified by the function. For example,
///         the following C function
/// {@snippet lang=c :
/// struct Struct { /* ... */ };
/// void func(struct Struct nonptr);
/// }
/// can be represented in Java as
/// {@snippet lang=java :
/// class Struct { /* ... */ };
/// void func(Struct nonptr);
/// }
/// while  the following C function
/// {@snippet lang=c :
/// void func(struct Struct *ptr);
/// }
/// would be represented in Java as
/// {@snippet lang=java :
/// class Struct { /* ... */ };
/// void func(@pointer(target = Struct.class) Struct ptr);
/// }
/// There's no difference in function signature between the two Java functions, but the second
/// function is annotated with {@code @pointer} to indicate that the parameter is passed as a
/// pointer.
///     </li>
/// </ul>
public @interface pointer {
    Class<?> target() default Object.class;
    String comment() default "";
}
