package tech.icey.vk4j.enumtype;

/// Enum type in {@link tech.icey.vk4j.datatype.Example}
///
/// {@snippet lang=c :
/// enum ExampleEnum {
///     EXAMPLE_ENUM_VALUE1 = 0,
///     EXAMPLE_ENUM_VALUE2 = 1
/// };}
public class ExampleEnum {
    private ExampleEnum(int value) {
        this.value = value;
    }

    public final int value;

    public static final ExampleEnum EXAMPLE_ENUM_VALUE1 = new ExampleEnum(0);
    public static final ExampleEnum EXAMPLE_ENUM_VALUE2 = new ExampleEnum(1);
}
