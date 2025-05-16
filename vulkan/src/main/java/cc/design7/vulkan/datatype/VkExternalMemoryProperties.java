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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalMemoryProperties.html"><code>VkExternalMemoryProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkExternalMemoryProperties {
///     VkExternalMemoryFeatureFlags externalMemoryFeatures;
///     VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes; // optional
///     VkExternalMemoryHandleTypeFlags compatibleHandleTypes;
/// } VkExternalMemoryProperties;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalMemoryProperties.html"><code>VkExternalMemoryProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExternalMemoryProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkExternalMemoryProperties allocate(Arena arena) {
        VkExternalMemoryProperties ret = new VkExternalMemoryProperties(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkExternalMemoryProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExternalMemoryProperties[] ret = new VkExternalMemoryProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExternalMemoryProperties(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkExternalMemoryProperties clone(Arena arena, VkExternalMemoryProperties src) {
        VkExternalMemoryProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExternalMemoryProperties[] clone(Arena arena, VkExternalMemoryProperties[] src) {
        VkExternalMemoryProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkExternalMemoryFeatureFlags.class) int externalMemoryFeatures() {
        return segment.get(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures);
    }

    public void externalMemoryFeatures(@enumtype(VkExternalMemoryFeatureFlags.class) int value) {
        segment.set(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures, value);
    }

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int exportFromImportedHandleTypes() {
        return segment.get(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes);
    }

    public void exportFromImportedHandleTypes(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes, value);
    }

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int compatibleHandleTypes() {
        return segment.get(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes);
    }

    public void compatibleHandleTypes(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$externalMemoryFeatures = PathElement.groupElement("PATH$externalMemoryFeatures");
    public static final PathElement PATH$exportFromImportedHandleTypes = PathElement.groupElement("PATH$exportFromImportedHandleTypes");
    public static final PathElement PATH$compatibleHandleTypes = PathElement.groupElement("PATH$compatibleHandleTypes");

    public static final OfInt LAYOUT$externalMemoryFeatures = (OfInt) LAYOUT.select(PATH$externalMemoryFeatures);
    public static final OfInt LAYOUT$exportFromImportedHandleTypes = (OfInt) LAYOUT.select(PATH$exportFromImportedHandleTypes);
    public static final OfInt LAYOUT$compatibleHandleTypes = (OfInt) LAYOUT.select(PATH$compatibleHandleTypes);

    public static final long SIZE$externalMemoryFeatures = LAYOUT$externalMemoryFeatures.byteSize();
    public static final long SIZE$exportFromImportedHandleTypes = LAYOUT$exportFromImportedHandleTypes.byteSize();
    public static final long SIZE$compatibleHandleTypes = LAYOUT$compatibleHandleTypes.byteSize();

    public static final long OFFSET$externalMemoryFeatures = LAYOUT.byteOffset(PATH$externalMemoryFeatures);
    public static final long OFFSET$exportFromImportedHandleTypes = LAYOUT.byteOffset(PATH$exportFromImportedHandleTypes);
    public static final long OFFSET$compatibleHandleTypes = LAYOUT.byteOffset(PATH$compatibleHandleTypes);
}
