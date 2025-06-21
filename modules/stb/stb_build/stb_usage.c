#include <stdio.h>
#include <stdlib.h>

void (*g_JavaTrace)(void);

extern void vk4jSetSTBJavaTrace(void (*javaTrace)(void)) {
    g_JavaTrace = javaTrace;
}

static void vk4jStbAssertFail(const char *asserter, const char *condition) {
    fprintf(stderr, "%s failed: %s\n", asserter, condition);
    if (g_JavaTrace) {
        g_JavaTrace();
    }
    abort();
}

#define VK4J_STB_GENERAL_ASSERT(ASSERTER, CONDITION) \
    ((CONDITION)                                     \
        ? (void)0                                    \
        : vk4jStbAssertFail(ASSERTER, #CONDITION))

#ifndef STBI_ASSERT
#   define STBI_ASSERT(CONDITION) VK4J_STB_GENERAL_ASSERT("STBI_ASSERT", CONDITION)
#endif

#ifndef STBTT_assert
#   define STBTT_assert(CONDITION) VK4J_STB_GENERAL_ASSERT("STBTT_assert", CONDITION)
#endif

#ifdef STBIR_ASSERT
#   define STBIR_ASSERT(CONDITION) VK4J_STB_GENERAL_ASSERT("STBIR_ASSERT", CONDITION)
#endif


#define STB_IMAGE_IMPLEMENTATION
#include "stb_image.h"

#define STB_TRUETYPE_IMPLEMENTATION
#include "stb_truetype.h"

#define STB_IMAGE_RESIZE_IMPLEMENTATION
#define STB_IMAGE_RESIZE2_IMPLEMENTATION
#include "stb_image_resize2.h"
