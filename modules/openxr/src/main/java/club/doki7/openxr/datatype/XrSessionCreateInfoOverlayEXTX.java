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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSessionCreateInfoOverlayEXTX.html"><code>XrSessionCreateInfoOverlayEXTX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSessionCreateInfoOverlayEXTX {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrOverlaySessionCreateFlagsEXTX createFlags; // @link substring="XrOverlaySessionCreateFlagsEXTX" target="XrOverlaySessionCreateFlagsEXTX" @link substring="createFlags" target="#createFlags"
///     uint32_t sessionLayersPlacement; // @link substring="sessionLayersPlacement" target="#sessionLayersPlacement"
/// } XrSessionCreateInfoOverlayEXTX;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX`
///
/// The {@code allocate} ({@link XrSessionCreateInfoOverlayEXTX#allocate(Arena)}, {@link XrSessionCreateInfoOverlayEXTX#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSessionCreateInfoOverlayEXTX#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSessionCreateInfoOverlayEXTX.html"><code>XrSessionCreateInfoOverlayEXTX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSessionCreateInfoOverlayEXTX(@NotNull MemorySegment segment) implements IXrSessionCreateInfoOverlayEXTX {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSessionCreateInfoOverlayEXTX.html"><code>XrSessionCreateInfoOverlayEXTX</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSessionCreateInfoOverlayEXTX}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSessionCreateInfoOverlayEXTX to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSessionCreateInfoOverlayEXTX.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSessionCreateInfoOverlayEXTX, Iterable<XrSessionCreateInfoOverlayEXTX> {
        public long size() {
            return segment.byteSize() / XrSessionCreateInfoOverlayEXTX.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSessionCreateInfoOverlayEXTX at(long index) {
            return new XrSessionCreateInfoOverlayEXTX(segment.asSlice(index * XrSessionCreateInfoOverlayEXTX.BYTES, XrSessionCreateInfoOverlayEXTX.BYTES));
        }

        public void write(long index, @NotNull XrSessionCreateInfoOverlayEXTX value) {
            MemorySegment s = segment.asSlice(index * XrSessionCreateInfoOverlayEXTX.BYTES, XrSessionCreateInfoOverlayEXTX.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSessionCreateInfoOverlayEXTX.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSessionCreateInfoOverlayEXTX.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSessionCreateInfoOverlayEXTX.BYTES,
                (end - start) * XrSessionCreateInfoOverlayEXTX.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSessionCreateInfoOverlayEXTX.BYTES));
        }

        public XrSessionCreateInfoOverlayEXTX[] toArray() {
            XrSessionCreateInfoOverlayEXTX[] ret = new XrSessionCreateInfoOverlayEXTX[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSessionCreateInfoOverlayEXTX> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSessionCreateInfoOverlayEXTX> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSessionCreateInfoOverlayEXTX.BYTES;
            }

            @Override
            public XrSessionCreateInfoOverlayEXTX next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSessionCreateInfoOverlayEXTX ret = new XrSessionCreateInfoOverlayEXTX(segment.asSlice(0, XrSessionCreateInfoOverlayEXTX.BYTES));
                segment = segment.asSlice(XrSessionCreateInfoOverlayEXTX.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSessionCreateInfoOverlayEXTX allocate(Arena arena) {
        XrSessionCreateInfoOverlayEXTX ret = new XrSessionCreateInfoOverlayEXTX(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SESSION_CREATE_INFO_OVERLAY_EXTX);
        return ret;
    }

    public static XrSessionCreateInfoOverlayEXTX.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSessionCreateInfoOverlayEXTX.Ptr ret = new XrSessionCreateInfoOverlayEXTX.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SESSION_CREATE_INFO_OVERLAY_EXTX);
        }
        return ret;
    }

    public static XrSessionCreateInfoOverlayEXTX clone(Arena arena, XrSessionCreateInfoOverlayEXTX src) {
        XrSessionCreateInfoOverlayEXTX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SESSION_CREATE_INFO_OVERLAY_EXTX);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSessionCreateInfoOverlayEXTX type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSessionCreateInfoOverlayEXTX next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSessionCreateInfoOverlayEXTX next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrOverlaySessionCreateFlagsEXTX.class) long createFlags() {
        return segment.get(LAYOUT$createFlags, OFFSET$createFlags);
    }

    public XrSessionCreateInfoOverlayEXTX createFlags(@Bitmask(XrOverlaySessionCreateFlagsEXTX.class) long value) {
        segment.set(LAYOUT$createFlags, OFFSET$createFlags, value);
        return this;
    }

    public @Unsigned int sessionLayersPlacement() {
        return segment.get(LAYOUT$sessionLayersPlacement, OFFSET$sessionLayersPlacement);
    }

    public XrSessionCreateInfoOverlayEXTX sessionLayersPlacement(@Unsigned int value) {
        segment.set(LAYOUT$sessionLayersPlacement, OFFSET$sessionLayersPlacement, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("createFlags"),
        ValueLayout.JAVA_INT.withName("sessionLayersPlacement")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$createFlags = PathElement.groupElement("createFlags");
    public static final PathElement PATH$sessionLayersPlacement = PathElement.groupElement("sessionLayersPlacement");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$createFlags = (OfLong) LAYOUT.select(PATH$createFlags);
    public static final OfInt LAYOUT$sessionLayersPlacement = (OfInt) LAYOUT.select(PATH$sessionLayersPlacement);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$createFlags = LAYOUT$createFlags.byteSize();
    public static final long SIZE$sessionLayersPlacement = LAYOUT$sessionLayersPlacement.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$createFlags = LAYOUT.byteOffset(PATH$createFlags);
    public static final long OFFSET$sessionLayersPlacement = LAYOUT.byteOffset(PATH$sessionLayersPlacement);
}
