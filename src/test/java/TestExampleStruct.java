import tech.icey.vk4j.Create;
import tech.icey.vk4j.datatype.Example;
import static tech.icey.vk4j.datatype.Example.Nested;

import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

public class TestExampleStruct {
    public static void main(String[] args) {
        try (Arena arena = Arena.ofConfined()) {
            Example example = Create.create(Example.FACTORY, arena);

            example.pNestedSafe(Create.create(Example.Nested.FACTORY, arena));

            Nested nested = example.pNestedSafe();
            assert nested != null;
            nested.a(114);
            nested.b(514);

            assert nested.a() == 114;
            assert nested.b() == 514;

            System.err.println(Arrays.toString(nested.segment().toArray(ValueLayout.JAVA_BYTE)));
            System.err.println(Arrays.toString(example.segment().toArray(ValueLayout.JAVA_BYTE)));
        }
    }
}
