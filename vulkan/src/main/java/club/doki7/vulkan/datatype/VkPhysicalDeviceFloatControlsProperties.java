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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFloatControlsProperties.html"><code>VkPhysicalDeviceFloatControlsProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceFloatControlsProperties {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkShaderFloatControlsIndependence denormBehaviorIndependence; // @link substring="VkShaderFloatControlsIndependence" target="VkShaderFloatControlsIndependence" @link substring="denormBehaviorIndependence" target="#denormBehaviorIndependence"
///     VkShaderFloatControlsIndependence roundingModeIndependence; // @link substring="VkShaderFloatControlsIndependence" target="VkShaderFloatControlsIndependence" @link substring="roundingModeIndependence" target="#roundingModeIndependence"
///     VkBool32 shaderSignedZeroInfNanPreserveFloat16; // @link substring="shaderSignedZeroInfNanPreserveFloat16" target="#shaderSignedZeroInfNanPreserveFloat16"
///     VkBool32 shaderSignedZeroInfNanPreserveFloat32; // @link substring="shaderSignedZeroInfNanPreserveFloat32" target="#shaderSignedZeroInfNanPreserveFloat32"
///     VkBool32 shaderSignedZeroInfNanPreserveFloat64; // @link substring="shaderSignedZeroInfNanPreserveFloat64" target="#shaderSignedZeroInfNanPreserveFloat64"
///     VkBool32 shaderDenormPreserveFloat16; // @link substring="shaderDenormPreserveFloat16" target="#shaderDenormPreserveFloat16"
///     VkBool32 shaderDenormPreserveFloat32; // @link substring="shaderDenormPreserveFloat32" target="#shaderDenormPreserveFloat32"
///     VkBool32 shaderDenormPreserveFloat64; // @link substring="shaderDenormPreserveFloat64" target="#shaderDenormPreserveFloat64"
///     VkBool32 shaderDenormFlushToZeroFloat16; // @link substring="shaderDenormFlushToZeroFloat16" target="#shaderDenormFlushToZeroFloat16"
///     VkBool32 shaderDenormFlushToZeroFloat32; // @link substring="shaderDenormFlushToZeroFloat32" target="#shaderDenormFlushToZeroFloat32"
///     VkBool32 shaderDenormFlushToZeroFloat64; // @link substring="shaderDenormFlushToZeroFloat64" target="#shaderDenormFlushToZeroFloat64"
///     VkBool32 shaderRoundingModeRTEFloat16; // @link substring="shaderRoundingModeRTEFloat16" target="#shaderRoundingModeRTEFloat16"
///     VkBool32 shaderRoundingModeRTEFloat32; // @link substring="shaderRoundingModeRTEFloat32" target="#shaderRoundingModeRTEFloat32"
///     VkBool32 shaderRoundingModeRTEFloat64; // @link substring="shaderRoundingModeRTEFloat64" target="#shaderRoundingModeRTEFloat64"
///     VkBool32 shaderRoundingModeRTZFloat16; // @link substring="shaderRoundingModeRTZFloat16" target="#shaderRoundingModeRTZFloat16"
///     VkBool32 shaderRoundingModeRTZFloat32; // @link substring="shaderRoundingModeRTZFloat32" target="#shaderRoundingModeRTZFloat32"
///     VkBool32 shaderRoundingModeRTZFloat64; // @link substring="shaderRoundingModeRTZFloat64" target="#shaderRoundingModeRTZFloat64"
/// } VkPhysicalDeviceFloatControlsProperties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES`
///
/// The {@code allocate} ({@link VkPhysicalDeviceFloatControlsProperties#allocate(Arena)}, {@link VkPhysicalDeviceFloatControlsProperties#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceFloatControlsProperties#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFloatControlsProperties.html"><code>VkPhysicalDeviceFloatControlsProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceFloatControlsProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceFloatControlsProperties allocate(Arena arena) {
        VkPhysicalDeviceFloatControlsProperties ret = new VkPhysicalDeviceFloatControlsProperties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDeviceFloatControlsProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFloatControlsProperties[] ret = new VkPhysicalDeviceFloatControlsProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFloatControlsProperties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDeviceFloatControlsProperties clone(Arena arena, VkPhysicalDeviceFloatControlsProperties src) {
        VkPhysicalDeviceFloatControlsProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFloatControlsProperties[] clone(Arena arena, VkPhysicalDeviceFloatControlsProperties[] src) {
        VkPhysicalDeviceFloatControlsProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES);
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

    public @enumtype(VkShaderFloatControlsIndependence.class) int denormBehaviorIndependence() {
        return segment.get(LAYOUT$denormBehaviorIndependence, OFFSET$denormBehaviorIndependence);
    }

    public void denormBehaviorIndependence(@enumtype(VkShaderFloatControlsIndependence.class) int value) {
        segment.set(LAYOUT$denormBehaviorIndependence, OFFSET$denormBehaviorIndependence, value);
    }

    public @enumtype(VkShaderFloatControlsIndependence.class) int roundingModeIndependence() {
        return segment.get(LAYOUT$roundingModeIndependence, OFFSET$roundingModeIndependence);
    }

    public void roundingModeIndependence(@enumtype(VkShaderFloatControlsIndependence.class) int value) {
        segment.set(LAYOUT$roundingModeIndependence, OFFSET$roundingModeIndependence, value);
    }

    public @unsigned int shaderSignedZeroInfNanPreserveFloat16() {
        return segment.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat16, OFFSET$shaderSignedZeroInfNanPreserveFloat16);
    }

    public void shaderSignedZeroInfNanPreserveFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat16, OFFSET$shaderSignedZeroInfNanPreserveFloat16, value);
    }

    public @unsigned int shaderSignedZeroInfNanPreserveFloat32() {
        return segment.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat32, OFFSET$shaderSignedZeroInfNanPreserveFloat32);
    }

    public void shaderSignedZeroInfNanPreserveFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat32, OFFSET$shaderSignedZeroInfNanPreserveFloat32, value);
    }

    public @unsigned int shaderSignedZeroInfNanPreserveFloat64() {
        return segment.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat64, OFFSET$shaderSignedZeroInfNanPreserveFloat64);
    }

    public void shaderSignedZeroInfNanPreserveFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat64, OFFSET$shaderSignedZeroInfNanPreserveFloat64, value);
    }

    public @unsigned int shaderDenormPreserveFloat16() {
        return segment.get(LAYOUT$shaderDenormPreserveFloat16, OFFSET$shaderDenormPreserveFloat16);
    }

    public void shaderDenormPreserveFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormPreserveFloat16, OFFSET$shaderDenormPreserveFloat16, value);
    }

    public @unsigned int shaderDenormPreserveFloat32() {
        return segment.get(LAYOUT$shaderDenormPreserveFloat32, OFFSET$shaderDenormPreserveFloat32);
    }

    public void shaderDenormPreserveFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormPreserveFloat32, OFFSET$shaderDenormPreserveFloat32, value);
    }

    public @unsigned int shaderDenormPreserveFloat64() {
        return segment.get(LAYOUT$shaderDenormPreserveFloat64, OFFSET$shaderDenormPreserveFloat64);
    }

    public void shaderDenormPreserveFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormPreserveFloat64, OFFSET$shaderDenormPreserveFloat64, value);
    }

    public @unsigned int shaderDenormFlushToZeroFloat16() {
        return segment.get(LAYOUT$shaderDenormFlushToZeroFloat16, OFFSET$shaderDenormFlushToZeroFloat16);
    }

    public void shaderDenormFlushToZeroFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormFlushToZeroFloat16, OFFSET$shaderDenormFlushToZeroFloat16, value);
    }

    public @unsigned int shaderDenormFlushToZeroFloat32() {
        return segment.get(LAYOUT$shaderDenormFlushToZeroFloat32, OFFSET$shaderDenormFlushToZeroFloat32);
    }

    public void shaderDenormFlushToZeroFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormFlushToZeroFloat32, OFFSET$shaderDenormFlushToZeroFloat32, value);
    }

    public @unsigned int shaderDenormFlushToZeroFloat64() {
        return segment.get(LAYOUT$shaderDenormFlushToZeroFloat64, OFFSET$shaderDenormFlushToZeroFloat64);
    }

    public void shaderDenormFlushToZeroFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormFlushToZeroFloat64, OFFSET$shaderDenormFlushToZeroFloat64, value);
    }

    public @unsigned int shaderRoundingModeRTEFloat16() {
        return segment.get(LAYOUT$shaderRoundingModeRTEFloat16, OFFSET$shaderRoundingModeRTEFloat16);
    }

    public void shaderRoundingModeRTEFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTEFloat16, OFFSET$shaderRoundingModeRTEFloat16, value);
    }

    public @unsigned int shaderRoundingModeRTEFloat32() {
        return segment.get(LAYOUT$shaderRoundingModeRTEFloat32, OFFSET$shaderRoundingModeRTEFloat32);
    }

    public void shaderRoundingModeRTEFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTEFloat32, OFFSET$shaderRoundingModeRTEFloat32, value);
    }

    public @unsigned int shaderRoundingModeRTEFloat64() {
        return segment.get(LAYOUT$shaderRoundingModeRTEFloat64, OFFSET$shaderRoundingModeRTEFloat64);
    }

    public void shaderRoundingModeRTEFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTEFloat64, OFFSET$shaderRoundingModeRTEFloat64, value);
    }

    public @unsigned int shaderRoundingModeRTZFloat16() {
        return segment.get(LAYOUT$shaderRoundingModeRTZFloat16, OFFSET$shaderRoundingModeRTZFloat16);
    }

    public void shaderRoundingModeRTZFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTZFloat16, OFFSET$shaderRoundingModeRTZFloat16, value);
    }

    public @unsigned int shaderRoundingModeRTZFloat32() {
        return segment.get(LAYOUT$shaderRoundingModeRTZFloat32, OFFSET$shaderRoundingModeRTZFloat32);
    }

    public void shaderRoundingModeRTZFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTZFloat32, OFFSET$shaderRoundingModeRTZFloat32, value);
    }

    public @unsigned int shaderRoundingModeRTZFloat64() {
        return segment.get(LAYOUT$shaderRoundingModeRTZFloat64, OFFSET$shaderRoundingModeRTZFloat64);
    }

    public void shaderRoundingModeRTZFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTZFloat64, OFFSET$shaderRoundingModeRTZFloat64, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("denormBehaviorIndependence"),
        ValueLayout.JAVA_INT.withName("roundingModeIndependence"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat64")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$denormBehaviorIndependence = PathElement.groupElement("denormBehaviorIndependence");
    public static final PathElement PATH$roundingModeIndependence = PathElement.groupElement("roundingModeIndependence");
    public static final PathElement PATH$shaderSignedZeroInfNanPreserveFloat16 = PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16");
    public static final PathElement PATH$shaderSignedZeroInfNanPreserveFloat32 = PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32");
    public static final PathElement PATH$shaderSignedZeroInfNanPreserveFloat64 = PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64");
    public static final PathElement PATH$shaderDenormPreserveFloat16 = PathElement.groupElement("shaderDenormPreserveFloat16");
    public static final PathElement PATH$shaderDenormPreserveFloat32 = PathElement.groupElement("shaderDenormPreserveFloat32");
    public static final PathElement PATH$shaderDenormPreserveFloat64 = PathElement.groupElement("shaderDenormPreserveFloat64");
    public static final PathElement PATH$shaderDenormFlushToZeroFloat16 = PathElement.groupElement("shaderDenormFlushToZeroFloat16");
    public static final PathElement PATH$shaderDenormFlushToZeroFloat32 = PathElement.groupElement("shaderDenormFlushToZeroFloat32");
    public static final PathElement PATH$shaderDenormFlushToZeroFloat64 = PathElement.groupElement("shaderDenormFlushToZeroFloat64");
    public static final PathElement PATH$shaderRoundingModeRTEFloat16 = PathElement.groupElement("shaderRoundingModeRTEFloat16");
    public static final PathElement PATH$shaderRoundingModeRTEFloat32 = PathElement.groupElement("shaderRoundingModeRTEFloat32");
    public static final PathElement PATH$shaderRoundingModeRTEFloat64 = PathElement.groupElement("shaderRoundingModeRTEFloat64");
    public static final PathElement PATH$shaderRoundingModeRTZFloat16 = PathElement.groupElement("shaderRoundingModeRTZFloat16");
    public static final PathElement PATH$shaderRoundingModeRTZFloat32 = PathElement.groupElement("shaderRoundingModeRTZFloat32");
    public static final PathElement PATH$shaderRoundingModeRTZFloat64 = PathElement.groupElement("shaderRoundingModeRTZFloat64");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$denormBehaviorIndependence = (OfInt) LAYOUT.select(PATH$denormBehaviorIndependence);
    public static final OfInt LAYOUT$roundingModeIndependence = (OfInt) LAYOUT.select(PATH$roundingModeIndependence);
    public static final OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat16 = (OfInt) LAYOUT.select(PATH$shaderSignedZeroInfNanPreserveFloat16);
    public static final OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat32 = (OfInt) LAYOUT.select(PATH$shaderSignedZeroInfNanPreserveFloat32);
    public static final OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat64 = (OfInt) LAYOUT.select(PATH$shaderSignedZeroInfNanPreserveFloat64);
    public static final OfInt LAYOUT$shaderDenormPreserveFloat16 = (OfInt) LAYOUT.select(PATH$shaderDenormPreserveFloat16);
    public static final OfInt LAYOUT$shaderDenormPreserveFloat32 = (OfInt) LAYOUT.select(PATH$shaderDenormPreserveFloat32);
    public static final OfInt LAYOUT$shaderDenormPreserveFloat64 = (OfInt) LAYOUT.select(PATH$shaderDenormPreserveFloat64);
    public static final OfInt LAYOUT$shaderDenormFlushToZeroFloat16 = (OfInt) LAYOUT.select(PATH$shaderDenormFlushToZeroFloat16);
    public static final OfInt LAYOUT$shaderDenormFlushToZeroFloat32 = (OfInt) LAYOUT.select(PATH$shaderDenormFlushToZeroFloat32);
    public static final OfInt LAYOUT$shaderDenormFlushToZeroFloat64 = (OfInt) LAYOUT.select(PATH$shaderDenormFlushToZeroFloat64);
    public static final OfInt LAYOUT$shaderRoundingModeRTEFloat16 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTEFloat16);
    public static final OfInt LAYOUT$shaderRoundingModeRTEFloat32 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTEFloat32);
    public static final OfInt LAYOUT$shaderRoundingModeRTEFloat64 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTEFloat64);
    public static final OfInt LAYOUT$shaderRoundingModeRTZFloat16 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTZFloat16);
    public static final OfInt LAYOUT$shaderRoundingModeRTZFloat32 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTZFloat32);
    public static final OfInt LAYOUT$shaderRoundingModeRTZFloat64 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTZFloat64);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$denormBehaviorIndependence = LAYOUT$denormBehaviorIndependence.byteSize();
    public static final long SIZE$roundingModeIndependence = LAYOUT$roundingModeIndependence.byteSize();
    public static final long SIZE$shaderSignedZeroInfNanPreserveFloat16 = LAYOUT$shaderSignedZeroInfNanPreserveFloat16.byteSize();
    public static final long SIZE$shaderSignedZeroInfNanPreserveFloat32 = LAYOUT$shaderSignedZeroInfNanPreserveFloat32.byteSize();
    public static final long SIZE$shaderSignedZeroInfNanPreserveFloat64 = LAYOUT$shaderSignedZeroInfNanPreserveFloat64.byteSize();
    public static final long SIZE$shaderDenormPreserveFloat16 = LAYOUT$shaderDenormPreserveFloat16.byteSize();
    public static final long SIZE$shaderDenormPreserveFloat32 = LAYOUT$shaderDenormPreserveFloat32.byteSize();
    public static final long SIZE$shaderDenormPreserveFloat64 = LAYOUT$shaderDenormPreserveFloat64.byteSize();
    public static final long SIZE$shaderDenormFlushToZeroFloat16 = LAYOUT$shaderDenormFlushToZeroFloat16.byteSize();
    public static final long SIZE$shaderDenormFlushToZeroFloat32 = LAYOUT$shaderDenormFlushToZeroFloat32.byteSize();
    public static final long SIZE$shaderDenormFlushToZeroFloat64 = LAYOUT$shaderDenormFlushToZeroFloat64.byteSize();
    public static final long SIZE$shaderRoundingModeRTEFloat16 = LAYOUT$shaderRoundingModeRTEFloat16.byteSize();
    public static final long SIZE$shaderRoundingModeRTEFloat32 = LAYOUT$shaderRoundingModeRTEFloat32.byteSize();
    public static final long SIZE$shaderRoundingModeRTEFloat64 = LAYOUT$shaderRoundingModeRTEFloat64.byteSize();
    public static final long SIZE$shaderRoundingModeRTZFloat16 = LAYOUT$shaderRoundingModeRTZFloat16.byteSize();
    public static final long SIZE$shaderRoundingModeRTZFloat32 = LAYOUT$shaderRoundingModeRTZFloat32.byteSize();
    public static final long SIZE$shaderRoundingModeRTZFloat64 = LAYOUT$shaderRoundingModeRTZFloat64.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$denormBehaviorIndependence = LAYOUT.byteOffset(PATH$denormBehaviorIndependence);
    public static final long OFFSET$roundingModeIndependence = LAYOUT.byteOffset(PATH$roundingModeIndependence);
    public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.byteOffset(PATH$shaderSignedZeroInfNanPreserveFloat16);
    public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.byteOffset(PATH$shaderSignedZeroInfNanPreserveFloat32);
    public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.byteOffset(PATH$shaderSignedZeroInfNanPreserveFloat64);
    public static final long OFFSET$shaderDenormPreserveFloat16 = LAYOUT.byteOffset(PATH$shaderDenormPreserveFloat16);
    public static final long OFFSET$shaderDenormPreserveFloat32 = LAYOUT.byteOffset(PATH$shaderDenormPreserveFloat32);
    public static final long OFFSET$shaderDenormPreserveFloat64 = LAYOUT.byteOffset(PATH$shaderDenormPreserveFloat64);
    public static final long OFFSET$shaderDenormFlushToZeroFloat16 = LAYOUT.byteOffset(PATH$shaderDenormFlushToZeroFloat16);
    public static final long OFFSET$shaderDenormFlushToZeroFloat32 = LAYOUT.byteOffset(PATH$shaderDenormFlushToZeroFloat32);
    public static final long OFFSET$shaderDenormFlushToZeroFloat64 = LAYOUT.byteOffset(PATH$shaderDenormFlushToZeroFloat64);
    public static final long OFFSET$shaderRoundingModeRTEFloat16 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTEFloat16);
    public static final long OFFSET$shaderRoundingModeRTEFloat32 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTEFloat32);
    public static final long OFFSET$shaderRoundingModeRTEFloat64 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTEFloat64);
    public static final long OFFSET$shaderRoundingModeRTZFloat16 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTZFloat16);
    public static final long OFFSET$shaderRoundingModeRTZFloat32 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTZFloat32);
    public static final long OFFSET$shaderRoundingModeRTZFloat64 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTZFloat64);
}
