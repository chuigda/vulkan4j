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

/// Represents a pointer to a {@code WGPUTexelCopyTextureInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUTexelCopyTextureInfo {
///     WGPUTexture texture; // @link substring="WGPUTexture" target="WGPUTexture" @link substring="texture" target="#texture"
///     uint32_t mipLevel; // @link substring="mipLevel" target="#mipLevel"
///     WGPUOrigin3d origin; // @link substring="WGPUOrigin3d" target="WGPUOrigin3d" @link substring="origin" target="#origin"
///     WGPUTextureAspect aspect; // @link substring="WGPUTextureAspect" target="WGPUTextureAspect" @link substring="aspect" target="#aspect"
/// } WGPUTexelCopyTextureInfo;
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
public record WGPUTexelCopyTextureInfo(@NotNull MemorySegment segment) implements IWGPUTexelCopyTextureInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUTexelCopyTextureInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUTexelCopyTextureInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUTexelCopyTextureInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUTexelCopyTextureInfo, Iterable<WGPUTexelCopyTextureInfo> {
        public long size() {
            return segment.byteSize() / WGPUTexelCopyTextureInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUTexelCopyTextureInfo at(long index) {
            return new WGPUTexelCopyTextureInfo(segment.asSlice(index * WGPUTexelCopyTextureInfo.BYTES, WGPUTexelCopyTextureInfo.BYTES));
        }

        public WGPUTexelCopyTextureInfo.Ptr at(long index, @NotNull Consumer<@NotNull WGPUTexelCopyTextureInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUTexelCopyTextureInfo value) {
            MemorySegment s = segment.asSlice(index * WGPUTexelCopyTextureInfo.BYTES, WGPUTexelCopyTextureInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUTexelCopyTextureInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUTexelCopyTextureInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUTexelCopyTextureInfo.BYTES,
                (end - start) * WGPUTexelCopyTextureInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUTexelCopyTextureInfo.BYTES));
        }

        public WGPUTexelCopyTextureInfo[] toArray() {
            WGPUTexelCopyTextureInfo[] ret = new WGPUTexelCopyTextureInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUTexelCopyTextureInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUTexelCopyTextureInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUTexelCopyTextureInfo.BYTES;
            }

            @Override
            public WGPUTexelCopyTextureInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUTexelCopyTextureInfo ret = new WGPUTexelCopyTextureInfo(segment.asSlice(0, WGPUTexelCopyTextureInfo.BYTES));
                segment = segment.asSlice(WGPUTexelCopyTextureInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUTexelCopyTextureInfo allocate(Arena arena) {
        return new WGPUTexelCopyTextureInfo(arena.allocate(LAYOUT));
    }

    public static WGPUTexelCopyTextureInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUTexelCopyTextureInfo.Ptr(segment);
    }

    public static WGPUTexelCopyTextureInfo clone(Arena arena, WGPUTexelCopyTextureInfo src) {
        WGPUTexelCopyTextureInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable WGPUTexture texture() {
        MemorySegment s = segment.asSlice(OFFSET$texture, SIZE$texture);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUTexture(s);
    }

    public WGPUTexelCopyTextureInfo texture(@Nullable WGPUTexture value) {
        segment.set(LAYOUT$texture, OFFSET$texture, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int mipLevel() {
        return segment.get(LAYOUT$mipLevel, OFFSET$mipLevel);
    }

    public WGPUTexelCopyTextureInfo mipLevel(@Unsigned int value) {
        segment.set(LAYOUT$mipLevel, OFFSET$mipLevel, value);
        return this;
    }

    public @NotNull WGPUOrigin3d origin() {
        return new WGPUOrigin3d(segment.asSlice(OFFSET$origin, LAYOUT$origin));
    }

    public WGPUTexelCopyTextureInfo origin(@NotNull WGPUOrigin3d value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$origin, SIZE$origin);
        return this;
    }

    public WGPUTexelCopyTextureInfo origin(Consumer<@NotNull WGPUOrigin3d> consumer) {
        consumer.accept(origin());
        return this;
    }

    public @EnumType(WGPUTextureAspect.class) int aspect() {
        return segment.get(LAYOUT$aspect, OFFSET$aspect);
    }

    public WGPUTexelCopyTextureInfo aspect(@EnumType(WGPUTextureAspect.class) int value) {
        segment.set(LAYOUT$aspect, OFFSET$aspect, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("texture"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        WGPUOrigin3d.LAYOUT.withName("origin"),
        ValueLayout.JAVA_INT.withName("aspect")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$texture = PathElement.groupElement("texture");
    public static final PathElement PATH$mipLevel = PathElement.groupElement("mipLevel");
    public static final PathElement PATH$origin = PathElement.groupElement("origin");
    public static final PathElement PATH$aspect = PathElement.groupElement("aspect");

    public static final AddressLayout LAYOUT$texture = (AddressLayout) LAYOUT.select(PATH$texture);
    public static final OfInt LAYOUT$mipLevel = (OfInt) LAYOUT.select(PATH$mipLevel);
    public static final StructLayout LAYOUT$origin = (StructLayout) LAYOUT.select(PATH$origin);
    public static final OfInt LAYOUT$aspect = (OfInt) LAYOUT.select(PATH$aspect);

    public static final long SIZE$texture = LAYOUT$texture.byteSize();
    public static final long SIZE$mipLevel = LAYOUT$mipLevel.byteSize();
    public static final long SIZE$origin = LAYOUT$origin.byteSize();
    public static final long SIZE$aspect = LAYOUT$aspect.byteSize();

    public static final long OFFSET$texture = LAYOUT.byteOffset(PATH$texture);
    public static final long OFFSET$mipLevel = LAYOUT.byteOffset(PATH$mipLevel);
    public static final long OFFSET$origin = LAYOUT.byteOffset(PATH$origin);
    public static final long OFFSET$aspect = LAYOUT.byteOffset(PATH$aspect);
}
