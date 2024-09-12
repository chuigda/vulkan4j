#include <stdio.h>
#include <stdint.h>
#include <inttypes.h>

struct Nested {
    uint32_t a;
    uint32_t b;
};

enum ExampleEnum {
    EXAMPLE_ENUM_VALUE1 = 0,
    EXAMPLE_ENUM_VALUE2 = 1
};

struct Example {
    int32_t a;
    uint64_t b;
    void *c;
    long d;
    struct Nested nested;
    int32_t arr[4];
    int bitfield1 : 24;
    unsigned bitfield2 : 8;
    int32_t *pInt;
    struct Nested *pNested;
    struct Nested nestedArr[4];
    enum ExampleEnum e;
};

void dump_example(struct Example const* example) {
    printf(
        "dump_example\n"
        "  example->a = %d\n"
        "  example->b = %" PRIu64 "\n"
        "  example->c = %p\n"
        "  example->d = %ld\n"
        "  example->nested.a = %u\n"
        "  example->nested.b = %u\n"
        "  example->arr[0] = %d\n"
        "  example->arr[1] = %d\n"
        "  example->arr[2] = %d\n"
        "  example->arr[3] = %d\n"
        "  example->bitfield1 = %d\n"
        "  example->bitfield2 = %u\n"
        "  example->pInt = %p\n"
        "  example->pNested = %p\n"
        "  example->nestedArr[0].a = %u\n"
        "  example->nestedArr[1].b = %u\n"
        "  example->nestedArr[2].a = %u\n"
        "  example->nestedArr[3].b = %u\n"
        "  example->e = %d\n",
        example->a,
        example->b,
        example->c,
        example->d,
        example->nested.a,
        example->nested.b,
        example->arr[0],
        example->arr[1],
        example->arr[2],
        example->arr[3],
        example->bitfield1,
        example->bitfield2,
        example->pInt,
        example->pNested,
        example->nestedArr[0].a,
        example->nestedArr[1].b,
        example->nestedArr[2].a,
        example->nestedArr[3].b,
        example->e
    );

    if (example->pInt) {
        printf("    *example->pInt = %d\n", *example->pInt);
    }

    if (example->pNested) {
        printf("    example->pNested->a = %u\n", example->pNested->a);
        printf("    example->pNested->b = %u\n", example->pNested->b);
    }
}

void dump_int_array(int32_t const* arr, int32_t count) {
    printf("dump_int_array\n");
    for (int32_t i = 0; i < count; ++i) {
        printf("  arr[%d] = %d\n", i, arr[i]);
    }
}
