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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.html"><code>VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR {
///     VkStructureType sType;
///     void const* pNext;
///     VkVideoProfileInfoKHR const* pVideoProfile;
///     uint32_t qualityLevel;
/// } VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR`
///
/// The {@link VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.html"><code>VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR allocate(Arena arena) {
        VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR ret = new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR);
        return ret;
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR[] ret = new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR);
        }
        return ret;
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR clone(Arena arena, VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR src) {
        VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR[] clone(Arena arena, VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR[] src) {
        VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @pointer(comment="VkVideoProfileInfoKHR*") MemorySegment pVideoProfileRaw() {
        return segment.get(LAYOUT$pVideoProfile, OFFSET$pVideoProfile);
    }

    public void pVideoProfileRaw(@pointer(comment="VkVideoProfileInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pVideoProfile, OFFSET$pVideoProfile, value);
    }

    public @Nullable VkVideoProfileInfoKHR pVideoProfile() {
        MemorySegment s = pVideoProfileRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoProfileInfoKHR(s);
    }

    public void pVideoProfile(@Nullable VkVideoProfileInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVideoProfileRaw(s);
    }

    @unsafe public @Nullable VkVideoProfileInfoKHR[] pVideoProfile(int assumedCount) {
        MemorySegment s = pVideoProfileRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoProfileInfoKHR.SIZE);
        VkVideoProfileInfoKHR[] ret = new VkVideoProfileInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoProfileInfoKHR(s.asSlice(i * VkVideoProfileInfoKHR.SIZE, VkVideoProfileInfoKHR.SIZE));
        }
        return ret;
    }

    public @unsigned int qualityLevel() {
        return segment.get(LAYOUT$qualityLevel, OFFSET$qualityLevel);
    }

    public void qualityLevel(@unsigned int value) {
        segment.set(LAYOUT$qualityLevel, OFFSET$qualityLevel, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoProfileInfoKHR.LAYOUT).withName("pVideoProfile"),
        ValueLayout.JAVA_INT.withName("qualityLevel")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pVideoProfile = PathElement.groupElement("PATH$pVideoProfile");
    public static final PathElement PATH$qualityLevel = PathElement.groupElement("PATH$qualityLevel");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pVideoProfile = (AddressLayout) LAYOUT.select(PATH$pVideoProfile);
    public static final OfInt LAYOUT$qualityLevel = (OfInt) LAYOUT.select(PATH$qualityLevel);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pVideoProfile = LAYOUT$pVideoProfile.byteSize();
    public static final long SIZE$qualityLevel = LAYOUT$qualityLevel.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pVideoProfile = LAYOUT.byteOffset(PATH$pVideoProfile);
    public static final long OFFSET$qualityLevel = LAYOUT.byteOffset(PATH$qualityLevel);
}
