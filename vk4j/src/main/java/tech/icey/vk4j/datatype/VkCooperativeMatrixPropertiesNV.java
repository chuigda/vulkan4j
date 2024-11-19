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
/// typedef struct VkCooperativeMatrixPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t MSize;
///     uint32_t NSize;
///     uint32_t KSize;
///     VkComponentTypeNV AType;
///     VkComponentTypeNV BType;
///     VkComponentTypeNV CType;
///     VkComponentTypeNV DType;
///     VkScopeNV scope;
/// } VkCooperativeMatrixPropertiesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCooperativeMatrixPropertiesNV.html">VkCooperativeMatrixPropertiesNV</a>
public record VkCooperativeMatrixPropertiesNV(MemorySegment segment) implements IPointer {
    public VkCooperativeMatrixPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV);
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

    public @unsigned int MSize() {
        return segment.get(LAYOUT$MSize, OFFSET$MSize);
    }

    public void MSize(@unsigned int value) {
        segment.set(LAYOUT$MSize, OFFSET$MSize, value);
    }

    public @unsigned int NSize() {
        return segment.get(LAYOUT$NSize, OFFSET$NSize);
    }

    public void NSize(@unsigned int value) {
        segment.set(LAYOUT$NSize, OFFSET$NSize, value);
    }

    public @unsigned int KSize() {
        return segment.get(LAYOUT$KSize, OFFSET$KSize);
    }

    public void KSize(@unsigned int value) {
        segment.set(LAYOUT$KSize, OFFSET$KSize, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int AType() {
        return segment.get(LAYOUT$AType, OFFSET$AType);
    }

    public void AType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$AType, OFFSET$AType, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int BType() {
        return segment.get(LAYOUT$BType, OFFSET$BType);
    }

    public void BType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$BType, OFFSET$BType, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int CType() {
        return segment.get(LAYOUT$CType, OFFSET$CType);
    }

    public void CType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$CType, OFFSET$CType, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int DType() {
        return segment.get(LAYOUT$DType, OFFSET$DType);
    }

    public void DType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$DType, OFFSET$DType, value);
    }

    public @enumtype(VkScopeKHR.class) int scope() {
        return segment.get(LAYOUT$scope, OFFSET$scope);
    }

    public void scope(@enumtype(VkScopeKHR.class) int value) {
        segment.set(LAYOUT$scope, OFFSET$scope, value);
    }

    public static VkCooperativeMatrixPropertiesNV allocate(Arena arena) {
        return new VkCooperativeMatrixPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkCooperativeMatrixPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCooperativeMatrixPropertiesNV[] ret = new VkCooperativeMatrixPropertiesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCooperativeMatrixPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCooperativeMatrixPropertiesNV clone(Arena arena, VkCooperativeMatrixPropertiesNV src) {
        VkCooperativeMatrixPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCooperativeMatrixPropertiesNV[] clone(Arena arena, VkCooperativeMatrixPropertiesNV[] src) {
        VkCooperativeMatrixPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("MSize"),
        ValueLayout.JAVA_INT.withName("NSize"),
        ValueLayout.JAVA_INT.withName("KSize"),
        ValueLayout.JAVA_INT.withName("AType"),
        ValueLayout.JAVA_INT.withName("BType"),
        ValueLayout.JAVA_INT.withName("CType"),
        ValueLayout.JAVA_INT.withName("DType"),
        ValueLayout.JAVA_INT.withName("scope")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$MSize = PathElement.groupElement("MSize");
    public static final PathElement PATH$NSize = PathElement.groupElement("NSize");
    public static final PathElement PATH$KSize = PathElement.groupElement("KSize");
    public static final PathElement PATH$AType = PathElement.groupElement("AType");
    public static final PathElement PATH$BType = PathElement.groupElement("BType");
    public static final PathElement PATH$CType = PathElement.groupElement("CType");
    public static final PathElement PATH$DType = PathElement.groupElement("DType");
    public static final PathElement PATH$scope = PathElement.groupElement("scope");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$MSize = (OfInt) LAYOUT.select(PATH$MSize);
    public static final OfInt LAYOUT$NSize = (OfInt) LAYOUT.select(PATH$NSize);
    public static final OfInt LAYOUT$KSize = (OfInt) LAYOUT.select(PATH$KSize);
    public static final OfInt LAYOUT$AType = (OfInt) LAYOUT.select(PATH$AType);
    public static final OfInt LAYOUT$BType = (OfInt) LAYOUT.select(PATH$BType);
    public static final OfInt LAYOUT$CType = (OfInt) LAYOUT.select(PATH$CType);
    public static final OfInt LAYOUT$DType = (OfInt) LAYOUT.select(PATH$DType);
    public static final OfInt LAYOUT$scope = (OfInt) LAYOUT.select(PATH$scope);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$MSize = LAYOUT.byteOffset(PATH$MSize);
    public static final long OFFSET$NSize = LAYOUT.byteOffset(PATH$NSize);
    public static final long OFFSET$KSize = LAYOUT.byteOffset(PATH$KSize);
    public static final long OFFSET$AType = LAYOUT.byteOffset(PATH$AType);
    public static final long OFFSET$BType = LAYOUT.byteOffset(PATH$BType);
    public static final long OFFSET$CType = LAYOUT.byteOffset(PATH$CType);
    public static final long OFFSET$DType = LAYOUT.byteOffset(PATH$DType);
    public static final long OFFSET$scope = LAYOUT.byteOffset(PATH$scope);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$MSize = LAYOUT$MSize.byteSize();
    public static final long SIZE$NSize = LAYOUT$NSize.byteSize();
    public static final long SIZE$KSize = LAYOUT$KSize.byteSize();
    public static final long SIZE$AType = LAYOUT$AType.byteSize();
    public static final long SIZE$BType = LAYOUT$BType.byteSize();
    public static final long SIZE$CType = LAYOUT$CType.byteSize();
    public static final long SIZE$DType = LAYOUT$DType.byteSize();
    public static final long SIZE$scope = LAYOUT$scope.byteSize();
}
