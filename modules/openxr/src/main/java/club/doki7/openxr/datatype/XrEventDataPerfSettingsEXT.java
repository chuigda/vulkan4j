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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataPerfSettingsEXT.html"><code>XrEventDataPerfSettingsEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEventDataPerfSettingsEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrPerfSettingsDomainEXT domain; // @link substring="XrPerfSettingsDomainEXT" target="XrPerfSettingsDomainEXT" @link substring="domain" target="#domain"
///     XrPerfSettingsSubDomainEXT subDomain; // @link substring="XrPerfSettingsSubDomainEXT" target="XrPerfSettingsSubDomainEXT" @link substring="subDomain" target="#subDomain"
///     XrPerfSettingsNotificationLevelEXT fromLevel; // @link substring="XrPerfSettingsNotificationLevelEXT" target="XrPerfSettingsNotificationLevelEXT" @link substring="fromLevel" target="#fromLevel"
///     XrPerfSettingsNotificationLevelEXT toLevel; // @link substring="XrPerfSettingsNotificationLevelEXT" target="XrPerfSettingsNotificationLevelEXT" @link substring="toLevel" target="#toLevel"
/// } XrEventDataPerfSettingsEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EVENT_DATA_PERF_SETTINGS_EXT`
///
/// The {@code allocate} ({@link XrEventDataPerfSettingsEXT#allocate(Arena)}, {@link XrEventDataPerfSettingsEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEventDataPerfSettingsEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataPerfSettingsEXT.html"><code>XrEventDataPerfSettingsEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEventDataPerfSettingsEXT(@NotNull MemorySegment segment) implements IXrEventDataPerfSettingsEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataPerfSettingsEXT.html"><code>XrEventDataPerfSettingsEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEventDataPerfSettingsEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEventDataPerfSettingsEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEventDataPerfSettingsEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEventDataPerfSettingsEXT, Iterable<XrEventDataPerfSettingsEXT> {
        public long size() {
            return segment.byteSize() / XrEventDataPerfSettingsEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEventDataPerfSettingsEXT at(long index) {
            return new XrEventDataPerfSettingsEXT(segment.asSlice(index * XrEventDataPerfSettingsEXT.BYTES, XrEventDataPerfSettingsEXT.BYTES));
        }

        public XrEventDataPerfSettingsEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrEventDataPerfSettingsEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrEventDataPerfSettingsEXT value) {
            MemorySegment s = segment.asSlice(index * XrEventDataPerfSettingsEXT.BYTES, XrEventDataPerfSettingsEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEventDataPerfSettingsEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEventDataPerfSettingsEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEventDataPerfSettingsEXT.BYTES,
                (end - start) * XrEventDataPerfSettingsEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEventDataPerfSettingsEXT.BYTES));
        }

        public XrEventDataPerfSettingsEXT[] toArray() {
            XrEventDataPerfSettingsEXT[] ret = new XrEventDataPerfSettingsEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEventDataPerfSettingsEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEventDataPerfSettingsEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEventDataPerfSettingsEXT.BYTES;
            }

            @Override
            public XrEventDataPerfSettingsEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEventDataPerfSettingsEXT ret = new XrEventDataPerfSettingsEXT(segment.asSlice(0, XrEventDataPerfSettingsEXT.BYTES));
                segment = segment.asSlice(XrEventDataPerfSettingsEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEventDataPerfSettingsEXT allocate(Arena arena) {
        XrEventDataPerfSettingsEXT ret = new XrEventDataPerfSettingsEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.EVENT_DATA_PERF_SETTINGS_EXT);
        return ret;
    }

    public static XrEventDataPerfSettingsEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEventDataPerfSettingsEXT.Ptr ret = new XrEventDataPerfSettingsEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.EVENT_DATA_PERF_SETTINGS_EXT);
        }
        return ret;
    }

    public static XrEventDataPerfSettingsEXT clone(Arena arena, XrEventDataPerfSettingsEXT src) {
        XrEventDataPerfSettingsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.EVENT_DATA_PERF_SETTINGS_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEventDataPerfSettingsEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEventDataPerfSettingsEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEventDataPerfSettingsEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrPerfSettingsDomainEXT.class) int domain() {
        return segment.get(LAYOUT$domain, OFFSET$domain);
    }

    public XrEventDataPerfSettingsEXT domain(@EnumType(XrPerfSettingsDomainEXT.class) int value) {
        segment.set(LAYOUT$domain, OFFSET$domain, value);
        return this;
    }

    public @EnumType(XrPerfSettingsSubDomainEXT.class) int subDomain() {
        return segment.get(LAYOUT$subDomain, OFFSET$subDomain);
    }

    public XrEventDataPerfSettingsEXT subDomain(@EnumType(XrPerfSettingsSubDomainEXT.class) int value) {
        segment.set(LAYOUT$subDomain, OFFSET$subDomain, value);
        return this;
    }

    public @EnumType(XrPerfSettingsNotificationLevelEXT.class) int fromLevel() {
        return segment.get(LAYOUT$fromLevel, OFFSET$fromLevel);
    }

    public XrEventDataPerfSettingsEXT fromLevel(@EnumType(XrPerfSettingsNotificationLevelEXT.class) int value) {
        segment.set(LAYOUT$fromLevel, OFFSET$fromLevel, value);
        return this;
    }

    public @EnumType(XrPerfSettingsNotificationLevelEXT.class) int toLevel() {
        return segment.get(LAYOUT$toLevel, OFFSET$toLevel);
    }

    public XrEventDataPerfSettingsEXT toLevel(@EnumType(XrPerfSettingsNotificationLevelEXT.class) int value) {
        segment.set(LAYOUT$toLevel, OFFSET$toLevel, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("domain"),
        ValueLayout.JAVA_INT.withName("subDomain"),
        ValueLayout.JAVA_INT.withName("fromLevel"),
        ValueLayout.JAVA_INT.withName("toLevel")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$domain = PathElement.groupElement("domain");
    public static final PathElement PATH$subDomain = PathElement.groupElement("subDomain");
    public static final PathElement PATH$fromLevel = PathElement.groupElement("fromLevel");
    public static final PathElement PATH$toLevel = PathElement.groupElement("toLevel");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$domain = (OfInt) LAYOUT.select(PATH$domain);
    public static final OfInt LAYOUT$subDomain = (OfInt) LAYOUT.select(PATH$subDomain);
    public static final OfInt LAYOUT$fromLevel = (OfInt) LAYOUT.select(PATH$fromLevel);
    public static final OfInt LAYOUT$toLevel = (OfInt) LAYOUT.select(PATH$toLevel);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$domain = LAYOUT$domain.byteSize();
    public static final long SIZE$subDomain = LAYOUT$subDomain.byteSize();
    public static final long SIZE$fromLevel = LAYOUT$fromLevel.byteSize();
    public static final long SIZE$toLevel = LAYOUT$toLevel.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$domain = LAYOUT.byteOffset(PATH$domain);
    public static final long OFFSET$subDomain = LAYOUT.byteOffset(PATH$subDomain);
    public static final long OFFSET$fromLevel = LAYOUT.byteOffset(PATH$fromLevel);
    public static final long OFFSET$toLevel = LAYOUT.byteOffset(PATH$toLevel);
}
