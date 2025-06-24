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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSecondaryViewConfigurationSessionBeginInfoMSFT.html"><code>XrSecondaryViewConfigurationSessionBeginInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSecondaryViewConfigurationSessionBeginInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t viewConfigurationCount; // @link substring="viewConfigurationCount" target="#viewConfigurationCount"
///     XrViewConfigurationType const* enabledViewConfigurationTypes; // @link substring="XrViewConfigurationType" target="XrViewConfigurationType" @link substring="enabledViewConfigurationTypes" target="#enabledViewConfigurationTypes"
/// } XrSecondaryViewConfigurationSessionBeginInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT`
///
/// The {@code allocate} ({@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#allocate(Arena)}, {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSecondaryViewConfigurationSessionBeginInfoMSFT.html"><code>XrSecondaryViewConfigurationSessionBeginInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSecondaryViewConfigurationSessionBeginInfoMSFT(@NotNull MemorySegment segment) implements IXrSecondaryViewConfigurationSessionBeginInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSecondaryViewConfigurationSessionBeginInfoMSFT.html"><code>XrSecondaryViewConfigurationSessionBeginInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSecondaryViewConfigurationSessionBeginInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSecondaryViewConfigurationSessionBeginInfoMSFT, Iterable<XrSecondaryViewConfigurationSessionBeginInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSecondaryViewConfigurationSessionBeginInfoMSFT at(long index) {
            return new XrSecondaryViewConfigurationSessionBeginInfoMSFT(segment.asSlice(index * XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES, XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES));
        }

        public void write(long index, @NotNull XrSecondaryViewConfigurationSessionBeginInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES, XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES,
                (end - start) * XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES));
        }

        public XrSecondaryViewConfigurationSessionBeginInfoMSFT[] toArray() {
            XrSecondaryViewConfigurationSessionBeginInfoMSFT[] ret = new XrSecondaryViewConfigurationSessionBeginInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSecondaryViewConfigurationSessionBeginInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSecondaryViewConfigurationSessionBeginInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES;
            }

            @Override
            public XrSecondaryViewConfigurationSessionBeginInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSecondaryViewConfigurationSessionBeginInfoMSFT ret = new XrSecondaryViewConfigurationSessionBeginInfoMSFT(segment.asSlice(0, XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES));
                segment = segment.asSlice(XrSecondaryViewConfigurationSessionBeginInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT allocate(Arena arena) {
        XrSecondaryViewConfigurationSessionBeginInfoMSFT ret = new XrSecondaryViewConfigurationSessionBeginInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT);
        return ret;
    }

    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSecondaryViewConfigurationSessionBeginInfoMSFT.Ptr ret = new XrSecondaryViewConfigurationSessionBeginInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT);
        }
        return ret;
    }

    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT clone(Arena arena, XrSecondaryViewConfigurationSessionBeginInfoMSFT src) {
        XrSecondaryViewConfigurationSessionBeginInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSecondaryViewConfigurationSessionBeginInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSecondaryViewConfigurationSessionBeginInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSecondaryViewConfigurationSessionBeginInfoMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int viewConfigurationCount() {
        return segment.get(LAYOUT$viewConfigurationCount, OFFSET$viewConfigurationCount);
    }

    public XrSecondaryViewConfigurationSessionBeginInfoMSFT viewConfigurationCount(@Unsigned int value) {
        segment.set(LAYOUT$viewConfigurationCount, OFFSET$viewConfigurationCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrViewConfigurationType.class) IntPtr enabledViewConfigurationTypes() {
        MemorySegment s = enabledViewConfigurationTypesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrSecondaryViewConfigurationSessionBeginInfoMSFT enabledViewConfigurationTypes(@Nullable @EnumType(XrViewConfigurationType.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        enabledViewConfigurationTypesRaw(s);
        return this;
    }

    public @Pointer(target=XrViewConfigurationType.class) @NotNull MemorySegment enabledViewConfigurationTypesRaw() {
        return segment.get(LAYOUT$enabledViewConfigurationTypes, OFFSET$enabledViewConfigurationTypes);
    }

    public void enabledViewConfigurationTypesRaw(@Pointer(target=XrViewConfigurationType.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$enabledViewConfigurationTypes, OFFSET$enabledViewConfigurationTypes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("viewConfigurationCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("enabledViewConfigurationTypes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$viewConfigurationCount = PathElement.groupElement("viewConfigurationCount");
    public static final PathElement PATH$enabledViewConfigurationTypes = PathElement.groupElement("enabledViewConfigurationTypes");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$viewConfigurationCount = (OfInt) LAYOUT.select(PATH$viewConfigurationCount);
    public static final AddressLayout LAYOUT$enabledViewConfigurationTypes = (AddressLayout) LAYOUT.select(PATH$enabledViewConfigurationTypes);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$viewConfigurationCount = LAYOUT$viewConfigurationCount.byteSize();
    public static final long SIZE$enabledViewConfigurationTypes = LAYOUT$enabledViewConfigurationTypes.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$viewConfigurationCount = LAYOUT.byteOffset(PATH$viewConfigurationCount);
    public static final long OFFSET$enabledViewConfigurationTypes = LAYOUT.byteOffset(PATH$enabledViewConfigurationTypes);
}
