package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkIndirectCommandsLayoutCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_INT.withName("tokenCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsLayoutTokenNV.LAYOUT).withName("pTokens"),
        ValueLayout.JAVA_INT.withName("streamCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pStreamStrides")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("pipelineBindPoint");
    public static final PathElement PATH$tokenCount = PathElement.groupElement("tokenCount");
    public static final PathElement PATH$pTokens = PathElement.groupElement("pTokens");
    public static final PathElement PATH$streamCount = PathElement.groupElement("streamCount");
    public static final PathElement PATH$pStreamStrides = PathElement.groupElement("pStreamStrides");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$pipelineBindPoint = (OfInt) LAYOUT.select(PATH$pipelineBindPoint);
    public static final OfInt LAYOUT$tokenCount = (OfInt) LAYOUT.select(PATH$tokenCount);
    public static final AddressLayout LAYOUT$pTokens = (AddressLayout) LAYOUT.select(PATH$pTokens);
    public static final OfInt LAYOUT$streamCount = (OfInt) LAYOUT.select(PATH$streamCount);
    public static final AddressLayout LAYOUT$pStreamStrides = (AddressLayout) LAYOUT.select(PATH$pStreamStrides);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pipelineBindPoint = LAYOUT.byteOffset(PATH$pipelineBindPoint);
    public static final long OFFSET$tokenCount = LAYOUT.byteOffset(PATH$tokenCount);
    public static final long OFFSET$pTokens = LAYOUT.byteOffset(PATH$pTokens);
    public static final long OFFSET$streamCount = LAYOUT.byteOffset(PATH$streamCount);
    public static final long OFFSET$pStreamStrides = LAYOUT.byteOffset(PATH$pStreamStrides);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pipelineBindPoint = LAYOUT$pipelineBindPoint.byteSize();
    public static final long SIZE$tokenCount = LAYOUT$tokenCount.byteSize();
    public static final long SIZE$pTokens = LAYOUT$pTokens.byteSize();
    public static final long SIZE$streamCount = LAYOUT$streamCount.byteSize();
    public static final long SIZE$pStreamStrides = LAYOUT$pStreamStrides.byteSize();

    public VkIndirectCommandsLayoutCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV);
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

    public @enumtype(VkIndirectCommandsLayoutUsageFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkIndirectCommandsLayoutUsageFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint() {
        return segment.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);
    }

    public void pipelineBindPoint(@enumtype(VkPipelineBindPoint.class) int value) {
        segment.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);
    }

    public @unsigned int tokenCount() {
        return segment.get(LAYOUT$tokenCount, OFFSET$tokenCount);
    }

    public void tokenCount(@unsigned int value) {
        segment.set(LAYOUT$tokenCount, OFFSET$tokenCount, value);
    }

    public @pointer(comment="VkIndirectCommandsLayoutTokenNV*") MemorySegment pTokensRaw() {
        return segment.get(LAYOUT$pTokens, OFFSET$pTokens);
    }

    public void pTokensRaw(@pointer(comment="VkIndirectCommandsLayoutTokenNV*") MemorySegment value) {
        segment.set(LAYOUT$pTokens, OFFSET$pTokens, value);
    }
    
    public @nullable VkIndirectCommandsLayoutTokenNV pTokens() {
        MemorySegment s = pTokensRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkIndirectCommandsLayoutTokenNV(s);
    }

    public void pTokens(@nullable VkIndirectCommandsLayoutTokenNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTokensRaw(s);
    }

    public @unsigned int streamCount() {
        return segment.get(LAYOUT$streamCount, OFFSET$streamCount);
    }

    public void streamCount(@unsigned int value) {
        segment.set(LAYOUT$streamCount, OFFSET$streamCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pStreamStridesRaw() {
        return segment.get(LAYOUT$pStreamStrides, OFFSET$pStreamStrides);
    }

    public void pStreamStridesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pStreamStrides, OFFSET$pStreamStrides, value);
    }
    
    public @unsigned IntBuffer pStreamStrides() {
        return new IntBuffer(pStreamStridesRaw());
    }

    public void pStreamStrides(@unsigned IntBuffer value) {
        pStreamStridesRaw(value.segment());
    }

    public static VkIndirectCommandsLayoutCreateInfoNV allocate(Arena arena) {
        return new VkIndirectCommandsLayoutCreateInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkIndirectCommandsLayoutCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsLayoutCreateInfoNV[] ret = new VkIndirectCommandsLayoutCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkIndirectCommandsLayoutCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
