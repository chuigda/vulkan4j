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

public record VkDeviceFaultInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfByte LAYOUT$description = ValueLayout.JAVA_BYTE.withName("description");
    public static final AddressLayout LAYOUT$pAddressInfos = ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultAddressInfoEXT.LAYOUT).withName("pAddressInfos");
    public static final AddressLayout LAYOUT$pVendorInfos = ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultVendorInfoEXT.LAYOUT).withName("pVendorInfos");
    public static final AddressLayout LAYOUT$pVendorBinaryData = ValueLayout.ADDRESS.withName("pVendorBinaryData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$description, LAYOUT$pAddressInfos, LAYOUT$pVendorInfos, LAYOUT$pVendorBinaryData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceFaultInfoEXT allocate(Arena arena) {
        return new VkDeviceFaultInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceFaultInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultInfoEXT[] ret = new VkDeviceFaultInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceFaultInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceFaultInfoEXT clone(Arena arena, VkDeviceFaultInfoEXT src) {
        VkDeviceFaultInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceFaultInfoEXT[] clone(Arena arena, VkDeviceFaultInfoEXT[] src) {
        VkDeviceFaultInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");
    public static final PathElement PATH$pAddressInfos = PathElement.groupElement("PATH$pAddressInfos");
    public static final PathElement PATH$pVendorInfos = PathElement.groupElement("PATH$pVendorInfos");
    public static final PathElement PATH$pVendorBinaryData = PathElement.groupElement("PATH$pVendorBinaryData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$pAddressInfos = LAYOUT$pAddressInfos.byteSize();
    public static final long SIZE$pVendorInfos = LAYOUT$pVendorInfos.byteSize();
    public static final long SIZE$pVendorBinaryData = LAYOUT$pVendorBinaryData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$pAddressInfos = LAYOUT.byteOffset(PATH$pAddressInfos);
    public static final long OFFSET$pVendorInfos = LAYOUT.byteOffset(PATH$pVendorInfos);
    public static final long OFFSET$pVendorBinaryData = LAYOUT.byteOffset(PATH$pVendorBinaryData);

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

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public @pointer(comment="VkDeviceFaultAddressInfoEXT*") MemorySegment pAddressInfosRaw() {
        return segment.get(LAYOUT$pAddressInfos, OFFSET$pAddressInfos);
    }

    public void pAddressInfosRaw(@pointer(comment="VkDeviceFaultAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pAddressInfos, OFFSET$pAddressInfos, value);
    }

    public @Nullable VkDeviceFaultAddressInfoEXT pAddressInfos() {
        MemorySegment s = pAddressInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceFaultAddressInfoEXT(s);
    }

    public void pAddressInfos(@Nullable VkDeviceFaultAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAddressInfosRaw(s);
    }

    @unsafe public @Nullable VkDeviceFaultAddressInfoEXT[] pAddressInfos(int assumedCount) {
        MemorySegment s = pAddressInfosRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDeviceFaultAddressInfoEXT.SIZE);
        VkDeviceFaultAddressInfoEXT[] ret = new VkDeviceFaultAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDeviceFaultAddressInfoEXT(s.asSlice(i * VkDeviceFaultAddressInfoEXT.SIZE, VkDeviceFaultAddressInfoEXT.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkDeviceFaultVendorInfoEXT*") MemorySegment pVendorInfosRaw() {
        return segment.get(LAYOUT$pVendorInfos, OFFSET$pVendorInfos);
    }

    public void pVendorInfosRaw(@pointer(comment="VkDeviceFaultVendorInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pVendorInfos, OFFSET$pVendorInfos, value);
    }

    public @Nullable VkDeviceFaultVendorInfoEXT pVendorInfos() {
        MemorySegment s = pVendorInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceFaultVendorInfoEXT(s);
    }

    public void pVendorInfos(@Nullable VkDeviceFaultVendorInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVendorInfosRaw(s);
    }

    @unsafe public @Nullable VkDeviceFaultVendorInfoEXT[] pVendorInfos(int assumedCount) {
        MemorySegment s = pVendorInfosRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDeviceFaultVendorInfoEXT.SIZE);
        VkDeviceFaultVendorInfoEXT[] ret = new VkDeviceFaultVendorInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDeviceFaultVendorInfoEXT(s.asSlice(i * VkDeviceFaultVendorInfoEXT.SIZE, VkDeviceFaultVendorInfoEXT.SIZE));
        }
        return ret;
    }

    public @pointer(comment="void*") MemorySegment pVendorBinaryData() {
        return segment.get(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData);
    }

    public void pVendorBinaryData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData, value);
    }

    public void pVendorBinaryData(IPointer pointer) {
        pVendorBinaryData(pointer.segment());
    }

}
/// dummy, not implemented yet
