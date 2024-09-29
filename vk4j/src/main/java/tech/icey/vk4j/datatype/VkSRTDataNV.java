package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkSRTDataNV {
///     float sx;
///     float a;
///     float b;
///     float pvx;
///     float sy;
///     float c;
///     float pvy;
///     float sz;
///     float pvz;
///     float qx;
///     float qy;
///     float qz;
///     float qw;
///     float tx;
///     float ty;
///     float tz;
/// } VkSRTDataNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSRTDataNV.html">VkSRTDataNV</a>
public record VkSRTDataNV(MemorySegment segment) implements IPointer {
    public VkSRTDataNV(MemorySegment segment) {
        this.segment = segment;
    }

    public float sx() {
        return segment.get(LAYOUT$sx, OFFSET$sx);
    }

    public void sx(float value) {
        segment.set(LAYOUT$sx, OFFSET$sx, value);
    }

    public float a() {
        return segment.get(LAYOUT$a, OFFSET$a);
    }

    public void a(float value) {
        segment.set(LAYOUT$a, OFFSET$a, value);
    }

    public float b() {
        return segment.get(LAYOUT$b, OFFSET$b);
    }

    public void b(float value) {
        segment.set(LAYOUT$b, OFFSET$b, value);
    }

    public float pvx() {
        return segment.get(LAYOUT$pvx, OFFSET$pvx);
    }

    public void pvx(float value) {
        segment.set(LAYOUT$pvx, OFFSET$pvx, value);
    }

    public float sy() {
        return segment.get(LAYOUT$sy, OFFSET$sy);
    }

    public void sy(float value) {
        segment.set(LAYOUT$sy, OFFSET$sy, value);
    }

    public float c() {
        return segment.get(LAYOUT$c, OFFSET$c);
    }

    public void c(float value) {
        segment.set(LAYOUT$c, OFFSET$c, value);
    }

    public float pvy() {
        return segment.get(LAYOUT$pvy, OFFSET$pvy);
    }

    public void pvy(float value) {
        segment.set(LAYOUT$pvy, OFFSET$pvy, value);
    }

    public float sz() {
        return segment.get(LAYOUT$sz, OFFSET$sz);
    }

    public void sz(float value) {
        segment.set(LAYOUT$sz, OFFSET$sz, value);
    }

    public float pvz() {
        return segment.get(LAYOUT$pvz, OFFSET$pvz);
    }

    public void pvz(float value) {
        segment.set(LAYOUT$pvz, OFFSET$pvz, value);
    }

    public float qx() {
        return segment.get(LAYOUT$qx, OFFSET$qx);
    }

    public void qx(float value) {
        segment.set(LAYOUT$qx, OFFSET$qx, value);
    }

    public float qy() {
        return segment.get(LAYOUT$qy, OFFSET$qy);
    }

    public void qy(float value) {
        segment.set(LAYOUT$qy, OFFSET$qy, value);
    }

    public float qz() {
        return segment.get(LAYOUT$qz, OFFSET$qz);
    }

    public void qz(float value) {
        segment.set(LAYOUT$qz, OFFSET$qz, value);
    }

    public float qw() {
        return segment.get(LAYOUT$qw, OFFSET$qw);
    }

    public void qw(float value) {
        segment.set(LAYOUT$qw, OFFSET$qw, value);
    }

    public float tx() {
        return segment.get(LAYOUT$tx, OFFSET$tx);
    }

    public void tx(float value) {
        segment.set(LAYOUT$tx, OFFSET$tx, value);
    }

    public float ty() {
        return segment.get(LAYOUT$ty, OFFSET$ty);
    }

    public void ty(float value) {
        segment.set(LAYOUT$ty, OFFSET$ty, value);
    }

    public float tz() {
        return segment.get(LAYOUT$tz, OFFSET$tz);
    }

    public void tz(float value) {
        segment.set(LAYOUT$tz, OFFSET$tz, value);
    }

    public static VkSRTDataNV allocate(Arena arena) {
        return new VkSRTDataNV(arena.allocate(LAYOUT));
    }
    
    public static VkSRTDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSRTDataNV[] ret = new VkSRTDataNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSRTDataNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSRTDataNV clone(Arena arena, VkSRTDataNV src) {
        VkSRTDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSRTDataNV[] clone(Arena arena, VkSRTDataNV[] src) {
        VkSRTDataNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("sx"),
        ValueLayout.JAVA_FLOAT.withName("a"),
        ValueLayout.JAVA_FLOAT.withName("b"),
        ValueLayout.JAVA_FLOAT.withName("pvx"),
        ValueLayout.JAVA_FLOAT.withName("sy"),
        ValueLayout.JAVA_FLOAT.withName("c"),
        ValueLayout.JAVA_FLOAT.withName("pvy"),
        ValueLayout.JAVA_FLOAT.withName("sz"),
        ValueLayout.JAVA_FLOAT.withName("pvz"),
        ValueLayout.JAVA_FLOAT.withName("qx"),
        ValueLayout.JAVA_FLOAT.withName("qy"),
        ValueLayout.JAVA_FLOAT.withName("qz"),
        ValueLayout.JAVA_FLOAT.withName("qw"),
        ValueLayout.JAVA_FLOAT.withName("tx"),
        ValueLayout.JAVA_FLOAT.withName("ty"),
        ValueLayout.JAVA_FLOAT.withName("tz")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sx = PathElement.groupElement("sx");
    public static final PathElement PATH$a = PathElement.groupElement("a");
    public static final PathElement PATH$b = PathElement.groupElement("b");
    public static final PathElement PATH$pvx = PathElement.groupElement("pvx");
    public static final PathElement PATH$sy = PathElement.groupElement("sy");
    public static final PathElement PATH$c = PathElement.groupElement("c");
    public static final PathElement PATH$pvy = PathElement.groupElement("pvy");
    public static final PathElement PATH$sz = PathElement.groupElement("sz");
    public static final PathElement PATH$pvz = PathElement.groupElement("pvz");
    public static final PathElement PATH$qx = PathElement.groupElement("qx");
    public static final PathElement PATH$qy = PathElement.groupElement("qy");
    public static final PathElement PATH$qz = PathElement.groupElement("qz");
    public static final PathElement PATH$qw = PathElement.groupElement("qw");
    public static final PathElement PATH$tx = PathElement.groupElement("tx");
    public static final PathElement PATH$ty = PathElement.groupElement("ty");
    public static final PathElement PATH$tz = PathElement.groupElement("tz");

    public static final OfFloat LAYOUT$sx = (OfFloat) LAYOUT.select(PATH$sx);
    public static final OfFloat LAYOUT$a = (OfFloat) LAYOUT.select(PATH$a);
    public static final OfFloat LAYOUT$b = (OfFloat) LAYOUT.select(PATH$b);
    public static final OfFloat LAYOUT$pvx = (OfFloat) LAYOUT.select(PATH$pvx);
    public static final OfFloat LAYOUT$sy = (OfFloat) LAYOUT.select(PATH$sy);
    public static final OfFloat LAYOUT$c = (OfFloat) LAYOUT.select(PATH$c);
    public static final OfFloat LAYOUT$pvy = (OfFloat) LAYOUT.select(PATH$pvy);
    public static final OfFloat LAYOUT$sz = (OfFloat) LAYOUT.select(PATH$sz);
    public static final OfFloat LAYOUT$pvz = (OfFloat) LAYOUT.select(PATH$pvz);
    public static final OfFloat LAYOUT$qx = (OfFloat) LAYOUT.select(PATH$qx);
    public static final OfFloat LAYOUT$qy = (OfFloat) LAYOUT.select(PATH$qy);
    public static final OfFloat LAYOUT$qz = (OfFloat) LAYOUT.select(PATH$qz);
    public static final OfFloat LAYOUT$qw = (OfFloat) LAYOUT.select(PATH$qw);
    public static final OfFloat LAYOUT$tx = (OfFloat) LAYOUT.select(PATH$tx);
    public static final OfFloat LAYOUT$ty = (OfFloat) LAYOUT.select(PATH$ty);
    public static final OfFloat LAYOUT$tz = (OfFloat) LAYOUT.select(PATH$tz);

    public static final long OFFSET$sx = LAYOUT.byteOffset(PATH$sx);
    public static final long OFFSET$a = LAYOUT.byteOffset(PATH$a);
    public static final long OFFSET$b = LAYOUT.byteOffset(PATH$b);
    public static final long OFFSET$pvx = LAYOUT.byteOffset(PATH$pvx);
    public static final long OFFSET$sy = LAYOUT.byteOffset(PATH$sy);
    public static final long OFFSET$c = LAYOUT.byteOffset(PATH$c);
    public static final long OFFSET$pvy = LAYOUT.byteOffset(PATH$pvy);
    public static final long OFFSET$sz = LAYOUT.byteOffset(PATH$sz);
    public static final long OFFSET$pvz = LAYOUT.byteOffset(PATH$pvz);
    public static final long OFFSET$qx = LAYOUT.byteOffset(PATH$qx);
    public static final long OFFSET$qy = LAYOUT.byteOffset(PATH$qy);
    public static final long OFFSET$qz = LAYOUT.byteOffset(PATH$qz);
    public static final long OFFSET$qw = LAYOUT.byteOffset(PATH$qw);
    public static final long OFFSET$tx = LAYOUT.byteOffset(PATH$tx);
    public static final long OFFSET$ty = LAYOUT.byteOffset(PATH$ty);
    public static final long OFFSET$tz = LAYOUT.byteOffset(PATH$tz);

    public static final long SIZE$sx = LAYOUT$sx.byteSize();
    public static final long SIZE$a = LAYOUT$a.byteSize();
    public static final long SIZE$b = LAYOUT$b.byteSize();
    public static final long SIZE$pvx = LAYOUT$pvx.byteSize();
    public static final long SIZE$sy = LAYOUT$sy.byteSize();
    public static final long SIZE$c = LAYOUT$c.byteSize();
    public static final long SIZE$pvy = LAYOUT$pvy.byteSize();
    public static final long SIZE$sz = LAYOUT$sz.byteSize();
    public static final long SIZE$pvz = LAYOUT$pvz.byteSize();
    public static final long SIZE$qx = LAYOUT$qx.byteSize();
    public static final long SIZE$qy = LAYOUT$qy.byteSize();
    public static final long SIZE$qz = LAYOUT$qz.byteSize();
    public static final long SIZE$qw = LAYOUT$qw.byteSize();
    public static final long SIZE$tx = LAYOUT$tx.byteSize();
    public static final long SIZE$ty = LAYOUT$ty.byteSize();
    public static final long SIZE$tz = LAYOUT$tz.byteSize();
}
