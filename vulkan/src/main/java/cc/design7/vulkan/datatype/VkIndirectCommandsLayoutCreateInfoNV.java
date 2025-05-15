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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsLayoutCreateInfoNV.html">VkIndirectCommandsLayoutCreateInfoNV</a>
@ValueBasedCandidate
public record VkIndirectCommandsLayoutCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$pipelineBindPoint = ValueLayout.JAVA_INT.withName("pipelineBindPoint");
    public static final OfInt LAYOUT$tokenCount = ValueLayout.JAVA_INT.withName("tokenCount");
    public static final AddressLayout LAYOUT$pTokens = ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsLayoutTokenNV.LAYOUT).withName("pTokens");
    public static final OfInt LAYOUT$streamCount = ValueLayout.JAVA_INT.withName("streamCount");
    public static final AddressLayout LAYOUT$pStreamStrides = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pStreamStrides");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$pipelineBindPoint, LAYOUT$tokenCount, LAYOUT$pTokens, LAYOUT$streamCount, LAYOUT$pStreamStrides);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkIndirectCommandsLayoutCreateInfoNV allocate(Arena arena) {
        return new VkIndirectCommandsLayoutCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsLayoutCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsLayoutCreateInfoNV[] ret = new VkIndirectCommandsLayoutCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectCommandsLayoutCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkIndirectCommandsLayoutCreateInfoNV clone(Arena arena, VkIndirectCommandsLayoutCreateInfoNV src) {
        VkIndirectCommandsLayoutCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsLayoutCreateInfoNV[] clone(Arena arena, VkIndirectCommandsLayoutCreateInfoNV[] src) {
        VkIndirectCommandsLayoutCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("PATH$pipelineBindPoint");
    public static final PathElement PATH$tokenCount = PathElement.groupElement("PATH$tokenCount");
    public static final PathElement PATH$pTokens = PathElement.groupElement("PATH$pTokens");
    public static final PathElement PATH$streamCount = PathElement.groupElement("PATH$streamCount");
    public static final PathElement PATH$pStreamStrides = PathElement.groupElement("PATH$pStreamStrides");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pipelineBindPoint = LAYOUT$pipelineBindPoint.byteSize();
    public static final long SIZE$tokenCount = LAYOUT$tokenCount.byteSize();
    public static final long SIZE$pTokens = LAYOUT$pTokens.byteSize();
    public static final long SIZE$streamCount = LAYOUT$streamCount.byteSize();
    public static final long SIZE$pStreamStrides = LAYOUT$pStreamStrides.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pipelineBindPoint = LAYOUT.byteOffset(PATH$pipelineBindPoint);
    public static final long OFFSET$tokenCount = LAYOUT.byteOffset(PATH$tokenCount);
    public static final long OFFSET$pTokens = LAYOUT.byteOffset(PATH$pTokens);
    public static final long OFFSET$streamCount = LAYOUT.byteOffset(PATH$streamCount);
    public static final long OFFSET$pStreamStrides = LAYOUT.byteOffset(PATH$pStreamStrides);

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

    public @Nullable VkIndirectCommandsLayoutTokenNV pTokens() {
        MemorySegment s = pTokensRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkIndirectCommandsLayoutTokenNV(s);
    }

    public void pTokens(@Nullable VkIndirectCommandsLayoutTokenNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTokensRaw(s);
    }

    @unsafe public @Nullable VkIndirectCommandsLayoutTokenNV[] pTokens(int assumedCount) {
        MemorySegment s = pTokensRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectCommandsLayoutTokenNV.SIZE);
        VkIndirectCommandsLayoutTokenNV[] ret = new VkIndirectCommandsLayoutTokenNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectCommandsLayoutTokenNV(s.asSlice(i * VkIndirectCommandsLayoutTokenNV.SIZE, VkIndirectCommandsLayoutTokenNV.SIZE));
        }
        return ret;
    }

    public @unsigned int streamCount() {
        return segment.get(LAYOUT$streamCount, OFFSET$streamCount);
    }

    public void streamCount(@unsigned int value) {
        segment.set(LAYOUT$streamCount, OFFSET$streamCount, value);
    }

    public @pointer(comment="int*") MemorySegment pStreamStridesRaw() {
        return segment.get(LAYOUT$pStreamStrides, OFFSET$pStreamStrides);
    }

    public void pStreamStridesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pStreamStrides, OFFSET$pStreamStrides, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pStreamStrides() {
        MemorySegment s = pStreamStridesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pStreamStrides(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStreamStridesRaw(s);
    }

}
