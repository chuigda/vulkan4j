#include <stdio.h>
#include <stdint.h>
#include <stdlib.h>

#ifdef _MSC_VER
#   define EXPORT __declspec(dllexport)
#else
#   define EXPORT __attribute__((visibility("default")))
#endif

#define ASSERT_EQ(a, b) do { if ((a) != (b)) { \
    fprintf(stderr, "Assertion failed: %s == %s\n", #a, #b); \
    exit(EXIT_FAILURE); \
} } while (0)

struct Bitfield1 {
    uint8_t bit1 : 1;
    uint8_t bit2 : 1;
    uint8_t bit3 : 1;
    uint8_t bit4 : 1;
    uint8_t bit5 : 1;
    uint8_t bit6 : 1;
    uint8_t bit7 : 1;
    uint8_t bit8 : 1;
};

// pattern 1: 10101010
EXPORT extern void checkBitfield1(struct Bitfield1 const* bf1) {
    ASSERT_EQ(bf1->bit1, 1);
    ASSERT_EQ(bf1->bit2, 0);
    ASSERT_EQ(bf1->bit3, 1);
    ASSERT_EQ(bf1->bit4, 0);
    ASSERT_EQ(bf1->bit5, 1);
    ASSERT_EQ(bf1->bit6, 0);
    ASSERT_EQ(bf1->bit7, 1);
    ASSERT_EQ(bf1->bit8, 0);
}

// pattern 2: 01010101
EXPORT extern void checkBitfield2(struct Bitfield1 const* bf1) {
    ASSERT_EQ(bf1->bit1, 0);
    ASSERT_EQ(bf1->bit2, 1);
    ASSERT_EQ(bf1->bit3, 0);
    ASSERT_EQ(bf1->bit4, 1);
    ASSERT_EQ(bf1->bit5, 0);
    ASSERT_EQ(bf1->bit6, 1);
    ASSERT_EQ(bf1->bit7, 0);
    ASSERT_EQ(bf1->bit8, 1);
}

// pattern 3: 11110000
EXPORT extern void checkBitfield3(struct Bitfield1 const* bf1) {
    ASSERT_EQ(bf1->bit1, 1);
    ASSERT_EQ(bf1->bit2, 1);
    ASSERT_EQ(bf1->bit3, 1);
    ASSERT_EQ(bf1->bit4, 1);
    ASSERT_EQ(bf1->bit5, 0);
    ASSERT_EQ(bf1->bit6, 0);
    ASSERT_EQ(bf1->bit7, 0);
    ASSERT_EQ(bf1->bit8, 0);
}

// pattern 4: 00001111
EXPORT extern void checkBitfield4(struct Bitfield1 const* bf1) {
    ASSERT_EQ(bf1->bit1, 0);
    ASSERT_EQ(bf1->bit2, 0);
    ASSERT_EQ(bf1->bit3, 0);
    ASSERT_EQ(bf1->bit4, 0);
    ASSERT_EQ(bf1->bit5, 1);
    ASSERT_EQ(bf1->bit6, 1);
    ASSERT_EQ(bf1->bit7, 1);
    ASSERT_EQ(bf1->bit8, 1);
}

struct Bitfield2 {
    uint32_t ayachi_ne: 24;
    uint32_t ne: 8;
};

// pattern: 0x0D00_0721
EXPORT extern void checkBitfield5(struct Bitfield2 *bf2) {
    ASSERT_EQ(bf2->ayachi_ne, 0x0D0007);
    ASSERT_EQ(bf2->ne, 0x21);
}
