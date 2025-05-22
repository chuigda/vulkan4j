package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetAllocateInfo.html"><code>VkDescriptorSetAllocateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorSetAllocateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkDescriptorPool descriptorPool; // @link substring="VkDescriptorPool" target="VkDescriptorPool" @link substring="descriptorPool" target="#descriptorPool"
///     uint32_t descriptorSetCount; // @link substring="descriptorSetCount" target="#descriptorSetCount"
///     VkDescriptorSetLayout const* pSetLayouts; // @link substring="VkDescriptorSetLayout" target="VkDescriptorSetLayout" @link substring="pSetLayouts" target="#pSetLayouts"
/// } VkDescriptorSetAllocateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO`
///
/// The {@code allocate} ({@link VkDescriptorSetAllocateInfo#allocate(Arena)}, {@link VkDescriptorSetAllocateInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDescriptorSetAllocateInfo#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetAllocateInfo.html"><code>VkDescriptorSetAllocateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorSetAllocateInfo(@NotNull MemorySegment segment) implements IVkDescriptorSetAllocateInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetAllocateInfo.html"><code>VkDescriptorSetAllocateInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDescriptorSetAllocateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDescriptorSetAllocateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDescriptorSetAllocateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDescriptorSetAllocateInfo {
        public long size() {
            return segment.byteSize() / VkDescriptorSetAllocateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDescriptorSetAllocateInfo at(long index) {
            return new VkDescriptorSetAllocateInfo(segment.asSlice(index * VkDescriptorSetAllocateInfo.BYTES, VkDescriptorSetAllocateInfo.BYTES));
        }

        public void write(long index, @NotNull VkDescriptorSetAllocateInfo value) {
            MemorySegment s = segment.asSlice(index * VkDescriptorSetAllocateInfo.BYTES, VkDescriptorSetAllocateInfo.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkDescriptorSetAllocateInfo.BYTES, VkDescriptorSetAllocateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDescriptorSetAllocateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDescriptorSetAllocateInfo.BYTES,
                (end - start) * VkDescriptorSetAllocateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDescriptorSetAllocateInfo.BYTES));
        }

        public VkDescriptorSetAllocateInfo[] toArray() {
            VkDescriptorSetAllocateInfo[] ret = new VkDescriptorSetAllocateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkDescriptorSetAllocateInfo allocate(Arena arena) {
        VkDescriptorSetAllocateInfo ret = new VkDescriptorSetAllocateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DESCRIPTOR_SET_ALLOCATE_INFO);
        return ret;
    }

    public static VkDescriptorSetAllocateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetAllocateInfo.Ptr ret = new VkDescriptorSetAllocateInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.DESCRIPTOR_SET_ALLOCATE_INFO);
        }
        return ret;
    }

    public static VkDescriptorSetAllocateInfo clone(Arena arena, VkDescriptorSetAllocateInfo src) {
        VkDescriptorSetAllocateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DESCRIPTOR_SET_ALLOCATE_INFO);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Nullable VkDescriptorPool descriptorPool() {
        MemorySegment s = segment.asSlice(OFFSET$descriptorPool, SIZE$descriptorPool);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorPool(s);
    }

    public void descriptorPool(@Nullable VkDescriptorPool value) {
        segment.set(LAYOUT$descriptorPool, OFFSET$descriptorPool, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int descriptorSetCount() {
        return segment.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);
    }

    public void descriptorSetCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);
    }

    /// Note: the returned {@link VkDescriptorSetLayout.Ptr} does not have correct {@link VkDescriptorSetLayout.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDescriptorSetLayout.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDescriptorSetLayout.Ptr pSetLayouts() {
        MemorySegment s = pSetLayoutsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorSetLayout.Ptr(s);
    }

    public void pSetLayouts(@Nullable VkDescriptorSetLayout.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSetLayoutsRaw(s);
    }

    public @pointer(target=VkDescriptorSetLayout.class) MemorySegment pSetLayoutsRaw() {
        return segment.get(LAYOUT$pSetLayouts, OFFSET$pSetLayouts);
    }

    public void pSetLayoutsRaw(@pointer(target=VkDescriptorSetLayout.class) MemorySegment value) {
        segment.set(LAYOUT$pSetLayouts, OFFSET$pSetLayouts, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorPool"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSetLayouts")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorPool = PathElement.groupElement("descriptorPool");
    public static final PathElement PATH$descriptorSetCount = PathElement.groupElement("descriptorSetCount");
    public static final PathElement PATH$pSetLayouts = PathElement.groupElement("pSetLayouts");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$descriptorPool = (AddressLayout) LAYOUT.select(PATH$descriptorPool);
    public static final OfInt LAYOUT$descriptorSetCount = (OfInt) LAYOUT.select(PATH$descriptorSetCount);
    public static final AddressLayout LAYOUT$pSetLayouts = (AddressLayout) LAYOUT.select(PATH$pSetLayouts);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorPool = LAYOUT$descriptorPool.byteSize();
    public static final long SIZE$descriptorSetCount = LAYOUT$descriptorSetCount.byteSize();
    public static final long SIZE$pSetLayouts = LAYOUT$pSetLayouts.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorPool = LAYOUT.byteOffset(PATH$descriptorPool);
    public static final long OFFSET$descriptorSetCount = LAYOUT.byteOffset(PATH$descriptorSetCount);
    public static final long OFFSET$pSetLayouts = LAYOUT.byteOffset(PATH$pSetLayouts);
}
