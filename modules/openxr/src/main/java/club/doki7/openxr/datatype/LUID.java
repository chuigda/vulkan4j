package club.doki7.openxr.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;
import club.doki7.openxr.XRFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/LUID.html"><code>LUID</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct LUID {
///     DWORD LowPart; // @link substring="LowPart" target="#LowPart"
///     LONG HighPart; // @link substring="HighPart" target="#HighPart"
/// } LUID;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/LUID.html"><code>LUID</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record LUID(@NotNull MemorySegment segment) implements ILUID {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/LUID.html"><code>LUID</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link LUID}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ILUID to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code LUID.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ILUID, Iterable<LUID> {
        public long size() {
            return segment.byteSize() / LUID.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull LUID at(long index) {
            return new LUID(segment.asSlice(index * LUID.BYTES, LUID.BYTES));
        }

        public LUID.Ptr at(long index, @NotNull Consumer<@NotNull LUID> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull LUID value) {
            MemorySegment s = segment.asSlice(index * LUID.BYTES, LUID.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
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
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * LUID.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * LUID.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * LUID.BYTES,
                (end - start) * LUID.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * LUID.BYTES));
        }

        public LUID[] toArray() {
            LUID[] ret = new LUID[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<LUID> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<LUID> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= LUID.BYTES;
            }

            @Override
            public LUID next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                LUID ret = new LUID(segment.asSlice(0, LUID.BYTES));
                segment = segment.asSlice(LUID.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static LUID allocate(Arena arena) {
        return new LUID(arena.allocate(LAYOUT));
    }

    public static LUID.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new LUID.Ptr(segment);
    }

    public static LUID clone(Arena arena, LUID src) {
        LUID ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("DWORD") @Unsigned int LowPart() {
        return segment.get(LAYOUT$LowPart, OFFSET$LowPart);
    }

    public LUID LowPart(@NativeType("DWORD") @Unsigned int value) {
        segment.set(LAYOUT$LowPart, OFFSET$LowPart, value);
        return this;
    }

    public @NativeType("LONG") int HighPart() {
        return segment.get(LAYOUT$HighPart, OFFSET$HighPart);
    }

    public LUID HighPart(@NativeType("LONG") int value) {
        segment.set(LAYOUT$HighPart, OFFSET$HighPart, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("LowPart"),
        ValueLayout.JAVA_INT.withName("HighPart")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$LowPart = PathElement.groupElement("LowPart");
    public static final PathElement PATH$HighPart = PathElement.groupElement("HighPart");

    public static final OfInt LAYOUT$LowPart = (OfInt) LAYOUT.select(PATH$LowPart);
    public static final OfInt LAYOUT$HighPart = (OfInt) LAYOUT.select(PATH$HighPart);

    public static final long SIZE$LowPart = LAYOUT$LowPart.byteSize();
    public static final long SIZE$HighPart = LAYOUT$HighPart.byteSize();

    public static final long OFFSET$LowPart = LAYOUT.byteOffset(PATH$LowPart);
    public static final long OFFSET$HighPart = LAYOUT.byteOffset(PATH$HighPart);
}
