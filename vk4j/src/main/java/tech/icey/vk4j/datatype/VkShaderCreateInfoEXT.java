package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkShaderCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkShaderCreateFlagsEXT flags;
///     VkShaderStageFlagBits stage;
///     VkShaderStageFlags nextStage;
///     VkShaderCodeTypeEXT codeType;
///     size_t codeSize;
///     const void* pCode;
///     const char* pName;
///     uint32_t setLayoutCount;
///     const VkDescriptorSetLayout* pSetLayouts;
///     uint32_t pushConstantRangeCount;
///     const VkPushConstantRange* pPushConstantRanges;
///     const VkSpecializationInfo* pSpecializationInfo;
/// } VkShaderCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkShaderCreateInfoEXT.html">VkShaderCreateInfoEXT</a>
public record VkShaderCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkShaderCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT);
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

    public @enumtype(VkShaderCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkShaderCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkShaderStageFlags.class) int stage() {
        return segment.get(LAYOUT$stage, OFFSET$stage);
    }

    public void stage(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stage, OFFSET$stage, value);
    }

    public @enumtype(VkShaderStageFlags.class) int nextStage() {
        return segment.get(LAYOUT$nextStage, OFFSET$nextStage);
    }

    public void nextStage(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$nextStage, OFFSET$nextStage, value);
    }

    public @enumtype(VkShaderCodeTypeEXT.class) int codeType() {
        return segment.get(LAYOUT$codeType, OFFSET$codeType);
    }

    public void codeType(@enumtype(VkShaderCodeTypeEXT.class) int value) {
        segment.set(LAYOUT$codeType, OFFSET$codeType, value);
    }

    public @unsigned long codeSize() {
            return NativeLayout.readCSizeT(segment, OFFSET$codeSize);
        }
    
        public void codeSize(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$codeSize, value);
        }

    public @pointer(comment="void*") MemorySegment pCode() {
        return segment.get(LAYOUT$pCode, OFFSET$pCode);
    }

    public void pCode(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pCode, OFFSET$pCode, value);
    }

    public void pCode(IPointer pointer) {
        pCode(pointer.segment());
    }

    public @pointer(comment="int8_t*") MemorySegment pNameRaw() {
        return segment.get(LAYOUT$pName, OFFSET$pName);
    }

    public void pNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pName, OFFSET$pName, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @nullable ByteBuffer pName() {
        MemorySegment s = pNameRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pName(@nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNameRaw(s);
    }

    public @unsigned int setLayoutCount() {
        return segment.get(LAYOUT$setLayoutCount, OFFSET$setLayoutCount);
    }

    public void setLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$setLayoutCount, OFFSET$setLayoutCount, value);
    }

    public @pointer(comment="VkDescriptorSetLayout") MemorySegment pSetLayoutsRaw() {
        return segment.get(LAYOUT$pSetLayouts, OFFSET$pSetLayouts);
    }

    public void pSetLayoutsRaw(@pointer(comment="VkDescriptorSetLayout") MemorySegment value) {
        segment.set(LAYOUT$pSetLayouts, OFFSET$pSetLayouts, value);
    }

    /// Note: the returned {@link VkDescriptorSetLayout.Buffer} does not have correct
    /// {@link VkDescriptorSetLayout.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkDescriptorSetLayout.Buffer#reinterpret} to set the size before actually
    /// {@link VkDescriptorSetLayout.Buffer#read}ing or {@link VkDescriptorSetLayout.Buffer#write}ing
    /// the buffer.
    public @nullable VkDescriptorSetLayout.Buffer pSetLayouts() {
        MemorySegment s = pSetLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSetLayout.Buffer(s);
    }

    public void pSetLayouts(@nullable VkDescriptorSetLayout.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSetLayoutsRaw(s);
    }

    public @unsigned int pushConstantRangeCount() {
        return segment.get(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount);
    }

    public void pushConstantRangeCount(@unsigned int value) {
        segment.set(LAYOUT$pushConstantRangeCount, OFFSET$pushConstantRangeCount, value);
    }

    public @pointer(comment="VkPushConstantRange*") MemorySegment pPushConstantRangesRaw() {
        return segment.get(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges);
    }

    public void pPushConstantRangesRaw(@pointer(comment="VkPushConstantRange*") MemorySegment value) {
        segment.set(LAYOUT$pPushConstantRanges, OFFSET$pPushConstantRanges, value);
    }

    public @nullable VkPushConstantRange pPushConstantRanges() {
        MemorySegment s = pPushConstantRangesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPushConstantRange(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPushConstantRange[] pPushConstantRanges(int assumedCount) {
        MemorySegment s = pPushConstantRangesRaw().reinterpret(assumedCount * VkPushConstantRange.SIZE);
        VkPushConstantRange[] arr = new VkPushConstantRange[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPushConstantRange(s.asSlice(i * VkPushConstantRange.SIZE, VkPushConstantRange.SIZE));
        }
        return arr;
    }

    public void pPushConstantRanges(@nullable VkPushConstantRange value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPushConstantRangesRaw(s);
    }

    public @pointer(comment="VkSpecializationInfo*") MemorySegment pSpecializationInfoRaw() {
        return segment.get(LAYOUT$pSpecializationInfo, OFFSET$pSpecializationInfo);
    }

    public void pSpecializationInfoRaw(@pointer(comment="VkSpecializationInfo*") MemorySegment value) {
        segment.set(LAYOUT$pSpecializationInfo, OFFSET$pSpecializationInfo, value);
    }

    public @nullable VkSpecializationInfo pSpecializationInfo() {
        MemorySegment s = pSpecializationInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSpecializationInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSpecializationInfo[] pSpecializationInfo(int assumedCount) {
        MemorySegment s = pSpecializationInfoRaw().reinterpret(assumedCount * VkSpecializationInfo.SIZE);
        VkSpecializationInfo[] arr = new VkSpecializationInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSpecializationInfo(s.asSlice(i * VkSpecializationInfo.SIZE, VkSpecializationInfo.SIZE));
        }
        return arr;
    }

    public void pSpecializationInfo(@nullable VkSpecializationInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSpecializationInfoRaw(s);
    }

    public static VkShaderCreateInfoEXT allocate(Arena arena) {
        return new VkShaderCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkShaderCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderCreateInfoEXT[] ret = new VkShaderCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkShaderCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_INT.withName("nextStage"),
        ValueLayout.JAVA_INT.withName("codeType"),
        NativeLayout.C_SIZE_T.withName("codeSize"),
        ValueLayout.ADDRESS.withName("pCode"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pName"),
        ValueLayout.JAVA_INT.withName("setLayoutCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSetLayouts"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPushConstantRange.LAYOUT).withName("pPushConstantRanges"),
        ValueLayout.ADDRESS.withTargetLayout(VkSpecializationInfo.LAYOUT).withName("pSpecializationInfo")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$stage = PathElement.groupElement("stage");
    public static final PathElement PATH$nextStage = PathElement.groupElement("nextStage");
    public static final PathElement PATH$codeType = PathElement.groupElement("codeType");
    public static final PathElement PATH$codeSize = PathElement.groupElement("codeSize");
    public static final PathElement PATH$pCode = PathElement.groupElement("pCode");
    public static final PathElement PATH$pName = PathElement.groupElement("pName");
    public static final PathElement PATH$setLayoutCount = PathElement.groupElement("setLayoutCount");
    public static final PathElement PATH$pSetLayouts = PathElement.groupElement("pSetLayouts");
    public static final PathElement PATH$pushConstantRangeCount = PathElement.groupElement("pushConstantRangeCount");
    public static final PathElement PATH$pPushConstantRanges = PathElement.groupElement("pPushConstantRanges");
    public static final PathElement PATH$pSpecializationInfo = PathElement.groupElement("pSpecializationInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$stage = (OfInt) LAYOUT.select(PATH$stage);
    public static final OfInt LAYOUT$nextStage = (OfInt) LAYOUT.select(PATH$nextStage);
    public static final OfInt LAYOUT$codeType = (OfInt) LAYOUT.select(PATH$codeType);
    public static final AddressLayout LAYOUT$pCode = (AddressLayout) LAYOUT.select(PATH$pCode);
    public static final AddressLayout LAYOUT$pName = (AddressLayout) LAYOUT.select(PATH$pName);
    public static final OfInt LAYOUT$setLayoutCount = (OfInt) LAYOUT.select(PATH$setLayoutCount);
    public static final AddressLayout LAYOUT$pSetLayouts = (AddressLayout) LAYOUT.select(PATH$pSetLayouts);
    public static final OfInt LAYOUT$pushConstantRangeCount = (OfInt) LAYOUT.select(PATH$pushConstantRangeCount);
    public static final AddressLayout LAYOUT$pPushConstantRanges = (AddressLayout) LAYOUT.select(PATH$pPushConstantRanges);
    public static final AddressLayout LAYOUT$pSpecializationInfo = (AddressLayout) LAYOUT.select(PATH$pSpecializationInfo);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$stage = LAYOUT.byteOffset(PATH$stage);
    public static final long OFFSET$nextStage = LAYOUT.byteOffset(PATH$nextStage);
    public static final long OFFSET$codeType = LAYOUT.byteOffset(PATH$codeType);
    public static final long OFFSET$codeSize = LAYOUT.byteOffset(PATH$codeSize);
    public static final long OFFSET$pCode = LAYOUT.byteOffset(PATH$pCode);
    public static final long OFFSET$pName = LAYOUT.byteOffset(PATH$pName);
    public static final long OFFSET$setLayoutCount = LAYOUT.byteOffset(PATH$setLayoutCount);
    public static final long OFFSET$pSetLayouts = LAYOUT.byteOffset(PATH$pSetLayouts);
    public static final long OFFSET$pushConstantRangeCount = LAYOUT.byteOffset(PATH$pushConstantRangeCount);
    public static final long OFFSET$pPushConstantRanges = LAYOUT.byteOffset(PATH$pPushConstantRanges);
    public static final long OFFSET$pSpecializationInfo = LAYOUT.byteOffset(PATH$pSpecializationInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$stage = LAYOUT$stage.byteSize();
    public static final long SIZE$nextStage = LAYOUT$nextStage.byteSize();
    public static final long SIZE$codeType = LAYOUT$codeType.byteSize();
    public static final long SIZE$pCode = LAYOUT$pCode.byteSize();
    public static final long SIZE$pName = LAYOUT$pName.byteSize();
    public static final long SIZE$setLayoutCount = LAYOUT$setLayoutCount.byteSize();
    public static final long SIZE$pSetLayouts = LAYOUT$pSetLayouts.byteSize();
    public static final long SIZE$pushConstantRangeCount = LAYOUT$pushConstantRangeCount.byteSize();
    public static final long SIZE$pPushConstantRanges = LAYOUT$pPushConstantRanges.byteSize();
    public static final long SIZE$pSpecializationInfo = LAYOUT$pSpecializationInfo.byteSize();

}
