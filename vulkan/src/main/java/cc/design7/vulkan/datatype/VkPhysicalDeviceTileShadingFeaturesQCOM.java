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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceTileShadingFeaturesQCOM.html">VkPhysicalDeviceTileShadingFeaturesQCOM</a>
@ValueBasedCandidate
public record VkPhysicalDeviceTileShadingFeaturesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$tileShading = ValueLayout.JAVA_INT.withName("tileShading");
    public static final OfInt LAYOUT$tileShadingFragmentStage = ValueLayout.JAVA_INT.withName("tileShadingFragmentStage");
    public static final OfInt LAYOUT$tileShadingColorAttachments = ValueLayout.JAVA_INT.withName("tileShadingColorAttachments");
    public static final OfInt LAYOUT$tileShadingDepthAttachments = ValueLayout.JAVA_INT.withName("tileShadingDepthAttachments");
    public static final OfInt LAYOUT$tileShadingStencilAttachments = ValueLayout.JAVA_INT.withName("tileShadingStencilAttachments");
    public static final OfInt LAYOUT$tileShadingInputAttachments = ValueLayout.JAVA_INT.withName("tileShadingInputAttachments");
    public static final OfInt LAYOUT$tileShadingSampledAttachments = ValueLayout.JAVA_INT.withName("tileShadingSampledAttachments");
    public static final OfInt LAYOUT$tileShadingPerTileDraw = ValueLayout.JAVA_INT.withName("tileShadingPerTileDraw");
    public static final OfInt LAYOUT$tileShadingPerTileDispatch = ValueLayout.JAVA_INT.withName("tileShadingPerTileDispatch");
    public static final OfInt LAYOUT$tileShadingDispatchTile = ValueLayout.JAVA_INT.withName("tileShadingDispatchTile");
    public static final OfInt LAYOUT$tileShadingApron = ValueLayout.JAVA_INT.withName("tileShadingApron");
    public static final OfInt LAYOUT$tileShadingAnisotropicApron = ValueLayout.JAVA_INT.withName("tileShadingAnisotropicApron");
    public static final OfInt LAYOUT$tileShadingAtomicOps = ValueLayout.JAVA_INT.withName("tileShadingAtomicOps");
    public static final OfInt LAYOUT$tileShadingImageProcessing = ValueLayout.JAVA_INT.withName("tileShadingImageProcessing");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$tileShading, LAYOUT$tileShadingFragmentStage, LAYOUT$tileShadingColorAttachments, LAYOUT$tileShadingDepthAttachments, LAYOUT$tileShadingStencilAttachments, LAYOUT$tileShadingInputAttachments, LAYOUT$tileShadingSampledAttachments, LAYOUT$tileShadingPerTileDraw, LAYOUT$tileShadingPerTileDispatch, LAYOUT$tileShadingDispatchTile, LAYOUT$tileShadingApron, LAYOUT$tileShadingAnisotropicApron, LAYOUT$tileShadingAtomicOps, LAYOUT$tileShadingImageProcessing);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTileShadingFeaturesQCOM[] ret = new VkPhysicalDeviceTileShadingFeaturesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceTileShadingFeaturesQCOM(segment.asSlice(i * SIZE, SIZE));
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

}
