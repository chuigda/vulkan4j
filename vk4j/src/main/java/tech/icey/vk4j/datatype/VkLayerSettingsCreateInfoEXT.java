package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkLayerSettingsCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t settingCount;
///     const VkLayerSettingEXT* pSettings;
/// } VkLayerSettingsCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkLayerSettingsCreateInfoEXT.html">VkLayerSettingsCreateInfoEXT</a>
public record VkLayerSettingsCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkLayerSettingsCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkLayerSettingEXT[] pSettings(int assumedCount) {
        MemorySegment s = pSettingsRaw().reinterpret(assumedCount * VkLayerSettingEXT.SIZE);
        VkLayerSettingEXT[] arr = new VkLayerSettingEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkLayerSettingEXT(s.asSlice(i * VkLayerSettingEXT.SIZE, VkLayerSettingEXT.SIZE));
        }
        return arr;
    }

    public void pSettings(@Nullable VkLayerSettingEXT value) {
        pSettingsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkLayerSettingsCreateInfoEXT allocate(Arena arena) {
        return new VkLayerSettingsCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkLayerSettingsCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLayerSettingsCreateInfoEXT[] ret = new VkLayerSettingsCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("settingCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkLayerSettingEXT.LAYOUT).withName("pSettings")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$settingCount = PathElement.groupElement("settingCount");
    public static final PathElement PATH$pSettings = PathElement.groupElement("pSettings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$settingCount = (OfInt) LAYOUT.select(PATH$settingCount);
    public static final AddressLayout LAYOUT$pSettings = (AddressLayout) LAYOUT.select(PATH$pSettings);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$settingCount = LAYOUT.byteOffset(PATH$settingCount);
    public static final long OFFSET$pSettings = LAYOUT.byteOffset(PATH$pSettings);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$settingCount = LAYOUT$settingCount.byteSize();
    public static final long SIZE$pSettings = LAYOUT$pSettings.byteSize();
}
