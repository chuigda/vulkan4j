package club.doki7.webgpu.handle;

import java.lang.foreign.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.annotation.*;

/// Represents an opaque handle type {@code ShaderModule}.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@link AddressLayout#byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record ShaderModule(@NotNull MemorySegment segment) implements IPointer {
    /// Represents a pointer to {@code ShaderModule} handle(s) in native memory.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@link AddressLayout#byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IPointer, Iterable<ShaderModule> {
        public long size() {
            return segment.byteSize() / ValueLayout.ADDRESS.byteSize();
        }

        public @Nullable ShaderModule read() {
            MemorySegment s = readRaw();
            if (s.equals(MemorySegment.NULL)) {
                return null;
            }
            return new ShaderModule(s);
        }

        public void write(@Nullable ShaderModule value) {
            writeRaw(value == null ? MemorySegment.NULL : value.segment());
        }

        public @Nullable ShaderModule read(long index) {
            MemorySegment s = readRaw(index);
            if (s.equals(MemorySegment.NULL)) {
                return null;
            }
            return new ShaderModule(s);
        }

        public void write(long index, @Nullable ShaderModule value) {
            writeRaw(index, value == null ? MemorySegment.NULL : value.segment());
        }

        public void write(@Nullable ShaderModule[] values) {
            for (int i = 0; i < values.length; i++) {
                write(i, values[i]);
            }
        }

        public void writeV(@Nullable ShaderModule value0, @Nullable ShaderModule ...values) {
            write(value0);
            for (int i = 0; i < values.length; i++) {
                write(i + 1, values[i]);
            }
        }

        public MemorySegment readRaw() {
            return segment.get(ValueLayout.ADDRESS, 0);
        }

        public MemorySegment readRaw(long index) {
            return segment.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
        }

        public void writeRaw(@NotNull MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, 0, value);
        }

        public void writeRaw(long index, @NotNull MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} handles,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * ValueLayout.ADDRESS.byteSize()));
        }

        public Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * ValueLayout.ADDRESS.byteSize()));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * ValueLayout.ADDRESS.byteSize(),
                (end - start) * ValueLayout.ADDRESS.byteSize()
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * ValueLayout.ADDRESS.byteSize()));
        }

        public static Ptr allocate(Arena arena) {
            return new Ptr(arena.allocate(ValueLayout.ADDRESS));
        }

        public static Ptr allocate(Arena arena, long size) {
            return new Ptr(arena.allocate(ValueLayout.ADDRESS, size));
        }

        public static Ptr allocate(Arena arena, @Nullable ShaderModule[] values) {
            Ptr ret = allocate(arena, values.length);
            for (int i = 0; i < values.length; i++) {
                ret.write(i, values[i]);
            }
            return ret;
        }

        public static Ptr allocateV(Arena arena, @Nullable ShaderModule value0, @Nullable ShaderModule ...values) {
            Ptr ret = allocate(arena, values.length + 1);
            ret.write(0, value0);
            for (int i = 0; i < values.length; i++) {
                ret.write(i + 1, values[i]);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<ShaderModule> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the handles.
        private static class Iter implements Iterator<ShaderModule> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= ValueLayout.ADDRESS.byteSize();
            }

            @Override
            public @Nullable ShaderModule next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                MemorySegment s = segment.get(ValueLayout.ADDRESS, 0);
                segment = segment.asSlice(ValueLayout.ADDRESS.byteSize());
                return s.equals(MemorySegment.NULL) ? null : new ShaderModule(s);
            }

            private @NotNull MemorySegment segment;
        }
    }
}
