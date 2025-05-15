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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageCompressionControlEXT.html">VkImageCompressionControlEXT</a>
@ValueBasedCandidate
public record VkImageCompressionControlEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$compressionControlPlaneCount = ValueLayout.JAVA_INT.withName("compressionControlPlaneCount");
    public static final AddressLayout LAYOUT$pFixedRateFlags = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pFixedRateFlags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$compressionControlPlaneCount, LAYOUT$pFixedRateFlags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageCompressionControlEXT allocate(Arena arena) {
        return new VkImageCompressionControlEXT(arena.allocate(LAYOUT));
    }

    public static VkImageCompressionControlEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCompressionControlEXT[] ret = new VkImageCompressionControlEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageCompressionControlEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageCompressionControlEXT clone(Arena arena, VkImageCompressionControlEXT src) {
        VkImageCompressionControlEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageCompressionControlEXT[] clone(Arena arena, VkImageCompressionControlEXT[] src) {
        VkImageCompressionControlEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$compressionControlPlaneCount = PathElement.groupElement("PATH$compressionControlPlaneCount");
    public static final PathElement PATH$pFixedRateFlags = PathElement.groupElement("PATH$pFixedRateFlags");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$compressionControlPlaneCount = LAYOUT$compressionControlPlaneCount.byteSize();
    public static final long SIZE$pFixedRateFlags = LAYOUT$pFixedRateFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$compressionControlPlaneCount = LAYOUT.byteOffset(PATH$compressionControlPlaneCount);
    public static final long OFFSET$pFixedRateFlags = LAYOUT.byteOffset(PATH$pFixedRateFlags);

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

    public @enumtype(VkImageCompressionFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageCompressionFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int compressionControlPlaneCount() {
        return segment.get(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount);
    }

    public void compressionControlPlaneCount(@unsigned int value) {
        segment.set(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount, value);
    }

    public @pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment pFixedRateFlagsRaw() {
        return segment.get(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags);
    }

    public void pFixedRateFlagsRaw(@pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkImageCompressionFixedRateFlagsEXT.class) IntPtr pFixedRateFlags() {
        MemorySegment s = pFixedRateFlagsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pFixedRateFlags(@Nullable @enumtype(VkImageCompressionFixedRateFlagsEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFixedRateFlagsRaw(s);
    }

}
