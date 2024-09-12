import tech.icey.vk4j.Create;
import tech.icey.vk4j.array.IntArray;
import tech.icey.vk4j.datatype.Example;
import tech.icey.vk4j.enumtype.ExampleEnum;
import tech.icey.vk4j.ptr.IntPtr;

import static tech.icey.vk4j.datatype.Example.Nested;

import java.lang.foreign.Arena;

public class TestExampleStruct {
    public static void main(String[] args) {
        try (Arena arena = Arena.ofConfined()) {
            Example example = Create.create(Example.FACTORY, arena);
            example.a(114514);
            example.b(1919810);
            example.d(7355608);

            IntArray arr = example.arr();
            arr.set(0, 114);
            arr.set(1, 514);
            arr.set(2, 1919);
            arr.set(3, 810);

            example.bitfield1(1145);
            example.bitfield2(224);

            assert arr.get(0) == 114;
            assert arr.get(1) == 514;
            assert arr.get(2) == 1919;
            assert arr.get(3) == 810;

            IntPtr pInt = IntArray.allocate(arena, 1).ptr();
            pInt.write(314159);
            example.pInt(pInt);

            Nested nested = Create.create(Example.Nested.FACTORY, arena);
            assert nested != null;
            nested.a(26);
            nested.b(535);

            example.pNested(nested);

            Nested fetched = example.pNested();
            assert fetched != null;
            assert fetched.a() == 114;
            assert fetched.b() == 514;

            Nested[] nestedArr = example.nestedArr();
            nestedArr[0].a(42);
            nestedArr[1].b(84);
            nestedArr[2].a(13);
            nestedArr[3].b(26);

            example.e(ExampleEnum.EXAMPLE_ENUM_VALUE2);
            Libdrill.dump_example(example);
        }
    }

    private static String toHexString(byte[] array) {
        var sb = new StringBuilder();

        for (byte b : array) {
            sb.append(String.format("%02X ", b));
        }

        return sb.toString();
    }
}
