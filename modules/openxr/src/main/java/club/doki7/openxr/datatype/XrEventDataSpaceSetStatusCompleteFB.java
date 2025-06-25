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
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataSpaceSetStatusCompleteFB.html"><code>XrEventDataSpaceSetStatusCompleteFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEventDataSpaceSetStatusCompleteFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrAsyncRequestIdFB requestId; // @link substring="requestId" target="#requestId"
///     XrResult result; // @link substring="XrResult" target="XrResult" @link substring="result" target="#result"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrUuidEXT uuid; // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="uuid" target="#uuid"
///     XrSpaceComponentTypeFB componentType; // @link substring="XrSpaceComponentTypeFB" target="XrSpaceComponentTypeFB" @link substring="componentType" target="#componentType"
///     XrBool32 enabled; // @link substring="enabled" target="#enabled"
/// } XrEventDataSpaceSetStatusCompleteFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB`
///
/// The {@code allocate} ({@link XrEventDataSpaceSetStatusCompleteFB#allocate(Arena)}, {@link XrEventDataSpaceSetStatusCompleteFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEventDataSpaceSetStatusCompleteFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataSpaceSetStatusCompleteFB.html"><code>XrEventDataSpaceSetStatusCompleteFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEventDataSpaceSetStatusCompleteFB(@NotNull MemorySegment segment) implements IXrEventDataSpaceSetStatusCompleteFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataSpaceSetStatusCompleteFB.html"><code>XrEventDataSpaceSetStatusCompleteFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEventDataSpaceSetStatusCompleteFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEventDataSpaceSetStatusCompleteFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEventDataSpaceSetStatusCompleteFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEventDataSpaceSetStatusCompleteFB, Iterable<XrEventDataSpaceSetStatusCompleteFB> {
        public long size() {
            return segment.byteSize() / XrEventDataSpaceSetStatusCompleteFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEventDataSpaceSetStatusCompleteFB at(long index) {
            return new XrEventDataSpaceSetStatusCompleteFB(segment.asSlice(index * XrEventDataSpaceSetStatusCompleteFB.BYTES, XrEventDataSpaceSetStatusCompleteFB.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrEventDataSpaceSetStatusCompleteFB> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrEventDataSpaceSetStatusCompleteFB value) {
            MemorySegment s = segment.asSlice(index * XrEventDataSpaceSetStatusCompleteFB.BYTES, XrEventDataSpaceSetStatusCompleteFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEventDataSpaceSetStatusCompleteFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEventDataSpaceSetStatusCompleteFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEventDataSpaceSetStatusCompleteFB.BYTES,
                (end - start) * XrEventDataSpaceSetStatusCompleteFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEventDataSpaceSetStatusCompleteFB.BYTES));
        }

        public XrEventDataSpaceSetStatusCompleteFB[] toArray() {
            XrEventDataSpaceSetStatusCompleteFB[] ret = new XrEventDataSpaceSetStatusCompleteFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEventDataSpaceSetStatusCompleteFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEventDataSpaceSetStatusCompleteFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEventDataSpaceSetStatusCompleteFB.BYTES;
            }

            @Override
            public XrEventDataSpaceSetStatusCompleteFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEventDataSpaceSetStatusCompleteFB ret = new XrEventDataSpaceSetStatusCompleteFB(segment.asSlice(0, XrEventDataSpaceSetStatusCompleteFB.BYTES));
                segment = segment.asSlice(XrEventDataSpaceSetStatusCompleteFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEventDataSpaceSetStatusCompleteFB allocate(Arena arena) {
        XrEventDataSpaceSetStatusCompleteFB ret = new XrEventDataSpaceSetStatusCompleteFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB);
        return ret;
    }

    public static XrEventDataSpaceSetStatusCompleteFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEventDataSpaceSetStatusCompleteFB.Ptr ret = new XrEventDataSpaceSetStatusCompleteFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB);
        }
        return ret;
    }

    public static XrEventDataSpaceSetStatusCompleteFB clone(Arena arena, XrEventDataSpaceSetStatusCompleteFB src) {
        XrEventDataSpaceSetStatusCompleteFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.EVENT_DATA_SPACE_SET_STATUS_COMPLETE_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEventDataSpaceSetStatusCompleteFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEventDataSpaceSetStatusCompleteFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEventDataSpaceSetStatusCompleteFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrAsyncRequestIdFB") @Unsigned long requestId() {
        return segment.get(LAYOUT$requestId, OFFSET$requestId);
    }

    public XrEventDataSpaceSetStatusCompleteFB requestId(@NativeType("XrAsyncRequestIdFB") @Unsigned long value) {
        segment.set(LAYOUT$requestId, OFFSET$requestId, value);
        return this;
    }

    public @EnumType(XrResult.class) int result() {
        return segment.get(LAYOUT$result, OFFSET$result);
    }

    public XrEventDataSpaceSetStatusCompleteFB result(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$result, OFFSET$result, value);
        return this;
    }

    public @Nullable XrSpace space() {
        MemorySegment s = segment.asSlice(OFFSET$space, SIZE$space);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrEventDataSpaceSetStatusCompleteFB space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrUuidEXT uuid() {
        return new XrUuidEXT(segment.asSlice(OFFSET$uuid, LAYOUT$uuid));
    }

    public XrEventDataSpaceSetStatusCompleteFB uuid(@NotNull XrUuidEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$uuid, SIZE$uuid);
        return this;
    }

    public XrEventDataSpaceSetStatusCompleteFB uuid(Consumer<@NotNull XrUuidEXT> consumer) {
        consumer.accept(uuid());
        return this;
    }

    public @EnumType(XrSpaceComponentTypeFB.class) int componentType() {
        return segment.get(LAYOUT$componentType, OFFSET$componentType);
    }

    public XrEventDataSpaceSetStatusCompleteFB componentType(@EnumType(XrSpaceComponentTypeFB.class) int value) {
        segment.set(LAYOUT$componentType, OFFSET$componentType, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int enabled() {
        return segment.get(LAYOUT$enabled, OFFSET$enabled);
    }

    public XrEventDataSpaceSetStatusCompleteFB enabled(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$enabled, OFFSET$enabled, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("requestId"),
        ValueLayout.JAVA_INT.withName("result"),
        ValueLayout.ADDRESS.withName("space"),
        XrUuidEXT.LAYOUT.withName("uuid"),
        ValueLayout.JAVA_INT.withName("componentType"),
        ValueLayout.JAVA_INT.withName("enabled")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$requestId = PathElement.groupElement("requestId");
    public static final PathElement PATH$result = PathElement.groupElement("result");
    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$uuid = PathElement.groupElement("uuid");
    public static final PathElement PATH$componentType = PathElement.groupElement("componentType");
    public static final PathElement PATH$enabled = PathElement.groupElement("enabled");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$requestId = (OfLong) LAYOUT.select(PATH$requestId);
    public static final OfInt LAYOUT$result = (OfInt) LAYOUT.select(PATH$result);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final StructLayout LAYOUT$uuid = (StructLayout) LAYOUT.select(PATH$uuid);
    public static final OfInt LAYOUT$componentType = (OfInt) LAYOUT.select(PATH$componentType);
    public static final OfInt LAYOUT$enabled = (OfInt) LAYOUT.select(PATH$enabled);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$requestId = LAYOUT$requestId.byteSize();
    public static final long SIZE$result = LAYOUT$result.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$uuid = LAYOUT$uuid.byteSize();
    public static final long SIZE$componentType = LAYOUT$componentType.byteSize();
    public static final long SIZE$enabled = LAYOUT$enabled.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$requestId = LAYOUT.byteOffset(PATH$requestId);
    public static final long OFFSET$result = LAYOUT.byteOffset(PATH$result);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$uuid = LAYOUT.byteOffset(PATH$uuid);
    public static final long OFFSET$componentType = LAYOUT.byteOffset(PATH$componentType);
    public static final long OFFSET$enabled = LAYOUT.byteOffset(PATH$enabled);
}
