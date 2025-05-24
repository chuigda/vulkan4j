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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPushDescriptorSetInfo.html"><code>VkPushDescriptorSetInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPushDescriptorSetInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkShaderStageFlags stageFlags; // @link substring="VkShaderStageFlags" target="VkShaderStageFlags" @link substring="stageFlags" target="#stageFlags"
///     VkPipelineLayout layout; // optional // @link substring="VkPipelineLayout" target="VkPipelineLayout" @link substring="layout" target="#layout"
///     uint32_t set; // optional // @link substring="set" target="#set"
///     uint32_t descriptorWriteCount; // @link substring="descriptorWriteCount" target="#descriptorWriteCount"
///     VkWriteDescriptorSet const* pDescriptorWrites; // @link substring="VkWriteDescriptorSet" target="VkWriteDescriptorSet" @link substring="pDescriptorWrites" target="#pDescriptorWrites"
/// } VkPushDescriptorSetInfo;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO`
///
/// The {@code allocate} ({@link VkPushDescriptorSetInfo#allocate(Arena)}, {@link VkPushDescriptorSetInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPushDescriptorSetInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPushDescriptorSetInfo.html"><code>VkPushDescriptorSetInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPushDescriptorSetInfo(@NotNull MemorySegment segment) implements IVkPushDescriptorSetInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPushDescriptorSetInfo.html"><code>VkPushDescriptorSetInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPushDescriptorSetInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPushDescriptorSetInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPushDescriptorSetInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPushDescriptorSetInfo {
        public long size() {
            return segment.byteSize() / VkPushDescriptorSetInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPushDescriptorSetInfo at(long index) {
            return new VkPushDescriptorSetInfo(segment.asSlice(index * VkPushDescriptorSetInfo.BYTES, VkPushDescriptorSetInfo.BYTES));
        }

        public void write(long index, @NotNull VkPushDescriptorSetInfo value) {
            MemorySegment s = segment.asSlice(index * VkPushDescriptorSetInfo.BYTES, VkPushDescriptorSetInfo.BYTES);
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
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkPushDescriptorSetInfo.BYTES, VkPushDescriptorSetInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPushDescriptorSetInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPushDescriptorSetInfo.BYTES,
                (end - start) * VkPushDescriptorSetInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPushDescriptorSetInfo.BYTES));
        }

        public VkPushDescriptorSetInfo[] toArray() {
            VkPushDescriptorSetInfo[] ret = new VkPushDescriptorSetInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkPushDescriptorSetInfo allocate(Arena arena) {
        VkPushDescriptorSetInfo ret = new VkPushDescriptorSetInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PUSH_DESCRIPTOR_SET_INFO);
        return ret;
    }

    public static VkPushDescriptorSetInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPushDescriptorSetInfo.Ptr ret = new VkPushDescriptorSetInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PUSH_DESCRIPTOR_SET_INFO);
        }
        return ret;
    }

    public static VkPushDescriptorSetInfo clone(Arena arena, VkPushDescriptorSetInfo src) {
        VkPushDescriptorSetInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PUSH_DESCRIPTOR_SET_INFO);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @EnumType(VkShaderStageFlags.class) int stageFlags() {
        return segment.get(LAYOUT$stageFlags, OFFSET$stageFlags);
    }

    public void stageFlags(@EnumType(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Unsigned int set() {
        return segment.get(LAYOUT$set, OFFSET$set);
    }

    public void set(@Unsigned int value) {
        segment.set(LAYOUT$set, OFFSET$set, value);
    }

    public @Unsigned int descriptorWriteCount() {
        return segment.get(LAYOUT$descriptorWriteCount, OFFSET$descriptorWriteCount);
    }

    public void descriptorWriteCount(@Unsigned int value) {
        segment.set(LAYOUT$descriptorWriteCount, OFFSET$descriptorWriteCount, value);
    }

    public void pDescriptorWrites(@Nullable IVkWriteDescriptorSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorWritesRaw(s);
    }

    @Unsafe public @Nullable VkWriteDescriptorSet.Ptr pDescriptorWrites(int assumedCount) {
        MemorySegment s = pDescriptorWritesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkWriteDescriptorSet.BYTES);
        return new VkWriteDescriptorSet.Ptr(s);
    }

    public @Nullable VkWriteDescriptorSet pDescriptorWrites() {
        MemorySegment s = pDescriptorWritesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkWriteDescriptorSet(s);
    }

    public @Pointer(target=VkWriteDescriptorSet.class) MemorySegment pDescriptorWritesRaw() {
        return segment.get(LAYOUT$pDescriptorWrites, OFFSET$pDescriptorWrites);
    }

    public void pDescriptorWritesRaw(@Pointer(target=VkWriteDescriptorSet.class) MemorySegment value) {
        segment.set(LAYOUT$pDescriptorWrites, OFFSET$pDescriptorWrites, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.JAVA_INT.withName("descriptorWriteCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkWriteDescriptorSet.LAYOUT).withName("pDescriptorWrites")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("stageFlags");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$set = PathElement.groupElement("set");
    public static final PathElement PATH$descriptorWriteCount = PathElement.groupElement("descriptorWriteCount");
    public static final PathElement PATH$pDescriptorWrites = PathElement.groupElement("pDescriptorWrites");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$set = (OfInt) LAYOUT.select(PATH$set);
    public static final OfInt LAYOUT$descriptorWriteCount = (OfInt) LAYOUT.select(PATH$descriptorWriteCount);
    public static final AddressLayout LAYOUT$pDescriptorWrites = (AddressLayout) LAYOUT.select(PATH$pDescriptorWrites);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$set = LAYOUT$set.byteSize();
    public static final long SIZE$descriptorWriteCount = LAYOUT$descriptorWriteCount.byteSize();
    public static final long SIZE$pDescriptorWrites = LAYOUT$pDescriptorWrites.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$set = LAYOUT.byteOffset(PATH$set);
    public static final long OFFSET$descriptorWriteCount = LAYOUT.byteOffset(PATH$descriptorWriteCount);
    public static final long OFFSET$pDescriptorWrites = LAYOUT.byteOffset(PATH$pDescriptorWrites);
}
