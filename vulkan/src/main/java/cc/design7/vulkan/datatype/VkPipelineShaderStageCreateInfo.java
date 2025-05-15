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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineShaderStageCreateInfo.html">VkPipelineShaderStageCreateInfo</a>
@ValueBasedCandidate
public record VkPipelineShaderStageCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$stage = ValueLayout.JAVA_INT.withName("stage");
    public static final AddressLayout LAYOUT$module = ValueLayout.ADDRESS.withName("module");
    public static final AddressLayout LAYOUT$pName = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pName");
    public static final AddressLayout LAYOUT$pSpecializationInfo = ValueLayout.ADDRESS.withTargetLayout(VkSpecializationInfo.LAYOUT).withName("pSpecializationInfo");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$stage, LAYOUT$module, LAYOUT$pName, LAYOUT$pSpecializationInfo);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineShaderStageCreateInfo allocate(Arena arena) {
        return new VkPipelineShaderStageCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineShaderStageCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineShaderStageCreateInfo[] ret = new VkPipelineShaderStageCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineShaderStageCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineShaderStageCreateInfo clone(Arena arena, VkPipelineShaderStageCreateInfo src) {
        VkPipelineShaderStageCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineShaderStageCreateInfo[] clone(Arena arena, VkPipelineShaderStageCreateInfo[] src) {
        VkPipelineShaderStageCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$stage = PathElement.groupElement("PATH$stage");
    public static final PathElement PATH$module = PathElement.groupElement("PATH$module");
    public static final PathElement PATH$pName = PathElement.groupElement("PATH$pName");
    public static final PathElement PATH$pSpecializationInfo = PathElement.groupElement("PATH$pSpecializationInfo");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$stage = LAYOUT$stage.byteSize();
    public static final long SIZE$module = LAYOUT$module.byteSize();
    public static final long SIZE$pName = LAYOUT$pName.byteSize();
    public static final long SIZE$pSpecializationInfo = LAYOUT$pSpecializationInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$stage = LAYOUT.byteOffset(PATH$stage);
    public static final long OFFSET$module = LAYOUT.byteOffset(PATH$module);
    public static final long OFFSET$pName = LAYOUT.byteOffset(PATH$pName);
    public static final long OFFSET$pSpecializationInfo = LAYOUT.byteOffset(PATH$pSpecializationInfo);

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

    public @enumtype(VkPipelineShaderStageCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineShaderStageCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkShaderStageFlags.class) int stage() {
        return segment.get(LAYOUT$stage, OFFSET$stage);
    }

    public void stage(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stage, OFFSET$stage, value);
    }

    public @Nullable VkShaderModule module() {
        MemorySegment s = segment.asSlice(OFFSET$module, SIZE$module);
        if (s.address() == 0) {
            return null;
        }
        return new VkShaderModule(s);
    }

    public void module() {
        segment.set(LAYOUT$module, OFFSET$module, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="byte*") MemorySegment pNameRaw() {
        return segment.get(LAYOUT$pName, OFFSET$pName);
    }

    public void pNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pName, OFFSET$pName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pName() {
        MemorySegment s = pNameRaw();
        if (s.address() == 0) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNameRaw(s);
    }

    public @pointer(comment="VkSpecializationInfo*") MemorySegment pSpecializationInfoRaw() {
        return segment.get(LAYOUT$pSpecializationInfo, OFFSET$pSpecializationInfo);
    }

    public void pSpecializationInfoRaw(@pointer(comment="VkSpecializationInfo*") MemorySegment value) {
        segment.set(LAYOUT$pSpecializationInfo, OFFSET$pSpecializationInfo, value);
    }

    public @Nullable VkSpecializationInfo pSpecializationInfo() {
        MemorySegment s = pSpecializationInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSpecializationInfo(s);
    }

    public void pSpecializationInfo(@Nullable VkSpecializationInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSpecializationInfoRaw(s);
    }

    @unsafe public @Nullable VkSpecializationInfo[] pSpecializationInfo(int assumedCount) {
        MemorySegment s = pSpecializationInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSpecializationInfo.SIZE);
        VkSpecializationInfo[] ret = new VkSpecializationInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSpecializationInfo(s.asSlice(i * VkSpecializationInfo.SIZE, VkSpecializationInfo.SIZE));
        }
        return ret;
    }

}
