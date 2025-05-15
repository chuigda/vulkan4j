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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalSemaphoreProperties.html"><code>VkExternalSemaphoreProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkExternalSemaphoreProperties {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes;
///     VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes;
///     VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures; // optional
/// } VkExternalSemaphoreProperties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES`
///
/// The {@link VkExternalSemaphoreProperties#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkExternalSemaphoreProperties#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalSemaphoreProperties.html"><code>VkExternalSemaphoreProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExternalSemaphoreProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkExternalSemaphoreProperties allocate(Arena arena) {
        VkExternalSemaphoreProperties ret = new VkExternalSemaphoreProperties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.EXTERNAL_SEMAPHORE_PROPERTIES);
        return ret;
    }

    public static VkExternalSemaphoreProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExternalSemaphoreProperties[] ret = new VkExternalSemaphoreProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExternalSemaphoreProperties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.EXTERNAL_SEMAPHORE_PROPERTIES);
        }
        return ret;
    }

    public static VkExternalSemaphoreProperties clone(Arena arena, VkExternalSemaphoreProperties src) {
        VkExternalSemaphoreProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExternalSemaphoreProperties[] clone(Arena arena, VkExternalSemaphoreProperties[] src) {
        VkExternalSemaphoreProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.EXTERNAL_SEMAPHORE_PROPERTIES);
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

    public @enumtype(VkExternalSemaphoreHandleTypeFlags.class) int exportFromImportedHandleTypes() {
        return segment.get(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes);
    }

    public void exportFromImportedHandleTypes(@enumtype(VkExternalSemaphoreHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes, value);
    }

    public @enumtype(VkExternalSemaphoreHandleTypeFlags.class) int compatibleHandleTypes() {
        return segment.get(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes);
    }

    public void compatibleHandleTypes(@enumtype(VkExternalSemaphoreHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes, value);
    }

    public @enumtype(VkExternalSemaphoreFeatureFlags.class) int externalSemaphoreFeatures() {
        return segment.get(LAYOUT$externalSemaphoreFeatures, OFFSET$externalSemaphoreFeatures);
    }

    public void externalSemaphoreFeatures(@enumtype(VkExternalSemaphoreFeatureFlags.class) int value) {
        segment.set(LAYOUT$externalSemaphoreFeatures, OFFSET$externalSemaphoreFeatures, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes"),
        ValueLayout.JAVA_INT.withName("externalSemaphoreFeatures")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$exportFromImportedHandleTypes = PathElement.groupElement("PATH$exportFromImportedHandleTypes");
    public static final PathElement PATH$compatibleHandleTypes = PathElement.groupElement("PATH$compatibleHandleTypes");
    public static final PathElement PATH$externalSemaphoreFeatures = PathElement.groupElement("PATH$externalSemaphoreFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$exportFromImportedHandleTypes = (OfInt) LAYOUT.select(PATH$exportFromImportedHandleTypes);
    public static final OfInt LAYOUT$compatibleHandleTypes = (OfInt) LAYOUT.select(PATH$compatibleHandleTypes);
    public static final OfInt LAYOUT$externalSemaphoreFeatures = (OfInt) LAYOUT.select(PATH$externalSemaphoreFeatures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$exportFromImportedHandleTypes = LAYOUT$exportFromImportedHandleTypes.byteSize();
    public static final long SIZE$compatibleHandleTypes = LAYOUT$compatibleHandleTypes.byteSize();
    public static final long SIZE$externalSemaphoreFeatures = LAYOUT$externalSemaphoreFeatures.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$exportFromImportedHandleTypes = LAYOUT.byteOffset(PATH$exportFromImportedHandleTypes);
    public static final long OFFSET$compatibleHandleTypes = LAYOUT.byteOffset(PATH$compatibleHandleTypes);
    public static final long OFFSET$externalSemaphoreFeatures = LAYOUT.byteOffset(PATH$externalSemaphoreFeatures);
}
