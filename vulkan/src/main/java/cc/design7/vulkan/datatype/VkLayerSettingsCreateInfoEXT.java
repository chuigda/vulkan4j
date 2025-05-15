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

public record VkLayerSettingsCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$settingCount = ValueLayout.JAVA_INT.withName("settingCount");
    public static final AddressLayout LAYOUT$pSettings = ValueLayout.ADDRESS.withTargetLayout(VkLayerSettingEXT.LAYOUT).withName("pSettings");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$settingCount, LAYOUT$pSettings);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkLayerSettingsCreateInfoEXT allocate(Arena arena) {
        return new VkLayerSettingsCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkLayerSettingsCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLayerSettingsCreateInfoEXT[] ret = new VkLayerSettingsCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkLayerSettingsCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkLayerSettingsCreateInfoEXT clone(Arena arena, VkLayerSettingsCreateInfoEXT src) {
        VkLayerSettingsCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkLayerSettingsCreateInfoEXT[] clone(Arena arena, VkLayerSettingsCreateInfoEXT[] src) {
        VkLayerSettingsCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$settingCount = PathElement.groupElement("PATH$settingCount");
    public static final PathElement PATH$pSettings = PathElement.groupElement("PATH$pSettings");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$settingCount = LAYOUT$settingCount.byteSize();
    public static final long SIZE$pSettings = LAYOUT$pSettings.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$settingCount = LAYOUT.byteOffset(PATH$settingCount);
    public static final long OFFSET$pSettings = LAYOUT.byteOffset(PATH$pSettings);

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

    public @unsigned int settingCount() {
        return segment.get(LAYOUT$settingCount, OFFSET$settingCount);
    }

    public void settingCount(@unsigned int value) {
        segment.set(LAYOUT$settingCount, OFFSET$settingCount, value);
    }

    public @pointer(comment="VkLayerSettingEXT*") MemorySegment pSettingsRaw() {
        return segment.get(LAYOUT$pSettings, OFFSET$pSettings);
    }

    public void pSettingsRaw(@pointer(comment="VkLayerSettingEXT*") MemorySegment value) {
        segment.set(LAYOUT$pSettings, OFFSET$pSettings, value);
    }

    public @Nullable VkLayerSettingEXT pSettings() {
        MemorySegment s = pSettingsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkLayerSettingEXT(s);
    }

    public void pSettings(@Nullable VkLayerSettingEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSettingsRaw(s);
    }

    @unsafe public @Nullable VkLayerSettingEXT[] pSettings(int assumedCount) {
        MemorySegment s = pSettingsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkLayerSettingEXT.SIZE);
        VkLayerSettingEXT[] ret = new VkLayerSettingEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkLayerSettingEXT(s.asSlice(i * VkLayerSettingEXT.SIZE, VkLayerSettingEXT.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
