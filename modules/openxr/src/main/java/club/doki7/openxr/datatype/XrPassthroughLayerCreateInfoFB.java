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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughLayerCreateInfoFB.html"><code>XrPassthroughLayerCreateInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrPassthroughLayerCreateInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrPassthroughFB passthrough; // @link substring="XrPassthroughFB" target="XrPassthroughFB" @link substring="passthrough" target="#passthrough"
///     XrPassthroughFlagsFB flags; // @link substring="XrPassthroughFlagsFB" target="XrPassthroughFlagsFB" @link substring="flags" target="#flags"
///     XrPassthroughLayerPurposeFB purpose; // @link substring="XrPassthroughLayerPurposeFB" target="XrPassthroughLayerPurposeFB" @link substring="purpose" target="#purpose"
/// } XrPassthroughLayerCreateInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_PASSTHROUGH_LAYER_CREATE_INFO_FB`
///
/// The {@code allocate} ({@link XrPassthroughLayerCreateInfoFB#allocate(Arena)}, {@link XrPassthroughLayerCreateInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrPassthroughLayerCreateInfoFB#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughLayerCreateInfoFB.html"><code>XrPassthroughLayerCreateInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrPassthroughLayerCreateInfoFB(@NotNull MemorySegment segment) implements IXrPassthroughLayerCreateInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughLayerCreateInfoFB.html"><code>XrPassthroughLayerCreateInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrPassthroughLayerCreateInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrPassthroughLayerCreateInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrPassthroughLayerCreateInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrPassthroughLayerCreateInfoFB, Iterable<XrPassthroughLayerCreateInfoFB> {
        public long size() {
            return segment.byteSize() / XrPassthroughLayerCreateInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrPassthroughLayerCreateInfoFB at(long index) {
            return new XrPassthroughLayerCreateInfoFB(segment.asSlice(index * XrPassthroughLayerCreateInfoFB.BYTES, XrPassthroughLayerCreateInfoFB.BYTES));
        }

        public XrPassthroughLayerCreateInfoFB.Ptr at(long index, @NotNull Consumer<@NotNull XrPassthroughLayerCreateInfoFB> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrPassthroughLayerCreateInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrPassthroughLayerCreateInfoFB.BYTES, XrPassthroughLayerCreateInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrPassthroughLayerCreateInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrPassthroughLayerCreateInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrPassthroughLayerCreateInfoFB.BYTES,
                (end - start) * XrPassthroughLayerCreateInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrPassthroughLayerCreateInfoFB.BYTES));
        }

        public XrPassthroughLayerCreateInfoFB[] toArray() {
            XrPassthroughLayerCreateInfoFB[] ret = new XrPassthroughLayerCreateInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrPassthroughLayerCreateInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrPassthroughLayerCreateInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrPassthroughLayerCreateInfoFB.BYTES;
            }

            @Override
            public XrPassthroughLayerCreateInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrPassthroughLayerCreateInfoFB ret = new XrPassthroughLayerCreateInfoFB(segment.asSlice(0, XrPassthroughLayerCreateInfoFB.BYTES));
                segment = segment.asSlice(XrPassthroughLayerCreateInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrPassthroughLayerCreateInfoFB allocate(Arena arena) {
        XrPassthroughLayerCreateInfoFB ret = new XrPassthroughLayerCreateInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.PASSTHROUGH_LAYER_CREATE_INFO_FB);
        return ret;
    }

    public static XrPassthroughLayerCreateInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrPassthroughLayerCreateInfoFB.Ptr ret = new XrPassthroughLayerCreateInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.PASSTHROUGH_LAYER_CREATE_INFO_FB);
        }
        return ret;
    }

    public static XrPassthroughLayerCreateInfoFB clone(Arena arena, XrPassthroughLayerCreateInfoFB src) {
        XrPassthroughLayerCreateInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.PASSTHROUGH_LAYER_CREATE_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrPassthroughLayerCreateInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrPassthroughLayerCreateInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrPassthroughLayerCreateInfoFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrPassthroughFB passthrough() {
        MemorySegment s = segment.asSlice(OFFSET$passthrough, SIZE$passthrough);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrPassthroughFB(s);
    }

    public XrPassthroughLayerCreateInfoFB passthrough(@Nullable XrPassthroughFB value) {
        segment.set(LAYOUT$passthrough, OFFSET$passthrough, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrPassthroughFlagsFB.class) long flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public XrPassthroughLayerCreateInfoFB flags(@Bitmask(XrPassthroughFlagsFB.class) long value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @EnumType(XrPassthroughLayerPurposeFB.class) int purpose() {
        return segment.get(LAYOUT$purpose, OFFSET$purpose);
    }

    public XrPassthroughLayerCreateInfoFB purpose(@EnumType(XrPassthroughLayerPurposeFB.class) int value) {
        segment.set(LAYOUT$purpose, OFFSET$purpose, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("passthrough"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.JAVA_INT.withName("purpose")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$passthrough = PathElement.groupElement("passthrough");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$purpose = PathElement.groupElement("purpose");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$passthrough = (AddressLayout) LAYOUT.select(PATH$passthrough);
    public static final OfLong LAYOUT$flags = (OfLong) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$purpose = (OfInt) LAYOUT.select(PATH$purpose);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$passthrough = LAYOUT$passthrough.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$purpose = LAYOUT$purpose.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$passthrough = LAYOUT.byteOffset(PATH$passthrough);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$purpose = LAYOUT.byteOffset(PATH$purpose);
}
