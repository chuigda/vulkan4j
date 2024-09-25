package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDispatchGraphCountInfoAMDX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("count"),
        VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("infos"),
        ValueLayout.JAVA_LONG.withName("stride")
    );

    public static final PathElement PATH$count = PathElement.groupElement("count");
    public static final PathElement PATH$infos = PathElement.groupElement("infos");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");

    public static final OfInt LAYOUT$count = (OfInt) LAYOUT.select(PATH$count);
    public static final UnionLayout LAYOUT$infos = (UnionLayout) LAYOUT.select(PATH$infos);
    public static final OfLong LAYOUT$stride = (OfLong) LAYOUT.select(PATH$stride);

    public static final long OFFSET$count = LAYOUT.byteOffset(PATH$count);
    public static final long OFFSET$infos = LAYOUT.byteOffset(PATH$infos);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);

    public VkDispatchGraphCountInfoAMDX(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int count() {
        return segment.get(LAYOUT$count, OFFSET$count);
    }

    public void count(@unsigned int value) {
        segment.set(LAYOUT$count, OFFSET$count, value);
    }

    public VkDeviceOrHostAddressConstAMDX infos() {
        return new VkDeviceOrHostAddressConstAMDX(segment.asSlice(OFFSET$infos, LAYOUT$infos));
    }

    public void infos(VkDeviceOrHostAddressConstAMDX value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$infos, LAYOUT$infos.byteSize());
    }

    public @unsigned long stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned long value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }


    public static final class Factory implements IFactory<VkDispatchGraphCountInfoAMDX> {
        @Override
        public Class<VkDispatchGraphCountInfoAMDX> clazz() {
            return VkDispatchGraphCountInfoAMDX.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDispatchGraphCountInfoAMDX.LAYOUT;
        }

        @Override
        public VkDispatchGraphCountInfoAMDX create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDispatchGraphCountInfoAMDX createUninit(MemorySegment segment) {
            return new VkDispatchGraphCountInfoAMDX(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
