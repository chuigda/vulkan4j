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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageFormatConstraintsInfoFUCHSIA.html">VkImageFormatConstraintsInfoFUCHSIA</a>
@ValueBasedCandidate
public record VkImageFormatConstraintsInfoFUCHSIA(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$imageCreateInfo = VkImageCreateInfo.LAYOUT.withName("imageCreateInfo");
    public static final OfInt LAYOUT$requiredFormatFeatures = ValueLayout.JAVA_INT.withName("requiredFormatFeatures");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfLong LAYOUT$sysmemPixelFormat = ValueLayout.JAVA_LONG.withName("sysmemPixelFormat");
    public static final OfInt LAYOUT$colorSpaceCount = ValueLayout.JAVA_INT.withName("colorSpaceCount");
    public static final AddressLayout LAYOUT$pColorSpaces = ValueLayout.ADDRESS.withTargetLayout(VkSysmemColorSpaceFUCHSIA.LAYOUT).withName("pColorSpaces");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$imageCreateInfo, LAYOUT$requiredFormatFeatures, LAYOUT$flags, LAYOUT$sysmemPixelFormat, LAYOUT$colorSpaceCount, LAYOUT$pColorSpaces);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageFormatConstraintsInfoFUCHSIA allocate(Arena arena) {
        return new VkImageFormatConstraintsInfoFUCHSIA(arena.allocate(LAYOUT));
    }

    public static VkImageFormatConstraintsInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageFormatConstraintsInfoFUCHSIA[] ret = new VkImageFormatConstraintsInfoFUCHSIA[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageFormatConstraintsInfoFUCHSIA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageFormatConstraintsInfoFUCHSIA clone(Arena arena, VkImageFormatConstraintsInfoFUCHSIA src) {
        VkImageFormatConstraintsInfoFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageFormatConstraintsInfoFUCHSIA[] clone(Arena arena, VkImageFormatConstraintsInfoFUCHSIA[] src) {
        VkImageFormatConstraintsInfoFUCHSIA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$imageCreateInfo = PathElement.groupElement("PATH$imageCreateInfo");
    public static final PathElement PATH$requiredFormatFeatures = PathElement.groupElement("PATH$requiredFormatFeatures");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$sysmemPixelFormat = PathElement.groupElement("PATH$sysmemPixelFormat");
    public static final PathElement PATH$colorSpaceCount = PathElement.groupElement("PATH$colorSpaceCount");
    public static final PathElement PATH$pColorSpaces = PathElement.groupElement("PATH$pColorSpaces");

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

    public VkImageCreateInfo imageCreateInfo() {
        return new VkImageCreateInfo(segment.asSlice(OFFSET$imageCreateInfo, LAYOUT$imageCreateInfo));
    }

    public void imageCreateInfo(VkImageCreateInfo value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageCreateInfo, SIZE$imageCreateInfo);
    }

    public @enumtype(VkFormatFeatureFlags.class) int requiredFormatFeatures() {
        return segment.get(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures);
    }

    public void requiredFormatFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures, value);
    }

    public @enumtype(VkImageFormatConstraintsFlagsFUCHSIA.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageFormatConstraintsFlagsFUCHSIA.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long sysmemPixelFormat() {
        return segment.get(LAYOUT$sysmemPixelFormat, OFFSET$sysmemPixelFormat);
    }

    public void sysmemPixelFormat(@unsigned long value) {
        segment.set(LAYOUT$sysmemPixelFormat, OFFSET$sysmemPixelFormat, value);
    }

    public @unsigned int colorSpaceCount() {
        return segment.get(LAYOUT$colorSpaceCount, OFFSET$colorSpaceCount);
    }

    public void colorSpaceCount(@unsigned int value) {
        segment.set(LAYOUT$colorSpaceCount, OFFSET$colorSpaceCount, value);
    }

    public @pointer(comment="VkSysmemColorSpaceFUCHSIA*") MemorySegment pColorSpacesRaw() {
        return segment.get(LAYOUT$pColorSpaces, OFFSET$pColorSpaces);
    }

    public void pColorSpacesRaw(@pointer(comment="VkSysmemColorSpaceFUCHSIA*") MemorySegment value) {
        segment.set(LAYOUT$pColorSpaces, OFFSET$pColorSpaces, value);
    }

    public @Nullable VkSysmemColorSpaceFUCHSIA pColorSpaces() {
        MemorySegment s = pColorSpacesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSysmemColorSpaceFUCHSIA(s);
    }

    public void pColorSpaces(@Nullable VkSysmemColorSpaceFUCHSIA value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorSpacesRaw(s);
    }

    @unsafe public @Nullable VkSysmemColorSpaceFUCHSIA[] pColorSpaces(int assumedCount) {
        MemorySegment s = pColorSpacesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSysmemColorSpaceFUCHSIA.SIZE);
        VkSysmemColorSpaceFUCHSIA[] ret = new VkSysmemColorSpaceFUCHSIA[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSysmemColorSpaceFUCHSIA(s.asSlice(i * VkSysmemColorSpaceFUCHSIA.SIZE, VkSysmemColorSpaceFUCHSIA.SIZE));
        }
        return ret;
    }

}
