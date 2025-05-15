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

public record VkAntiLagDataAMD(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$mode = ValueLayout.JAVA_INT.withName("mode");
    public static final OfInt LAYOUT$maxFPS = ValueLayout.JAVA_INT.withName("maxFPS");
    public static final AddressLayout LAYOUT$pPresentationInfo = ValueLayout.ADDRESS.withTargetLayout(VkAntiLagPresentationInfoAMD.LAYOUT).withName("pPresentationInfo");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$mode, LAYOUT$maxFPS, LAYOUT$pPresentationInfo);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAntiLagDataAMD allocate(Arena arena) {
        return new VkAntiLagDataAMD(arena.allocate(LAYOUT));
    }

    public static VkAntiLagDataAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAntiLagDataAMD[] ret = new VkAntiLagDataAMD[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAntiLagDataAMD(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAntiLagDataAMD clone(Arena arena, VkAntiLagDataAMD src) {
        VkAntiLagDataAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAntiLagDataAMD[] clone(Arena arena, VkAntiLagDataAMD[] src) {
        VkAntiLagDataAMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");
    public static final PathElement PATH$maxFPS = PathElement.groupElement("PATH$maxFPS");
    public static final PathElement PATH$pPresentationInfo = PathElement.groupElement("PATH$pPresentationInfo");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$maxFPS = LAYOUT$maxFPS.byteSize();
    public static final long SIZE$pPresentationInfo = LAYOUT$pPresentationInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$maxFPS = LAYOUT.byteOffset(PATH$maxFPS);
    public static final long OFFSET$pPresentationInfo = LAYOUT.byteOffset(PATH$pPresentationInfo);

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

    public @enumtype(VkAntiLagModeAMD.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkAntiLagModeAMD.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public @unsigned int maxFPS() {
        return segment.get(LAYOUT$maxFPS, OFFSET$maxFPS);
    }

    public void maxFPS(@unsigned int value) {
        segment.set(LAYOUT$maxFPS, OFFSET$maxFPS, value);
    }

    public @pointer(comment="VkAntiLagPresentationInfoAMD*") MemorySegment pPresentationInfoRaw() {
        return segment.get(LAYOUT$pPresentationInfo, OFFSET$pPresentationInfo);
    }

    public void pPresentationInfoRaw(@pointer(comment="VkAntiLagPresentationInfoAMD*") MemorySegment value) {
        segment.set(LAYOUT$pPresentationInfo, OFFSET$pPresentationInfo, value);
    }

    public @Nullable VkAntiLagPresentationInfoAMD pPresentationInfo() {
        MemorySegment s = pPresentationInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAntiLagPresentationInfoAMD(s);
    }

    public void pPresentationInfo(@Nullable VkAntiLagPresentationInfoAMD value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPresentationInfoRaw(s);
    }

    @unsafe public @Nullable VkAntiLagPresentationInfoAMD[] pPresentationInfo(int assumedCount) {
        MemorySegment s = pPresentationInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAntiLagPresentationInfoAMD.SIZE);
        VkAntiLagPresentationInfoAMD[] ret = new VkAntiLagPresentationInfoAMD[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAntiLagPresentationInfoAMD(s.asSlice(i * VkAntiLagPresentationInfoAMD.SIZE, VkAntiLagPresentationInfoAMD.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
