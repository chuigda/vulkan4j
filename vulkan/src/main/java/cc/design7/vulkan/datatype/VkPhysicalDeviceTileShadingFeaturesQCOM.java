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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceTileShadingFeaturesQCOM.html"><code>VkPhysicalDeviceTileShadingFeaturesQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceTileShadingFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 tileShading;
///     VkBool32 tileShadingFragmentStage;
///     VkBool32 tileShadingColorAttachments;
///     VkBool32 tileShadingDepthAttachments;
///     VkBool32 tileShadingStencilAttachments;
///     VkBool32 tileShadingInputAttachments;
///     VkBool32 tileShadingSampledAttachments;
///     VkBool32 tileShadingPerTileDraw;
///     VkBool32 tileShadingPerTileDispatch;
///     VkBool32 tileShadingDispatchTile;
///     VkBool32 tileShadingApron;
///     VkBool32 tileShadingAnisotropicApron;
///     VkBool32 tileShadingAtomicOps;
///     VkBool32 tileShadingImageProcessing;
/// } VkPhysicalDeviceTileShadingFeaturesQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM`
///
/// The {@link VkPhysicalDeviceTileShadingFeaturesQCOM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceTileShadingFeaturesQCOM#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceTileShadingFeaturesQCOM.html"><code>VkPhysicalDeviceTileShadingFeaturesQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceTileShadingFeaturesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocate(Arena arena) {
        VkPhysicalDeviceTileShadingFeaturesQCOM ret = new VkPhysicalDeviceTileShadingFeaturesQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM);
        return ret;
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTileShadingFeaturesQCOM[] ret = new VkPhysicalDeviceTileShadingFeaturesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceTileShadingFeaturesQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM);
        }
        return ret;
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM clone(Arena arena, VkPhysicalDeviceTileShadingFeaturesQCOM src) {
        VkPhysicalDeviceTileShadingFeaturesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM[] clone(Arena arena, VkPhysicalDeviceTileShadingFeaturesQCOM[] src) {
        VkPhysicalDeviceTileShadingFeaturesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM);
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

    public @unsigned int tileShading() {
        return segment.get(LAYOUT$tileShading, OFFSET$tileShading);
    }

    public void tileShading(@unsigned int value) {
        segment.set(LAYOUT$tileShading, OFFSET$tileShading, value);
    }

    public @unsigned int tileShadingFragmentStage() {
        return segment.get(LAYOUT$tileShadingFragmentStage, OFFSET$tileShadingFragmentStage);
    }

    public void tileShadingFragmentStage(@unsigned int value) {
        segment.set(LAYOUT$tileShadingFragmentStage, OFFSET$tileShadingFragmentStage, value);
    }

    public @unsigned int tileShadingColorAttachments() {
        return segment.get(LAYOUT$tileShadingColorAttachments, OFFSET$tileShadingColorAttachments);
    }

    public void tileShadingColorAttachments(@unsigned int value) {
        segment.set(LAYOUT$tileShadingColorAttachments, OFFSET$tileShadingColorAttachments, value);
    }

    public @unsigned int tileShadingDepthAttachments() {
        return segment.get(LAYOUT$tileShadingDepthAttachments, OFFSET$tileShadingDepthAttachments);
    }

    public void tileShadingDepthAttachments(@unsigned int value) {
        segment.set(LAYOUT$tileShadingDepthAttachments, OFFSET$tileShadingDepthAttachments, value);
    }

    public @unsigned int tileShadingStencilAttachments() {
        return segment.get(LAYOUT$tileShadingStencilAttachments, OFFSET$tileShadingStencilAttachments);
    }

    public void tileShadingStencilAttachments(@unsigned int value) {
        segment.set(LAYOUT$tileShadingStencilAttachments, OFFSET$tileShadingStencilAttachments, value);
    }

    public @unsigned int tileShadingInputAttachments() {
        return segment.get(LAYOUT$tileShadingInputAttachments, OFFSET$tileShadingInputAttachments);
    }

    public void tileShadingInputAttachments(@unsigned int value) {
        segment.set(LAYOUT$tileShadingInputAttachments, OFFSET$tileShadingInputAttachments, value);
    }

    public @unsigned int tileShadingSampledAttachments() {
        return segment.get(LAYOUT$tileShadingSampledAttachments, OFFSET$tileShadingSampledAttachments);
    }

    public void tileShadingSampledAttachments(@unsigned int value) {
        segment.set(LAYOUT$tileShadingSampledAttachments, OFFSET$tileShadingSampledAttachments, value);
    }

    public @unsigned int tileShadingPerTileDraw() {
        return segment.get(LAYOUT$tileShadingPerTileDraw, OFFSET$tileShadingPerTileDraw);
    }

    public void tileShadingPerTileDraw(@unsigned int value) {
        segment.set(LAYOUT$tileShadingPerTileDraw, OFFSET$tileShadingPerTileDraw, value);
    }

    public @unsigned int tileShadingPerTileDispatch() {
        return segment.get(LAYOUT$tileShadingPerTileDispatch, OFFSET$tileShadingPerTileDispatch);
    }

    public void tileShadingPerTileDispatch(@unsigned int value) {
        segment.set(LAYOUT$tileShadingPerTileDispatch, OFFSET$tileShadingPerTileDispatch, value);
    }

    public @unsigned int tileShadingDispatchTile() {
        return segment.get(LAYOUT$tileShadingDispatchTile, OFFSET$tileShadingDispatchTile);
    }

    public void tileShadingDispatchTile(@unsigned int value) {
        segment.set(LAYOUT$tileShadingDispatchTile, OFFSET$tileShadingDispatchTile, value);
    }

    public @unsigned int tileShadingApron() {
        return segment.get(LAYOUT$tileShadingApron, OFFSET$tileShadingApron);
    }

    public void tileShadingApron(@unsigned int value) {
        segment.set(LAYOUT$tileShadingApron, OFFSET$tileShadingApron, value);
    }

    public @unsigned int tileShadingAnisotropicApron() {
        return segment.get(LAYOUT$tileShadingAnisotropicApron, OFFSET$tileShadingAnisotropicApron);
    }

    public void tileShadingAnisotropicApron(@unsigned int value) {
        segment.set(LAYOUT$tileShadingAnisotropicApron, OFFSET$tileShadingAnisotropicApron, value);
    }

    public @unsigned int tileShadingAtomicOps() {
        return segment.get(LAYOUT$tileShadingAtomicOps, OFFSET$tileShadingAtomicOps);
    }

    public void tileShadingAtomicOps(@unsigned int value) {
        segment.set(LAYOUT$tileShadingAtomicOps, OFFSET$tileShadingAtomicOps, value);
    }

    public @unsigned int tileShadingImageProcessing() {
        return segment.get(LAYOUT$tileShadingImageProcessing, OFFSET$tileShadingImageProcessing);
    }

    public void tileShadingImageProcessing(@unsigned int value) {
        segment.set(LAYOUT$tileShadingImageProcessing, OFFSET$tileShadingImageProcessing, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tileShading"),
        ValueLayout.JAVA_INT.withName("tileShadingFragmentStage"),
        ValueLayout.JAVA_INT.withName("tileShadingColorAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingDepthAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingStencilAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingInputAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingSampledAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingPerTileDraw"),
        ValueLayout.JAVA_INT.withName("tileShadingPerTileDispatch"),
        ValueLayout.JAVA_INT.withName("tileShadingDispatchTile"),
        ValueLayout.JAVA_INT.withName("tileShadingApron"),
        ValueLayout.JAVA_INT.withName("tileShadingAnisotropicApron"),
        ValueLayout.JAVA_INT.withName("tileShadingAtomicOps"),
        ValueLayout.JAVA_INT.withName("tileShadingImageProcessing")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$tileShading = PathElement.groupElement("PATH$tileShading");
    public static final PathElement PATH$tileShadingFragmentStage = PathElement.groupElement("PATH$tileShadingFragmentStage");
    public static final PathElement PATH$tileShadingColorAttachments = PathElement.groupElement("PATH$tileShadingColorAttachments");
    public static final PathElement PATH$tileShadingDepthAttachments = PathElement.groupElement("PATH$tileShadingDepthAttachments");
    public static final PathElement PATH$tileShadingStencilAttachments = PathElement.groupElement("PATH$tileShadingStencilAttachments");
    public static final PathElement PATH$tileShadingInputAttachments = PathElement.groupElement("PATH$tileShadingInputAttachments");
    public static final PathElement PATH$tileShadingSampledAttachments = PathElement.groupElement("PATH$tileShadingSampledAttachments");
    public static final PathElement PATH$tileShadingPerTileDraw = PathElement.groupElement("PATH$tileShadingPerTileDraw");
    public static final PathElement PATH$tileShadingPerTileDispatch = PathElement.groupElement("PATH$tileShadingPerTileDispatch");
    public static final PathElement PATH$tileShadingDispatchTile = PathElement.groupElement("PATH$tileShadingDispatchTile");
    public static final PathElement PATH$tileShadingApron = PathElement.groupElement("PATH$tileShadingApron");
    public static final PathElement PATH$tileShadingAnisotropicApron = PathElement.groupElement("PATH$tileShadingAnisotropicApron");
    public static final PathElement PATH$tileShadingAtomicOps = PathElement.groupElement("PATH$tileShadingAtomicOps");
    public static final PathElement PATH$tileShadingImageProcessing = PathElement.groupElement("PATH$tileShadingImageProcessing");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$tileShading = (OfInt) LAYOUT.select(PATH$tileShading);
    public static final OfInt LAYOUT$tileShadingFragmentStage = (OfInt) LAYOUT.select(PATH$tileShadingFragmentStage);
    public static final OfInt LAYOUT$tileShadingColorAttachments = (OfInt) LAYOUT.select(PATH$tileShadingColorAttachments);
    public static final OfInt LAYOUT$tileShadingDepthAttachments = (OfInt) LAYOUT.select(PATH$tileShadingDepthAttachments);
    public static final OfInt LAYOUT$tileShadingStencilAttachments = (OfInt) LAYOUT.select(PATH$tileShadingStencilAttachments);
    public static final OfInt LAYOUT$tileShadingInputAttachments = (OfInt) LAYOUT.select(PATH$tileShadingInputAttachments);
    public static final OfInt LAYOUT$tileShadingSampledAttachments = (OfInt) LAYOUT.select(PATH$tileShadingSampledAttachments);
    public static final OfInt LAYOUT$tileShadingPerTileDraw = (OfInt) LAYOUT.select(PATH$tileShadingPerTileDraw);
    public static final OfInt LAYOUT$tileShadingPerTileDispatch = (OfInt) LAYOUT.select(PATH$tileShadingPerTileDispatch);
    public static final OfInt LAYOUT$tileShadingDispatchTile = (OfInt) LAYOUT.select(PATH$tileShadingDispatchTile);
    public static final OfInt LAYOUT$tileShadingApron = (OfInt) LAYOUT.select(PATH$tileShadingApron);
    public static final OfInt LAYOUT$tileShadingAnisotropicApron = (OfInt) LAYOUT.select(PATH$tileShadingAnisotropicApron);
    public static final OfInt LAYOUT$tileShadingAtomicOps = (OfInt) LAYOUT.select(PATH$tileShadingAtomicOps);
    public static final OfInt LAYOUT$tileShadingImageProcessing = (OfInt) LAYOUT.select(PATH$tileShadingImageProcessing);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$tileShading = LAYOUT$tileShading.byteSize();
    public static final long SIZE$tileShadingFragmentStage = LAYOUT$tileShadingFragmentStage.byteSize();
    public static final long SIZE$tileShadingColorAttachments = LAYOUT$tileShadingColorAttachments.byteSize();
    public static final long SIZE$tileShadingDepthAttachments = LAYOUT$tileShadingDepthAttachments.byteSize();
    public static final long SIZE$tileShadingStencilAttachments = LAYOUT$tileShadingStencilAttachments.byteSize();
    public static final long SIZE$tileShadingInputAttachments = LAYOUT$tileShadingInputAttachments.byteSize();
    public static final long SIZE$tileShadingSampledAttachments = LAYOUT$tileShadingSampledAttachments.byteSize();
    public static final long SIZE$tileShadingPerTileDraw = LAYOUT$tileShadingPerTileDraw.byteSize();
    public static final long SIZE$tileShadingPerTileDispatch = LAYOUT$tileShadingPerTileDispatch.byteSize();
    public static final long SIZE$tileShadingDispatchTile = LAYOUT$tileShadingDispatchTile.byteSize();
    public static final long SIZE$tileShadingApron = LAYOUT$tileShadingApron.byteSize();
    public static final long SIZE$tileShadingAnisotropicApron = LAYOUT$tileShadingAnisotropicApron.byteSize();
    public static final long SIZE$tileShadingAtomicOps = LAYOUT$tileShadingAtomicOps.byteSize();
    public static final long SIZE$tileShadingImageProcessing = LAYOUT$tileShadingImageProcessing.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$tileShading = LAYOUT.byteOffset(PATH$tileShading);
    public static final long OFFSET$tileShadingFragmentStage = LAYOUT.byteOffset(PATH$tileShadingFragmentStage);
    public static final long OFFSET$tileShadingColorAttachments = LAYOUT.byteOffset(PATH$tileShadingColorAttachments);
    public static final long OFFSET$tileShadingDepthAttachments = LAYOUT.byteOffset(PATH$tileShadingDepthAttachments);
    public static final long OFFSET$tileShadingStencilAttachments = LAYOUT.byteOffset(PATH$tileShadingStencilAttachments);
    public static final long OFFSET$tileShadingInputAttachments = LAYOUT.byteOffset(PATH$tileShadingInputAttachments);
    public static final long OFFSET$tileShadingSampledAttachments = LAYOUT.byteOffset(PATH$tileShadingSampledAttachments);
    public static final long OFFSET$tileShadingPerTileDraw = LAYOUT.byteOffset(PATH$tileShadingPerTileDraw);
    public static final long OFFSET$tileShadingPerTileDispatch = LAYOUT.byteOffset(PATH$tileShadingPerTileDispatch);
    public static final long OFFSET$tileShadingDispatchTile = LAYOUT.byteOffset(PATH$tileShadingDispatchTile);
    public static final long OFFSET$tileShadingApron = LAYOUT.byteOffset(PATH$tileShadingApron);
    public static final long OFFSET$tileShadingAnisotropicApron = LAYOUT.byteOffset(PATH$tileShadingAnisotropicApron);
    public static final long OFFSET$tileShadingAtomicOps = LAYOUT.byteOffset(PATH$tileShadingAtomicOps);
    public static final long OFFSET$tileShadingImageProcessing = LAYOUT.byteOffset(PATH$tileShadingImageProcessing);
}
