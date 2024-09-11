import tech.icey.vk4j.Create;
import tech.icey.vk4j.array.IntArray;
import tech.icey.vk4j.datatype.Example;
import static tech.icey.vk4j.datatype.Example.Nested;

import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

public class TestExampleStruct {
    public static void main(String[] args) {
        try (Arena arena = Arena.ofConfined()) {
            Example example = Create.create(Example.FACTORY, arena);

            IntArray arr = example.arr();
            arr.set(0, 114);
            arr.set(1, 514);
            arr.set(2, 1919);
            arr.set(3, 810);

            assert arr.get(0) == 114;
            assert arr.get(1) == 514;
            assert arr.get(2) == 1919;
            assert arr.get(3) == 810;

            Nested nested = Create.create(Example.Nested.FACTORY, arena);
            assert nested != null;
            nested.a(114);
            nested.b(514);

            example.pNested(nested);

            Nested fetched = example.pNested();
            assert fetched != null;
            assert fetched.a() == 114;
            assert fetched.b() == 514;

            System.err.println(Arrays.toString(nested.segment().toArray(ValueLayout.JAVA_BYTE)));
            System.err.println(Arrays.toString(example.segment().toArray(ValueLayout.JAVA_BYTE)));
        }
    }
}
