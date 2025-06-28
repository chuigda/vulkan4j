package club.doki7.webgpu.datatype;

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
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.handle.*;
import club.doki7.webgpu.enumtype.*;
import static club.doki7.webgpu.WGPUConstants.*;

/// Represents a pointer to a {@code WGPUShaderModuleDescriptorSpirV} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUShaderModuleDescriptorSpirV {
///     WGPUStringView label; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="label" target="#label"
///     uint32_t sourceSize; // @link substring="sourceSize" target="#sourceSize"
///     uint32_t const* source; // @link substring="source" target="#source"
/// } WGPUShaderModuleDescriptorSpirV;
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
@ValueBasedCandidate
@UnsafeConstructor
public record WGPUShaderModuleDescriptorSpirV(@NotNull MemorySegment segment) implements IWGPUShaderModuleDescriptorSpirV {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUShaderModuleDescriptorSpirV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUShaderModuleDescriptorSpirV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUShaderModuleDescriptorSpirV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUShaderModuleDescriptorSpirV, Iterable<WGPUShaderModuleDescriptorSpirV> {
        public long size() {
            return segment.byteSize() / WGPUShaderModuleDescriptorSpirV.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUShaderModuleDescriptorSpirV at(long index) {
            return new WGPUShaderModuleDescriptorSpirV(segment.asSlice(index * WGPUShaderModuleDescriptorSpirV.BYTES, WGPUShaderModuleDescriptorSpirV.BYTES));
        }

        public WGPUShaderModuleDescriptorSpirV.Ptr at(long index, @NotNull Consumer<@NotNull WGPUShaderModuleDescriptorSpirV> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUShaderModuleDescriptorSpirV value) {
            MemorySegment s = segment.asSlice(index * WGPUShaderModuleDescriptorSpirV.BYTES, WGPUShaderModuleDescriptorSpirV.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUShaderModuleDescriptorSpirV.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUShaderModuleDescriptorSpirV.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUShaderModuleDescriptorSpirV.BYTES,
                (end - start) * WGPUShaderModuleDescriptorSpirV.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUShaderModuleDescriptorSpirV.BYTES));
        }

        public WGPUShaderModuleDescriptorSpirV[] toArray() {
            WGPUShaderModuleDescriptorSpirV[] ret = new WGPUShaderModuleDescriptorSpirV[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUShaderModuleDescriptorSpirV> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUShaderModuleDescriptorSpirV> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUShaderModuleDescriptorSpirV.BYTES;
            }

            @Override
            public WGPUShaderModuleDescriptorSpirV next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUShaderModuleDescriptorSpirV ret = new WGPUShaderModuleDescriptorSpirV(segment.asSlice(0, WGPUShaderModuleDescriptorSpirV.BYTES));
                segment = segment.asSlice(WGPUShaderModuleDescriptorSpirV.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUShaderModuleDescriptorSpirV allocate(Arena arena) {
        return new WGPUShaderModuleDescriptorSpirV(arena.allocate(LAYOUT));
    }

    public static WGPUShaderModuleDescriptorSpirV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUShaderModuleDescriptorSpirV.Ptr(segment);
    }

    public static WGPUShaderModuleDescriptorSpirV clone(Arena arena, WGPUShaderModuleDescriptorSpirV src) {
        WGPUShaderModuleDescriptorSpirV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUStringView label() {
        return new WGPUStringView(segment.asSlice(OFFSET$label, LAYOUT$label));
    }

    public WGPUShaderModuleDescriptorSpirV label(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public WGPUShaderModuleDescriptorSpirV label(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(label());
        return this;
    }

    public @Unsigned int sourceSize() {
        return segment.get(LAYOUT$sourceSize, OFFSET$sourceSize);
    }

    public WGPUShaderModuleDescriptorSpirV sourceSize(@Unsigned int value) {
        segment.set(LAYOUT$sourceSize, OFFSET$sourceSize, value);
        return this;
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned IntPtr source() {
        MemorySegment s = sourceRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUShaderModuleDescriptorSpirV source(@Nullable @Unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        sourceRaw(s);
        return this;
    }

    public @Pointer(comment="uint32_t*") @NotNull MemorySegment sourceRaw() {
        return segment.get(LAYOUT$source, OFFSET$source);
    }

    public void sourceRaw(@Pointer(comment="uint32_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$source, OFFSET$source, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUStringView.LAYOUT.withName("label"),
        ValueLayout.JAVA_INT.withName("sourceSize"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("source")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$sourceSize = PathElement.groupElement("sourceSize");
    public static final PathElement PATH$source = PathElement.groupElement("source");

    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final OfInt LAYOUT$sourceSize = (OfInt) LAYOUT.select(PATH$sourceSize);
    public static final AddressLayout LAYOUT$source = (AddressLayout) LAYOUT.select(PATH$source);

    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$sourceSize = LAYOUT$sourceSize.byteSize();
    public static final long SIZE$source = LAYOUT$source.byteSize();

    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$sourceSize = LAYOUT.byteOffset(PATH$sourceSize);
    public static final long OFFSET$source = LAYOUT.byteOffset(PATH$source);
}
