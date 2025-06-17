package club.doki7.vulkan.datatype;

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
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatConstraintsInfoFUCHSIA.html"><code>VkImageFormatConstraintsInfoFUCHSIA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageFormatConstraintsInfoFUCHSIA {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkImageCreateInfo imageCreateInfo; // @link substring="VkImageCreateInfo" target="VkImageCreateInfo" @link substring="imageCreateInfo" target="#imageCreateInfo"
///     VkFormatFeatureFlags requiredFormatFeatures; // @link substring="VkFormatFeatureFlags" target="VkFormatFeatureFlags" @link substring="requiredFormatFeatures" target="#requiredFormatFeatures"
///     VkImageFormatConstraintsFlagsFUCHSIA flags; // optional // @link substring="VkImageFormatConstraintsFlagsFUCHSIA" target="VkImageFormatConstraintsFlagsFUCHSIA" @link substring="flags" target="#flags"
///     uint64_t sysmemPixelFormat; // optional // @link substring="sysmemPixelFormat" target="#sysmemPixelFormat"
///     uint32_t colorSpaceCount; // @link substring="colorSpaceCount" target="#colorSpaceCount"
///     VkSysmemColorSpaceFUCHSIA const* pColorSpaces; // @link substring="VkSysmemColorSpaceFUCHSIA" target="VkSysmemColorSpaceFUCHSIA" @link substring="pColorSpaces" target="#pColorSpaces"
/// } VkImageFormatConstraintsInfoFUCHSIA;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_FORMAT_CONSTRAINTS_INFO_FUCHSIA`
///
/// The {@code allocate} ({@link VkImageFormatConstraintsInfoFUCHSIA#allocate(Arena)}, {@link VkImageFormatConstraintsInfoFUCHSIA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImageFormatConstraintsInfoFUCHSIA#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatConstraintsInfoFUCHSIA.html"><code>VkImageFormatConstraintsInfoFUCHSIA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageFormatConstraintsInfoFUCHSIA(@NotNull MemorySegment segment) implements IVkImageFormatConstraintsInfoFUCHSIA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatConstraintsInfoFUCHSIA.html"><code>VkImageFormatConstraintsInfoFUCHSIA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkImageFormatConstraintsInfoFUCHSIA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkImageFormatConstraintsInfoFUCHSIA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkImageFormatConstraintsInfoFUCHSIA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkImageFormatConstraintsInfoFUCHSIA, Iterable<VkImageFormatConstraintsInfoFUCHSIA> {
        public long size() {
            return segment.byteSize() / VkImageFormatConstraintsInfoFUCHSIA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkImageFormatConstraintsInfoFUCHSIA at(long index) {
            return new VkImageFormatConstraintsInfoFUCHSIA(segment.asSlice(index * VkImageFormatConstraintsInfoFUCHSIA.BYTES, VkImageFormatConstraintsInfoFUCHSIA.BYTES));
        }

        public void write(long index, @NotNull VkImageFormatConstraintsInfoFUCHSIA value) {
            MemorySegment s = segment.asSlice(index * VkImageFormatConstraintsInfoFUCHSIA.BYTES, VkImageFormatConstraintsInfoFUCHSIA.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkImageFormatConstraintsInfoFUCHSIA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkImageFormatConstraintsInfoFUCHSIA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkImageFormatConstraintsInfoFUCHSIA.BYTES,
                (end - start) * VkImageFormatConstraintsInfoFUCHSIA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkImageFormatConstraintsInfoFUCHSIA.BYTES));
        }

        public VkImageFormatConstraintsInfoFUCHSIA[] toArray() {
            VkImageFormatConstraintsInfoFUCHSIA[] ret = new VkImageFormatConstraintsInfoFUCHSIA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkImageFormatConstraintsInfoFUCHSIA> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkImageFormatConstraintsInfoFUCHSIA> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkImageFormatConstraintsInfoFUCHSIA.BYTES;
            }

            @Override
            public VkImageFormatConstraintsInfoFUCHSIA next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkImageFormatConstraintsInfoFUCHSIA ret = new VkImageFormatConstraintsInfoFUCHSIA(segment.asSlice(0, VkImageFormatConstraintsInfoFUCHSIA.BYTES));
                segment = segment.asSlice(VkImageFormatConstraintsInfoFUCHSIA.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkImageFormatConstraintsInfoFUCHSIA allocate(Arena arena) {
        VkImageFormatConstraintsInfoFUCHSIA ret = new VkImageFormatConstraintsInfoFUCHSIA(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_FORMAT_CONSTRAINTS_INFO_FUCHSIA);
        return ret;
    }

    public static VkImageFormatConstraintsInfoFUCHSIA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageFormatConstraintsInfoFUCHSIA.Ptr ret = new VkImageFormatConstraintsInfoFUCHSIA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.IMAGE_FORMAT_CONSTRAINTS_INFO_FUCHSIA);
        }
        return ret;
    }

    public static VkImageFormatConstraintsInfoFUCHSIA clone(Arena arena, VkImageFormatConstraintsInfoFUCHSIA src) {
        VkImageFormatConstraintsInfoFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_FORMAT_CONSTRAINTS_INFO_FUCHSIA);
    }

    public @MagicConstant(valuesFromClass = VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkImageFormatConstraintsInfoFUCHSIA sType(@MagicConstant(valuesFromClass = VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkImageFormatConstraintsInfoFUCHSIA pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull VkImageCreateInfo imageCreateInfo() {
        return new VkImageCreateInfo(segment.asSlice(OFFSET$imageCreateInfo, LAYOUT$imageCreateInfo));
    }

    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo(@NotNull VkImageCreateInfo value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageCreateInfo, SIZE$imageCreateInfo);
        return this;
    }

    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo(Consumer<@NotNull VkImageCreateInfo> consumer) {
        consumer.accept(imageCreateInfo());
        return this;
    }

    public @MagicConstant(valuesFromClass = VkFormatFeatureFlags.class) int requiredFormatFeatures() {
        return segment.get(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures);
    }

    public VkImageFormatConstraintsInfoFUCHSIA requiredFormatFeatures(@MagicConstant(valuesFromClass = VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures, value);
        return this;
    }

    public @MagicConstant(valuesFromClass = VkImageFormatConstraintsFlagsFUCHSIA.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public VkImageFormatConstraintsInfoFUCHSIA flags(@MagicConstant(valuesFromClass = VkImageFormatConstraintsFlagsFUCHSIA.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @Unsigned long sysmemPixelFormat() {
        return segment.get(LAYOUT$sysmemPixelFormat, OFFSET$sysmemPixelFormat);
    }

    public VkImageFormatConstraintsInfoFUCHSIA sysmemPixelFormat(@Unsigned long value) {
        segment.set(LAYOUT$sysmemPixelFormat, OFFSET$sysmemPixelFormat, value);
        return this;
    }

    public @Unsigned int colorSpaceCount() {
        return segment.get(LAYOUT$colorSpaceCount, OFFSET$colorSpaceCount);
    }

    public VkImageFormatConstraintsInfoFUCHSIA colorSpaceCount(@Unsigned int value) {
        segment.set(LAYOUT$colorSpaceCount, OFFSET$colorSpaceCount, value);
        return this;
    }

    public VkImageFormatConstraintsInfoFUCHSIA pColorSpaces(@Nullable IVkSysmemColorSpaceFUCHSIA value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorSpacesRaw(s);
        return this;
    }

    @Unsafe public @Nullable VkSysmemColorSpaceFUCHSIA.Ptr pColorSpaces(int assumedCount) {
        MemorySegment s = pColorSpacesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSysmemColorSpaceFUCHSIA.BYTES);
        return new VkSysmemColorSpaceFUCHSIA.Ptr(s);
    }

    public @Nullable VkSysmemColorSpaceFUCHSIA pColorSpaces() {
        MemorySegment s = pColorSpacesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSysmemColorSpaceFUCHSIA(s);
    }

    public @Pointer(target=VkSysmemColorSpaceFUCHSIA.class) MemorySegment pColorSpacesRaw() {
        return segment.get(LAYOUT$pColorSpaces, OFFSET$pColorSpaces);
    }

    public void pColorSpacesRaw(@Pointer(target=VkSysmemColorSpaceFUCHSIA.class) MemorySegment value) {
        segment.set(LAYOUT$pColorSpaces, OFFSET$pColorSpaces, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkImageCreateInfo.LAYOUT.withName("imageCreateInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("sysmemPixelFormat"),
        ValueLayout.JAVA_INT.withName("colorSpaceCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSysmemColorSpaceFUCHSIA.LAYOUT).withName("pColorSpaces")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageCreateInfo = PathElement.groupElement("imageCreateInfo");
    public static final PathElement PATH$requiredFormatFeatures = PathElement.groupElement("requiredFormatFeatures");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$sysmemPixelFormat = PathElement.groupElement("sysmemPixelFormat");
    public static final PathElement PATH$colorSpaceCount = PathElement.groupElement("colorSpaceCount");
    public static final PathElement PATH$pColorSpaces = PathElement.groupElement("pColorSpaces");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$imageCreateInfo = (StructLayout) LAYOUT.select(PATH$imageCreateInfo);
    public static final OfInt LAYOUT$requiredFormatFeatures = (OfInt) LAYOUT.select(PATH$requiredFormatFeatures);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$sysmemPixelFormat = (OfLong) LAYOUT.select(PATH$sysmemPixelFormat);
    public static final OfInt LAYOUT$colorSpaceCount = (OfInt) LAYOUT.select(PATH$colorSpaceCount);
    public static final AddressLayout LAYOUT$pColorSpaces = (AddressLayout) LAYOUT.select(PATH$pColorSpaces);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageCreateInfo = LAYOUT$imageCreateInfo.byteSize();
    public static final long SIZE$requiredFormatFeatures = LAYOUT$requiredFormatFeatures.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$sysmemPixelFormat = LAYOUT$sysmemPixelFormat.byteSize();
    public static final long SIZE$colorSpaceCount = LAYOUT$colorSpaceCount.byteSize();
    public static final long SIZE$pColorSpaces = LAYOUT$pColorSpaces.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageCreateInfo = LAYOUT.byteOffset(PATH$imageCreateInfo);
    public static final long OFFSET$requiredFormatFeatures = LAYOUT.byteOffset(PATH$requiredFormatFeatures);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$sysmemPixelFormat = LAYOUT.byteOffset(PATH$sysmemPixelFormat);
    public static final long OFFSET$colorSpaceCount = LAYOUT.byteOffset(PATH$colorSpaceCount);
    public static final long OFFSET$pColorSpaces = LAYOUT.byteOffset(PATH$pColorSpaces);
}
