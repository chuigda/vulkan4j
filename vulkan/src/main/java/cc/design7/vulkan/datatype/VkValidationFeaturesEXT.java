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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkValidationFeaturesEXT.html"><code>VkValidationFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkValidationFeaturesEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t enabledValidationFeatureCount; // optional
///     VkValidationFeatureEnableEXT const* pEnabledValidationFeatures;
///     uint32_t disabledValidationFeatureCount; // optional
///     VkValidationFeatureDisableEXT const* pDisabledValidationFeatures;
/// } VkValidationFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT`
///
/// The {@link VkValidationFeaturesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkValidationFeaturesEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkValidationFeaturesEXT.html"><code>VkValidationFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkValidationFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkValidationFeaturesEXT allocate(Arena arena) {
        VkValidationFeaturesEXT ret = new VkValidationFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VALIDATION_FEATURES_EXT);
        return ret;
    }

    public static VkValidationFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkValidationFeaturesEXT[] ret = new VkValidationFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkValidationFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VALIDATION_FEATURES_EXT);
        }
        return ret;
    }

    public static VkValidationFeaturesEXT clone(Arena arena, VkValidationFeaturesEXT src) {
        VkValidationFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkValidationFeaturesEXT[] clone(Arena arena, VkValidationFeaturesEXT[] src) {
        VkValidationFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VALIDATION_FEATURES_EXT);
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

    public @unsigned int enabledValidationFeatureCount() {
        return segment.get(LAYOUT$enabledValidationFeatureCount, OFFSET$enabledValidationFeatureCount);
    }

    public void enabledValidationFeatureCount(@unsigned int value) {
        segment.set(LAYOUT$enabledValidationFeatureCount, OFFSET$enabledValidationFeatureCount, value);
    }

    public @pointer(target=VkValidationFeatureEnableEXT.class) MemorySegment pEnabledValidationFeaturesRaw() {
        return segment.get(LAYOUT$pEnabledValidationFeatures, OFFSET$pEnabledValidationFeatures);
    }

    public void pEnabledValidationFeaturesRaw(@pointer(target=VkValidationFeatureEnableEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pEnabledValidationFeatures, OFFSET$pEnabledValidationFeatures, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkValidationFeatureEnableEXT.class) IntPtr pEnabledValidationFeatures() {
        MemorySegment s = pEnabledValidationFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pEnabledValidationFeatures(@Nullable @enumtype(VkValidationFeatureEnableEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pEnabledValidationFeaturesRaw(s);
    }

    public @unsigned int disabledValidationFeatureCount() {
        return segment.get(LAYOUT$disabledValidationFeatureCount, OFFSET$disabledValidationFeatureCount);
    }

    public void disabledValidationFeatureCount(@unsigned int value) {
        segment.set(LAYOUT$disabledValidationFeatureCount, OFFSET$disabledValidationFeatureCount, value);
    }

    public @pointer(target=VkValidationFeatureDisableEXT.class) MemorySegment pDisabledValidationFeaturesRaw() {
        return segment.get(LAYOUT$pDisabledValidationFeatures, OFFSET$pDisabledValidationFeatures);
    }

    public void pDisabledValidationFeaturesRaw(@pointer(target=VkValidationFeatureDisableEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pDisabledValidationFeatures, OFFSET$pDisabledValidationFeatures, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkValidationFeatureDisableEXT.class) IntPtr pDisabledValidationFeatures() {
        MemorySegment s = pDisabledValidationFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDisabledValidationFeatures(@Nullable @enumtype(VkValidationFeatureDisableEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDisabledValidationFeaturesRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pEnabledValidationFeatures"),
        ValueLayout.JAVA_INT.withName("disabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDisabledValidationFeatures")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$enabledValidationFeatureCount = PathElement.groupElement("PATH$enabledValidationFeatureCount");
    public static final PathElement PATH$pEnabledValidationFeatures = PathElement.groupElement("PATH$pEnabledValidationFeatures");
    public static final PathElement PATH$disabledValidationFeatureCount = PathElement.groupElement("PATH$disabledValidationFeatureCount");
    public static final PathElement PATH$pDisabledValidationFeatures = PathElement.groupElement("PATH$pDisabledValidationFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$enabledValidationFeatureCount = (OfInt) LAYOUT.select(PATH$enabledValidationFeatureCount);
    public static final AddressLayout LAYOUT$pEnabledValidationFeatures = (AddressLayout) LAYOUT.select(PATH$pEnabledValidationFeatures);
    public static final OfInt LAYOUT$disabledValidationFeatureCount = (OfInt) LAYOUT.select(PATH$disabledValidationFeatureCount);
    public static final AddressLayout LAYOUT$pDisabledValidationFeatures = (AddressLayout) LAYOUT.select(PATH$pDisabledValidationFeatures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$enabledValidationFeatureCount = LAYOUT$enabledValidationFeatureCount.byteSize();
    public static final long SIZE$pEnabledValidationFeatures = LAYOUT$pEnabledValidationFeatures.byteSize();
    public static final long SIZE$disabledValidationFeatureCount = LAYOUT$disabledValidationFeatureCount.byteSize();
    public static final long SIZE$pDisabledValidationFeatures = LAYOUT$pDisabledValidationFeatures.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$enabledValidationFeatureCount = LAYOUT.byteOffset(PATH$enabledValidationFeatureCount);
    public static final long OFFSET$pEnabledValidationFeatures = LAYOUT.byteOffset(PATH$pEnabledValidationFeatures);
    public static final long OFFSET$disabledValidationFeatureCount = LAYOUT.byteOffset(PATH$disabledValidationFeatureCount);
    public static final long OFFSET$pDisabledValidationFeatures = LAYOUT.byteOffset(PATH$pDisabledValidationFeatures);
}
