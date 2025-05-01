package cc.design7.ffm.bits;

import cc.design7.ffm.annotation.unsigned;

interface IBitfieldUtilImpl {
    boolean readBitUnchecked(@unsigned byte value, @unsigned int bit);
    boolean readBitUnchecked(@unsigned short value, @unsigned int bit);
    boolean readBitUnchecked(@unsigned int value, @unsigned int bit);

    @unsigned byte readBitsUnchecked(@unsigned byte value, @unsigned int startBit, @unsigned int endBit);
    @unsigned short readBitsUnchecked(@unsigned short value, @unsigned int startBit, @unsigned int endBit);
    @unsigned int readBitsUnchecked(@unsigned int value, @unsigned int startBit, @unsigned int endBit);
}
