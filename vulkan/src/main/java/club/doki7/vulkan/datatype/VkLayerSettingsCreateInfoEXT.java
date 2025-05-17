package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLayerSettingsCreateInfoEXT.html"><code>VkLayerSettingsCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkLayerSettingsCreateInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t settingCount; // optional
///     VkLayerSettingEXT const* pSettings;
/// } VkLayerSettingsCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT`
///
/// The {@link VkLayerSettingsCreateInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkLayerSettingsCreateInfoEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLayerSettingsCreateInfoEXT.html"><code>VkLayerSettingsCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkLayerSettingsCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkLayerSettingsCreateInfoEXT allocate(Arena arena) {
        VkLayerSettingsCreateInfoEXT ret = new VkLayerSettingsCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.LAYER_SETTINGS_CREATE_INFO_EXT);
        return ret;
    }

    public static VkLayerSettingsCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLayerSettingsCreateInfoEXT[] ret = new VkLayerSettingsCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkLayerSettingsCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.LAYER_SETTINGS_CREATE_INFO_EXT);
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

    public void autoInit() {
        sType(VkStructureType.LAYER_SETTINGS_CREATE_INFO_EXT);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int settingCount() {
        return segment.get(LAYOUT$settingCount, OFFSET$settingCount);
    }

    public void settingCount(@unsigned int value) {
        segment.set(LAYOUT$settingCount, OFFSET$settingCount, value);
    }

    public @pointer(target=VkLayerSettingEXT.class) MemorySegment pSettingsRaw() {
        return segment.get(LAYOUT$pSettings, OFFSET$pSettings);
    }

    public void pSettingsRaw(@pointer(target=VkLayerSettingEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pSettings, OFFSET$pSettings, value);
    }

    public @Nullable VkLayerSettingEXT pSettings() {
        MemorySegment s = pSettingsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkLayerSettingEXT.BYTES);
        VkLayerSettingEXT[] ret = new VkLayerSettingEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkLayerSettingEXT(s.asSlice(i * VkLayerSettingEXT.BYTES, VkLayerSettingEXT.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("settingCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkLayerSettingEXT.LAYOUT).withName("pSettings")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$settingCount = PathElement.groupElement("PATH$settingCount");
    public static final PathElement PATH$pSettings = PathElement.groupElement("PATH$pSettings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$settingCount = (OfInt) LAYOUT.select(PATH$settingCount);
    public static final AddressLayout LAYOUT$pSettings = (AddressLayout) LAYOUT.select(PATH$pSettings);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$settingCount = LAYOUT$settingCount.byteSize();
    public static final long SIZE$pSettings = LAYOUT$pSettings.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$settingCount = LAYOUT.byteOffset(PATH$settingCount);
    public static final long OFFSET$pSettings = LAYOUT.byteOffset(PATH$pSettings);
}
