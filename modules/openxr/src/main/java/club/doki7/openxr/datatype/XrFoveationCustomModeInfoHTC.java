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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationCustomModeInfoHTC.html"><code>XrFoveationCustomModeInfoHTC</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFoveationCustomModeInfoHTC {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t configCount; // @link substring="configCount" target="#configCount"
///     XrFoveationConfigurationHTC const* configs; // @link substring="XrFoveationConfigurationHTC" target="XrFoveationConfigurationHTC" @link substring="configs" target="#configs"
/// } XrFoveationCustomModeInfoHTC;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC`
///
/// The {@code allocate} ({@link XrFoveationCustomModeInfoHTC#allocate(Arena)}, {@link XrFoveationCustomModeInfoHTC#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFoveationCustomModeInfoHTC#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationCustomModeInfoHTC.html"><code>XrFoveationCustomModeInfoHTC</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFoveationCustomModeInfoHTC(@NotNull MemorySegment segment) implements IXrFoveationCustomModeInfoHTC {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationCustomModeInfoHTC.html"><code>XrFoveationCustomModeInfoHTC</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFoveationCustomModeInfoHTC}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFoveationCustomModeInfoHTC to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFoveationCustomModeInfoHTC.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFoveationCustomModeInfoHTC, Iterable<XrFoveationCustomModeInfoHTC> {
        public long size() {
            return segment.byteSize() / XrFoveationCustomModeInfoHTC.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFoveationCustomModeInfoHTC at(long index) {
            return new XrFoveationCustomModeInfoHTC(segment.asSlice(index * XrFoveationCustomModeInfoHTC.BYTES, XrFoveationCustomModeInfoHTC.BYTES));
        }

        public XrFoveationCustomModeInfoHTC.Ptr at(long index, @NotNull Consumer<@NotNull XrFoveationCustomModeInfoHTC> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrFoveationCustomModeInfoHTC value) {
            MemorySegment s = segment.asSlice(index * XrFoveationCustomModeInfoHTC.BYTES, XrFoveationCustomModeInfoHTC.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFoveationCustomModeInfoHTC.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFoveationCustomModeInfoHTC.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFoveationCustomModeInfoHTC.BYTES,
                (end - start) * XrFoveationCustomModeInfoHTC.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFoveationCustomModeInfoHTC.BYTES));
        }

        public XrFoveationCustomModeInfoHTC[] toArray() {
            XrFoveationCustomModeInfoHTC[] ret = new XrFoveationCustomModeInfoHTC[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFoveationCustomModeInfoHTC> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFoveationCustomModeInfoHTC> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFoveationCustomModeInfoHTC.BYTES;
            }

            @Override
            public XrFoveationCustomModeInfoHTC next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFoveationCustomModeInfoHTC ret = new XrFoveationCustomModeInfoHTC(segment.asSlice(0, XrFoveationCustomModeInfoHTC.BYTES));
                segment = segment.asSlice(XrFoveationCustomModeInfoHTC.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFoveationCustomModeInfoHTC allocate(Arena arena) {
        XrFoveationCustomModeInfoHTC ret = new XrFoveationCustomModeInfoHTC(arena.allocate(LAYOUT));
        ret.type(XrStructureType.FOVEATION_CUSTOM_MODE_INFO_HTC);
        return ret;
    }

    public static XrFoveationCustomModeInfoHTC.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFoveationCustomModeInfoHTC.Ptr ret = new XrFoveationCustomModeInfoHTC.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.FOVEATION_CUSTOM_MODE_INFO_HTC);
        }
        return ret;
    }

    public static XrFoveationCustomModeInfoHTC clone(Arena arena, XrFoveationCustomModeInfoHTC src) {
        XrFoveationCustomModeInfoHTC ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.FOVEATION_CUSTOM_MODE_INFO_HTC);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFoveationCustomModeInfoHTC type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFoveationCustomModeInfoHTC next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFoveationCustomModeInfoHTC next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int configCount() {
        return segment.get(LAYOUT$configCount, OFFSET$configCount);
    }

    public XrFoveationCustomModeInfoHTC configCount(@Unsigned int value) {
        segment.set(LAYOUT$configCount, OFFSET$configCount, value);
        return this;
    }

    public XrFoveationCustomModeInfoHTC configs(@Nullable IXrFoveationConfigurationHTC value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        configsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrFoveationConfigurationHTC.Ptr configs(int assumedCount) {
        MemorySegment s = configsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrFoveationConfigurationHTC.BYTES);
        return new XrFoveationConfigurationHTC.Ptr(s);
    }

    public @Nullable XrFoveationConfigurationHTC configs() {
        MemorySegment s = configsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrFoveationConfigurationHTC(s);
    }

    public @Pointer(target=XrFoveationConfigurationHTC.class) @NotNull MemorySegment configsRaw() {
        return segment.get(LAYOUT$configs, OFFSET$configs);
    }

    public void configsRaw(@Pointer(target=XrFoveationConfigurationHTC.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$configs, OFFSET$configs, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("configCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrFoveationConfigurationHTC.LAYOUT).withName("configs")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$configCount = PathElement.groupElement("configCount");
    public static final PathElement PATH$configs = PathElement.groupElement("configs");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$configCount = (OfInt) LAYOUT.select(PATH$configCount);
    public static final AddressLayout LAYOUT$configs = (AddressLayout) LAYOUT.select(PATH$configs);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$configCount = LAYOUT$configCount.byteSize();
    public static final long SIZE$configs = LAYOUT$configs.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$configCount = LAYOUT.byteOffset(PATH$configCount);
    public static final long OFFSET$configs = LAYOUT.byteOffset(PATH$configs);
}
