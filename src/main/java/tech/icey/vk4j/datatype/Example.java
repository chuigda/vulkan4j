package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.array.IntArray;
import tech.icey.vk4j.ptr.IntPtr;
import tech.icey.vk4j.util.pointer;
import tech.icey.vk4j.util.unsafe;
import tech.icey.vk4j.util.unsigned;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

/// This class is an example, showing how C struct is represented in vk4j
///
/// Given the follow C struct
/// {@snippet lang=c :
/// struct Example {
///     int32_t a;
///     uint64_t b;
///     void *c;
///     long d;
///     struct Nested nested;
///     int32_t arr[4];
///     int bitfield1 : 24;
///     int bitfield2 : 8;
///     int32_t *pInt;
///     struct Nested *pNested;
///     struct Nested nestedArr[4];
/// };}
///
/// The corresponding Java class would be like this one.
public record Example(MemorySegment segment) {
    /// Nested struct in Example
    ///
    /// {@snippet lang=c :
    /// struct Nested {
    ///     uint32_t a;
    ///     uint32_t b;
    /// };}
    public record Nested(MemorySegment segment) {
        public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
                ValueLayout.JAVA_INT.withName("a"),
                ValueLayout.JAVA_INT.withName("b")
        );

        public static final PathElement PATH$a = PathElement.groupElement("a");
        public static final PathElement PATH$b = PathElement.groupElement("b");

        public static final OfInt LAYOUT$a = (OfInt) LAYOUT.select(PATH$a);
        public static final OfInt LAYOUT$b = (OfInt) LAYOUT.select(PATH$b);

        public static final long OFFSET$a = LAYOUT.byteOffset(PATH$a);
        public static final long OFFSET$b = LAYOUT.byteOffset(PATH$b);

        public @unsigned int a() {
            return segment.get(LAYOUT$a, OFFSET$a);
        }

        public void a(@unsigned int value) {
            segment.set(LAYOUT$a, OFFSET$a, value);
        }

        public @unsigned int b() {
            return segment.get(LAYOUT$b, OFFSET$b);
        }

        public void b(@unsigned int value) {
            segment.set(LAYOUT$b, OFFSET$b, value);
        }

        public static final class NestedFactory implements IFactory<Nested> {
            @Override
            public Class<Nested> clazz() {
                return Nested.class;
            }

            @Override
            public MemoryLayout layout() {
                return LAYOUT;
            }

            @Override
            public Nested create(MemorySegment segment) {
                return new Nested(segment);
            }

            @Override
            public Nested createUninit(MemorySegment segment) {
                return create(segment);
            }
        }

        public static final NestedFactory FACTORY = new NestedFactory();
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
            ValueLayout.JAVA_INT.withName("a"),
            ValueLayout.JAVA_LONG.withName("b"),
            ValueLayout.ADDRESS.withName("c"),
            NativeLayout.C_LONG.withName("d"),
            Nested.LAYOUT.withName("nested"),
            MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("arr"),
            ValueLayout.JAVA_INT.withName("bitfield$bitfield1_bitfield2"),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pInt"),
            ValueLayout.ADDRESS.withTargetLayout(Nested.LAYOUT).withName("pNested"),
            MemoryLayout.sequenceLayout(4, Nested.LAYOUT).withName("nestedArr")
    );

    public static final PathElement PATH$a = PathElement.groupElement("a");
    public static final PathElement PATH$b = PathElement.groupElement("b");
    public static final PathElement PATH$c = PathElement.groupElement("c");
    public static final PathElement PATH$d = PathElement.groupElement("d");
    public static final PathElement PATH$nested = PathElement.groupElement("nested");
    public static final PathElement PATH$arr = PathElement.groupElement("arr");
    public static final PathElement PATH$bitfield$bitfield1_bitfield2 = PathElement.groupElement("bitfield$bitfield1_bitfield2");
    public static final PathElement PATH$pInt = PathElement.groupElement("pInt");
    public static final PathElement PATH$pNested = PathElement.groupElement("pNested");
    public static final PathElement PATH$nestedArr = PathElement.groupElement("nestedArr");

    public static final OfInt LAYOUT$a = (OfInt) LAYOUT.select(PATH$a);
    public static final OfLong LAYOUT$b = (OfLong) LAYOUT.select(PATH$b);
    public static final AddressLayout LAYOUT$c = (AddressLayout) LAYOUT.select(PATH$c);
    public static final ValueLayout LAYOUT$d = (ValueLayout) LAYOUT.select(PATH$d);
    public static final StructLayout LAYOUT$nested = (StructLayout) LAYOUT.select(PATH$nested);
    public static final SequenceLayout LAYOUT$arr = (SequenceLayout) LAYOUT.select(PATH$arr);
    public static final OfInt LAYOUT$bitfield$bitfield1_bitfield2 = (OfInt) LAYOUT.select(PATH$bitfield$bitfield1_bitfield2);
    public static final AddressLayout LAYOUT$pInt = (AddressLayout) LAYOUT.select(PATH$pInt);
    public static final AddressLayout LAYOUT$pNested = (AddressLayout) LAYOUT.select(PATH$pNested);
    public static final SequenceLayout LAYOUT$nestedArr = (SequenceLayout) LAYOUT.select(PATH$nestedArr);

    public static final long OFFSET$a = LAYOUT.byteOffset(PATH$a);
    public static final long OFFSET$b = LAYOUT.byteOffset(PATH$b);
    public static final long OFFSET$c = LAYOUT.byteOffset(PATH$c);
    public static final long OFFSET$d = LAYOUT.byteOffset(PATH$d);
    public static final long OFFSET$nested = LAYOUT.byteOffset(PATH$nested);
    public static final long OFFSET$arr = LAYOUT.byteOffset(PATH$arr);
    public static final long OFFSET$bitfield$bitfield1_bitfield2 = LAYOUT.byteOffset(PATH$bitfield$bitfield1_bitfield2);
    public static final long OFFSET$pInt = LAYOUT.byteOffset(PATH$pInt);
    public static final long OFFSET$pNested = LAYOUT.byteOffset(PATH$pNested);
    public static final long OFFSET$nestedArr = LAYOUT.byteOffset(PATH$nestedArr);

    public int a() {
        return segment.get(LAYOUT$a, OFFSET$a);
    }

    public void a(int value) {
        segment.set(LAYOUT$a, OFFSET$a, value);
    }

    public @unsigned long b() {
        return segment.get(LAYOUT$b, OFFSET$b);
    }

    public void b(@unsigned long value) {
        segment.set(LAYOUT$b, OFFSET$b, value);
    }

    public @pointer("void") MemorySegment c() {
        return segment.get(LAYOUT$c, OFFSET$c);
    }

    public void c(@pointer("void") MemorySegment value) {
        segment.set(LAYOUT$c, OFFSET$c, value);
    }

    public long d() {
        return NativeLayout.readCLong(segment, OFFSET$d);
    }

    public void d(long value) {
        NativeLayout.writeCLong(segment, OFFSET$d, value);
    }

    public Nested nested() {
        return new Nested(segment.asSlice(OFFSET$nested, LAYOUT$nested));
    }

    public void nested(Nested value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$nested, LAYOUT$nested.byteSize());
    }

    public IntArray arr() {
        return new IntArray(segment.asSlice(OFFSET$arr, LAYOUT$arr), LAYOUT$arr.elementCount());
    }

    public void arr(IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$arr, LAYOUT$arr.byteSize());
    }

    public int bitfield1() {
        return segment.get(LAYOUT$bitfield$bitfield1_bitfield2, OFFSET$bitfield$bitfield1_bitfield2) >> 8;
    }

    public void bitfield1(int value) {
        int original = segment.get(LAYOUT$bitfield$bitfield1_bitfield2, OFFSET$bitfield$bitfield1_bitfield2);
        int newValue = (value << 8) | (original & 0xFF);
        segment.set(LAYOUT$bitfield$bitfield1_bitfield2, OFFSET$bitfield$bitfield1_bitfield2, newValue);
    }

    public int bitfield2() {
        return segment.get(LAYOUT$bitfield$bitfield1_bitfield2, OFFSET$bitfield$bitfield1_bitfield2) & 0xFF;
    }

    public void bitfield2(int value) {
        int original = segment.get(LAYOUT$bitfield$bitfield1_bitfield2, OFFSET$bitfield$bitfield1_bitfield2);
        int newValue = (original & 0xFFFFFF00) | value;
        segment.set(LAYOUT$bitfield$bitfield1_bitfield2, OFFSET$bitfield$bitfield1_bitfield2, newValue);
    }

    public IntPtr pInt() {
        MemorySegment s = segment.get(LAYOUT$pInt, OFFSET$pInt);
        if (s.address() == 0) {
            return null;
        }

        return new IntPtr(s);
    }

    public void pInt(IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        segment.set(LAYOUT$pInt, OFFSET$pInt, s);
    }

    public MemorySegment pIntRaw() {
        return segment.get(LAYOUT$pInt, OFFSET$pInt);
    }

    @unsafe
    public void pIntRaw(MemorySegment value) {
        segment.set(LAYOUT$pInt, OFFSET$pInt, value);
    }

    public Nested pNested() {
        MemorySegment s = segment.get(LAYOUT$pNested, OFFSET$pNested);
        if (s.address() == 0) {
            return null;
        }

        return new Nested(s);
    }

    public void pNested(Nested value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        segment.set(LAYOUT$pNested, OFFSET$pNested, s);
    }

    public MemorySegment pNestedRaw() {
        return segment.get(LAYOUT$pNested, OFFSET$pNested);
    }

    @unsafe
    public void pNestedRaw(MemorySegment value) {
        segment.set(LAYOUT$pNested, OFFSET$pNested, value);
    }

    public Nested[] nestedArr() {
        MemorySegment s = segment.asSlice(OFFSET$nestedArr, LAYOUT$nestedArr.byteSize());
        Nested[] arr = new Nested[(int)LAYOUT$nestedArr.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Nested(s.asSlice(i * Nested.LAYOUT.byteSize(), Nested.LAYOUT.byteSize()));
        }
        return arr;
    }

    public void nestedArr(Nested[] value) {
        MemorySegment s = segment.asSlice(OFFSET$nestedArr, LAYOUT$nestedArr.byteSize());
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * Nested.LAYOUT.byteSize(), Nested.LAYOUT.byteSize());
        }
    }

    public Nested nestArrAt(long index) {
        MemorySegment s = segment.asSlice(OFFSET$nestedArr, LAYOUT$nestedArr.byteSize());
        return new Nested(s.asSlice(index * Nested.LAYOUT.byteSize(), Nested.LAYOUT.byteSize()));
    }

    public void nestArrAt(long index, Nested value) {
        MemorySegment s = segment.asSlice(OFFSET$nestedArr, LAYOUT$nestedArr.byteSize());
        MemorySegment.copy(value.segment(), 0, s, index * Nested.LAYOUT.byteSize(), Nested.LAYOUT.byteSize());
    }

    public MemorySegment nestedArrRaw() {
        return segment.asSlice(OFFSET$nestedArr, LAYOUT$nestedArr.byteSize());
    }

    public void nestedArrRaw(MemorySegment value) {
        MemorySegment.copy(value, 0, segment, OFFSET$nestedArr, LAYOUT$nestedArr.byteSize());
    }

    public static final class ExampleFactory implements IFactory<Example> {
        @Override
        public Class<Example> clazz() {
            return Example.class;
        }

        @Override
        public MemoryLayout layout() {
            return Example.LAYOUT;
        }

        @Override
        public Example create(MemorySegment segment) {
            return new Example(segment);
        }

        @Override
        public Example createUninit(MemorySegment segment) {
            // For types without field default values, this method is trivial
            return create(segment);
        }
    }

    public static final ExampleFactory FACTORY = new ExampleFactory();
}
