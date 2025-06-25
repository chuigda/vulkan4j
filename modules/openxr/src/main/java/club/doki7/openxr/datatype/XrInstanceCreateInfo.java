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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInstanceCreateInfo.html"><code>XrInstanceCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrInstanceCreateInfo {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrInstanceCreateFlags createFlags; // optional // @link substring="XrInstanceCreateFlags" target="XrInstanceCreateFlags" @link substring="createFlags" target="#createFlags"
///     XrApplicationInfo applicationInfo; // @link substring="XrApplicationInfo" target="XrApplicationInfo" @link substring="applicationInfo" target="#applicationInfo"
///     uint32_t enabledApiLayerCount; // optional // @link substring="enabledApiLayerCount" target="#enabledApiLayerCount"
///     char const* const* enabledApiLayerNames; // optional // @link substring="enabledApiLayerNames" target="#enabledApiLayerNames"
///     uint32_t enabledExtensionCount; // optional // @link substring="enabledExtensionCount" target="#enabledExtensionCount"
///     char const* const* enabledExtensionNames; // optional // @link substring="enabledExtensionNames" target="#enabledExtensionNames"
/// } XrInstanceCreateInfo;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_INSTANCE_CREATE_INFO`
///
/// The {@code allocate} ({@link XrInstanceCreateInfo#allocate(Arena)}, {@link XrInstanceCreateInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrInstanceCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInstanceCreateInfo.html"><code>XrInstanceCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrInstanceCreateInfo(@NotNull MemorySegment segment) implements IXrInstanceCreateInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInstanceCreateInfo.html"><code>XrInstanceCreateInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrInstanceCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrInstanceCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrInstanceCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrInstanceCreateInfo, Iterable<XrInstanceCreateInfo> {
        public long size() {
            return segment.byteSize() / XrInstanceCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrInstanceCreateInfo at(long index) {
            return new XrInstanceCreateInfo(segment.asSlice(index * XrInstanceCreateInfo.BYTES, XrInstanceCreateInfo.BYTES));
        }

        public XrInstanceCreateInfo.Ptr at(long index, @NotNull Consumer<@NotNull XrInstanceCreateInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrInstanceCreateInfo value) {
            MemorySegment s = segment.asSlice(index * XrInstanceCreateInfo.BYTES, XrInstanceCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrInstanceCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrInstanceCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrInstanceCreateInfo.BYTES,
                (end - start) * XrInstanceCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrInstanceCreateInfo.BYTES));
        }

        public XrInstanceCreateInfo[] toArray() {
            XrInstanceCreateInfo[] ret = new XrInstanceCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrInstanceCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrInstanceCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrInstanceCreateInfo.BYTES;
            }

            @Override
            public XrInstanceCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrInstanceCreateInfo ret = new XrInstanceCreateInfo(segment.asSlice(0, XrInstanceCreateInfo.BYTES));
                segment = segment.asSlice(XrInstanceCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrInstanceCreateInfo allocate(Arena arena) {
        XrInstanceCreateInfo ret = new XrInstanceCreateInfo(arena.allocate(LAYOUT));
        ret.type(XrStructureType.INSTANCE_CREATE_INFO);
        return ret;
    }

    public static XrInstanceCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrInstanceCreateInfo.Ptr ret = new XrInstanceCreateInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.INSTANCE_CREATE_INFO);
        }
        return ret;
    }

    public static XrInstanceCreateInfo clone(Arena arena, XrInstanceCreateInfo src) {
        XrInstanceCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.INSTANCE_CREATE_INFO);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrInstanceCreateInfo type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrInstanceCreateInfo next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrInstanceCreateInfo next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrInstanceCreateFlags.class) long createFlags() {
        return segment.get(LAYOUT$createFlags, OFFSET$createFlags);
    }

    public XrInstanceCreateInfo createFlags(@Bitmask(XrInstanceCreateFlags.class) long value) {
        segment.set(LAYOUT$createFlags, OFFSET$createFlags, value);
        return this;
    }

    public @NotNull XrApplicationInfo applicationInfo() {
        return new XrApplicationInfo(segment.asSlice(OFFSET$applicationInfo, LAYOUT$applicationInfo));
    }

    public XrInstanceCreateInfo applicationInfo(@NotNull XrApplicationInfo value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$applicationInfo, SIZE$applicationInfo);
        return this;
    }

    public XrInstanceCreateInfo applicationInfo(Consumer<@NotNull XrApplicationInfo> consumer) {
        consumer.accept(applicationInfo());
        return this;
    }

    public @Unsigned int enabledApiLayerCount() {
        return segment.get(LAYOUT$enabledApiLayerCount, OFFSET$enabledApiLayerCount);
    }

    public XrInstanceCreateInfo enabledApiLayerCount(@Unsigned int value) {
        segment.set(LAYOUT$enabledApiLayerCount, OFFSET$enabledApiLayerCount, value);
        return this;
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr enabledApiLayerNames() {
        MemorySegment s = enabledApiLayerNamesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public XrInstanceCreateInfo enabledApiLayerNames(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        enabledApiLayerNamesRaw(s);
        return this;
    }

    public @Pointer(comment="void**") @NotNull MemorySegment enabledApiLayerNamesRaw() {
        return segment.get(LAYOUT$enabledApiLayerNames, OFFSET$enabledApiLayerNames);
    }

    public void enabledApiLayerNamesRaw(@Pointer(comment="void**") @NotNull MemorySegment value) {
        segment.set(LAYOUT$enabledApiLayerNames, OFFSET$enabledApiLayerNames, value);
    }

    public @Unsigned int enabledExtensionCount() {
        return segment.get(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount);
    }

    public XrInstanceCreateInfo enabledExtensionCount(@Unsigned int value) {
        segment.set(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount, value);
        return this;
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr enabledExtensionNames() {
        MemorySegment s = enabledExtensionNamesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public XrInstanceCreateInfo enabledExtensionNames(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        enabledExtensionNamesRaw(s);
        return this;
    }

    public @Pointer(comment="void**") @NotNull MemorySegment enabledExtensionNamesRaw() {
        return segment.get(LAYOUT$enabledExtensionNames, OFFSET$enabledExtensionNames);
    }

    public void enabledExtensionNamesRaw(@Pointer(comment="void**") @NotNull MemorySegment value) {
        segment.set(LAYOUT$enabledExtensionNames, OFFSET$enabledExtensionNames, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("createFlags"),
        XrApplicationInfo.LAYOUT.withName("applicationInfo"),
        ValueLayout.JAVA_INT.withName("enabledApiLayerCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("enabledApiLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("enabledExtensionNames")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$createFlags = PathElement.groupElement("createFlags");
    public static final PathElement PATH$applicationInfo = PathElement.groupElement("applicationInfo");
    public static final PathElement PATH$enabledApiLayerCount = PathElement.groupElement("enabledApiLayerCount");
    public static final PathElement PATH$enabledApiLayerNames = PathElement.groupElement("enabledApiLayerNames");
    public static final PathElement PATH$enabledExtensionCount = PathElement.groupElement("enabledExtensionCount");
    public static final PathElement PATH$enabledExtensionNames = PathElement.groupElement("enabledExtensionNames");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$createFlags = (OfLong) LAYOUT.select(PATH$createFlags);
    public static final StructLayout LAYOUT$applicationInfo = (StructLayout) LAYOUT.select(PATH$applicationInfo);
    public static final OfInt LAYOUT$enabledApiLayerCount = (OfInt) LAYOUT.select(PATH$enabledApiLayerCount);
    public static final AddressLayout LAYOUT$enabledApiLayerNames = (AddressLayout) LAYOUT.select(PATH$enabledApiLayerNames);
    public static final OfInt LAYOUT$enabledExtensionCount = (OfInt) LAYOUT.select(PATH$enabledExtensionCount);
    public static final AddressLayout LAYOUT$enabledExtensionNames = (AddressLayout) LAYOUT.select(PATH$enabledExtensionNames);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$createFlags = LAYOUT$createFlags.byteSize();
    public static final long SIZE$applicationInfo = LAYOUT$applicationInfo.byteSize();
    public static final long SIZE$enabledApiLayerCount = LAYOUT$enabledApiLayerCount.byteSize();
    public static final long SIZE$enabledApiLayerNames = LAYOUT$enabledApiLayerNames.byteSize();
    public static final long SIZE$enabledExtensionCount = LAYOUT$enabledExtensionCount.byteSize();
    public static final long SIZE$enabledExtensionNames = LAYOUT$enabledExtensionNames.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$createFlags = LAYOUT.byteOffset(PATH$createFlags);
    public static final long OFFSET$applicationInfo = LAYOUT.byteOffset(PATH$applicationInfo);
    public static final long OFFSET$enabledApiLayerCount = LAYOUT.byteOffset(PATH$enabledApiLayerCount);
    public static final long OFFSET$enabledApiLayerNames = LAYOUT.byteOffset(PATH$enabledApiLayerNames);
    public static final long OFFSET$enabledExtensionCount = LAYOUT.byteOffset(PATH$enabledExtensionCount);
    public static final long OFFSET$enabledExtensionNames = LAYOUT.byteOffset(PATH$enabledExtensionNames);
}
