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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrmFormatModifierPropertiesListEXT.html">VkDrmFormatModifierPropertiesListEXT</a>
@ValueBasedCandidate
public record VkDrmFormatModifierPropertiesListEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$drmFormatModifierCount = ValueLayout.JAVA_INT.withName("drmFormatModifierCount");
    public static final AddressLayout LAYOUT$pDrmFormatModifierProperties = ValueLayout.ADDRESS.withTargetLayout(VkDrmFormatModifierPropertiesEXT.LAYOUT).withName("pDrmFormatModifierProperties");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$drmFormatModifierCount, LAYOUT$pDrmFormatModifierProperties);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDrmFormatModifierPropertiesListEXT allocate(Arena arena) {
        return new VkDrmFormatModifierPropertiesListEXT(arena.allocate(LAYOUT));
    }

    public static VkDrmFormatModifierPropertiesListEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrmFormatModifierPropertiesListEXT[] ret = new VkDrmFormatModifierPropertiesListEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrmFormatModifierPropertiesListEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDrmFormatModifierPropertiesListEXT clone(Arena arena, VkDrmFormatModifierPropertiesListEXT src) {
        VkDrmFormatModifierPropertiesListEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrmFormatModifierPropertiesListEXT[] clone(Arena arena, VkDrmFormatModifierPropertiesListEXT[] src) {
        VkDrmFormatModifierPropertiesListEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$drmFormatModifierCount = PathElement.groupElement("PATH$drmFormatModifierCount");
    public static final PathElement PATH$pDrmFormatModifierProperties = PathElement.groupElement("PATH$pDrmFormatModifierProperties");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$drmFormatModifierCount = LAYOUT$drmFormatModifierCount.byteSize();
    public static final long SIZE$pDrmFormatModifierProperties = LAYOUT$pDrmFormatModifierProperties.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$drmFormatModifierCount = LAYOUT.byteOffset(PATH$drmFormatModifierCount);
    public static final long OFFSET$pDrmFormatModifierProperties = LAYOUT.byteOffset(PATH$pDrmFormatModifierProperties);

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

    public @unsigned int drmFormatModifierCount() {
        return segment.get(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount);
    }

    public void drmFormatModifierCount(@unsigned int value) {
        segment.set(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount, value);
    }

    public @pointer(comment="VkDrmFormatModifierPropertiesEXT*") MemorySegment pDrmFormatModifierPropertiesRaw() {
        return segment.get(LAYOUT$pDrmFormatModifierProperties, OFFSET$pDrmFormatModifierProperties);
    }

    public void pDrmFormatModifierPropertiesRaw(@pointer(comment="VkDrmFormatModifierPropertiesEXT*") MemorySegment value) {
        segment.set(LAYOUT$pDrmFormatModifierProperties, OFFSET$pDrmFormatModifierProperties, value);
    }

    public @Nullable VkDrmFormatModifierPropertiesEXT pDrmFormatModifierProperties() {
        MemorySegment s = pDrmFormatModifierPropertiesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDrmFormatModifierPropertiesEXT(s);
    }

    public void pDrmFormatModifierProperties(@Nullable VkDrmFormatModifierPropertiesEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDrmFormatModifierPropertiesRaw(s);
    }

    @unsafe public @Nullable VkDrmFormatModifierPropertiesEXT[] pDrmFormatModifierProperties(int assumedCount) {
        MemorySegment s = pDrmFormatModifierPropertiesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDrmFormatModifierPropertiesEXT.SIZE);
        VkDrmFormatModifierPropertiesEXT[] ret = new VkDrmFormatModifierPropertiesEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDrmFormatModifierPropertiesEXT(s.asSlice(i * VkDrmFormatModifierPropertiesEXT.SIZE, VkDrmFormatModifierPropertiesEXT.SIZE));
        }
        return ret;
    }

}
