#define VMA_VULKAN_VERSION 1004000
#define VMA_IMPLEMENTATION
#define VMA_STATIC_VULKAN_FUNCTIONS 0

void (*g_JavaTrace)(void);

#include <stdio.h>
#include <stdlib.h>

#define VMA_ASSERT(CONDITION) \
    do {if (!(CONDITION)) { \
        fprintf(stderr, "VMA_ASSERT failed: %s\n", #CONDITION); \
        if (g_JavaTrace) { \
            g_JavaTrace(); \
        } \
        abort(); \
    }} while (false);


#include "vk_mem_alloc.h"

extern "C" {
    VMA_CALL_PRE void VMA_CALL_POST
    vk4jSetJavaTrace(void (*javaTrace)(void)) {
        g_JavaTrace = javaTrace;
    }
}
