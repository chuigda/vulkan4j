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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsRequirementsVulkanKHR.html"><code>XrGraphicsRequirementsVulkanKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrGraphicsRequirementsVulkanKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrVersion minApiVersionSupported; // @link substring="minApiVersionSupported" target="#minApiVersionSupported"
///     XrVersion maxApiVersionSupported; // @link substring="maxApiVersionSupported" target="#maxApiVersionSupported"
/// } XrGraphicsRequirementsVulkanKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR`
///
/// The {@code allocate} ({@link XrGraphicsRequirementsVulkanKHR#allocate(Arena)}, {@link XrGraphicsRequirementsVulkanKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrGraphicsRequirementsVulkanKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsRequirementsVulkanKHR.html"><code>XrGraphicsRequirementsVulkanKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrGraphicsRequirementsVulkanKHR(@NotNull MemorySegment segment) implements IXrGraphicsRequirementsVulkanKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsRequirementsVulkanKHR.html"><code>XrGraphicsRequirementsVulkanKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrGraphicsRequirementsVulkanKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrGraphicsRequirementsVulkanKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrGraphicsRequirementsVulkanKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrGraphicsRequirementsVulkanKHR, Iterable<XrGraphicsRequirementsVulkanKHR> {
        public long size() {
            return segment.byteSize() / XrGraphicsRequirementsVulkanKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrGraphicsRequirementsVulkanKHR at(long index) {
            return new XrGraphicsRequirementsVulkanKHR(segment.asSlice(index * XrGraphicsRequirementsVulkanKHR.BYTES, XrGraphicsRequirementsVulkanKHR.BYTES));
        }

        public void write(long index, @NotNull XrGraphicsRequirementsVulkanKHR value) {
            MemorySegment s = segment.asSlice(index * XrGraphicsRequirementsVulkanKHR.BYTES, XrGraphicsRequirementsVulkanKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrGraphicsRequirementsVulkanKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrGraphicsRequirementsVulkanKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrGraphicsRequirementsVulkanKHR.BYTES,
                (end - start) * XrGraphicsRequirementsVulkanKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrGraphicsRequirementsVulkanKHR.BYTES));
        }

        public XrGraphicsRequirementsVulkanKHR[] toArray() {
            XrGraphicsRequirementsVulkanKHR[] ret = new XrGraphicsRequirementsVulkanKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrGraphicsRequirementsVulkanKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrGraphicsRequirementsVulkanKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrGraphicsRequirementsVulkanKHR.BYTES;
            }

            @Override
            public XrGraphicsRequirementsVulkanKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrGraphicsRequirementsVulkanKHR ret = new XrGraphicsRequirementsVulkanKHR(segment.asSlice(0, XrGraphicsRequirementsVulkanKHR.BYTES));
                segment = segment.asSlice(XrGraphicsRequirementsVulkanKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrGraphicsRequirementsVulkanKHR allocate(Arena arena) {
        XrGraphicsRequirementsVulkanKHR ret = new XrGraphicsRequirementsVulkanKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.GRAPHICS_REQUIREMENTS_VULKAN_KHR);
        return ret;
    }

    public static XrGraphicsRequirementsVulkanKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrGraphicsRequirementsVulkanKHR.Ptr ret = new XrGraphicsRequirementsVulkanKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.GRAPHICS_REQUIREMENTS_VULKAN_KHR);
        }
        return ret;
    }

    public static XrGraphicsRequirementsVulkanKHR clone(Arena arena, XrGraphicsRequirementsVulkanKHR src) {
        XrGraphicsRequirementsVulkanKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.GRAPHICS_REQUIREMENTS_VULKAN_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrGraphicsRequirementsVulkanKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrGraphicsRequirementsVulkanKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrGraphicsRequirementsVulkanKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrVersion") @Unsigned long minApiVersionSupported() {
        return segment.get(LAYOUT$minApiVersionSupported, OFFSET$minApiVersionSupported);
    }

    public XrGraphicsRequirementsVulkanKHR minApiVersionSupported(@NativeType("XrVersion") @Unsigned long value) {
        segment.set(LAYOUT$minApiVersionSupported, OFFSET$minApiVersionSupported, value);
        return this;
    }

    public @NativeType("XrVersion") @Unsigned long maxApiVersionSupported() {
        return segment.get(LAYOUT$maxApiVersionSupported, OFFSET$maxApiVersionSupported);
    }

    public XrGraphicsRequirementsVulkanKHR maxApiVersionSupported(@NativeType("XrVersion") @Unsigned long value) {
        segment.set(LAYOUT$maxApiVersionSupported, OFFSET$maxApiVersionSupported, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("minApiVersionSupported"),
        ValueLayout.JAVA_LONG.withName("maxApiVersionSupported")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$minApiVersionSupported = PathElement.groupElement("minApiVersionSupported");
    public static final PathElement PATH$maxApiVersionSupported = PathElement.groupElement("maxApiVersionSupported");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$minApiVersionSupported = (OfLong) LAYOUT.select(PATH$minApiVersionSupported);
    public static final OfLong LAYOUT$maxApiVersionSupported = (OfLong) LAYOUT.select(PATH$maxApiVersionSupported);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$minApiVersionSupported = LAYOUT$minApiVersionSupported.byteSize();
    public static final long SIZE$maxApiVersionSupported = LAYOUT$maxApiVersionSupported.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$minApiVersionSupported = LAYOUT.byteOffset(PATH$minApiVersionSupported);
    public static final long OFFSET$maxApiVersionSupported = LAYOUT.byteOffset(PATH$maxApiVersionSupported);
}
