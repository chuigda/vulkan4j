package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineBinaryCreateInfoKHR.html"><code>VkPipelineBinaryCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineBinaryCreateInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkPipelineBinaryKeysAndDataKHR const* pKeysAndDataInfo; // optional
///     VkPipeline pipeline; // optional
///     VkPipelineCreateInfoKHR const* pPipelineCreateInfo; // optional
/// } VkPipelineBinaryCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR`
///
/// The {@link VkPipelineBinaryCreateInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPipelineBinaryCreateInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineBinaryCreateInfoKHR.html"><code>VkPipelineBinaryCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineBinaryCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineBinaryCreateInfoKHR allocate(Arena arena) {
        VkPipelineBinaryCreateInfoKHR ret = new VkPipelineBinaryCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_BINARY_CREATE_INFO_KHR);
        return ret;
    }

    public static VkPipelineBinaryCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryCreateInfoKHR[] ret = new VkPipelineBinaryCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineBinaryCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_BINARY_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkPipelineBinaryCreateInfoKHR clone(Arena arena, VkPipelineBinaryCreateInfoKHR src) {
        VkPipelineBinaryCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineBinaryCreateInfoKHR[] clone(Arena arena, VkPipelineBinaryCreateInfoKHR[] src) {
        VkPipelineBinaryCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_BINARY_CREATE_INFO_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @pointer(comment="VkPipelineBinaryKeysAndDataKHR*") MemorySegment pKeysAndDataInfoRaw() {
        return segment.get(LAYOUT$pKeysAndDataInfo, OFFSET$pKeysAndDataInfo);
    }

    public void pKeysAndDataInfoRaw(@pointer(comment="VkPipelineBinaryKeysAndDataKHR*") MemorySegment value) {
        segment.set(LAYOUT$pKeysAndDataInfo, OFFSET$pKeysAndDataInfo, value);
    }

    public @Nullable VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo() {
        MemorySegment s = pKeysAndDataInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineBinaryKeysAndDataKHR(s);
    }

    public void pKeysAndDataInfo(@Nullable VkPipelineBinaryKeysAndDataKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pKeysAndDataInfoRaw(s);
    }

    @unsafe public @Nullable VkPipelineBinaryKeysAndDataKHR[] pKeysAndDataInfo(int assumedCount) {
        MemorySegment s = pKeysAndDataInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineBinaryKeysAndDataKHR.BYTES);
        VkPipelineBinaryKeysAndDataKHR[] ret = new VkPipelineBinaryKeysAndDataKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineBinaryKeysAndDataKHR(s.asSlice(i * VkPipelineBinaryKeysAndDataKHR.BYTES, VkPipelineBinaryKeysAndDataKHR.BYTES));
        }
        return ret;
    }

    public @Nullable VkPipeline pipeline() {
        MemorySegment s = segment.asSlice(OFFSET$pipeline, SIZE$pipeline);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void pipeline(@Nullable VkPipeline value) {
        segment.set(LAYOUT$pipeline, OFFSET$pipeline, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="VkPipelineCreateInfoKHR*") MemorySegment pPipelineCreateInfoRaw() {
        return segment.get(LAYOUT$pPipelineCreateInfo, OFFSET$pPipelineCreateInfo);
    }

    public void pPipelineCreateInfoRaw(@pointer(comment="VkPipelineCreateInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineCreateInfo, OFFSET$pPipelineCreateInfo, value);
    }

    public @Nullable VkPipelineCreateInfoKHR pPipelineCreateInfo() {
        MemorySegment s = pPipelineCreateInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineCreateInfoKHR(s);
    }

    public void pPipelineCreateInfo(@Nullable VkPipelineCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineCreateInfoRaw(s);
    }

    @unsafe public @Nullable VkPipelineCreateInfoKHR[] pPipelineCreateInfo(int assumedCount) {
        MemorySegment s = pPipelineCreateInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineCreateInfoKHR.BYTES);
        VkPipelineCreateInfoKHR[] ret = new VkPipelineCreateInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineCreateInfoKHR(s.asSlice(i * VkPipelineCreateInfoKHR.BYTES, VkPipelineCreateInfoKHR.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeysAndDataKHR.LAYOUT).withName("pKeysAndDataInfo"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreateInfoKHR.LAYOUT).withName("pPipelineCreateInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pKeysAndDataInfo = PathElement.groupElement("PATH$pKeysAndDataInfo");
    public static final PathElement PATH$pipeline = PathElement.groupElement("PATH$pipeline");
    public static final PathElement PATH$pPipelineCreateInfo = PathElement.groupElement("PATH$pPipelineCreateInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pKeysAndDataInfo = (AddressLayout) LAYOUT.select(PATH$pKeysAndDataInfo);
    public static final AddressLayout LAYOUT$pipeline = (AddressLayout) LAYOUT.select(PATH$pipeline);
    public static final AddressLayout LAYOUT$pPipelineCreateInfo = (AddressLayout) LAYOUT.select(PATH$pPipelineCreateInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pKeysAndDataInfo = LAYOUT$pKeysAndDataInfo.byteSize();
    public static final long SIZE$pipeline = LAYOUT$pipeline.byteSize();
    public static final long SIZE$pPipelineCreateInfo = LAYOUT$pPipelineCreateInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pKeysAndDataInfo = LAYOUT.byteOffset(PATH$pKeysAndDataInfo);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$pPipelineCreateInfo = LAYOUT.byteOffset(PATH$pPipelineCreateInfo);
}
